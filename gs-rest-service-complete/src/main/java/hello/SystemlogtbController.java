package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemlogtbController {
	@CrossOrigin
	@RequestMapping("/api/123")
    public String paymenttb() {
        return "12132131231231";
    }
	@CrossOrigin
	@RequestMapping("/api/getSystemlogtbsList")
	public ResponseEntity<List<Systemlogtb>> getSystemlogtbsList() {
		List<Systemlogtb> systemlogtbs = new ArrayList<Systemlogtb>();
		
		try {
			Statement stmt 	= MysqlConnector.conn.createStatement();
			ResultSet rs; 	
			// lay lich su giao dich trong ngay hien tai
			String sql_Count = "SELECT " + 
					"a.SystemLogId, " + 
					"a.UserId, " + 
					"a.MachineName, " + 
					"a.IPAddress, " + 
					"a.EnterTime, " + 
					"a.EndTime, " + 
					"a.Status, " + 
					"a.Note, " + 
					"a.TimeUsed " + 
					"from systemlogtb a, (SELECT MachineName, MAX(SystemLogId) as SystemLogId from systemlogtb where EnterDate = DATE_FORMAT(NOW(), '%Y-%m-%d') group by MachineName) b " + 
					"where a.SystemLogId = b.SystemLogId ";
			rs = stmt.executeQuery(sql_Count);
						
			while (rs.next()) {
				Systemlogtb systemlogtb = new Systemlogtb();
				systemlogtb.setSystemLogId(rs.getInt("systemLogId"));
				systemlogtb.setUserId(rs.getInt("UserId"));
				systemlogtb.setMachineName(rs.getString("MachineName"));
				systemlogtb.setIPAddress(rs.getString("IPAddress"));
				systemlogtb.setEnterTime(rs.getTime("EnterTime"));
				systemlogtb.setEndTime(rs.getTime("EndTime"));
				systemlogtb.setStatus(rs.getInt("Status"));
				systemlogtb.setNote(rs.getString("Note"));
				systemlogtb.setTimeUsed(rs.getInt("TimeUsed"));
				systemlogtbs.add(systemlogtb);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<List<Systemlogtb>>(systemlogtbs, HttpStatus.OK);		
	}
}

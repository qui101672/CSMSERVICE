package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PaymenttbController {
	@CrossOrigin
    @RequestMapping("/")
    public String paymenttb() {
        return "12132131231231";
    }
    @CrossOrigin
    @RequestMapping("/api/getPaymentList")
	public ResponseEntity<List<Paymenttb>> getPaymentList() {
		List<Paymenttb> paymenttbs = new ArrayList<Paymenttb>();
		
		try {
			Statement stmt 	= MysqlConnector.conn.createStatement();
			ResultSet rs; 	
			// lay lich su giao dich trong ngay hien tai
			String sql_Count = "select paymenttb.VoucherNo,\r\n" + 
					"paymenttb.VoucherDate,\r\n" + 
					"paymenttb.VoucherTime,\r\n" + 
					"paymenttb.Amount,\r\n" + 
					"paymenttb.AutoAmount,\r\n" + 
					"paymenttb.TimeTotal,\r\n" + 
					"paymenttb.Active,\r\n" + 
					"paymenttb.UserNote,\r\n" + 
					"paymenttb.Note,\r\n" + 
					"paymenttb.MachineName from paymenttb where VoucherDate = DATE_FORMAT(NOW(), '%Y-%m-%d')";
			rs = stmt.executeQuery(sql_Count);
						
			while (rs.next()) {
				Paymenttb payment = new Paymenttb();
				payment.setVoucherNo(rs.getString("VoucherDate"));
				payment.setVoucherDate(rs.getDate("voucherDate"));
				payment.setVoucherTime(rs.getTime("voucherTime"));
				payment.setAmount(rs.getLong("amount"));
				payment.setAutoAmount(rs.getLong("autoAmount"));
				payment.setTimeTotal(rs.getInt("timeTotal"));
				payment.setActive(rs.getInt("active"));
				payment.setUserNote(rs.getString("userNote"));
				payment.setMachineName(rs.getString("machineName"));
				paymenttbs.add(payment);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<List<Paymenttb>>(paymenttbs, HttpStatus.OK);		
	}
	
    @CrossOrigin
    @RequestMapping("/api/getPaymentListByDate/{tungay}/{denngay}")
	public ResponseEntity<List<Paymenttb>> getPaymentListByDate(@PathVariable("tungay") String tungay, @PathVariable("denngay") String denngay) {
		List<Paymenttb> paymenttbs = new ArrayList<Paymenttb>();
		
		try {
			Statement stmt 	= MysqlConnector.conn.createStatement();
			ResultSet rs; 	
			// lay lich su giao dich trong ngay hien tai
			String sql_Count = "select paymenttb.VoucherNo,\r\n" + 
					"paymenttb.VoucherDate," + 
					"paymenttb.VoucherTime," +
					"paymenttb.Amount," + 
					"paymenttb.AutoAmount," + 
					"paymenttb.TimeTotal," + 
					"paymenttb.Active," + 
					"paymenttb.UserNote," + 
					"paymenttb.Note," + 
					"paymenttb.MachineName from paymenttb where VoucherDate >= '"+tungay+"' and VoucherDate <= '"+denngay+"' ";
			rs = stmt.executeQuery(sql_Count);
						
			while (rs.next()) {
				Paymenttb payment = new Paymenttb();
				payment.setVoucherNo(rs.getString("VoucherDate"));
				payment.setVoucherDate(rs.getDate("voucherDate"));
				payment.setVoucherTime(rs.getTime("voucherTime"));
				payment.setAmount(rs.getLong("amount"));
				payment.setAutoAmount(rs.getLong("autoAmount"));
				payment.setTimeTotal(rs.getInt("timeTotal"));
				payment.setActive(rs.getInt("active"));
				payment.setUserNote(rs.getString("userNote"));
				payment.setMachineName(rs.getString("machineName"));
				paymenttbs.add(payment);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return new ResponseEntity<List<Paymenttb>>(paymenttbs, HttpStatus.OK);		
	}
    
}

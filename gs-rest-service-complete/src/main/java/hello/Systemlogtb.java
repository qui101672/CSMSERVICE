package hello;

import java.sql.Date;
import java.sql.Time;

public class Systemlogtb {
    
    private int	SystemLogId;
    private int	UserId;
    private String	MachineName;
    private String	IPAddress;
    private Date	EnterDate;
    private Time	EnterTime;
    private Date	EndDate;
    private Time	EndTime;
    private int	Status;
    private String	Note;
    private int	TimeUsed;
    private int	MoneyUsed;
    private int	PriceAppRentID;
    private int	AppRentMoneyUsed;
	public int getSystemLogId() {
		return SystemLogId;
	}
	public void setSystemLogId(int systemLogId) {
		SystemLogId = systemLogId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getMachineName() {
		return MachineName;
	}
	public void setMachineName(String machineName) {
		MachineName = machineName;
	}
	public String getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
	public Date getEnterDate() {
		return EnterDate;
	}
	public void setEnterDate(Date enterDate) {
		EnterDate = enterDate;
	}
	public Time getEnterTime() {
		return EnterTime;
	}
	public void setEnterTime(Time enterTime) {
		EnterTime = enterTime;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public Time getEndTime() {
		return EndTime;
	}
	public void setEndTime(Time endTime) {
		EndTime = endTime;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public int getTimeUsed() {
		return TimeUsed;
	}
	public void setTimeUsed(int timeUsed) {
		TimeUsed = timeUsed;
	}
	public int getMoneyUsed() {
		return MoneyUsed;
	}
	public void setMoneyUsed(int moneyUsed) {
		MoneyUsed = moneyUsed;
	}
	public int getPriceAppRentID() {
		return PriceAppRentID;
	}
	public void setPriceAppRentID(int priceAppRentID) {
		PriceAppRentID = priceAppRentID;
	}
	public int getAppRentMoneyUsed() {
		return AppRentMoneyUsed;
	}
	public void setAppRentMoneyUsed(int appRentMoneyUsed) {
		AppRentMoneyUsed = appRentMoneyUsed;
	}
	public Systemlogtb(int systemLogId, int userId, String machineName, String iPAddress, Date enterDate,
			Time enterTime, Date endDate, Time endTime, int status, String note, int timeUsed, int moneyUsed,
			int priceAppRentID, int appRentMoneyUsed) {
		super();
		SystemLogId = systemLogId;
		UserId = userId;
		MachineName = machineName;
		IPAddress = iPAddress;
		EnterDate = enterDate;
		EnterTime = enterTime;
		EndDate = endDate;
		EndTime = endTime;
		Status = status;
		Note = note;
		TimeUsed = timeUsed;
		MoneyUsed = moneyUsed;
		PriceAppRentID = priceAppRentID;
		AppRentMoneyUsed = appRentMoneyUsed;
	}
	public Systemlogtb() {
		super();
	}

    
}

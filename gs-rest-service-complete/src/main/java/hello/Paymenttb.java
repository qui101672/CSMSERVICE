package hello;

import java.sql.Date;
import java.sql.Time;


public class Paymenttb 
	{
	private int VoucherId;
	private int UserId;
	private String VoucherNo;
	private Date VoucherDate;
	private Time VoucherTime;
	private Date ServeDate;
	private Time ServeTime;
	private long Amount;
	private long AutoAmount;
	private int TimeTotal;
	private int Active;
	private String UserNote;
	private String Note;
	private int ServicePaid;
	private int StaffId;
	private String MachineName;
	private int PaymentType;
	private int PaymentWaitId
	;
	public int getVoucherId() {
		return VoucherId;
	}
	public void setVoucherId(int voucherId) {
		VoucherId = voucherId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getVoucherNo() {
		return VoucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		VoucherNo = voucherNo;
	}
	public Date getVoucherDate() {
		return VoucherDate;
	}
	public void setVoucherDate(Date voucherDate) {
		VoucherDate = voucherDate;
	}
	public Time getVoucherTime() {
		return VoucherTime;
	}
	public void setVoucherTime(Time voucherTime) {
		VoucherTime = voucherTime;
	}
	public Date getServeDate() {
		return ServeDate;
	}
	public void setServeDate(Date serveDate) {
		ServeDate = serveDate;
	}
	public Time getServeTime() {
		return ServeTime;
	}
	public void setServeTime(Time serveTime) {
		ServeTime = serveTime;
	}
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		Amount = amount;
	}
	public long getAutoAmount() {
		return AutoAmount;
	}
	public void setAutoAmount(long autoAmount) {
		AutoAmount = autoAmount;
	}
	public int getTimeTotal() {
		return TimeTotal;
	}
	public void setTimeTotal(int timeTotal) {
		TimeTotal = timeTotal;
	}
	public int getActive() {
		return Active;
	}
	public void setActive(int active) {
		Active = active;
	}
	public String getUserNote() {
		return UserNote;
	}
	public void setUserNote(String userNote) {
		UserNote = userNote;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public int getServicePaid() {
		return ServicePaid;
	}
	public void setServicePaid(int servicePaid) {
		ServicePaid = servicePaid;
	}
	public int getStaffId() {
		return StaffId;
	}
	public void setStaffId(int staffId) {
		StaffId = staffId;
	}
	public String getMachineName() {
		return MachineName;
	}
	public void setMachineName(String machineName) {
		MachineName = machineName;
	}
	public int getPaymentType() {
		return PaymentType;
	}
	public void setPaymentType(int paymentType) {
		PaymentType = paymentType;
	}
	public int getPaymentWaitId() {
		return PaymentWaitId;
	}
	public void setPaymentWaitId(int paymentWaitId) {
		PaymentWaitId = paymentWaitId;
	}
	public Paymenttb(int voucherId, int userId, String voucherNo, Date voucherDate, Time voucherTime, Date serveDate,
			Time serveTime, long amount, long autoAmount, int timeTotal, int active, String userNote, String note,
			int servicePaid, int staffId, String machineName, int paymentType, int paymentWaitId) {
		super();
		VoucherId = voucherId;
		UserId = userId;
		VoucherNo = voucherNo;
		VoucherDate = voucherDate;
		VoucherTime = voucherTime;
		ServeDate = serveDate;
		ServeTime = serveTime;
		Amount = amount;
		AutoAmount = autoAmount;
		TimeTotal = timeTotal;
		Active = active;
		UserNote = userNote;
		Note = note;
		ServicePaid = servicePaid;
		StaffId = staffId;
		MachineName = machineName;
		PaymentType = paymentType;
		PaymentWaitId = paymentWaitId;
	}
	public Paymenttb() {
		super();
	}
	
	

}

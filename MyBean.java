package cap.bean;

public class MyBean {
	private String name;
	private long Sourceaccno,Destaccno;
	private long mobileNo;
	private float balance;
	private int depositeAmount;
	private int withdrawAmount;
	private int transAmount;
	private long accNo;
	public MyBean(long accNo, String name, long mobileNo, float balance) {
		this.name = name;
		this.balance =  balance;
		this.mobileNo=mobileNo;
		this.accNo=accNo;
		
	}
	public MyBean(long accNo) {
	this.accNo=accNo;
	}
	
	public MyBean(long accNo, int depositeAmount2) {
		this.depositeAmount = depositeAmount;
		this.accNo=accNo;
	}
	public MyBean(long sourceAccNo, long destAccNo, int transAmount) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(int depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public int getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public int getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(int transAmount) {
		this.transAmount = transAmount;
	}
	public long getSraccno() {
		return Sourceaccno;
	}
	public void setSraccno(long Sourceaccno) {
	  this.Sourceaccno =Sourceaccno;
	}
	public long getDestaccno() {
		return Destaccno;
	}
	public void setDestaccno(long destaccno) {
		this.Destaccno = destaccno;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	

}

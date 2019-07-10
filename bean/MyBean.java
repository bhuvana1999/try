package cap.bean;

public class MyBean {
	private String name;

	private long mobileNo;
	private float balance;
	private float Amount;
	private long accNo;
	private long accNo1,accNo2;
	//getters and setters
	
	public String getName() {
		return name;
	}
	public long getAccNo1() {
		return accNo1;
	}
	public void setAccNo1(long accNo1) {
		this.accNo1 = accNo1;
	}
	public long getAccNo2() {
		return accNo2;
	}
	public void setAccNo2(long accNo2) {
		this.accNo2 = accNo2;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public float getAmount() {
		return Amount;
	}
	public void setAmount(float amount) {
		Amount = amount;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	//constructer
	public MyBean(String name,long mobileNo, float balance, float amount,long accNo) {
		super();
		this.name = name;
		
		this.mobileNo = mobileNo;
		this.balance = balance;
		Amount = amount;
		this.accNo = accNo;
	}
	public MyBean() {
		super();
	}
	public MyBean(long accNo, String name, long mobileNo, float balance) 
	{
		this.accNo = accNo;
		this.name = name;
		this.mobileNo = mobileNo;
		this.balance = balance;
	}
	public MyBean(long accNo) {
		this.accNo = accNo;
	}
	
	public MyBean(float amount, long accNo) {
		this.accNo = accNo;
		Amount = amount;
	}
	
	public MyBean(long accNo, float amount) {
		this.accNo = accNo;
		Amount = amount;
	}
	public MyBean(long accNo1, long accNo2, float amount1) {
		this.accNo1 = accNo1;
		this.accNo2 = accNo2;
		this.Amount = amount1;
		
		
	}
	
	
}
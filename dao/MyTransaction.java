package cap.dao;

public class MyTransaction {
	private int transId;
	private long accNofrom;
	private long accnoto;
	private float amount;
	private int date;
	private int transInfo;
	private int time;
	private float balance;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public long getAccNofrom() {
		return accNofrom;
	}
	public void setAccNofrom(long accNofrom) {
		this.accNofrom = accNofrom;
	}
	public long getAccnoto() {
		return accnoto;
	}
	public void setAccnoto(long accnoto) {
		this.accnoto = accnoto;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getTransInfo() {
		return transInfo;
	}
	public void setTransInfo(int transInfo) {
		this.transInfo = transInfo;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	//constructor
	public MyTransaction(int transId, long accNofrom, long accnoto, float amount, int date, int transInfo, int time,
			float balance) {
		super();
		this.transId = transId;
		this.accNofrom = accNofrom;
		this.accnoto = accnoto;
		this.amount = amount;
		this.date = date;
		this.transInfo = transInfo;
		this.time = time;
		this.balance = balance;
	}
	public MyTransaction() {
		super();
	}
	
	
	
	
	

}

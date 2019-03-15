import java.util.ArrayList;

public class bankacc {
	public static final String CREDIT_NUM ="1234";
	private double Balance;
	int Index1,Index2;
	private ArrayList<String> hist = new ArrayList<String>();
	
	//constructor
	public bankacc (double balance,ArrayList<String> history) {
		//this.History = history;
		this.Balance = balance;
		this.hist = history;
		this.Index1 = 0;
		this.Index2 = 0;
	}
	//setters & getters
	public int getIndex2() {
		return Index2;
	}
	public void setIndex2(int index2) {
		Index2 = index2;
	}
	public int getIndex1() {
		return Index1;
	}
	public void setIndex1(int index1) {
		Index1 = index1;
	}
	public ArrayList<String> getHist() {
		return hist;
	}
	public void setHist(ArrayList<String> hist) {
		this.hist = hist;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	//methods
	public void Deposit(int dep_value) {
		
		this.Balance =  this.Balance + dep_value;

	}
	public void history (String transactiontype,String transactionvalue) {
		
		this.hist.add(transactiontype+" : "+transactionvalue);
		
	}
	public void previous (ArrayList<String>histoire) {
		this.Index2 ++;
		System.out.println(""+histoire.get(this.Index1));
	}
	public boolean Withdraw (int with_value) {
		if (this.Balance>=(double)with_value)
		{
			this.Balance = this.Balance - with_value;;
		return true;
		}
		else
			return false;
	}
	
}

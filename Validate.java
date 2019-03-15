
public class Validate {
	public static final String CREDIT_NUM ="1234";

	public int CreditnumValidate (String x) {
		if (x.contentEquals(CREDIT_NUM))
			return 1;
		else 
			return 0;
	}
	public boolean depWithValid(int value) {
		int x = value % 20;
		if (x==0)
			return true;
		else 
			return false;
	}

}

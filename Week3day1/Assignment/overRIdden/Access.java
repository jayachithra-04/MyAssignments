package overRIdden;

public class Access  {
	public static void main(String[] args)
	{
		AxisBank bankobj = new AxisBank();
		bankobj.saving();
		bankobj.fixed();
		bankobj.deposit();
		BankInfo bankinfoobj = new BankInfo();
		bankinfoobj.deposit();
	}

}

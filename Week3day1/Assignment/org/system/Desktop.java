package org.system;



public class Desktop extends Computer {
	
	
	public void desktopSize()
	{
		System.out.println("14 inch");
		
	}
	public static void main(String[] args)
	{
		
		Desktop deskstopobj = new Desktop();
		deskstopobj.computerModel();
		deskstopobj.desktopSize();
	}
	

}

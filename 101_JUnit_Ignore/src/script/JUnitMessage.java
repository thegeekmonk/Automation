package script;

public class JUnitMessage {
    
	public String msg; 
	public JUnitMessage(String msg) 
	{
		// TODO Auto-generated constructor stub
         this.msg = msg;
	}
	
	
	public String printMessage()
	{
		System.out.println("Printing Message : "+msg);
				
		return msg;
	}
	
	public String printHiMessage()
	{
		msg = "Hi "+msg;
		
		System.out.println("Printing Message : Hi "+msg);
		return msg;
	}

}

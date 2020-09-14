package script;

public class JUnitMessage 
{
     private int num;

	public JUnitMessage(int num) {
		super();
		this.num = num;
	}
     
    
	public boolean divide()
	{
		int division = num/0;
		
		System.out.println("Division is : "+division);
		
		return true;
	}
	
}
package script;

public class JUnitMessage 
{
     private int num;

	public JUnitMessage(int num) {
		super();
		this.num = num;
	}
     
    
	public void divide()
	{
		int division = num/0;
		
		System.out.println("Division is : "+division);
	}
	
}
public class GP2 
{
	//Changed the fields to private
	private int a;
	private int b; 

	public GP2( int a, int b ) 
	{
		this.a = a; 
		this.b = b;
		generateNum();
	}

	public int generateNum() 
	{
		//Made the random inclusive to the upper bound
		int c = (int)(Math.random()*(b-a+1));
		return a + c;
	}
}

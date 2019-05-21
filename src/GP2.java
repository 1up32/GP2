public class GP2 
{
	int a;
	int b; 
	public GP2( int a, int b ) 
	{
		this.a = a; 
		this.b = b;
		generateNum();
	}
	public int generateNum() 
	{
		int c = (int)(Math.random()*(b-a));
		return a + c;
	}
}

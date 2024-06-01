public class blocks{
	static int x=10;
	int y=50;
	static{
		System.out.println("World");
		System.out.println(x);//static variable
	}
	{
		System.out.println("Hello");
		System.out.println(y);//instance variable
		System.out.println(x);//static variable
	}
	public static void main(String []args){
		//blocks b=new blocks();
		//blocks c=new blocks();
		{
			int s=66;
			System.out.println(s+" level 1");
			{
				System.out.println(s+" level 2");
				{
					int m=12345;
					System.out.println(m);
					System.out.println(s+" level 3");
					System.out.println(x);
					//System.out.println(b.y);
				}
			}
		}
	}
}
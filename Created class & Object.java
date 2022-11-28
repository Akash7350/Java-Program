
//java program of creating class and object

class Demo
{
	int a = 9;
	String b = "Akash";
	
	void Show() // method
		  {
			System.out.println(a+ "  "+b);
		  }
}
class Test
{
	public static void main(String[] args)
	{
		Demo z=new Demo();
		z.Show();
	} // main end
} // class end



// output: 9 Akash

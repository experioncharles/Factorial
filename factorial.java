import java.io*

Class Factorial{
	public static void main(String args[])
	{
		int i,fact=1,num=5;
		System.out.println("Input the value");
		for(i=1;i<num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is",+fact);
	}

import java.io*


Class Factorial{
	public static void main(String args[])
	{
		int i,fact=1,n;
		System.out.println("Input the value");
		n = Integer.parseInt(System.console().readLine());
		for(i=1;i<n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is",+fact);
	}
}

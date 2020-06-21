import java.util.*;

public class calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Multiplication of "+a+" & "+b+" is "+multiplication(a,b));
		System.out.println("Addition of "+a+" & "+b+" is "+addition(a,b));
	}
	public static int multiplication(int a, int b)
	{
		return a*b;
	}
	public static int addition(int a, int b)
	{
		return a+b;
	}
}
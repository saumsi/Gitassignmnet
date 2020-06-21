

import java.util.*;
public class calculator
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Subtraction of a and b is "+subtraction(a,b));
		System.out.println("Division of a and b is "+division(a,b));
	}
	public static int subtraction(int a, int b)
	{
		return a-b;
	}
	public static int division(int a , int b)
	{
		return a/b;
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
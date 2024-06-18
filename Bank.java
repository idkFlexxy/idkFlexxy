import java.util.Scanner;
class PayOutBound extends Exception
{
	public PayOutBound(String problem)
	{
		super(problem);
	}
}
public class Bank
{
	public static void main( String args[ ] ) throws PayOutBound
	{
		int balance = 1000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Withdrawal Amount");
		int withdraw = sc.nextInt();
		if (balance < withdraw)
		{
			PayOutBound e = new PayOutBound("No balance please");
			throw e;
		}
		else
		{
			System.out.println("Draw & enjoy, Best wishes of the day");
		}
	}
}
import java.util.Scanner;
public class whileloops
{
	public static void main(String args[])
	{
		int num;
		int i=1;
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		while(i<=num)
		{
			System.out.println(i);
			i++;
		}
	}
}
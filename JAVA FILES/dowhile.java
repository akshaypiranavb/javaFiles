import java.util.Scanner;
public class dowhile
{
	public static void main(String args[])
	{
		int n;
		int i=1;
		System.out.println("Enter the limit : ");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		do{
			System.out.println(i);
			i++;
		}while(i<=n);
	}
}
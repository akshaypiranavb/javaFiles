import java.util.Scanner;
public class groupswitch
{
	public static void main(String args[])
	{
	char c;
	System.out.println("Enter a single character :");
	Scanner in=new Scanner(System.in);
	c=in.next().charAt(0);
	switch(c)
	{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		System.out.println(c+"is a vowel");
		break;
		default :
		System.out.println(c+"is a consonant");
		break;
	}
}
}
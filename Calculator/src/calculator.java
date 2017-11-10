import java.util.*;
public class calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,ch;
		Scanner s=new Scanner(System.in);
		
		do {
		System.out.println("Enter your option:");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		ch=s.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter first value:");
				a=s.nextInt();
				System.out.println("Enter Second value:");
				b=s.nextInt();
				System.out.println("Addition of two numbers is : "+(a+b)+"\n");
				break;
		case 2: System.out.println("Enter first value:\n");
				a=s.nextInt();
				System.out.println("Enter Second value:\n");
				b=s.nextInt();
				System.out.println("Subtraction of two numbers is : "+(a-b)+"\n");
				break;		
		case 3: System.out.println("Enter first value:\n");
				a=s.nextInt();
				System.out.println("Enter Second value:\n");
				b=s.nextInt();
				System.out.println("Multiplication of two numbers is : "+(a*b)+"\n");
				break;
		case 4: System.out.println("Enter first value:\n");
				a=s.nextInt();
				System.out.println("Enter Second value:\n");
				b=s.nextInt();
				if(b!=0)
				{
					System.out.println("Division of two numbers is : "+(a/b)+"\n");
				}
				else
				{
					System.out.println("Second value must be NON-ZERO");
				}
				break;
		case 5: System.exit(0);
				break;
		default:System.out.println("Enter correct option\n");
				break;
		}	
		}while(ch!=5);
s.close();
	}

}

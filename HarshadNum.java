import java.util.Scanner;

public class HarshadNum {

	public static void main(String[] args) {
		int input;
		int remainder=0;
		int sum=0;
		int quotient=0;
		int secondVariable=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The Number:");
		input=in.nextInt();
		secondVariable=input;
	while(secondVariable!=0) {
			remainder=secondVariable%10;
			sum=sum+remainder;
			secondVariable=secondVariable/10;
	      
	}
	      System.out.println(sum);
			
			if(input%sum==0)
			{
				System.out.println(input+" is Harshad");
				
			}
			else
				System.out.println(input+" is not harshad");
		

	}

}

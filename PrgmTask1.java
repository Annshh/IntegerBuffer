import java.util.Scanner;

public class PrgmTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner a= new Scanner(System.in);
		
		System.out.println("Enter an integer between 0 and 1000 ");
		int m= a.nextInt();
		int temp=m;
		int sum=0;
		if(m>=0 && m<=9)
		{
			sum=m;
			System.out.println("The sum of :"+temp+": number is " +sum);
		}
		else if(m>=10 && m<=99)
		{
			sum=m%10;
			m=m/10;
			sum=sum+m;
			System.out.println("The sum of :"+temp+": number is " +sum);
		}
		
		else if(m>=100 && m<=999)
		{
			n=m%10;
			sum=sum+n;
			m=m/10;
			n=m%10;
			sum=sum+n;
			m=m/10;
			sum=sum+m;
			System.out.println("The sum of :"+temp+": number is " +sum);
		}
		
		else if(m==1000)
		{
			System.out.println("Sum of 1000 is :1");
		}
		
		else {
			System.out.println("Invalid Number");
		}
		
		}
}



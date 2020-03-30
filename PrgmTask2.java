import java.util.Scanner;

public class PrgmTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the amount of water in kilograms to calculate the energy needed to heat water");
		Scanner in=new Scanner(System.in);
		double M=in.nextDouble();
		
		System.out.println("Enter the initial temperature");
		double initial_temp=in.nextDouble();
		
		System.out.println("Enter the final temperature");
		double final_temp=in.nextDouble();
		
		double q=calculation(M,initial_temp,final_temp);
		
		System.out.println("The energy needed is "+q);
		
		}
	public static double calculation(double M, double initial_temp, double final_temp)
	{
		double Q= M*(final_temp - initial_temp ) * 4184;
		
		return Q;
	
	}

}

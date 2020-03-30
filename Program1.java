
import java.util.Scanner;

public class Program1 {

	public static int a;
	public static int n[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] arr;
		System.out.println("Enter the number of elements in the array");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		
		if (a > 0) {
			n = new int[a];
			if (a == (int) a) {

				System.out.println("Enter the elements in the array");
				arr = new double[(n.length)];

				for (int i = 0; i < n.length; i++) {
					arr[i] = in.nextDouble();
				}

				double max = greatest(arr);

				System.out.println("The greatest number in the array is " + max);
			} else {
				System.out.println("Enter a valid number");
			}
		}
		else
		{
			System.out.println("Wrong input value");
		}
	}

	static double greatest(double[] arr) {
		int i;

		double max = arr[0];

		for (i = 1; i < n.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}
}

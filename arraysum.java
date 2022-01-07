package jan5Assiment;
import java.util.Scanner;

public class arraysum {
	
	public static int sumArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
			
			
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter array value : ");
			int arrNo=sc.nextInt();
			arr[i]=arrNo;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
			
		}
		System.out.println("Sum of array is : ");
		System.out.println(sumArray(arr));
		
	}

}

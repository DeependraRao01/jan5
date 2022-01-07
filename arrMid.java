package jan5Assiment;
import java.util.Scanner;

public class arrMid {
	public static int Midarr(int[] arr) {
		int mid_element=0;
		int mid=(arr.length/2)+1;
		for(int i=0;i<mid;i++) {
			mid_element=arr[i];
		}
		return mid_element;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter array value : ");
			int arrval=sc.nextInt();
			arr[i]=arrval;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(Midarr(arr));

	}

}

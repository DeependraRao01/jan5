package jan5Assiment;
import java.util.Scanner;

public class positiveNo {

	
		public static void positive(int arr[]){

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.println(arr[i]+" ");;
            }
            else{
                continue;
            }
        }
    }
    public static void main(String[] args) {
        int mark[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            mark[i]= sc.nextInt();
        }
        positive(mark);

    }

	

}

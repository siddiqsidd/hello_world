package jan27;
import java.util.Scanner;
public class armstrong {
	public static void main(String[] args) {
//		int count=0;int arm;int n;

	//	int a=0;
/*		while(a<=999) {
			 n=a;
			arm=0;
		
		while(n>0){
			int i =n%10;
			arm=arm+(i*i*i);
			n=n/10;
		}
		
		if(arm==a) {
		System.out.println(a);
		}
		a++;*/
		        Scanner sc= new Scanner(System.in);
		        System.out.println("Enter the limit :");
		        int limit= sc.nextInt();
		        for(int i=0; i<limit;i++){
		            // i --> if armtsrong or not
		            if (isArmstrong(i)){
		                System.out.print(i+ ",");
		            }
		        }
		    }
		    private static boolean isArmstrong(int num){
		        int temp=num, digit=0,sum=0;
		        // number of digits
		        while (temp>0){
		            temp=temp/10;
		            digit= digit+1;
		        }
		        temp =num;
		        // logic to check armstrong
		        while (temp>0){
		            int lastDigit=temp%10;
		            sum+= Math.pow(lastDigit,digit);
		            temp=temp/10;
		        }
		        return sum==num ? true: false;
		    }


	
}



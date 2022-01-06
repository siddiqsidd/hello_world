package jan5;

import java.io.*;
import java.util.Scanner;

public class perfectsquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int f=1; f<=n; f++) {
			if(n%f==0) {
				count = count+1;
				
				}
		}
		if(count%2!=0) {
			System.out.println("Perfect Square");
		}else {
			System.out.println("Not Perfect Square");
		}

	}

}

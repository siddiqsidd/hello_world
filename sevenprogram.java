package jan24assignment;
import java.util.*;
public class sevenprogram {
	public static void main(String[] args) {
		int a; int b; int avg;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
			System.out.println("a is maximum" +a );
		else
			System.out.println("b is maximum" +b);
		if(a<b)
			System.out.println(a+"is minimum");
		else
			System.out.println(b+"is minimum");
		System.out.println((a+b)/2+ "is average");
		int n=1;
		while(n<11) {
			System.out.println(n);
			n++;
		}
		int m=10;
		while(m>0){
			System.out.println(m);
			m--;
		}
		
	}

}

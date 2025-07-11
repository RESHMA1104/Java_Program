import java.util.Scanner;
public class Sumofdigits
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    int a = obj.nextInt();
	    while(a>10){
	        int sum = 0;
	    while(a!=0){
	        sum+=a%10;
	        a = a/=10;
	    }
	    a = sum;
	    }
		System.out.println(a);
	}
}


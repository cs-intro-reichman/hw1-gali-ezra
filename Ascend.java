// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Random;
public class Ascend {
	public static void main(String[] args) {

		Random rand= new Random();
		int limit= Integer.parseInt(args[0]);
		int a= (rand.nextInt(limit));
		int b= (rand.nextInt(limit));
		int c= (rand.nextInt(limit));

		int min = Math.min((Math.min(a,b)),(Math.min(b,c)));
		int max = Math.max((Math.max(a,b)),(Math.max(b,c)));
		int middle= a+b+c-min-max;

		System.out.println(a +" " + b + " " +c);
		System.out.println(min  +" " + middle + " " +max);



	}
}

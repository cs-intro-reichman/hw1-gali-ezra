// Splits a restaurant bill evenly among three diners.

public class Bill3 {
	public static void main(String[] args) {

		System.out.println("enter first name");
	    String name1 = args[0];

		System.out.println("enter second name");
	    String name2 = args[1];

		System.out.println("enter third name");
	    String name3 = args[2];
		
		System.out.println("enter amount money");
	    int amount = Integer.parseInt(args[3]);
	    double splitAmount= Math.ceil((amount/3.0));

		System.out.println("Dear " + name1 + ", "+ name2 + " and " + name3 + ": pay " +(int) splitAmount + " Shekels each.");
	}
}

// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	

		//int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		//int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
		String time= args[0];
		int hours = Integer.parseInt(time.substring(0, 2));
		int minutes = Integer.parseInt(time.substring(3, 5));
		String newMinute = time.substring(3, 5);

		if (minutes<10)
		{
			newMinute= "0"+ minutes;
		}
		if (hours==12)
		{
			
			System.out.println(hours + ":" + newMinute + " PM");
		}
		//change the hours that bigger than 12 and print PM
		else if (hours > 12 && hours <24)
		{
			hours -= 12;
			System.out.println(hours + ":" + newMinute + " PM");
		}
 
		else
		{
			System.out.println(hours + ":" + newMinute + " AM") ;
		}
		
        
	}
}
package mymac;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * Horoscope Application
 * @author sahilgogna
 *
 */
public class Horoscope {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);    //scanner object to get command line input
		String userDate;                          // variable to store user entered date
		Boolean isValid;                          // variable indicating whether user input is valid or invalid
		String sign;                              // variable to store sign of user
		String element;                           // variable to store element of user 
		String[] compatibleSigns = new String[3]; // array to store compatible signs
		String dob[] = new String[3];
		int remain = 0;                           // variable for user choice to continue
		System.out.println(HoroscopeConstants.welcome);
		System.out.println(HoroscopeConstants.newLine);
		
		do{ // start of do
			int i=0;
			System.out.println(HoroscopeConstants.userInput);
			userDate = scan.next();
			Validator validator = new Validator(); // validator class object
			isValid = validator.isValidDate(userDate); // gets true or false depending upon valadity of user entered data
			if(isValid) {
				StringTokenizer tokens = new StringTokenizer(userDate,HoroscopeConstants.dateTokenizer); // spliting user entered data to extract day, maonth
				while(tokens.hasMoreTokens()) {
					dob[i]= tokens.nextToken();
					i++;
				}
				sign = finddHoroscopeSign(dob);    // calling method to get user sign according to entered data
				element = findElement(sign);	   // calling method to get user element according to entered data
				compatibleSigns = findCompatibleElements(element);  // calling method to get user compatible signs according to entered data
				printHoroscope(sign, element, compatibleSigns);     // calling print function to print results
			}else {
				System.out.println(HoroscopeConstants.invalidEntry);   // if user enter wrong format
			}
			System.out.println(HoroscopeConstants.continueText);
			try {
				remain = scan.nextInt();
			}catch (Exception e) {
				System.out.println(HoroscopeConstants.warningNote);
			}
			
		}//end of do
		while(remain == HoroscopeConstants.One);
		System.out.println(HoroscopeConstants.thanksNote);
	    scan.close();  // closing scanner object
	}
	
	/**
	 * 
	 * @param dob input is an array of strings containing date, month and year
	 * 
	 * @return sign evaluated according user entered date
	 */
	public static String finddHoroscopeSign(String[] dob) {
		
		String month = dob[1];
		int date = Integer.parseInt(dob[2]);
		String sign = null;
		switch(month) {// switch on month
		case HoroscopeConstants.January:
			if(date >= HoroscopeConstants.Twenty)
				sign = HoroscopeConstants.Aquarius;
			else sign = HoroscopeConstants.Capricorn;
			break;
			
		case HoroscopeConstants.February:
			if(date >= HoroscopeConstants.Nineteen)
				sign = HoroscopeConstants.Pisces;
			else sign = HoroscopeConstants.Aquarius;
			break;
			
		case HoroscopeConstants.March:
			if(date >= HoroscopeConstants.TwentyOne)
				sign = HoroscopeConstants.Aries;
			else sign = HoroscopeConstants.Pisces;
			break;
		
		case HoroscopeConstants.April:
			if(date >= HoroscopeConstants.Twenty)
				sign = HoroscopeConstants.Taurus;
			else sign = HoroscopeConstants.Aries;
			break;
		
		case HoroscopeConstants.May:
			if(date >= HoroscopeConstants.TwentyOne)
				sign = HoroscopeConstants.Gemini;
			else sign = HoroscopeConstants.Taurus;
			break;
			
		case HoroscopeConstants.June:
			if(date >= HoroscopeConstants.TwentyTwo)
				sign = HoroscopeConstants.Cancer;
			else sign = HoroscopeConstants.Gemini;
			break;
			
		case HoroscopeConstants.July:
			if(date >= HoroscopeConstants.TwentyThree)
				sign = HoroscopeConstants.Leo;
			else sign = HoroscopeConstants.Cancer;
			break;
			
		case HoroscopeConstants.August:
			if(date >= HoroscopeConstants.TwentyThree)
				sign = HoroscopeConstants.Virgo;
			else sign = HoroscopeConstants.Leo;
			break;
			
		case HoroscopeConstants.September:
			if(date >= HoroscopeConstants.TwentyThree)
				sign = HoroscopeConstants.Libra;
			else sign = HoroscopeConstants.Virgo;
			break;
			
		case HoroscopeConstants.October:
			if(date >= HoroscopeConstants.TwentyThree)
				sign = HoroscopeConstants.Scorpio;
			else sign = HoroscopeConstants.Libra;
			break;
			
		case HoroscopeConstants.November:
			if(date >= HoroscopeConstants.TwentyTwo)
				sign = HoroscopeConstants.Sagittarius;
			else sign = HoroscopeConstants.Scorpio;
			break;
			
		case HoroscopeConstants.December:
			if(date >= HoroscopeConstants.TwentyTwo)
				sign = HoroscopeConstants.Capricorn;
			else sign = HoroscopeConstants.Sagittarius;
			break;
		}// end switch
		
		return sign;
	}

	/**
	 * 
	 * @param sign 
	 * 
	 * @return element based on input sign
	 */
	public static String findElement(String sign) {
		String element = null;
		if(sign.equals(HoroscopeConstants.Aries) || sign.equals(HoroscopeConstants.Leo) || sign.equals(HoroscopeConstants.Sagittarius))
			element = HoroscopeConstants.Fire;
		
		else if(sign.equals(HoroscopeConstants.Taurus) || sign.equals(HoroscopeConstants.Virgo) || sign.equals(HoroscopeConstants.Capricorn))
			element = HoroscopeConstants.Earth;
		
		else if(sign.equals(HoroscopeConstants.Gemini) || sign.equals(HoroscopeConstants.Libra) || sign.equals(HoroscopeConstants.Aquarius))
			element = HoroscopeConstants.Air;
		
		else if(sign.equals(HoroscopeConstants.Cancer) || sign.equals(HoroscopeConstants.Scorpio) || sign.equals(HoroscopeConstants.Pisces))
			element = HoroscopeConstants.Water;
		
		return element;
	}
	
	/**
	 * 
	 * @param element
	 * 
	 * @return array of compatible signs according to element
	 */
	public static String[] findCompatibleElements(String element) {
		
		String[] compatibleSign = new String[3];
		if(element.equals(HoroscopeConstants.Fire)){
			compatibleSign[0] = HoroscopeConstants.Aries;
		    compatibleSign[1] = HoroscopeConstants.Leo;
			compatibleSign[2] = HoroscopeConstants.Sagittarius;
		}
		
		else if(element.equals(HoroscopeConstants.Earth)){
			compatibleSign[0] = HoroscopeConstants.Taurus;
		    compatibleSign[1] = HoroscopeConstants.Virgo;
			compatibleSign[2] = HoroscopeConstants.Capricorn;
		}
		
		else if(element.equals(HoroscopeConstants.Air)){
			compatibleSign[0] = HoroscopeConstants.Gemini;
		    compatibleSign[1] = HoroscopeConstants.Libra;
			compatibleSign[2] = HoroscopeConstants.Aquarius;
		}
		
		else if(element.equals(HoroscopeConstants.Water)){
			compatibleSign[0] = HoroscopeConstants.Cancer;
		    compatibleSign[1] = HoroscopeConstants.Scorpio;
			compatibleSign[2] = HoroscopeConstants.Pisces;
		}
		
		return compatibleSign;
	}
	
	/**
	 * 
	 * @param sign
	 * @param element
	 * @param compatibleSigns
	 * 
	 * prints the results
	 */
	public static void printHoroscope(String sign, String element, String[] compatibleSigns) {
		System.out.println(HoroscopeConstants.signPrint+sign);
		System.out.println(HoroscopeConstants.elementPrint+element);
		System.out.println(HoroscopeConstants.compatibleSignPrint);
		for(int i=0; i<3;i++) {
			System.out.println(HoroscopeConstants.blank+(i+1)+HoroscopeConstants.dot+HoroscopeConstants.space+compatibleSigns[i]);
		}
	}
}

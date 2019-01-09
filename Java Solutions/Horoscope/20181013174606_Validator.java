package mymac;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * validator class to check validity of user entered data
 * @author sahilgogna
 *
 */
public class Validator {
	/**
	 * method to check validity of date according to a defined format
	 * @param inDate
	 * @return
	 */
	public boolean isValidDate(String inDate) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat(HoroscopeConstants.pattern);
	    dateFormat.setLenient(false);
	    try {
	      dateFormat.parse(inDate.trim());
	    } catch (ParseException pe) {
	      return false;
	    }
	    return true;
	  }
}

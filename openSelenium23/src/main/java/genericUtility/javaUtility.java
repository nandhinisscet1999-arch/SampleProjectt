package genericUtility;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class javaUtility {

	public int randomNumber() {
		Random ran = new Random();
		int data = ran.nextInt(5000);
		return data;

	}

	public String getSystemDateYYYYDDMM() {
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		return date;
	}

	public String getRequiredDateYYYYMMDD(int days) {
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, days);

		return sim.format(cal.getTime());
	}

	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");

	}

}

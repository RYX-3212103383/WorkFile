package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		CalenderTest();
	}
	public static void CalenderTest() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int scend = cal.get(Calendar.SECOND);
		int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.println(year + "年" + month + "月" + day + "日" + hour + ":" + minute + ":" + scend + "周" + week);
	}
}

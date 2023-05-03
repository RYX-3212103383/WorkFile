package test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws ParseException {
		DateFormatTest();
	}


	private static void DateFormatTest() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss EE");
		Date now = new Date();
		String format = sdf.format(now);
		System.out.println(format);
		String time = "2023-04-27 02:21:55 星期四";
		Date ti = sdf.parse(time);
		System.out.println(ti);
	}
}

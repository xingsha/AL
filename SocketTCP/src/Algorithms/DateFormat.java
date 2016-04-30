package Algorithms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-ww-DD MM-WW-dd HH-mm-ss-SS");
		Date date = new Date();
		System.out.println(sdf.format(date));
	}

}

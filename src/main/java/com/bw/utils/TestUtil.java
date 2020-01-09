package com.bw.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestUtil {
	
	public static void main(String[] args) {
		
		/*int age = DateUtil.getAge("1996-03-20");
		System.out.println(age);*/
		
	/*	Date init = DateUtil.getDateByMonthInit(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
		String string = format.format(init);
		System.out.println(string);*/
		
		/*Date init = DateUtil.getDateByMonthLast(new Date());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
		String string = format.format(init);
		System.out.println(string);*/
		
		/*int i = DateUtil.getDaysByFuture(new Date());
		System.out.println(i);*/
		
		int i = DateUtil.getDaysByDeparted(new Date());
		System.out.println(i);
	}
}

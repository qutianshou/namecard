package com.zhongwei.namecard.miniapp.utils;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;

@Service
public class DataUtils {
	
	
	/**
	 * 将时间戳转为yyyy-MM-dd HH:mm:ss格式是字符串
	 * @param millis
	 * @return
	 */
	public static String millisToString(long millis) {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		GregorianCalendar gc = new GregorianCalendar(); 
		gc.setTimeInMillis(millis);
		String dateStr = dateformat.format(gc.getTime());
		return dateStr;
	}
	
	public static String getCurrTime() {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmSSsss");
		long nowTime = System.currentTimeMillis();
		GregorianCalendar gc = new GregorianCalendar(); 
		gc.setTimeInMillis(nowTime);
		String dateStr = dateformat.format(gc.getTime());
		return dateStr;
	}

}

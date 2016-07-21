package com.acube.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.springframework.util.StringUtils;

import com.acube.common.domain.TimeSpan;

public class CmnDateUtils {
	static public String getCurHour(int day) {
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("HH");
		cal.add(Calendar.DATE, day);
		String hour = sdf.format(cal.getTime());
		return hour;
	}

	static public String plusOrMinusMinsDate(Date date, int plusOrMinusMins) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.MINUTE, plusOrMinusMins);
		Date ret = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format(ret);
	}

	static public String addDate(int day) {
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		cal.add(Calendar.DATE, day);
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addDate(String dateStr, int day) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			if (!StringUtils.isEmpty(dateStr)) {
				date = (Date) formatter.parse(dateStr);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (date == null)
			cal.add(Calendar.DATE, day);
		else {
			cal.setTime(date);
			cal.add(Calendar.DATE, day);
		}
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addDate(String dateStr, int day, String pattern) {
		DateFormat formatter = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			if (!StringUtils.isEmpty(dateStr)) {
				date = (Date) formatter.parse(dateStr);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		if (date == null)
			cal.add(Calendar.DATE, day);
		else {
			cal.setTime(date);
			cal.add(Calendar.DATE, day);
		}
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addDate(Date date, int day) {
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (date == null)
			cal.add(Calendar.DATE, day);
		else {
			cal.setTime(date);
			cal.add(Calendar.DATE, day);
		}
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addDate(Date date, int day, String pattern) {
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		if (date == null)
			cal.add(Calendar.DATE, day);
		else {
			cal.setTime(date);
			cal.add(Calendar.DATE, day);
		}
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addMonth(int month) {
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		cal.add(Calendar.MONTH, month);
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addMonth(String dateStr, int month) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			if (!StringUtils.isEmpty(dateStr)) {
				date = (Date) formatter.parse(dateStr);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (date == null)
			cal.add(Calendar.MONTH, month);
		else {
			cal.setTime(date);
			cal.add(Calendar.MONTH, month);
		}
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addMonth(String dateStr, int month, String pattern) {
		DateFormat formatter = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			if (!StringUtils.isEmpty(dateStr)) {
				date = (Date) formatter.parse(dateStr);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		if (date == null)
			cal.add(Calendar.MONTH, month);
		else {
			cal.setTime(date);
			cal.add(Calendar.MONTH, month);
		}
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addMonth(Date date, int month) {
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		if (date == null)
			cal.add(Calendar.MONTH, month);
		else {
			cal.setTime(date);
			cal.add(Calendar.MONTH, month);
		}
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public String addMonth(Date date, int month, String pattern) {
		Calendar cal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		if (date == null)
			cal.add(Calendar.MONTH, month);
		else {
			cal.setTime(date);
			cal.add(Calendar.MONTH, month);
		}
		String date1 = sdf.format(cal.getTime());
		return date1;
	}

	static public int dateDiff(String beginDateStr, String endDateStr) {

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = null;
		Date endDate = null;
		try {
			if (!StringUtils.isEmpty(beginDateStr)) {
				beginDate = (Date) formatter.parse(beginDateStr);
			}
			if (!StringUtils.isEmpty(endDateStr)) {
				endDate = (Date) formatter.parse(endDateStr);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long diff = endDate.getTime() - beginDate.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);

		return (int) diffDays;
	}

	static public int dateDiff(Date beginDate, Date endDate) {
		long diff = endDate.getTime() - beginDate.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);

		return (int) diffDays;
	}

	static public int dateDiff(Date beginDate, Date endDate, TimeSpan timeSpan) {
		long diff = endDate.getTime() - beginDate.getTime();
		long diffDays = 0l;
		if (timeSpan == TimeSpan.DAY) {
			diffDays = diff / (24 * 60 * 60 * 1000);
		} else if (timeSpan == TimeSpan.HOUR) {
			diffDays = diff / (60 * 60 * 1000);
		} else if (timeSpan == TimeSpan.MINUTE) {
			diffDays = diff / (60 * 1000);
		} else if (timeSpan == TimeSpan.SECOND) {
			diffDays = diff / (1000);
		}

		return (int) diffDays;
	}

	static public String getStrDateFormat(Date date) {
		return getStrDateFormat(date, "yyyy-MM-dd");
	}

	static public String getStrDateFormat(Date date, String dateFormat) {
		if (date == null)
			return "";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}

	static public Date getDate(String dateStr, String pattern) {
		DateFormat formatter = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			if (!StringUtils.isEmpty(dateStr)) {
				date = (Date) formatter.parse(dateStr);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	static public boolean checkValidDate(String dateStr) {
		return checkValidDate(dateStr, "yyyyMMdd");
	}

	static public boolean checkValidDate(String dateStr, String pattern) {
		DateFormat formatter = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			if (!StringUtils.isEmpty(dateStr)) {
				// 이게 초과되는 날짜이면 에러를 내는게 아니라 초과되는 일수를 다음달로 이월시켜 계산하드라...
				date = (Date) formatter.parse(dateStr);
			} else {
				return false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = 1 + cal.get(Calendar.MONTH);
		String month2 = month < 10 ? ("0" + month) : "" + month;
		String date2 = cal.get(Calendar.DATE) < 10 ? ("0" + cal.get(Calendar.DATE)) : "" + cal.get(Calendar.DATE);
		String changedDate = cal.get(Calendar.YEAR) + "" + month2 + date2;
		// 그래서 원래 날짜와 같은지 다시 비교하여 다르면 유효하지 않은 것임..
		return dateStr.equals(changedDate);
	}

	public static long getDateDiff(Date fromDate, Date toDate, TimeUnit timeUnit) {
		long diffInMillies = toDate.getTime() - fromDate.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}

	public static Date getZeroDate(Date date, String time) {
		String curDateStr = CmnDateUtils.getStrDateFormat(date, "yyyyMMdd");
		String timeStr = time.replace(":", "");
		if ("23:59".equals(time)) {
			timeStr = timeStr + "59";
		} else {
			timeStr = timeStr + "00";
		}
		curDateStr += timeStr;
		return CmnDateUtils.getDate(curDateStr, "yyyyMMddHHmmss");
	}

	public static String getZeroDateStr(Date date, String time) {
		String curDateStr = CmnDateUtils.getStrDateFormat(date, "yyyyMMdd");
		String timeStr = time.replace(":", "");
		if ("23:59".equals(time)) {
			timeStr = timeStr + "59";
		} else {
			timeStr = timeStr + "00";
		}
		curDateStr += timeStr;
		return CmnDateUtils.getStrDateFormat(CmnDateUtils.getDate(curDateStr, "yyyyMMddHHmmss"), "yyyyMMddHHmmss");
	}

	public static Date getFirstTime(Date workDate) {
		return getFirstTime(workDate, null);
	}

	public static Date getFirstTime(Date workDate, String resultPattern) {
		if (StringUtils.isEmpty(resultPattern)) {
			resultPattern = "yyyy-MM-dd HH:mm:ss";
		}
		Date curDate = workDate;
		String curDateStr = getStrDateFormat(curDate, "yyyy-MM-dd") + " 00:00:00";
		Date retDate = getDate(curDateStr, resultPattern);
		return retDate;
	}

	public static Date getLastTime(Date workDate) {
		return getLastTime(workDate, null);
	}

	public static Date getLastTime(Date workDate, String resultPattern) {
		if (StringUtils.isEmpty(resultPattern)) {
			resultPattern = "yyyy-MM-dd HH:mm:ss";
		}
		Date curDate = workDate;
		String curDateStr = getStrDateFormat(curDate, "yyyy-MM-dd") + " 23:59:59";
		Date retDate = getDate(curDateStr, resultPattern);
		return retDate;
	}
}

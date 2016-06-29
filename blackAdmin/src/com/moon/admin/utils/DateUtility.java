package com.moon.admin.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

public class DateUtility
{
  public static final Calendar getCalendarFromYYYYMMDD(String dateStr)
  {
    Calendar mydate = getNowCalendar();
    mydate.set(Integer.parseInt(dateStr.substring(0, 4)), 
      Integer.parseInt(dateStr.substring(4, 6)) - 1, 
      Integer.parseInt(dateStr.substring(6, 8)));

    return mydate;
  }
  
  public static final Calendar getCalendarFromYYYY_MM_DD(String dateStr)
  {
	  Calendar mydate = getNowCalendar();
	  mydate.set(Integer.parseInt(dateStr.substring(0, 4)), 
			  Integer.parseInt(dateStr.substring(5, 7)) - 1, 
			  Integer.parseInt(dateStr.substring(8, 10)));
	  
	  return mydate;
  }

  public static final Calendar getCalendarFromYYYYMMDDHHmmss(String dateStr)
  {
    Calendar mydate = getNowCalendar();
    mydate.set(Integer.parseInt(dateStr.substring(0, 4)), 
      Integer.parseInt(dateStr.substring(4, 6)) - 1, 
      Integer.parseInt(dateStr.substring(6, 8)), 
      Integer.parseInt(dateStr.substring(8, 10)), 
      Integer.parseInt(dateStr.substring(10, 12)), 
      Integer.parseInt(dateStr.substring(12, 14)));

    return mydate;
  }
  
  //add by mengxin  2014-11-14 带格式化日期字符串转换Calendar
  public static final Calendar getCalendarFromYYYYMMDDHHmmss2(String dateStr)
  {
	  Calendar mydate = getNowCalendar();
	  mydate.set(Integer.parseInt(dateStr.substring(0, 4)), 
			  Integer.parseInt(dateStr.substring(5, 7)) - 1, 
			  Integer.parseInt(dateStr.substring(8, 10)), 
			  Integer.parseInt(dateStr.substring(11, 13)), 
			  Integer.parseInt(dateStr.substring(14, 16)), 
			  Integer.parseInt(dateStr.substring(17, 19)));
	  
	  return mydate;
  }
  
  public static final Calendar getCalendarFromYYYYMMDDHHmmss2_noSecond(String dateStr)
  {
	  Calendar mydate = getNowCalendar();
	  mydate.set(Integer.parseInt(dateStr.substring(0, 4)), 
			  Integer.parseInt(dateStr.substring(5, 7)) - 1, 
			  Integer.parseInt(dateStr.substring(8, 10)), 
			  Integer.parseInt(dateStr.substring(11, 13)), 
			  Integer.parseInt(dateStr.substring(14, 16)));
	  
	  return mydate;
  }

  private static final String formatCalendar(Calendar mydate, String pattern)
  {
    SimpleDateFormat format = new SimpleDateFormat(pattern);
    return format.format(mydate.getTime());
  }

  public static final String format2YYYY_MM_DD(Calendar mydate) {
    return formatCalendar(mydate, "yyyy-MM-dd");
  }

  public static final String format2YYYYMMDD(Calendar mydate) {
    return formatCalendar(mydate, "yyyyMMdd");
  }
  
  public static final String format2YYYYMMDD_CHS(Calendar mydate) {
	    return formatCalendar(mydate, "yyyy年MM月dd日");
  }
  
  //add by mengxin 2014-10-21
  public static final String format2YYYYMMDD_split(Calendar mydate) {
	  return formatCalendar(mydate, "yyyy.MM.dd");
  }

  public static final String format2MMDD(Calendar mydate) {
    return formatCalendar(mydate, "MMdd");
  }

  public static final String format2YYYYMM(Calendar mydate) {
    return formatCalendar(mydate, "yyyyMM");
  }
  public static final String format2YYYYMMDDHHmmss1(Calendar mydate) {
    return formatCalendar(mydate, "yyyy-MM-dd HH:mm:ss");
  }

  public static final String format2YYYYMMDDHHmmss2(Calendar mydate) {
    return formatCalendar(mydate, "yyyyMMddHHmmss");
  }

  public static final String format2YYYYMMDDHHmmsssss(Calendar mydate) {
    return formatCalendar(mydate, "yyyyMMddHHmmssSSS");
  }

  public static final String format2YYYY(Calendar mydate) {
    return formatCalendar(mydate, "yyyy");
  }

  public static final String format2HHmmss1(Calendar mydate) {
    return formatCalendar(mydate, "HH:mm:ss");
  }

  public static final String format2HHmm1(Calendar mydate) {
    return formatCalendar(mydate, "HH:mm");
  }

  public static final String format2mm1(Calendar mydate) {
    return formatCalendar(mydate, "mm");
  }

  public static final String format2mmss1(Calendar mydate) {
    return formatCalendar(mydate, "mm:ss");
  }

  public static final Calendar getNowCalendar() {
    Calendar mydate = GregorianCalendar.getInstance();
    mydate.setFirstDayOfWeek(2);
    mydate.setMinimalDaysInFirstWeek(7);
    return mydate;
  }

  public static final String getNowYYYY_MM_DD() {
    Calendar mydate = getNowCalendar();
    return format2YYYY_MM_DD(mydate);
  }

  public static final String getNowYYYYMMDD() {
    Calendar mydate = getNowCalendar();
    return format2YYYYMMDD(mydate);
  }

  public static final String getNowYYYYMMDD_CHS() {
	  Calendar mydate = getNowCalendar();
	  return format2YYYYMMDD_CHS(mydate);
  }
  
  //add by mengxin 2014-10-21
  public static final String getNowYYYYMMDD_split() {
	  Calendar mydate = getNowCalendar();
	  return format2YYYYMMDD_split(mydate);
  }
  
  public static final String getNowMMDD() {
    Calendar mydate = getNowCalendar();
    return format2MMDD(mydate);
  }

  public static final String getNowYYYYMM() {
    Calendar mydate = getNowCalendar();
    return format2YYYYMM(mydate);
  }

  public static final String getNowYYYYMMDDHHmmss1() {
    Calendar mydate = getNowCalendar();
    return format2YYYYMMDDHHmmss1(mydate);
  }

  public static final String getNowYYYYMMDDHHmmss2() {
    Calendar mydate = getNowCalendar();
    return format2YYYYMMDDHHmmss2(mydate);
  }

  public static final String getNowYYYYMMDDHHmmsssss() {
    Calendar mydate = getNowCalendar();
    return format2YYYYMMDDHHmmsssss(mydate);
  }

  public static final String getNowHHmmss1() {
    Calendar mydate = getNowCalendar();
    return format2HHmmss1(mydate);
  }

  public static final String getNowHHmm1() {
    Calendar mydate = getNowCalendar();
    return format2HHmm1(mydate);
  }

  public static final Calendar convertDate2Calendar(Date odate) {
    Calendar myCalendar = getNowCalendar();
    myCalendar.setTime(odate);
    return myCalendar;
  }

  public static final String pad2YYYYMMDDHHmmss(String date, boolean beginOrEnd)
  {
    String dateStr = date;
    String charP = beginOrEnd ? "0" : "9";
    int length = dateStr.length();
    if (length >= 14) {
      return dateStr;
    }

    for (int i = 0; i < 14 - length; i++)
      dateStr = dateStr + charP;
    return dateStr;
  }
  
  /** 
   * @Title: getDateFormat
   * @Class: DateUtils.java
   * @Description: 获取转换格式
       
   * @return
      
   * @AuthorOriginally DSY
   */ 
  public static DateFormat getDateFormat(String pattern) {
    	  SimpleDateFormat ymd_1 = new SimpleDateFormat(pattern);
          return ymd_1;
  }
  
  /** 
   * @Title: str2Date
   * @Class: DateUtils.java
   * @Description: 字符串转换Date
       
   * @param str    Date字符串
   * @return
      
   * @AuthorOriginally DSY
   */ 
  public static Date str2Date(String str,String pattern) {
      try {
          return getDateFormat(pattern).parse(str);
      } catch (Exception e) {
          return null;
      }
  }
  /** 
   * @Title: getMargin
   * @Class: DateUtils.java
   * @Description: 比较两个日期相差的天数
       
   * @param date1
   * @param date2
   * @return
      
   * @AuthorOriginally DSY
   */ 
  public static int getMargin(String date1, String date2) {
      int margin;
      try {
          Date dt1 = str2Date(date1,"yyyy-MM-dd");
          Date dt2 = str2Date(date2,"yyyy-MM-dd");
          long l = dt1.getTime() - dt2.getTime();
          margin = (int) (l / (24 * 60 * 60 * 1000));
          return margin;
      } catch (Exception e) {
          return 0;
      }
  }
  
  /**
   * @Title: date2StrYHM
   * @Class: DateUtil.java
   * @Package: com.tw.sys.util
   * @Description:格式化日期为yyyy-MM-dd
   
   *@param date
   *@return
   
   * @AuthorOriginally DSY
   * @date 2014年8月22日 下午1:15:22
   */
  public static String date2StrYHM(Date date){
  	return date2Str(date, "yyyy-MM-dd");
  }
  
  /** 
   * @Title: date2Str
   * @Class: DateUtils.java
   * @Description: Date转换指定格式字符串
       
   * @param date
   * @param pattern    转换格式
   * @return
      
   * @AuthorOriginally DHL
   */ 
  public static String date2Str(Object date, String pattern) {
      try {
          if (org.apache.commons.lang.StringUtils.isEmpty(pattern)) {
              pattern="yyyy-MM-dd";
          }
          return getDateFormat(pattern).format(date);
      } catch (Exception e) {
          return null;
      }
  }
  
  /** 
   * @Title: getYear
   * @Class: DateUtils.java
   * @Description: 获得服务器当前日期的年份
       
   * @return
      
   * @AuthorOriginally DHL
   */ 
  public static String getYear() {
      try {
    	  Calendar calendar = Calendar.getInstance();
          return String.valueOf(calendar.get(Calendar.YEAR));
      } catch (Exception e) {
          return null;
      }
  }
  /** 
   * @Title: getMonth
   * @Class: DateUtils.java
   * @Description: 获得服务器当前日期的月份
       
   * @return
      
   * @AuthorOriginally DHL
   */ 
  public static String getMonth() {
      try {
    	  Calendar calendar = Calendar.getInstance();
          java.text.DecimalFormat df = new java.text.DecimalFormat();
          df.applyPattern("00;00");
          return df.format((calendar.get(Calendar.MONTH) + 1));
      } catch (Exception e) {
          return null;
      }
  }
  
  /**
   * 
   * @Title: getMonth2
   * @Class: DateUtility.java
   * @Package: com.dths.web.servlet.utils
   * @Description:获得服务器当前日期的月份 不补位
   * @return String
   * @AuthorOriginally mengxin
   * @date 2015-6-18 下午1:29:28
   */
  public static String getMonth2() {
      try {
    	  Calendar calendar = Calendar.getInstance();
          return String.valueOf((calendar.get(Calendar.MONTH) + 1));
      } catch (Exception e) {
          return null;
      }
  }
  
  /** 
   * @Title: getDay
   * @Class: DateUtils.java
   * @Description: 获得服务器当前月中的天数
       
   * @return
      
   * @AuthorOriginally DHL
   */ 
  public static String getDay() {
      try {
    	  Calendar calendar = Calendar.getInstance();
          return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
      } catch (Exception e) {
          return null;
      }
  }
  
  /**
   * 
   * @Title: addMonth
   * @Class: DateUtility.java
   * @Package: com.dths.web.servlet.utils
   * @Description:传入日期字符串增加相应月份(yyyy_MM_dd)
   * @param currentDate
   * @param nums
   * @return String
   * @AuthorOriginally mengxin
   * @date 2014-12-2 下午12:26:17
   */
  public static String addMonth_yyyy_MM_dd(String currentDate,int nums) {
	  	  if(StringUtils.isEmpty(currentDate))
	  		  return "";
    	  Calendar calendar = getCalendarFromYYYY_MM_DD(currentDate);
    	  if(nums==0)
    		  nums = 1;
    	  calendar.add(Calendar.MONTH, Integer.valueOf(nums));
          return DateUtility.format2YYYY_MM_DD(calendar);
  }
  
  /**
 * @Title: formateDateNum2DateStr
 * @Class: DateUtility.java
 * @Package: com.dths.web.servlet.utils
 * @Description:格式化日期 yyyyMMddHHmmss 转为 yyyy-MM-dd HH:mm:ss
 
 *@param dateNum
 *@return
 
 * @AuthorOriginally DSY
 * @date 2015年3月2日 下午5:46:51
 */
public static String formateDateNum2DateStr(String dateNum){
	  String dateStr = "";
	  if(dateNum.length()<14){
		  dateStr = dateNum;
	  }else{
		  String year = dateNum.substring(0,4);
		  String month = dateNum.substring(4,6);
		  String day = dateNum.substring(6,8);
		  String hour = dateNum.substring(8,10);
		  String min = dateNum.substring(10,12);
		  String sec = dateNum.substring(12,14);
		  dateStr = year+"-"+month+"-"+day+" "+hour+":"+min+":"+sec;
	  }
	  return dateStr;
  }

	/**
	 * 
	 * @Title: isValidDate
	 * @Class: DateUtility.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:验证字符串是否格式化时间
	 * @param DateStr
	 * @param fromatStr
	 * @return boolean
	 * @AuthorOriginally mengxin
	 * @date 2015-11-21 下午6:34:04
	 */
	public static boolean isValidDate(String DateStr,String fromatStr) {
		if(	StringUtils.isEmpty(fromatStr))
			fromatStr="yyyy-MM-dd";
	    boolean convertSuccess=true;
	    // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
	     SimpleDateFormat format = new SimpleDateFormat(fromatStr);
	     try {
	    	// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
	        format.setLenient(false);
	        format.parse(DateStr);
	     } catch (ParseException e) {
	        // e.printStackTrace();
	        //如果throw java.text.ParseException或者NullPointerException，就说明格式不对
	        convertSuccess=false;
	     } 
	     return convertSuccess;
	}
	
	/**
	 * 
	 * @Title: isValidDate
	 * @Class: DateUtility.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:验证字符串是否格式化时间 格式：20XX-[01-12]-[01-31]
	 * @param DateStr
	 * @return boolean
	 * @AuthorOriginally mengxin
	 * @date 2015-11-21 下午6:36:54
	 */
	public static boolean isValidDate(String DateStr) {
	    Pattern pattern = Pattern.compile("(20[0-9][0-9])-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])");
	    Matcher matcher = pattern.matcher(DateStr);
	    if (matcher.find()){
	    	return true;
	    }else {
	    	return false;
	    }
	}


	/**
	 * @Title: getMonthSpace
	 * @Class: DateUtility.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:获得两个日期的相差月份数
	 
	 *@param date1
	 *@param date2
	 *@return
	 *@throws ParseException
	 
	 * @AuthorOriginally DSY
	 * @date 2016年3月4日 下午5:52:29
	 */
	public static int getMonthSpace(String date1, String date2)
            throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();

        startCalendar.setTime(sdf.parse(date1));
        endCalendar.setTime(sdf.parse(date2));
        
        Calendar temp = Calendar.getInstance();
        temp.setTime(sdf.parse(date1));
        temp.add(Calendar.DATE, 1);
        
        int year = endCalendar.get(Calendar.YEAR)
                - startCalendar.get(Calendar.YEAR);
        int month = endCalendar.get(Calendar.MONTH)
                - startCalendar.get(Calendar.MONTH);

        if ((startCalendar.get(Calendar.DATE) == 1)
                && (temp.get(Calendar.DATE) == 1)) {
            return year * 12 + month + 1;
        } else if ((startCalendar.get(Calendar.DATE) != 1)
                && (temp.get(Calendar.DATE) == 1)) {
            return year * 12 + month;
        } else if ((startCalendar.get(Calendar.DATE) == 1)
                && (temp.get(Calendar.DATE) != 1)) {
            return year * 12 + month;
        } else {
            return (year * 12 + month - 1) < 0 ? 0 : (year * 12 + month);
        }

    }
	
	/**
	 * @Title: getMonthUp
	 * @Class: DateUtility.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:获取指定月份的上一个月
	 
	 *@param date
	 *@return
	 *@throws ParseException
	 
	 * @AuthorOriginally DSY
	 * @date 2016年3月7日 上午9:49:09
	 */
	public static String getMonthUp(String date)throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		 Calendar calendar = Calendar.getInstance();

		 calendar.setTime(sdf.parse(date));
        calendar.add(Calendar.MONTH, -1);//获取上个月月份
        return sdf.format(calendar.getTime());
	}
}

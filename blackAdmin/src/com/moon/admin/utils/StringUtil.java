package com.moon.admin.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.commons.lang3.StringUtils;

/**
 * 工具类-用于字符验证
 * @date 2014-04-15
 */
/** 
 * @ClassName: StringUtil 
 * @Description: 
 
 * @author DSY
 * @date 2014年11月25日 下午9:15:17 
 */ 
public final class StringUtil{
	/**
	 * 私有构造函数，防止被创建实例
	 *
	 */
	private static SimpleDateFormat datetimeformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private StringUtil(){
		
	}
	
    /**
     * 从文本text中找到regex首次匹配的字符串，不区分大小写
     * @param regex： 正则表达式
     * @param text：欲查找的字符串
     * @return regex首次匹配的字符串，如未匹配返回空
     */
	public static String getMatchedString(String regex,String text){
        Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        
        Matcher matcher=pattern.matcher(text);
 
        while(matcher.find()){
            return matcher.group(2);
        }
        
        return null;
    }
	public static String getCurrentTimeStr()
	{
		return datetimeformat.format(new Date());
	}
	
	/**
	 * 
	 * @Title: mapSSToMapSO
	 * @Class: StringUtil.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:把<String,String> AND <String,String[]> 转换为 <String,Object> 类型
	 * @param paramMapSS
	 * @return Map<String,Object>
	 * @AuthorOriginally mengxin
	 * @date 2014-8-26 下午5:20:24
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Map<String,Object> mapSSToMapSO(Map paramMapSS){
		Map<String,Object> returnMap=new HashMap<String,Object>();
		if(paramMapSS!=null){
			Set<Entry<String, Object>> entrySet = paramMapSS.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				if(entry.getValue() instanceof String[]){
					String[] value = (String[]) entry.getValue();
					returnMap.put(entry.getKey(), value[0]);
				}else if(entry.getValue() instanceof String){
					String value = (String) entry.getValue();
					returnMap.put(entry.getKey(), value);
				}
			}
		}
		return returnMap;
		
	}
	
	/**
	 * @Title: compareMaps
	 * @Class: StringUtil.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:比较两个map，相同key下的value是否相同，如果不同，则将oldMap的key，value放入到map中返回。
	 
	 *@param oldMap
	 *@param newMap
	 *@return
	 
	 * @AuthorOriginally DSY
	 * @date 2014年11月25日 下午9:01:08
	 */
	public static Map<String, String> compareMaps(Map<String, String> oldMap,Map<String, String> newMap){
		Map<String, String> map = new HashMap<String, String>();
		Set<String> keySet = newMap.keySet();
		for (String key : keySet) {
			String value1 = oldMap.get(key);
			String value2 = newMap.get(key);
			if(StringUtils.isEmpty(value2) && StringUtils.isEmpty(value1)){
				continue;
			}
			if(StringUtils.isEmpty(value1) || !value1.equals(value2)){
				map.put(key, value2);
			}
		}
		return map;
	}
	
	
	/**
	 * @Title: objectMap2StringMap
	 * @Class: StringUtil.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:Map(Object) 转成Map(String)
	 
	 *@param map
	 *@return
	 
	 * @AuthorOriginally DSY
	 * @date 2014年11月25日 下午9:16:38
	 */
	public static Map<String, String> objectMap2StringMap(Map<String, Object> map){
		Map<String, String> newMap = new HashMap<String, String>();
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = (String) map.get(key);
			newMap.put(key, value );
		}
		return newMap;
	}

	  /**
	 * @Title: substringBeforeLast
	 * @Class: StringUtil.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:返回最后一个指定字符串之前的所有字符
	 
	 *@param str
	 *@param separator
	 *@return
	 
	 * @AuthorOriginally DSY
	 * @date 2015年3月10日 下午1:20:05
	 */
	public static String substringBeforeLast(String str, String separator) {
		if ((StringUtils.isEmpty(str)) || (StringUtils.isEmpty(separator)))
			return str;

		int pos = str.lastIndexOf(separator);
		if (pos == -1)
			return str;

		return str.substring(0, pos);
	}

	public static boolean endsWithIgnoreCase(String str, String suffix) {
		return endsWith(str, suffix, true);
	}

	public static boolean endsWith(String str, String suffix) {
		return endsWith(str, suffix, false);
	}

	private static boolean endsWith(String str, String suffix,
			boolean ignoreCase) {
		if ((str == null) || (suffix == null))
			return ((str == null) && (suffix == null));

		if (suffix.length() > str.length())
			return false;

		int strOffset = str.length() - suffix.length();
		return str.regionMatches(ignoreCase, strOffset, suffix, 0,
				suffix.length());
	}

	/**
	 * @Title: getNumbers
	 * @Class: StringUtil.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:截取数字
	 
	 *@param content
	 *@return
	 
	 * @AuthorOriginally DSY
	 * @date 2015年4月23日 下午1:39:17
	 */
	public static String getNumbers(String content) {  
	    Pattern pattern = Pattern.compile("\\d+");  
	    Matcher matcher = pattern.matcher(content);  
	    while (matcher.find()) {  
	       return matcher.group(0);  
	    }  
	    return "";  
	} 
	
	/**
	 * @Title: isNullOrEmpty
	 * @Class: StringUtil.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:判断是否为空
	 
	 *@param str
	 *@return
	 
	 * @AuthorOriginally DSY
	 * @date 2015年8月20日 上午11:25:45
	 */
	public static boolean isNullOrEmpty(Object str){
		if(str==null || str.equals("")){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * @Title: StringFilter
	 * @Class: StringUtil.java
	 * @Package: com.dths.web.servlet.utils
	 * @Description:过滤掉特殊字符
	 
	 *@param str
	 *@return
	 *@throws PatternSyntaxException
	 
	 * @AuthorOriginally DSY
	 * @date 2015年8月26日 下午3:42:02
	 */
	public static String StringFilter(String str) throws PatternSyntaxException {
		// 只允许字母和数字
		// String regEx = "[^a-zA-Z0-9]";
		// 清除掉所有特殊字符
		String regEx = "[`~!@#$%^&*+=|{}':;',\\[\\].<>/?~！@#￥%……&*——+|{}【】‘；：”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}
}
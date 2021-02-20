package com.rj.bd;

import java.util.Date;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Month;

/**
 * @author 张箭
 *@ 日期时间工具-DateUtil
 */
public class testData 
{
    public static void main( String[] args )
    {    //1.获取当前日期
    	Date date = DateUtil.date();
    	System.out.println(date);
    	//2.当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
    	String now = DateUtil.now();
    	System.out.println(now);
    	//3.当前日期字符串，格式：yyyy-MM-dd
    	String today= DateUtil.today();
    	System.out.println(today);
    	//4.获取Date对象的某个部分
	    	Date date1 = DateUtil.date();
	    	//获得年的部分
	    	DateUtil.year(date1);
	    	System.out.println("年:"+DateUtil.year(date1));
	    	//获得月份，从0开始计数
	    	DateUtil.month(date1);
	    	System.out.println("月:"+DateUtil.month(date1));
	    	//获得月份枚举
	    	DateUtil.monthEnum(date1);
	    	System.out.println("枚举:"+DateUtil.monthEnum(date1));
	    //5.日期时间差	
	    	String dateStr1 = "2018-06-01 19:33:23";
	    	Date date2 = DateUtil.parse(dateStr1);

	    	String dateStr2 = "2017-04-01 21:33:23";
	    	Date date3 = DateUtil.parse(dateStr2);

	    	//相差一个月，31天
	    	long betweenDay = DateUtil.between(date1, date2, DateUnit.DAY);
	    	System.out.println("时间差："+betweenDay);
	    	
	    //6.星座和属相
	    	// "摩羯座"
	    	String zodiac = DateUtil.getZodiac(Month.APRIL.getValue(), 22);
            System.out.println("我的星座："+zodiac);
	    	// "狗"
	    	String chineseZodiac = DateUtil.getChineseZodiac(2000);
	    	System.out.println("我的属相："+chineseZodiac);
    }
}

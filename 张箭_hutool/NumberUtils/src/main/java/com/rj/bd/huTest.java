package com.rj.bd;

import java.math.BigDecimal;

import javax.swing.plaf.synth.SynthSeparatorUI;

import cn.hutool.core.lang.Console;
import cn.hutool.core.util.NumberUtil;
import junit.framework.Assert;
import net.sourceforge.pinyin4j.PinyinHelper;
/**
 * @desc 数字工具-NumberUtil的使用
 * @author 张箭
 *@time 2021-2-20
 */
public class huTest {

	public static void main(String[] args) {
		//1.定义两个double类型的变量
		double N = 3.334;
		double N2 = 1.264;
		double result;
		//2.对float、double、BigDecimal做加减乘除操作
		result = NumberUtil.add(N, N2);
	    System.out.println("double类型做加法:"+result);//加法
		result = NumberUtil.sub(N, N2);
	    System.out.println("double类型做减法:"+result);//减法
		result = NumberUtil.mul(N, N2);
	    System.out.println("double类型做乘法:"+result);//乘法
		result = NumberUtil.div(N, N2);
	    System.out.println("double类型做除法:"+result);//除法
        
	   //3.保留两位小数
	    BigDecimal roundNum = NumberUtil.round(N, 2);
	    System.out.println("保留两位小数："+roundNum);
	    
	    
	}

	

}

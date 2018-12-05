package com.xurongbiao.foundation.day08thirdchaptercontrol;
/**
 * 
 * @author 徐荣彪
 *
 */
public class CForCycle {
/*
 循环结构分两大类，一类是当型，一类是直到型。

 当型：

      当布尔表达式条件为true时，反复执行某语句，当布尔表达式的值为false时才停止循环，比如：while与for循环。

 直到型：

      先执行某语句， 再判断布尔表达式，如果为true，再执行某语句，如此反复，直到布尔表达式条件为false时才停止循环，比如do-while循环。
 */
	/*
	 * 方法的入口
	 */
	public static void main(String[] args) {
		CForCycle.testWhilecode();
	}
	/*
	 * 当型：循环结构
	 * while语句
	 */
	public static void testWhilecode() {
		/*
		while(布尔表达式) {
			循环体;
		}
		*/
		int a = 0;
		int b = 0;
		while(a<100) {
			a++;
			b+=a;
			if(a ==100) {
				System.out.println(a);
			}else {
				System.out.print(a+"+");
			}
		}
		System.out.print("="+b);
	}
}

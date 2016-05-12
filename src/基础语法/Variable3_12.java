package 基础语法;

public class Variable3_12 {

	public static void main(String[] args) {
		// 变量其实就是在JVM中一个暂存的位置
		// 如果想声明一个不再可以修改的变量，只需要在变量名和类型前增加关键字 final
		final double finalNumber = 10;
		// finalNumber = 111; 
		/*  再赋值会报错：The final local variable finalNumber cannot be assigned.
		 *  It must be blank and not using a compound assignment.
		 */
		
		
		// 忽略符
		// 使用Unicode字符编码来输出“hello”  可使用的情况是：想打的字符无法通过打字输入来输出
		System.out.println("\u0048\u0065\u006C\u006C\u006F");
		
		
		/*
		 * 在Java7之后，可以用下划线更清晰地表示数字
		 */
		int number1 = 1234_7890;
		double number2 = 3.14_149_265_4;
		System.out.println(number1);
		System.out.println(number2);
		
		/*
		 * 以二进制的方式爱表示数字,以 0b 为开头
		 */
		int mask = 0b10101011001;
		System.out.println(mask);
		
		
	}

}

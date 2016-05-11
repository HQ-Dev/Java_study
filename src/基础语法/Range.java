package 基础语法;


// 导入这个可以省略 System
import static java.lang.System.*; 

public class Range {
	
	public static void main(String[] args) {
		
	    out.println("Java 可以区分为 Primitive type and Class Type: 接下来演示基本类型的数值范围。");
		out.println();
		// byte short int long 的范围 (这些引用的都是类的静态成员变量)
		out.printf("Byte range: %d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		out.printf("Short range: %d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);;
		out.printf("Integer range: %d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		out.printf("Long range: %d ~ %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
		out.println("----------------------------------------------------------------");
		out.println();
		
		// float double精度范围
		out.printf("Float range: %d ~ %d%n", Float.MIN_EXPONENT, Float.MAX_EXPONENT);
		out.printf("Double range:  %d ~ %d%n", Double.MIN_EXPONENT, Double.MAX_EXPONENT);
		out.println("----------------------------------------------------------------");
		out.println();
		
		// char 可表示的unicode范围
	    out.printf("Character range: %h ~ %h%n", Character.MIN_VALUE, Character.MAX_VALUE);
	    out.println("----------------------------------------------------------------");
		out.println();
	    
		// boolean的两个值
		out.printf("Boolean range: %b ~ %b%n", Boolean.TRUE, Boolean.FALSE);
		out.println("----------------------------------------------------------------");
		out.println();
		
		// 可以确定输出值的精度
		out.printf("%.4f%n", 3.1415926);
		out.println("----------------------------------------------------------------");
		out.println();
		
		out.printf("example:%6.2f%n", 19.234);
		out.println("因为‘%6.2f’预留了6个字符的宽度，所有最后打印出的内容前面补了一个空格。");
		out.println("----------------------------------------------------------------");
		// 求阿姆斯特朗数
		int a =1;
		int b = 0;
		int c = 0;
		for (a=1;a<10;a++) 
			for (b=0;b<10;b++)
				for(c=0;c<10;c++)
					if (Math.pow(a,3)+Math.pow(b, 3)+Math.pow(c, 3) ==
							a*100+b*10+c){
						System.out.println(a*100+b*10+c);
					}
		
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[arr1.length];
		arr2 = arr1;
		for (int value : arr2) {
			System.out.printf("%d", value);			
		}
		
 		
	}

}

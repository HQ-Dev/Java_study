package 基础语法;

import static java.lang.System.*;

import java.io.ObjectOutputStream.PutField;

import javax.print.attribute.standard.PrinterLocation;

import org.omg.CORBA.OBJ_ADAPTER;
import org.omg.CORBA.ORB;

public class Operator {

	public static void main(String[] args) {

		out.println("AND 运算：");
		out.printf("0 AND 0 %5d%n", 0 & 0);
		out.printf("0 AND 1 %5d%n", 0 & 1);
		out.printf("1 AND 0 %5d%n", 1 & 0);
		out.printf("1 AND 1 %5d%n", 1 & 1);
		
		out.println("\nOR 运算：");
		out.printf("0 OR 0 %5d%n", 0 | 0);
		out.printf("0 OR 1 %5d%n", 0 | 1);
		out.printf("1 OR 0 %5d%n", 1 | 0);
		out.printf("1 OR 1 %5d%n", 1 | 1);
		
		out.println("\nXOR运算：");
		out.printf("0 XOR 0 %5d%n", 0 ^ 0);
		out.printf("0 XOR 1 %5d%n", 0 ^ 1);
		out.printf("1 XOR 0 %5d%n", 1 ^ 0);
		out.printf("1 XOR 1 %5d%n", 1 ^ 1);
		
		out.println("----------------------------------------");
		
		byte number = 0;
		out.print(~number);
		out.println("\n 因为byte占用一个字节，0在内存中是位00000000,经补码运算就变成了11111111,这个数字在计算机中用整数表示就是"
				+ "-1");
		
	}

}

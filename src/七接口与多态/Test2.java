package 七接口与多态;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test2 {

	public static void  main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("请输入内容：");
		
	    Set line = tokenSet( console.nextLine());
	    System.out.printf("收集的不重复的单词有%d 个， 分别是:%s", line.size(), line );
		
	}

	static Set tokenSet(String line) {
		String[] strings = line.split(" ");
		return new HashSet(Arrays.asList(strings));
	}


}


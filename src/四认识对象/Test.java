package 四认识对象;


public class Test {

	public static void main(String[] args) {
		// 第一题
		// 调用封装后的费氏数
		Fibonacci a = new Fibonacci(20);
		a.dosth();
		
		
	}

}

//封装后的费氏数
class Fibonacci {
	private int length = 0;
	private int[] number;
	
	public Fibonacci(int length) {
		this.length = length;
		this.number = new int[length];
	}
	
	protected void dosth() {
		for (int i= 0; i<length;i++){
			if (i == 0)
				number[i] = 0;
			else if (i==1)
				number[i] = 1;
			else 
			   number[i] = number[i-2] + number[i-1];
		}
		for (int a : number)
			System.out.print(a + " ");
	}
}

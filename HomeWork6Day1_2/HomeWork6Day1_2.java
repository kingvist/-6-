package HomeWork6Day1_2;
import HomeWork6Day1_1.HomeWork6Day1_1;
import java.util.*;
public class HomeWork6Day1_2 {
	public static void main(String[] args) {
		System.out.print("请输入要阶乘的数字：");
		Scanner i = new Scanner(System.in);
		int num = i.nextInt();
		HomeWork6Day1_1 j = new HomeWork6Day1_1();
		System.out.println("阶乘和为"+j.Factorial(num));
	}
}

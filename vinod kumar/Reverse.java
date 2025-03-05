import java.lang.StringBuilder;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.next();
		StringBuilder strb = new StringBuilder(str);
		String str_reverse = (strb.reverse()).toString();
		System.out.print(str_reverse);
	}
}

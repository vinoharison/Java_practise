import java.util.Scanner;

public class Rev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str_reverse="";
		for(int i= str.length()-1; i>=0; i++) {
			str_reverse += str.charAt(i);
		}
		System.out.print(str_reverse);
	}
}
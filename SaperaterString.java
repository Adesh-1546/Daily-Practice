package mock;
import java.util.Scanner;

public class SaperaterString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str = sc.nextLine();
		
		String alphabets = "";
		String digits = "";
		String specialChar ="";
		
		for (int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			
			if (Character.isAlphabetic(ch)) {
				alphabets += ch;
			}else if (Character.isDigit(ch)) {
				digits += ch;
			}else if (!Character.isWhitespace(ch)) {
				specialChar += ch;
			}
		}
		
		System.out.println("Alphabets : "+alphabets);
		System.out.println("Digits : "+digits);
		System.out.println("Special character : "+specialChar);
		
		sc.close();
	}

}

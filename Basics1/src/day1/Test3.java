package day1;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("Enter the sentence: ");
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		System.out.println("Enter the word that what u need to replace");
		String searchWord = s.next();
		System.out.println("Enter the word the word that u want to placed ");
		String replaceWord = s.next();

		String result = replaceWord(text, searchWord, replaceWord);
		System.out.println(result);
	}

	public static String replaceWord(String text, String searchWord, String replaceWord) {
		char[] textChars = text.toCharArray();
		char[] searchWordChars = searchWord.toCharArray();
		char[] replaceWordChars = replaceWord.toCharArray();
		int q = 0;
		int w = 0;
		int e = 0;
		for (char x : textChars) {
			q++;
		}
		for (char y : textChars) {
			w++;
		}
		for (char z : textChars) {
			e++;
		}

		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < q) {
			boolean matchFound = true;
			int j = 0;

			while (j < w) {
				if (i + j >= q  || textChars[i + j] != searchWordChars[j]) {
					matchFound = false;
					break;
				}
				j++;
			}

			if (matchFound) {
				sb.append(replaceWordChars);
				i += w;
			} else {
				sb.append(textChars[i]);
				i++;
			}
		}

		return sb + "";
	}
}
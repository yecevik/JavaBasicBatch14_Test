package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class StringWhileLoops {

	public static void main(String[] args) {
		String sentence = "it's a beautiful day!";

		Scanner aaa = new Scanner(sentence);

		ArrayList<String> words = new ArrayList<String>();

		while (aaa.hasNext()) {
			words.add(aaa.next());
		}
		System.out.println(words);
		System.out.println(sentence);
		
				
	}

}

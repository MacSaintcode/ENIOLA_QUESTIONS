package saintcoded;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;

public class Twice {
	String[] Word;
	String next;
//	boolean print;

	void repeat(String Input) {

		String[] Words = Input.split(" ");
		System.out.println(Arrays.toString(Words));

		for (int i = 0; i < Words.length; i++) {
			next = Words[i];
			boolean match=Pattern.matches(next,Input);
			if (match==false){
				Words[i].replace("", Input);
				continue;
			}
			/*else{
				continue;
			}*/
		}

	}
	public static void main(String[] args) {
		Twice call = new Twice();
		call.repeat("i lOve LoVe you Love");
	}

}

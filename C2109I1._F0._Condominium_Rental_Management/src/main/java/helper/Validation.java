package helper;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Validation {
	public static Boolean checkRegex(String regex , String str ) {
		while (true) {
			if (Pattern.compile(regex).matcher(str).matches()) {
				return true;
			} else {
				return false ;
			}
		}
	}
}

package helper;

public class RegexConst {
	public static final String SDT="^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
	public static final String TEN = "^([a-zA-Z]\\s*){5,25}$";
	public final static String DATE ="\\d{4}[-|/]\\d{2}[-|/]\\d{2}";
	public final static String CCCD = "^[0-9]{12}$";
	public final static String MK = "(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
	public final static String DC = "([a-zA-Z0-9]\\s*){5,25}";
	public final static String GT = "^[a-zA-Z]{1,3}$";
	public final static String SP = "[0-9]{1,2}";
	public final static String TT = "[0-9]{1,10}";
	public final static String THANG = "0?[1-9]|1[012]";
	public final static String TH = "([a-zA-Z0-9]\\s*){1,180}";
}

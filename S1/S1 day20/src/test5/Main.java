package test5;

public class Main {
	public static void main(String[] args) {
		String s1 = "Welcome to Java";
		String s2 = s1;
		String s3 = new String("we1come to Java");
		String s4 = "Welcome to Java";
		System.out.println("1.\t" + (s1 == s2));
		System.out.println("2.\t" + (s2 == s3));
		System.out.println("3.\t" + s1.equals(s2));
		System.out.println("4.\t" + s2.equals(s3));
		System.out.println("5.\t" + s1.compareTo(s2));
		System.out.println("6.\t" + s1.compareTo(s3));
		System.out.println("7.\t" + (s1 == s4));
		System.out.println("8.\t" + s1.charAt(0));
		System.out.println("9.\t" + s1.indexOf('j'));
		System.out.println("10.\t" + s1.indexOf("to"));
		System.out.println("11.\t" + s1.lastIndexOf('a'));
		System.out.println("12.\t" + s1.lastIndexOf("o", 15));
		System.out.println("13.\t" + s1.length());
		System.out.println("14.\t" + s1.substring(5));
		System.out.println("15.\t" + s1.substring(5, 11));
		System.out.println("16.\t" + s1.startsWith("Wel"));
		System.out.println("17.\t" + s1.endsWith("Java"));
		System.out.println("18.\t" + s1.toLowerCase());
		System.out.println("19.\t" + s1.toUpperCase());
		System.out.println("20.\t" + " Welcome ".trim());
		System.out.println("21.\t" + s1.replace('o', 'T'));
		System.out.println("22.\t" + s1.replaceAll("o", "T"));
		System.out.println("23.\t" + s1.replaceFirst("o", "T"));
		System.out.println("24.\t" + s1.toCharArray());
	}
}


public class Strings {
	public static void main(String[]args){
		String name = "Jonas";
		String name2 = "jonas";
		
		System.out.println("Hello my name is " + name);
		System.out.println(name.charAt(2));
		System.out.println(name.compareTo(name2));
		System.out.println(name.isEmpty());
		System.out.println(name.compareToIgnoreCase(name2));
		System.out.println(name.length());
		System.out.println(name.substring(1,3));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
	}
}

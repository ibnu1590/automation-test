package Element;

import java.util.ArrayList;

public class Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
		//2,4,6,8,10,122
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println("didalam for " + arr2[i]);
			if (arr2[i] % 2 == 0) {
//				System.out.println("didalam if " + arr2[i]);
			} else {
//				System.out.println("didalam else " + arr2[i]);
			}
		}
		
		//ArrayList
		ArrayList<String> a = new ArrayList<String>();
		a.add("Testing");
		a.add("ABC");
//		System.out.println("From ArrayList " + a.get(0));
		
		//String is an Object
		String s = "Muhammad Nur Ibnu Wicaksono";
//		String[] SplitedS = s.split("Nur");
//		System.out.println("String split " + SplitedS[1]);
		
		for (int i=0; i<s.length(); i++) {
//			System.out.println("Print String per Char " + s.charAt(i));
		}
		
		//reverse String
		for (int i=s.length()-1; i>=0; i--) {
			System.out.println("Print Reverse String per Char " + s.charAt(i));
		}
		
	}

}

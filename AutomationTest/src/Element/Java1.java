package Element;

public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data type
		int myNum = 5;
		String title = "Testing Java";
		char character = 'a';
		
		System.out.println("Data Type" + myNum + title + character);
		
		//array
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int[] arr2 = {1,2,3};
		String[] name = {"asu", "asi", "asa"};
		
		for (int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		for (String s : name) {
			System.out.println("in String s " + s);
		}
		
	}

}

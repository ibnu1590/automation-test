package Element;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java3 d = new java3();
		String name = d.getData();
		System.out.println("Isi Return " + name);
		
		java31 d2 = new java31();
		d2.getDataFromJava31();
		
		getData2();
		String name2 = getData2();
		System.out.println("Isi Return " + name2);
	}
	
	public String getData() {
		System.out.println("Hello!");
		return "Test";
	}
	
	//Static digunakan jika class nya digunakan didalam classnya sendiri
	public static String getData2() {
		System.out.println("Using Static");
		return "Test static";
	}

}

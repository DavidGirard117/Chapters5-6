package dg_ch5_ex5;

public class Bottles {

	public static void countdown(int b) {
		b = 0;
		if (b == 0) {
		 System.out.println("no bottles of beer on the wall,\r\n" + 
		 		"no bottles of beer,\r\n" + 
		 		"ya’ take one down, ya’ pass it around,\r\n" + 
		 		"no bottles of beer on the wall.");
		} else {
			System.out.println("bottles of beer on the wall,\r\n" + 
		 		"b bottles of beer,\r\n" + 
		 		"ya’ take one down, ya’ pass it around,\r\n" + 
		 		"b bottles of beer on the wall.");
		countdown(b - 1);
	}

}
}
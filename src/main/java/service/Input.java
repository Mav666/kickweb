package service;

import java.util.Scanner;

public class Input {
	private Scanner scan;

	public int read() {
		scan = new Scanner(System.in);
		return scan.nextInt();	
	}
	
	public long readLong() {
		scan = new Scanner(System.in);
		return scan.nextLong();		
	}
	
	public String readString() {
		scan = new Scanner(System.in);
		return scan.nextLine();		
	}

}

package classes;
import java.util.Scanner;

public class owners {
	Scanner myInput = new Scanner(System.in);
	
	
	private String name ;
	private String PhoneNumber;
	public owners() {};
	
	
	public owners(String name , String PhoneNumber ) {
		
		this.name=name;
		this.PhoneNumber=PhoneNumber;
	};
	public String GetName() {
		return name ;
	}
	public void SetName(String new_name) {
		name = new_name;
	}
	
	public String GetPhoneNumber() {
		return PhoneNumber ;
	}
	public void SetPhoneNumber(String NewPhoneNumber) {
		PhoneNumber = NewPhoneNumber;
	}
		

}

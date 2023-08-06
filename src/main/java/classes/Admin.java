package classes;
import java.util.ArrayList;


public class Admin {
	private String name;
	private String password;
	private String address;
	private String phoneNumber;
	ArrayList<House> arrayHouses = new ArrayList<House>();
	
	public String GetName() {
		return name ;
	}
	public void SetName(String new_name) {
		name = new_name;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void AddHouse(ArrayList <House> A) {
		House House1 = new House();
		for (int i=0 ; i<A.size() ; i++ ) {
			
		
	}
	}
}
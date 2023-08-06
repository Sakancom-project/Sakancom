package classes;
public class apartments {
	private int number ;
	private int which_floor;
	private int monthly_fee;
	private int number_person;
	private String space;
	private int bedroom_number;
	private int bathrooms_number;
	private int balcony_number;
	
	private String photo;
	private boolean Free_internet;
	private boolean Fees_include_water_electricity;
	

	public apartments() {};
	public apartments(int number,int which_floor,int monthly_fee,int number_person,String space,int bedroom_number, int bathrooms_number, int balcony_number, String photo,boolean Free_internet,boolean Fees_include_water_electricity) {
		this.number=number;
		this.which_floor=which_floor;
		this.monthly_fee=monthly_fee;
		this.number_person=number_person;
		this.space=space;
		this.bedroom_number=bedroom_number;
		this.bathrooms_number=bathrooms_number;
		this.balcony_number=balcony_number;
		this.photo=photo;
		this.Free_internet=Free_internet;
		this.Fees_include_water_electricity=Fees_include_water_electricity;
	};
	
	public int get_number() {
		return number;
	}
	public void set_number(int new_number) {
		number = new_number;
	}
	public int get_which_floor() {
		return which_floor;
	}
	public void set_which_floor(int new_which_floor) {
		which_floor = new_which_floor;
	}
	public int get_monthly_fee() {
		return monthly_fee;
	}
	public void set_monthly_fee(int new_monthly_fee) {
		monthly_fee = new_monthly_fee;
	}
	public int get_number_person() {
		return number_person;
	}
	public void set_number_person(int new_number_person) {
		number_person = new_number_person;
	}
	public String get_space() {
		return space;
	}
	public void set_space(String new_space) {
		space = new_space;
	}
	public int get_bedroom_number() {
		return  bedroom_number;
	}
	public void set_bedroom_number(int new_bedroom_number) {
		bedroom_number = new_bedroom_number;
	}
	public int get_bathrooms_number() {
		return bathrooms_number;
	}
	public void set_bathrooms_number(int new_bathrooms_number) {
		bathrooms_number = new_bathrooms_number;
	}
	public int get_balcony_number() {
		return balcony_number;
	}
	public void set_balcony_number(int new_balcony_number) {
		balcony_number = new_balcony_number;
	}
	public String get_photo() {
		return photo;
	}
	public void set_photo(String new_photo) {
		photo = new_photo;
	}
	public boolean get_Free_internet() {
		return Free_internet;
	}
	public void set_Free_internet(boolean new_Free_internet) {
		Free_internet = new_Free_internet;
	}
	public boolean get_Fees_include_water_electricity() {
		return Fees_include_water_electricity;
	}
	public void set_Fees_include_water_electricity(boolean new_Fees_include_water_electricity) {
		Fees_include_water_electricity = new_Fees_include_water_electricity;
	}
}

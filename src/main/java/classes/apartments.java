package classes;
public class apartments {
	private int number ;
	private int whichFloor;
	private int MonthlyFee;
	private int NumberPerson;
	private String space;
	private int BedroomNumber;
	private int BathroomsNumber;
	private int BalconyNumber;
	
	private String photo;
	private boolean FreeInternet;
	private boolean FeesIncludeWaterElectricity;
	

	public apartments() {};
	public apartments(int number,int whichFloor,int MonthlyFee,int NumberPerson,String space,int BedroomNumber, int BathroomsNumber, int BalconyNumber, String photo,boolean FreeInternet,boolean FeesIncludeWaterElectricity) {
		this.number=number;
		this.whichFloor=whichFloor;
		this.MonthlyFee=MonthlyFee;
		this.NumberPerson=NumberPerson;
		this.space=space;
		this.BedroomNumber=BedroomNumber;
		this.BathroomsNumber=BathroomsNumber;
		this.BalconyNumber=BalconyNumber;
		this.photo=photo;
		this.FreeInternet=FreeInternet;
		this.FeesIncludeWaterElectricity=FeesIncludeWaterElectricity;
	};
	
	public int GetNumber() {
		return number;
	}
	public void SetNumber(int NewNumber) {
		number = NewNumber;
	}
	public int GetWhichFloor() {
		return whichFloor;
	}
	public void SetWhichFloor(int NewWhichFloor) {
		whichFloor = NewWhichFloor;
	}
	public int GetMonthlyFee() {
		return MonthlyFee;
	}
	public void SetMonthlyFee(int NewMonthlyFee) {
		MonthlyFee = NewMonthlyFee;
	}
	public int GetNumberPerson() {
		return NumberPerson;
	}
	public void SetNumberPerson(int NewNumberPerson) {
		NumberPerson = NewNumberPerson;
	}
	public String GetSpace() {
		return space;
	}
	public void SetSpace(String NewSpace) {
		space = NewSpace;
	}
	public int GetBedroomNumber() {
		return  BedroomNumber;
	}
	public void SetBedroomNumber(int NewBedroomNumber) {
		BedroomNumber = NewBedroomNumber;
	}
	public int GetBathroomsNumber() {
		return BathroomsNumber;
	}
	public void SetBathroomsNumber(int NewBathroomsNumber) {
		BathroomsNumber = NewBathroomsNumber;
	}
	public int GetBalconyNumber() {
		return BalconyNumber;
	}
	public void SetBalconyNumber(int NewBalconyNumber) {
		BalconyNumber = NewBalconyNumber;
	}
	public String GetPhoto() {
		return photo;
	}
	public void SetPhoto(String NewPhoto) {
		photo = NewPhoto;
	}
	public boolean GetFreeInternet() {
		return FreeInternet;
	}
	public void SetFreeInternet(boolean NewFreeInternet) {
		FreeInternet = NewFreeInternet;
	}
	public boolean GetFeesIncludeWaterElectricity() {
		return FeesIncludeWaterElectricity;
	}
	public void SetFeesIncludeWaterElectricity(boolean NewFeesIncludeWaterElectricity) {
		FeesIncludeWaterElectricity = NewFeesIncludeWaterElectricity;
	}
}

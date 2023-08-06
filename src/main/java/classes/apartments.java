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
	
	public int getNumber() {
		return number;
	}
	public void SetNumber(int newNumber) {
		number = newNumber;
	}
	public int getWhichFloor() {
		return whichFloor;
	}
	public void setWhichFloor(int NewWhichFloor) {
		whichFloor = NewWhichFloor;
	}
	public int GetMonthlyFee() {
		return MonthlyFee;
	}
	public void setMonthlyFee(int NewMonthlyFee) {
		MonthlyFee = NewMonthlyFee;
	}
	public int getNumberPerson() {
		return NumberPerson;
	}
	public void setNumberPerson(int newNumberPerson) {
		NumberPerson = newNumberPerson;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String NewSpace) {
		space = NewSpace;
	}
	public int getBedroomNumber() {
		return  BedroomNumber;
	}
	public void setBedroomNumber(int NewBedroomNumber) {
		BedroomNumber = NewBedroomNumber;
	}
	public int getBathroomsNumber() {
		return BathroomsNumber;
	}
	public void setBathroomsNumber(int NewBathroomsNumber) {
		BathroomsNumber = NewBathroomsNumber;
	}
	public int getBalconyNumber() {
		return BalconyNumber;
	}
	public void setBalconyNumber(int NewBalconyNumber) {
		BalconyNumber = NewBalconyNumber;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String NewPhoto) {
		photo = NewPhoto;
	}
	public boolean getFreeInternet() {
		return FreeInternet;
	}
	public void setFreeInternet(boolean NewFreeInternet) {
		FreeInternet = NewFreeInternet;
	}
	public boolean getFeesIncludeWaterElectricity() {
		return FeesIncludeWaterElectricity;
	}
	public void setFeesIncludeWaterElectricity(boolean NewFeesIncludeWaterElectricity) {
		FeesIncludeWaterElectricity = NewFeesIncludeWaterElectricity;
	}
}

package classes;

public class House {
	private int id;
	public Residence ResidenceObj;
	public apartments ApartmentsObj ;
	public owners OwnerObj ;
	private boolean AvailabilityStatus;

	public House() {}
	public House(int id,Residence ResidenceObj,apartments ApartmentsObj,owners OwnerObj,boolean AvailabilityStatus) {
		this.id=id;
		this.ResidenceObj=ResidenceObj;
		this.ApartmentsObj=ApartmentsObj;
		this.OwnerObj=OwnerObj;
		this.AvailabilityStatus=AvailabilityStatus;
	}
	public int GetId() {
		return id;
	}
	public void Setid(int Newid) {
		id = Newid;
	}
	public boolean GetAvailabilityStatus() {
		return AvailabilityStatus;
	}
	public void SetAvailabilityStatus(boolean NewAvailabilityStatus) {
		AvailabilityStatus = NewAvailabilityStatus;
	}
}

package classes;

public class House {
	private int ID;
	public Residence residenceObj;
	public apartments apartmentsObj ;
	public owners ownerObj ;
	private boolean availabilityStatus;

	public House() {}
	public House(int ID,Residence residenceObj,apartments apartmentsObj,owners ownerObj,boolean availabilityStatus) {
		this.ID=ID;
		this.residenceObj=residenceObj;
		this.apartmentsObj=apartmentsObj;
		this.ownerObj=ownerObj;
		this.availabilityStatus=availabilityStatus;
	}
	public int GetID() {
		return ID;
	}
	public void SetID(int NewID) {
		ID = NewID;
	}
	public boolean GetAvailabilityStatus() {
		return availabilityStatus;
	}
	public void SetAvailabilityStatus(boolean NewAvailabilityStatus) {
		availabilityStatus = NewAvailabilityStatus;
	}
}

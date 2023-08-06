package classes;

public class House {
	private int id;
	public Residence residenceObj;
	public apartments apartmentsObj ;
	public owners OwnerObj ;
	private boolean availabilityStatus;

	public House() {}
	public House(int id,Residence residenceObj,apartments apartmentsObj,owners OwnerObj,boolean availabilityStatus) {
		this.id=id;
		this.residenceObj=residenceObj;
		this.apartmentsObj=apartmentsObj;
		this.OwnerObj=OwnerObj;
		this.availabilityStatus=availabilityStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public boolean getAvailabilityStatus() {
		return availabilityStatus;
	}
	public void SetAvailabilityStatus(boolean newAvailabilityStatus) {
		availabilityStatus = newAvailabilityStatus;
	}
}

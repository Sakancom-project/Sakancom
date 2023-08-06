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
	public int get_ID() {
		return ID;
	}
	public void set_ID(int new_ID) {
		ID = new_ID;
	}
	public boolean get_availabilityStatus() {
		return availabilityStatus;
	}
	public void set_availabilityStatus(boolean new_availabilityStatus) {
		availabilityStatus = new_availabilityStatus;
	}
}

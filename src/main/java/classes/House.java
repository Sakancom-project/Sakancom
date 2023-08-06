package classes;

public class House {
	private int Id;
	public Residence ResidenceObj;
	public apartments ApartmentsObj ;
	public owners OwnerObj ;
	private boolean AvailabilityStatus;

	public House() {}
	public House(int Id,Residence ResidenceObj,apartments ApartmentsObj,owners OwnerObj,boolean AvailabilityStatus) {
		this.Id=Id;
		this.ResidenceObj=ResidenceObj;
		this.ApartmentsObj=ApartmentsObj;
		this.OwnerObj=OwnerObj;
		this.AvailabilityStatus=AvailabilityStatus;
	}
	public int GetId() {
		return Id;
	}
	public void SetId(int NewId) {
		Id = NewId;
	}
	public boolean GetAvailabilityStatus() {
		return AvailabilityStatus;
	}
	public void SetAvailabilityStatus(boolean NewAvailabilityStatus) {
		AvailabilityStatus = NewAvailabilityStatus;
	}
}

package classes;

public class House {
	private int ID;
	public Residence residenceObj;
	public apartments apartmentsObj ;
	public owners owner;
	public House() {}
	public House(int ID,Residence residenceObj,apartments apartmentsObj) {
		this.ID=ID;
		this.residenceObj=residenceObj;
		this.apartmentsObj=apartmentsObj;
	}
	public int get_ID() {
		return ID;
	}
	public void set_ID(int new_ID) {
		ID = new_ID;
	}
	
}

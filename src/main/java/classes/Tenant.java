package classes;

public class Tenant {
	 private String name;
	 private String phone;
	 private int age;
	 private String major ;
	 private boolean student ;
	 private String furniture= null ;
	 private String payDate;
	 
    public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String newPayDate) {
		payDate = newPayDate;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	private boolean paid=false;
	public Tenant(String name, String phone, int age, String major, boolean student,String payDate) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.major = major;
		this.student = student;
		
		this.payDate=payDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public boolean getIsStudent() {
		return student;
	}
	
	public void setIsStudent(boolean isStudent) {
		student = isStudent;
	}
	
	public String getFurniture() {
		return furniture;
	}
	
	public void setFurniture(String newFurniture) {
		furniture = newFurniture;
	}
	 
}
package classes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;
public class main {
	static Scanner myInput = new Scanner(System.in);
	public static ArrayList<House> arrayHouses = new ArrayList<House>();
	public static ArrayList<House> AdvertisedHouses = new ArrayList<House>();
	private static int CounterID=0; 
	public static ArrayList<User> users = new ArrayList<User>();
	public static ArrayList<tenant> tenantList = new ArrayList<tenant>();
	private static String userType = "none" ;
	static String username;
	public static ArrayList <IdAndTennant> IdAndTennantlist = new ArrayList<IdAndTennant>();
	static int counter=0;
	private static final Logger logger = Logger.getLogger(main .class.getName());
	private static final String ADMIN = "admin";
	private static final String OWNER = "owner";
	private static final String TENANT = "tenant";
	 public static void main(String[] args) {
		 
		 fullTenantList();
		 
		 do {
			 logger.log(Level.INFO, "Enter your username please");
		 username = myInput.next();
		 logger.log(Level.INFO,"Enter your password please");
		String pass = myInput.next();
		String type = login(username, pass);
		menuType(type);
		}
		 while (username.equals("exit"));
	 }
 
	 public static String login(String userName , String password){
		 
		 User firstUser= new User("marah", "123",ADMIN);
		 User secondtUser= new User("bayan", "333", OWNER);
		 User thirdUser= new User("ahmad", "133", OWNER);
		 User fourthUser= new User("khalid", "993", TENANT);
		 User fifthUser= new User("mayar", "122", TENANT);
		 User sixthUser= new User("osama", "222", TENANT);
		 
		 users.add(firstUser);
		 users.add(secondtUser);
		 users.add(thirdUser);
		 users.add(fourthUser);
		 users.add(fifthUser);
		 users.add(sixthUser);
		 
		for (int i=0 ; i <users.size();i++) {
			
			if (users.get(i).getUserName().equals(userName)) {
			if (users.get(i).getType().equals(ADMIN)) {
				setUserType(ADMIN);
		}
			else if (users.get(i).getType().equals(OWNER)) {
				setUserType(OWNER);
		}
			else if (users.get(i).getType().equals(TENANT)) {
				setUserType(TENANT);
		}
			else {
				setUserType("none");
			}
		}
		}
	
	return getUserType();
	 }
	 
	 public static void setUserType(String type) {
			userType = type;
		}	
	 public static String getUserType() {
			return userType;
		}
	 
	 public static House enterInformation() {
		 Residence residenceObj=new Residence();
		 	apartments apartmentsObj =new apartments() ;
		 	owners owner1 = new owners();
		 	owner1.setName(username);
			CounterID=CounterID+1;
			logger.log(Level.INFO,"The name of the building in which the apartment is located ?");
			residenceObj.setName(myInput.next());

			logger.log(Level.INFO,"What is the location of the Residence in which the apartment is located ?");
			residenceObj.setLocation(myInput.next()); 
			
			logger.log(Level.INFO,"What is the number of floors of the building ?");
			residenceObj.setNumberFloors(myInput.nextInt());
			
			logger.log(Level.INFO,"How many apartments per floor?");
			residenceObj.setNumberApartmentsFloor(myInput.nextInt());
			
			logger.log(Level.INFO,"Enter the number of the apartment ?");
			apartmentsObj.setNumber(myInput.nextInt());
			
			logger.log(Level.INFO,"What floor is the apartment on ?");
			apartmentsObj.setWhichFloor(myInput.nextInt());

			logger.log(Level.INFO,"How many people can the apartment accommodate ?");
			apartmentsObj.setNumberPerson(myInput.nextInt());

			logger.log(Level.INFO,"How space is the room ?");
			apartmentsObj.setSpace(myInput.next());
			
			logger.log(Level.INFO,"How much are the monthly fees ?");
			apartmentsObj.setWhichFloor(myInput.nextInt());
			
			logger.log(Level.INFO,"The number of bedrooms is :");
			apartmentsObj.setBedroomNumber(myInput.nextInt());
			
			logger.log(Level.INFO,"The number of bathrooms is :");
			apartmentsObj.setBathroomsNumber(myInput.nextInt());
			
			logger.log(Level.INFO,"The number of balcony is :");
			apartmentsObj.setBalconyNumber(myInput.nextInt());
			
			logger.log(Level.INFO,"Do the fees include electricity and water ? (y or n)");
			String s = myInput.next();
			boolean b=true ;
			if(s.equals("y") && s.equals("Y")) { b=true;}
			else if(s.equals("n") && s.equals("N")) { b=false;}
			else { logger.log(Level.INFO,"Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			apartmentsObj.setFeesIncludeWaterElectricity(b);

			logger.log(Level.INFO,"Is there free internet service ? (y or n)");
			s = myInput.next();
			if(s.equals("y") && s.equals("Y")) { b=true;}
			else if(s.equals("n") && s.equals("N")) { b=false;}
			else { logger.log(Level.INFO,"Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			apartmentsObj.setFreeInternet(b);
			
			logger.log(Level.INFO,"Is there a private car park for the building? (y or n)");
			s = myInput.next();
			if(s.equals("y") && s.equals("Y")) { b=true;}
			else if(s.equals("n") && s.equals("N")) { b=false;}
			else { logger.log(Level.INFO,"Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			residenceObj.setAvailableParking(b);
			
			logger.log(Level.INFO,"Is elevator service available? (y or n)");
			s = myInput.next();
			if(s.equals("y") && s.equals("Y")) { b=true;}
			else if(s.equals("n") && s.equals("N")) { b=false;}
			else {logger.log(Level.INFO,"Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			residenceObj.setElevatorAvailable(b);	
			
			logger.log(Level.INFO,"Enter your phone number to contact : ");
			owner1.SetPhoneNumber(myInput.next());
			
			logger.log(Level.INFO,"Enter a picture of the apartment");
			apartmentsObj.setPhoto(myInput.next());
			
			 House House1=new House(CounterID,residenceObj,apartmentsObj,owner1,true);
		 	return House1;
	 }
	 
	 
	 public static void menuType(String type)  {
		 int in;
		 if(type.equals(OWNER)) {
			 do { 
				 logger.log(Level.INFO," ((( owner menu ))) : ");
				 logger.log(Level.INFO,"1-add House\n2-Modify information\n3-show House\n4-control panel\n5-Exit");
			  in = myInput.nextInt();
				 switch(in) {
				 case 1:
					 House House1 = enterInformation();
						addHouse(House1,OWNER);
					 break;
				 case 2:
		
					 logger.log(Level.INFO,"What is the house ID that you want to change to?");
						int houseId = myInput.nextInt();
						
						logger.log(Level.INFO,"What information do you want to modify?");
						logger.log(Level.INFO,"1-name of Residence \n2-the location of the Residence \n3-the number of floors of the building \n4-How many apartments per floor");
						logger.log(Level.INFO,"5-the number of the apartment \n6-What floor is the apartment on \n7-How many people can the apartment accommodate \n8-How space is the room");
						logger.log(Level.INFO,"9-How much are the monthly fees \n10-Do the fees include electricity and water \n11-Is there free internet service \n12-Is there a private car park for the building \n13-Is elevator service available \n14-picture of the apartment");
						
						int num = myInput.nextInt();
						logger.log(Level.INFO,"Enter the new value");
						String new_value =  myInput.next();
						Modify_information(houseId,num,new_value);			 
						break;
				 case 3:
					 showHouse();
					 break;
				 case 4:
					 controlPanel(username);
					 break; 
				 case 5:
					 
					 break; 
				 }
				 
			}
			 while(in!=5);
			  
		}
		 else if (type.equals(ADMIN)) {
			 do { 
				 logger.log(Level.INFO," ((( admin menu ))) : ");
				 logger.log(Level.INFO,"1-accept and reject\n2-show advertised houses\n3-add at advertised houses\n4-Watching reservations via the system\n5-Exit");
				 in = myInput.nextInt();
					 switch(in) {
					 case 1:
						String acc; 
							 for(int i=0;i<arrayHouses.size();i++) {
								 logger.log(Level.INFO,"The ID of the house is: " +arrayHouses.get(i).getId() );
								 logger.log(Level.INFO,"House information is : ");
								 logger.log(Level.INFO,"1-name of Residence : " +arrayHouses.get(i).getResidenceObj().getName()+" \n2-the location of the Residence : " +arrayHouses.get(i).getResidenceObj().getLocation() +"\n3-the number of floors of the building : "+arrayHouses.get(i).getResidenceObj().getNumberFloors()+" \n4-How many apartments per floor : "+arrayHouses.get(i).getResidenceObj().getNumberApartmentsFloor());
								 logger.log(Level.INFO,"5-the number of the apartment : "+arrayHouses.get(i).getApartmentsObj().getNumber()+" \n6-What floor is the apartment on : "+arrayHouses.get(i).getApartmentsObj().getWhichFloor()+" \n7-How many people can the apartment accommodate : "+arrayHouses.get(i).getApartmentsObj().getNumberPerson()+" \n8-How space is the room : "+arrayHouses.get(i).getApartmentsObj().getSpace());
								 logger.log(Level.INFO,"9-How much are the monthly fees : "+arrayHouses.get(i).getApartmentsObj().getMonthlyFee()+" \n10-Do the fees include electricity and water : "+arrayHouses.get(i).getApartmentsObj().getFeesIncludeWaterElectricity()+" \n11-Is there free internet service : "+arrayHouses.get(i).getApartmentsObj().getFreeInternet()+" \n12-Is there a private car park for the building : "+arrayHouses.get(i).getResidenceObj().getAvailableParking()+"\n13-Is elevator service available : "+arrayHouses.get(i).getResidenceObj().getElevatorAvailable());
									
								 logger.log(Level.INFO,"Enter y if you accept to add this house and n if you reject : ");
									acc = myInput.next();
									acceptAndReject(acc,arrayHouses.get(i));
							 } 
						 
						 break; 
					 case 2:
						 showAdvertisedHouses();
						 break; 
					 case 3:
						 House House1 = enterInformation();
							addHouse(House1,ADMIN);
						 break; 
					 case 4:
						 watchingReservations();
						 break; 	 
					 case 5:
						 
						 break;  
						 
					 } 
			 }	
			 while(in!=5);
		 }
		 else {
			 do { 
				 logger.log(Level.INFO," ((( tenants menu ))) : ");
				 logger.log(Level.INFO,"1-view the available housing \n2- view pictures of housing and other information\n3-control panel\n4-book accommodation\n5-AddFurniture\n6- Show Furniture \n7-see the neighbours \n8- Exit");
				 in = myInput.nextInt();
					 switch(in) {
					 case 1:
						 viewAvailableHousing();
						 break; 
					 case 2:
						 viewPicturesAndInformation();
						 break; 
					 case 3:
						 menu();
						 int Num =myInput.nextInt();
						 switch(Num) {
						 case 1: 
							 showTenant(username);
							 break;
						 case 2:
							 ShowOwnerInformation(username);
							 break;		
						 case 3:
							 payment(username);
							 break;
						  }; 
						  break;
					
						 case 4:
							 logger.log(Level.INFO,"enter id hous to booked");

								for(int i=0 ; i< AdvertisedHouses.size() ; i++) {
									 if(AdvertisedHouses.get(i).getAvailabilityStatus() ) {
										 logger.log(Level.INFO,AdvertisedHouses.get(i).getId()+" || ");
							  
									 }}
								Scanner input2 = new Scanner(System.in);
							 	int id = input2.nextInt();

							 	bookAccommodation(id,username);
						 break;
						 case 5:
							 Scanner inp = new Scanner(System.in);

							 logger.log(Level.INFO,"Enter your Furniture to add  please");
								String	Furniture = inp.next();
								addFurniture(Furniture,username);
							 break;
							 
						 case 6 :
							 ShowFurniture(username);
							 break;
						 case 7 :
							 seeNeighbours(username);
							 break;
						 case 8:
							 break;
		
					  }; 
					
			 } while(in!=8);
		 }
	 }

		public static boolean addHouse(House House1,String type) {
			if(type.equals(OWNER)) {
				arrayHouses.add(House1);
			}
			else if(type.equals(ADMIN)) {
				AdvertisedHouses.add(House1);
			}
			
			logger.log(Level.INFO,"*******House has been added successfully*******");
			return true;
		}

		public static boolean Modify_information(int houseId , int num , String new_value) {
			House House1 = new House();
			House1=arrayHouses.get(houseId-1);

			switch (num) { 
			case 1:
				House1.getResidenceObj().setName(new_value);
				break;
			case 2:
				House1.getResidenceObj().setLocation(new_value);
				break;
			case 3:
				House1.getResidenceObj().setNumberFloors(Integer.parseInt(new_value));
				break;
			case 4:
				House1.getResidenceObj().setNumberApartmentsFloor(Integer.parseInt(new_value));
				break;
			case 5:
				House1.getApartmentsObj().setNumber(Integer.parseInt(new_value));
				break;
			case 6:
				House1.getApartmentsObj().setWhichFloor(Integer.parseInt(new_value));
				break;
			case 7:
				House1.getApartmentsObj().setNumberPerson(Integer.parseInt(new_value));
				break;
			case 8:
				House1.getApartmentsObj().setSpace(new_value);
				break;
			case 9:
				House1.getApartmentsObj().setWhichFloor(Integer.parseInt(new_value));
				break;
			case 10:
				House1.getApartmentsObj().setFeesIncludeWaterElectricity(Boolean.parseBoolean(new_value));
				break;
			case 11:
				House1.getApartmentsObj().setFreeInternet(Boolean.parseBoolean(new_value));
				break;
			case 12:
				House1.getResidenceObj().setAvailableParking(Boolean.parseBoolean(new_value));
				break;
			case 13:
				House1.getResidenceObj().setElevatorAvailable(Boolean.parseBoolean(new_value));
				break;
			case 14:
				House1.getApartmentsObj().setPhoto(new_value);
				break;
			default:
				logger.log(Level.INFO,"Wrong!!!Enter only one of the available options");
			}
		
			arrayHouses.set(houseId-1,House1);
			logger.log(Level.INFO,"Modify information successfully");
			return true;		
		}
		
		public static boolean showHouse() {
			for(int i=0;i<arrayHouses.size();i++) {
				logger.log(Level.INFO,"The ID of the house is: " +arrayHouses.get(i).getId() );
				logger.log(Level.INFO,"House information is : ");
				logger.log(Level.INFO,"1-name of Residence : " +arrayHouses.get(i).getResidenceObj().getName()+" \n2-the location of the Residence : " +arrayHouses.get(i).getResidenceObj().getLocation() +"\n3-the number of floors of the building : "+arrayHouses.get(i).getResidenceObj().getNumberFloors()+" \n4-How many apartments per floor : "+arrayHouses.get(i).getResidenceObj().getNumberApartmentsFloor());
				logger.log(Level.INFO,"5-the number of the apartment : "+arrayHouses.get(i).getApartmentsObj().getNumber()+" \n6-What floor is the apartment on : "+arrayHouses.get(i).getApartmentsObj().getWhichFloor()+" \n7-How many people can the apartment accommodate : "+arrayHouses.get(i).getApartmentsObj().getNumberPerson()+" \n8-How space is the room : "+arrayHouses.get(i).getApartmentsObj().getSpace());
				logger.log(Level.INFO,"9-How much are the monthly fees : "+arrayHouses.get(i).getApartmentsObj().getMonthlyFee()+" \n10-Do the fees include electricity and water : "+arrayHouses.get(i).getApartmentsObj().getFeesIncludeWaterElectricity()+" \n11-Is there free internet service : "+arrayHouses.get(i).getApartmentsObj().getFreeInternet()+" \n12-Is there a private car park for the building : "+arrayHouses.get(i).getResidenceObj().getAvailableParking()+"\n13-Is elevator service available : "+arrayHouses.get(i).getResidenceObj().getElevatorAvailable());
			}
			logger.log(Level.INFO,"***The array is empty***");
			return true;
		}
		
		
		public static boolean  controlPanel(String userName) {
			for(int i=0;i<AdvertisedHouses.size();i++) {
				if(userName.equals(AdvertisedHouses.get(i).getOwnerObj().getName())) {
					logger.log(Level.INFO,"The ID of the house is: " +AdvertisedHouses.get(i).getId() );
					logger.log(Level.INFO,"Architecture name : " +AdvertisedHouses.get(i).getResidenceObj().getName() );
					logger.log(Level.INFO,"The apartment is located on the floor : " +AdvertisedHouses.get(i).getResidenceObj().getNumberFloors() );
					logger.log(Level.INFO,"This apartment is located on the floor:"+AdvertisedHouses.get(i).getApartmentsObj().getWhichFloor());
					logger.log(Level.INFO,"It contains a number of bedrooms:"+AdvertisedHouses.get(i).getApartmentsObj().getBedroomNumber());
					logger.log(Level.INFO,"Number of bathrooms:"+AdvertisedHouses.get(i).getApartmentsObj().getBathroomsNumber());
					logger.log(Level.INFO,"balcony number:"+AdvertisedHouses.get(i).getApartmentsObj().getBalconyNumber());
					logger.log(Level.INFO,"The tenants are:");
				for(int k =0 ; k<IdAndTennantlist.size() ; k++) {
					if(IdAndTennantlist.get(k).gethousingId() == AdvertisedHouses.get(i).getId()) {
						logger.log(Level.INFO,IdAndTennantlist.get(k).getTenants());
						for(int h=0 ; h<tenantList.size() ; h++ ) {
							if(tenantList.get(h).getName().equals(IdAndTennantlist.get(k).getTenants())) {
								logger.log(Level.INFO,"\t"+tenantList.get(h).getPhone());
							}
						}
					}
				}
				}
			}
			return true;
			
		}

		
		public static Boolean acceptAndReject(String s ,House housing){
			
			if(s.equals("y")) {AdvertisedHouses.add(housing); 
			arrayHouses.remove (housing); 
			logger.log(Level.INFO,"*********done successfully********* ");
			return true;
			}
			else if(s.equals("n")) {arrayHouses.remove (housing);
			logger.log(Level.INFO,"*********Not added*********");
			return false;
			}
			else {
				logger.log(Level.INFO,"Enter true value !!!");
			}
			logger.log(Level.INFO,"*********Not added*********");
			return false;
			}

		public static boolean showAdvertisedHouses() {
			for(int i=0;i<AdvertisedHouses.size();i++) {
				logger.log(Level.INFO,"House information is : ");
				logger.log(Level.INFO,"1-name of Residence : " +AdvertisedHouses.get(i).getResidenceObj().getName()+" \n2-the location of the Residence : " +AdvertisedHouses.get(i).getResidenceObj().getLocation() +"\n3-the number of floors of the building : "+AdvertisedHouses.get(i).getResidenceObj().getNumberFloors()+" \n4-How many apartments per floor : "+AdvertisedHouses.get(i).getResidenceObj().getNumberApartmentsFloor());
				logger.log(Level.INFO,"5-the number of the apartment : "+AdvertisedHouses.get(i).getApartmentsObj().getNumber()+" \n6-What floor is the apartment on : "+AdvertisedHouses.get(i).getApartmentsObj().getWhichFloor()+" \n7-How many people can the apartment accommodate : "+AdvertisedHouses.get(i).getApartmentsObj().getNumberPerson()+" \n8-How space is the room : "+AdvertisedHouses.get(i).getApartmentsObj().getSpace());
				logger.log(Level.INFO,"9-How much are the monthly fees : "+AdvertisedHouses.get(i).getApartmentsObj().getMonthlyFee()+" \n10-Do the fees include electricity and water : "+AdvertisedHouses.get(i).getApartmentsObj().getFeesIncludeWaterElectricity()+" \n11-Is there free internet service : "+AdvertisedHouses.get(i).getApartmentsObj().getFreeInternet()+" \n12-Is there a private car park for the building : "+AdvertisedHouses.get(i).getResidenceObj().getAvailableParking()+"\n13-Is elevator service available : "+AdvertisedHouses.get(i).getResidenceObj().getElevatorAvailable());
			}
			logger.log(Level.INFO,"***The array is empty***");
			return true;
		}
		
		
		public static boolean watchingReservations() {
			for(int i=0 ; i<IdAndTennantlist.size() ; i++) {
				
				logger.log(Level.INFO, "housing Id is : "+IdAndTennantlist.get(i).gethousingId());
				logger.log(Level.INFO, "Who is the tenant : "+IdAndTennantlist.get(i).getTenants());
			}
			
			return true;
			
		}
		public static boolean viewAvailableHousing(){
			if(AdvertisedHouses.isEmpty()) {logger.log(Level.INFO,"***There are no homes available***"); return false;}
			logger.log(Level.INFO,"The available housing : ");
			for(int i=0;i<AdvertisedHouses.size();i++) {
				 if(AdvertisedHouses.get(i).getAvailabilityStatus()) {
					 logger.log(Level.INFO,"name of Residence : " +AdvertisedHouses.get(i).getResidenceObj().getName()+" \nthe location of the Residence : " +AdvertisedHouses.get(i).getResidenceObj().getLocation() );
					 logger.log(Level.INFO,"the number of the apartment : "+AdvertisedHouses.get(i).getApartmentsObj().getNumber());
				 } 
			 }
			
			 return true;
		}
		
		public static boolean viewPicturesAndInformation(){
			for(int i=0;i<AdvertisedHouses.size();i++) {
				 if(AdvertisedHouses.get(i).getAvailabilityStatus()) {
					 logger.log(Level.INFO,"House information is : ");
					 logger.log(Level.INFO,"1-name of Residence : " +AdvertisedHouses.get(i).getResidenceObj().getName()+" \n2-the location of the Residence : " +AdvertisedHouses.get(i).getResidenceObj().getLocation() +"\n3-the number of floors of the building : "+AdvertisedHouses.get(i).getResidenceObj().getNumberFloors()+" \n4-How many apartments per floor : "+AdvertisedHouses.get(i).getResidenceObj().getNumberApartmentsFloor());
					 logger.log(Level.INFO,"5-the number of the apartment : "+AdvertisedHouses.get(i).getApartmentsObj().getNumber()+" \n6-What floor is the apartment on : "+AdvertisedHouses.get(i).getApartmentsObj().getWhichFloor()+" \n7-How many people can the apartment accommodate : "+AdvertisedHouses.get(i).getApartmentsObj().getNumberPerson()+" \n8-How space is the room : "+AdvertisedHouses.get(i).getApartmentsObj().getSpace());
					 logger.log(Level.INFO,"9-How much are the monthly fees : "+AdvertisedHouses.get(i).getApartmentsObj().getMonthlyFee()+" \n10-Do the fees include electricity and water : "+AdvertisedHouses.get(i).getApartmentsObj().getFeesIncludeWaterElectricity()+" \n11-Is there free internet service : "+AdvertisedHouses.get(i).getApartmentsObj().getFreeInternet()+" \n12-Is there a private car park for the building : "+AdvertisedHouses.get(i).getResidenceObj().getAvailableParking()+"\n13-Is elevator service available : "+AdvertisedHouses.get(i).getResidenceObj().getElevatorAvailable());
					 logger.log(Level.INFO,"14-Image link for the apartment"+AdvertisedHouses.get(i).getApartmentsObj().getPhoto());
					 logger.log(Level.INFO,"** This house is available **");
				 }
			 }
			return true;
		}
		
		public static void fullTenantList() {
			tenant tenant1=new tenant("mayar","0569902837",19,"enj",true,"12-4-2023");
			tenant tenant2=new tenant("osama","0569834654",19,"enj",true,"12-4-2023");
			tenantList.add(tenant1);
			tenantList.add(tenant2);
			
		
		}
		
		public static Boolean addFurniture(String Furniture , String tenantName){
			 for ( int i=0; i <tenantList.size(); i++ ) {
				 if (tenantName.equals(tenantList.get(i).getName())){
					 tenantList.get(i).setFurniture(Furniture);
					 logger.log(Level.INFO,"done");
					 return true;
				 }
			 }
			 return false;
		 }
		public static boolean showTenant(String name){
			 for ( int i=0; i <tenantList.size(); i++ ) {
			if(tenantList.get(i).getName().equals(name)){
				logger.log(Level.INFO," the tenat information is : ");
				logger.log(Level.INFO,"Name : " + tenantList.get(i).getName());
				logger.log(Level.INFO,"phone : " + tenantList.get(i).getPhone());
				logger.log(Level.INFO,"Age : " + tenantList.get(i).getAge());
				logger.log(Level.INFO,"major : " + tenantList.get(i).getMajor());
				logger.log(Level.INFO,"he is a student  : " + tenantList.get(i).getIsStudent());
				logger.log(Level.INFO,"furniture : " + tenantList.get(i).getFurniture());

			}
			 }
			return true;
		}
		public  static boolean seeNeighbours(String username2) {
			for ( int i=0; i <tenantList.size(); i++ ) {
				 if (username2.equals(tenantList.get(i).getName())){
					 if(tenantList.get(i).getIsStudent()) {
						 logger.log(Level.INFO,"your neighbours : ");
							for ( int j=0; j<tenantList.size(); j++ ) {
								if( i!=j ){
									 if(tenantList.get(j).getIsStudent()) {
										 logger.log(Level.INFO, tenantList.get(j).getName());
										 logger.log(Level.INFO,"major :" + tenantList.get(j).getMajor());
										 logger.log(Level.INFO,  "phone :" + tenantList.get(j).getPhone());
									 }
										}
							
										}
							return true;
					 }
				 }
				}
			return false ;
		}


		public  static boolean ShowFurniture(String username2) {
			 for ( int i=0; i <tenantList.size(); i++ ) {
				 if (username2.equals(tenantList.get(i).getName())){
					 logger.log(Level.INFO,"furniture : " + tenantList.get(i).getFurniture());
					 return true;
				 }
			 }
			return false;
			}
		public static void payment(String name){
			int fee;
			 for ( int i=0; i <IdAndTennantlist.size(); i++ ){
				 if(IdAndTennantlist.get(i).getTenants().equals(name) ) {
						fee= AdvertisedHouses.get(i).getApartmentsObj().getMonthlyFee();
						
						logger.log(Level.INFO,"fee: " + fee);	
						logger.log(Level.INFO,"do you want to pay , Enter the letter Y=Yes or N=No only");	
			 String aa=myInput.next();
			 paymentt(aa,name);
				 }
					}
			
		}
		
		public static boolean paymentt(String aa,String name){
			switch(aa) {
			 case "y":
				 logger.log(Level.INFO,"fees payed successfully " + "\npayred date : ");
				 for (int j=0; j<tenantList.size();j++ ) {
					 if (tenantList.get(j).getName().equals(name)) {
						 logger.log(Level.INFO,tenantList.get(j).getPayDate());
					 }
				 }
				 break;
			 case "n":
				 logger.log(Level.INFO,"please pay soon ");
				 break;
				 
			 }
			return true;
		}
		public static void menu() {
			logger.log(Level.INFO," Choose one of these options : ");
			logger.log(Level.INFO," 1- Tenant Information ");
			logger.log(Level.INFO," 2- Informations about Owner and how to Contact ");
			logger.log(Level.INFO," 3- the Rent and when to pay  ");
}	
		public static boolean ShowOwnerInformation(String username) {
			int ID_House =0;
			for(int i=0 ; i< IdAndTennantlist.size() ; i++) {
				 if(IdAndTennantlist.get(i).getTenants().equals(username) ) {
					 ID_House=IdAndTennantlist.get(i).gethousingId();
				 }
			}
			for (int i=0 ; i<AdvertisedHouses.size() ; i++){
			if (AdvertisedHouses.get(i).getId()==ID_House) {

				logger.log(Level.INFO," Owner name is  : " +AdvertisedHouses.get(i).getOwnerObj().getName());
				logger.log(Level.INFO," Owner phone number is  : " +AdvertisedHouses.get(i).getOwnerObj().getPhoneNumber());
			}
			} 
			return true;
		}
	
		public static boolean bookAccommodation(int id,String n) {
			 boolean flagRet=false;
			for(int i=0 ; i< AdvertisedHouses.size() ; i++) {
				 if(AdvertisedHouses.get(i).getId() == id ) {	
					 if(AdvertisedHouses.get(i).getAvailabilityStatus() ) {
						 counter=counter+1;
						  flagRet=true;	 
						  IdAndTennant t = new IdAndTennant(id,n);
						  IdAndTennantlist.add(t);
						  logger.log(Level.INFO,"The house has been booked");						
						  if(AdvertisedHouses.get(i).getApartmentsObj().getNumberPerson() == counter) {
							  AdvertisedHouses.get(i).setAvailabilityStatus(false);
							  
						  }
						  
					  }
					  else	{
						  flagRet=false;
						  logger.log(Level.INFO,"This house is Non available"); }

					  }
					 }
			return flagRet;
								 
				}
		
		
		
}

package classes;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	 
	 public static void main(String[] args) {
		 fullTenantList();
		 
		 do {
		System.out.println("Enter your username please");
		 username = myInput.next();
		System.out.println("Enter your password please");
		String pass = myInput.next();
		String type = login(username, pass);
		menu_type(type);
		}
		 while (username.equals("exit"));
	 }
	 
	 
//log in 	 
	 public static String login(String userName , String password){
		 
		 User firstUser= new User("marah", "123","admin");
		 User secondtUser= new User("bayan", "333", "owner");
		 User thirdUser= new User("ahmad", "133", "owner");
		 User fourthUser= new User("khalid", "993", "tenant");
		 User fifthUser= new User("mayar", "122", "tenant");
		 User sixthUser= new User("osama", "222", "tenant");
		 
		 users.add(firstUser);
		 users.add(secondtUser);
		 users.add(thirdUser);
		 users.add(fourthUser);
		 users.add(fifthUser);
		 users.add(sixthUser);
		 
		for (int i=0 ; i <users.size();i++) {
			
			if (users.get(i).getUserName().equals(userName)) {
			if (users.get(i).getType().equals("admin")) {
				setUserType("admin");
		}
			else if (users.get(i).getType().equals("owner")) {
				setUserType("owner");
		}
			else if (users.get(i).getType().equals("tenant")) {
				setUserType("tenant");
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
		 Residence ResidenceObj=new Residence();
		 	apartments ApartmentsObj =new apartments() ;
		 	owners owner1 = new owners();
		 	owner1.SetName(username);
			CounterID=CounterID+1;
			System.out.println("The name of the building in which the apartment is located ?");
			ResidenceObj.setName(myInput.next());

			System.out.println("What is the location of the Residence in which the apartment is located ?");
			ResidenceObj.setLocation(myInput.next()); 
			
			System.out.println("What is the number of floors of the building ?");
			ResidenceObj.setNumberFloors(myInput.nextInt());
			
			System.out.println("How many apartments per floor?");
			ResidenceObj.setNumberApartmentsFloor(myInput.nextInt());
			
			System.out.println("Enter the number of the apartment ?");
			ApartmentsObj.SetNumber(myInput.nextInt());
			
			System.out.println("What floor is the apartment on ?");
			ApartmentsObj.SetWhichFloor(myInput.nextInt());

			System.out.println("How many people can the apartment accommodate ?");
			ApartmentsObj.SetNumberPerson(myInput.nextInt());

			System.out.println("How space is the room ?");
			ApartmentsObj.SetSpace(myInput.next());
			
			System.out.println("How much are the monthly fees ?");
			ApartmentsObj.SetMonthlyFee(myInput.nextInt());
			
			System.out.println("The number of bedrooms is :");
			ApartmentsObj.SetBedroomNumber(myInput.nextInt());
			
			System.out.println("The number of bathrooms is :");
			ApartmentsObj.SetBathroomsNumber(myInput.nextInt());
			
			System.out.println("The number of balcony is :");
			ApartmentsObj.SetBalconyNumber(myInput.nextInt());
			
			System.out.println("Do the fees include electricity and water ? (y or n)");
			String s = myInput.next();
			boolean b=true ;
			if(s.equals("y") && s.equals("Y")) { b=true;}
			else if(s.equals("n") && s.equals("N")) { b=false;}
			else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			ApartmentsObj.SetFeesIncludeWaterElectricity(b);

			System.out.println("Is there free internet service ? (y or n)");
			s = myInput.next();
			if(s.equals("y") && s.equals("Y")) { b=true;}
			else if(s.equals("n") && s.equals("N")) { b=false;}
			else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			ApartmentsObj.SetFreeInternet(b);
			
			System.out.println("Is there a private car park for the building? (y or n)");
			s = myInput.next();
			if(s.equals("y") && s.equals("Y")) { b=true;}
			else if(s.equals("n") && s.equals("N")) { b=false;}
			else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			ResidenceObj.setAvailableParking(b);
			
			System.out.println("Is elevator service available? (y or n)");
			s = myInput.next();
			if(s.equals("y") && s.equals("Y")) { b=true;}
			else if(s.equals("n") && s.equals("N")) { b=false;}
			else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
			ResidenceObj.setElevatorAvailable(b);	
			
			System.out.println("Enter your phone number to contact : ");
			owner1.SetPhoneNumber(myInput.next());
			
			System.out.println("Enter a picture of the apartment");
			ApartmentsObj.SetPhoto(myInput.next());
			
			 House House1=new House(CounterID,ResidenceObj,ApartmentsObj,owner1,true);
		 	return House1;
	 }
	 
	 
	 public static void menu_type(String type)  {
		 int in;
		 if(type.equals("owner")) {
			 do { 
			 System.out.println(" ((( owner menu ))) : ");
			 System.out.println("1-add House\n2-Modify information\n3-show House\n4-control panel\n5-Exit");
			  in = myInput.nextInt();
				 switch(in) {
				 case 1:
					 House House1 = enterInformation();
						addHouse(House1,"owner");
					 break;
				 case 2:
		
						System.out.println("What is the house ID that you want to change to?");
						int houseId = myInput.nextInt();
						
						System.out.println("What information do you want to modify?");
						System.out.println("1-name of Residence \n2-the location of the Residence \n3-the number of floors of the building \n4-How many apartments per floor");
						System.out.println("5-the number of the apartment \n6-What floor is the apartment on \n7-How many people can the apartment accommodate \n8-How space is the room");
						System.out.println("9-How much are the monthly fees \n10-Do the fees include electricity and water \n11-Is there free internet service \n12-Is there a private car park for the building \n13-Is elevator service available \n14-picture of the apartment");
						
						int num = myInput.nextInt();
						System.out.println("Enter the new value");
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
		 else if (type.equals("admin")) {
			 do { 
				 System.out.println(" ((( admin menu ))) : ");
				 System.out.println("1-accept and reject\n2-show advertised houses\n3-add at advertised houses\n4-Watching reservations via the system\n5-Exit");
				 in = myInput.nextInt();
					 switch(in) {
					 case 1:
						String acc; 
							 for(int i=0;i<arrayHouses.size();i++) {
									System.out.println("The ID of the house is: " +arrayHouses.get(i).GetId() );
									System.out.println("House information is : ");
									System.out.println("1-name of Residence : " +arrayHouses.get(i).ResidenceObj.getName()+" \n2-the location of the Residence : " +arrayHouses.get(i).ResidenceObj.getLocation() +"\n3-the number of floors of the building : "+arrayHouses.get(i).ResidenceObj.getNumberFloors()+" \n4-How many apartments per floor : "+arrayHouses.get(i).ResidenceObj.getNumberApartmentsFloor());
									System.out.println("5-the number of the apartment : "+arrayHouses.get(i).ApartmentsObj.GetNumber()+" \n6-What floor is the apartment on : "+arrayHouses.get(i).ApartmentsObj.GetWhichFloor()+" \n7-How many people can the apartment accommodate : "+arrayHouses.get(i).ApartmentsObj.GetNumberPerson()+" \n8-How space is the room : "+arrayHouses.get(i).ApartmentsObj.GetSpace());
									System.out.println("9-How much are the monthly fees : "+arrayHouses.get(i).ApartmentsObj.GetMonthlyFee()+" \n10-Do the fees include electricity and water : "+arrayHouses.get(i).ApartmentsObj.GetFeesIncludeWaterElectricity()+" \n11-Is there free internet service : "+arrayHouses.get(i).ApartmentsObj.GetFreeInternet()+" \n12-Is there a private car park for the building : "+arrayHouses.get(i).ResidenceObj.getAvailableParking()+"\n13-Is elevator service available : "+arrayHouses.get(i).ResidenceObj.getElevatorAvailable());
									
									System.out.println("Enter y if you accept to add this house and n if you reject : ");
									acc = myInput.next();
									acceptAndReject(acc,arrayHouses.get(i));
							 } 
						 
						 break; 
					 case 2:
						 showAdvertisedHouses();
						 break; 
					 case 3:
						 House House1 = enterInformation();
							addHouse(House1,"admin");
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
				 System.out.println(" ((( tenants menu ))) : ");
				 System.out.println("1-view the available housing \n2- view pictures of housing and other information\n3-control panel\n4-book accommodation\n5-AddFurniture\n6- Show Furniture \n7-see the neighbours \n8- Exit");
				 in = myInput.nextInt();
					 switch(in) {
					 case 1:
						 viewAvailableHousing();
						 break; 
					 case 2:
						 viewPicturesAndInformation();
						 break; 
					 case 3:
						 Menu();
						 int Num =myInput.nextInt();
						 switch(Num) {
						 case 1: 
							 ShowTenant(username);
							 break;
						 case 2:
							 ShowOwnerInformation(username);
							 break;		
						 case 3:
							 Payment(username);
							 break;
						  }; 
						  break;
					
						 case 4:
							 System.out.println("enter id hous to booked");

								for(int i=0 ; i< AdvertisedHouses.size() ; i++) {
									 if(AdvertisedHouses.get(i).GetAvailabilityStatus() ) {
										  System.out.print(AdvertisedHouses.get(i).GetId()+" || ");
							  
									 }}
								Scanner input2 = new Scanner(System.in);
							 	int id = input2.nextInt();

							 bookacc(id,username);
						 break;
						 case 5:
							 Scanner inp = new Scanner(System.in);

								System.out.println("Enter your Furniture to add  please");
								String	Furniture = inp.next();
								AddFurniture(Furniture,username);
							 break;
							 
						 case 6 :
							 ShowFurniture(username);
							 break;
						 case 7 :
							 SeeNeighbours(username);
							 break;
						 case 8:
							 break;
		
					  }; 
					
			 } while(in!=8);
		 }
	 }
	 
//owner		
		
		public static boolean addHouse(House House1,String type) {
			if(type.equals("owner")) {
				arrayHouses.add(House1);
			}
			else if(type.equals("admin")) {
				AdvertisedHouses.add(House1);
			}
			
			System.out.println("*******House has been added successfully*******");
			return true;
		}

		public static boolean Modify_information(int houseId , int num , String new_value) {
			House House1 = new House();
			House1=arrayHouses.get(houseId-1);

			switch (num) { 
			case 1:
				House1.ResidenceObj.setName(new_value);
				break;
			case 2:
				House1.ResidenceObj.setLocation(new_value);
				break;
			case 3:
				House1.ResidenceObj.setNumberFloors(Integer.parseInt(new_value));
				break;
			case 4:
				House1.ResidenceObj.setNumberApartmentsFloor(Integer.parseInt(new_value));
				break;
			case 5:
				House1.ApartmentsObj.SetNumber(Integer.parseInt(new_value));
				break;
			case 6:
				House1.ApartmentsObj.SetWhichFloor(Integer.parseInt(new_value));
				break;
			case 7:
				House1.ApartmentsObj.SetNumberPerson(Integer.parseInt(new_value));
				break;
			case 8:
				House1.ApartmentsObj.SetSpace(new_value);
				break;
			case 9:
				House1.ApartmentsObj.SetMonthlyFee(Integer.parseInt(new_value));
				break;
			case 10:
				House1.ApartmentsObj.SetFeesIncludeWaterElectricity(Boolean.parseBoolean(new_value));
				break;
			case 11:
				House1.ApartmentsObj.SetFreeInternet(Boolean.parseBoolean(new_value));
				break;
			case 12:
				House1.ResidenceObj.setAvailableParking(Boolean.parseBoolean(new_value));
				break;
			case 13:
				House1.ResidenceObj.setElevatorAvailable(Boolean.parseBoolean(new_value));
				break;
			case 14:
				House1.ApartmentsObj.SetPhoto(new_value);
				break;
			default:
				System.out.println("Wrong!!!Enter only one of the available options");
			}
		
			arrayHouses.set(houseId-1,House1);
			System.out.println("Modify information successfully");
			return true;		
		}
		
		public static boolean showHouse() {
			for(int i=0;i<arrayHouses.size();i++) {
			System.out.println("The ID of the house is: " +arrayHouses.get(i).GetId() );
			System.out.println("House information is : ");
			System.out.println("1-name of Residence : " +arrayHouses.get(i).ResidenceObj.getName()+" \n2-the location of the Residence : " +arrayHouses.get(i).ResidenceObj.getLocation() +"\n3-the number of floors of the building : "+arrayHouses.get(i).ResidenceObj.getNumberFloors()+" \n4-How many apartments per floor : "+arrayHouses.get(i).ResidenceObj.getNumberApartmentsFloor());
			System.out.println("5-the number of the apartment : "+arrayHouses.get(i).ApartmentsObj.GetNumber()+" \n6-What floor is the apartment on : "+arrayHouses.get(i).ApartmentsObj.GetWhichFloor()+" \n7-How many people can the apartment accommodate : "+arrayHouses.get(i).ApartmentsObj.GetNumberPerson()+" \n8-How space is the room : "+arrayHouses.get(i).ApartmentsObj.GetSpace());
			System.out.println("9-How much are the monthly fees : "+arrayHouses.get(i).ApartmentsObj.GetMonthlyFee()+" \n10-Do the fees include electricity and water : "+arrayHouses.get(i).ApartmentsObj.GetFeesIncludeWaterElectricity()+" \n11-Is there free internet service : "+arrayHouses.get(i).ApartmentsObj.GetFreeInternet()+" \n12-Is there a private car park for the building : "+arrayHouses.get(i).ResidenceObj.getAvailableParking()+"\n13-Is elevator service available : "+arrayHouses.get(i).ResidenceObj.getElevatorAvailable());
			}
			System.out.println("***The array is empty***");
			return true;
		}
		
		
		public static boolean  controlPanel(String userName) {
			for(int i=0;i<AdvertisedHouses.size();i++) {
				if(userName.equals(AdvertisedHouses.get(i).OwnerObj.GetName())) {
				System.out.println("The ID of the house is: " +AdvertisedHouses.get(i).GetId() );
				System.out.println("Architecture name : " +AdvertisedHouses.get(i).ResidenceObj.getName() );
				System.out.println("The apartment is located on the floor : " +AdvertisedHouses.get(i).ResidenceObj.getNumberFloors() );
				System.out.println("This apartment is located on the floor:"+AdvertisedHouses.get(i).ApartmentsObj.GetWhichFloor());
				System.out.println("It contains a number of bedrooms:"+AdvertisedHouses.get(i).ApartmentsObj.GetBedroomNumber());
				System.out.println("Number of bathrooms:"+AdvertisedHouses.get(i).ApartmentsObj.GetBathroomsNumber());
				System.out.println("balcony number:"+AdvertisedHouses.get(i).ApartmentsObj.GetBalconyNumber());
				System.out.println("The tenants are:");
				//				System.out.println("Names of owner:"+AdvertisedHouses.get(i).OwnerObj.get_name()+"And his phone number:"+AdvertisedHouses.get(i).OwnerObj.get_phone_number());
				for(int k =0 ; k<IdAndTennantlist.size() ; k++) {
					if(IdAndTennantlist.get(k).gethousingId() == AdvertisedHouses.get(i).GetId()) {
						System.out.print(IdAndTennantlist.get(k).getTenants());
						for(int h=0 ; h<tenantList.size() ; h++ ) {
							if(tenantList.get(h).getName().equals(IdAndTennantlist.get(k).getTenants())) {
								System.out.println("\t"+tenantList.get(h).getPhone());
							}
						}
					}
				}
				}
			}
			return true;
			
		}

//admain		
		
		public static Boolean acceptAndReject(String s ,House housing){
			
			if(s.equals("y")) {AdvertisedHouses.add(housing); 
			arrayHouses.remove (housing); 
			System.out.println("*********done successfully********* ");
			return true;
			}
			else if(s.equals("n")) {arrayHouses.remove (housing);
			System.out.println("*********Not added*********");
			return false;
			}
			else {
				System.out.println("Enter true value !!!");
			}
			System.out.println("*********Not added*********");
			return false;
			}

		public static boolean showAdvertisedHouses() {
			for(int i=0;i<AdvertisedHouses.size();i++) {
			System.out.println("House information is : ");
			System.out.println("1-name of Residence : " +AdvertisedHouses.get(i).ResidenceObj.getName()+" \n2-the location of the Residence : " +AdvertisedHouses.get(i).ResidenceObj.getLocation() +"\n3-the number of floors of the building : "+AdvertisedHouses.get(i).ResidenceObj.getNumberFloors()+" \n4-How many apartments per floor : "+AdvertisedHouses.get(i).ResidenceObj.getNumberApartmentsFloor());
			System.out.println("5-the number of the apartment : "+AdvertisedHouses.get(i).ApartmentsObj.GetNumber()+" \n6-What floor is the apartment on : "+AdvertisedHouses.get(i).ApartmentsObj.GetWhichFloor()+" \n7-How many people can the apartment accommodate : "+AdvertisedHouses.get(i).ApartmentsObj.GetNumberPerson()+" \n8-How space is the room : "+AdvertisedHouses.get(i).ApartmentsObj.GetSpace());
			System.out.println("9-How much are the monthly fees : "+AdvertisedHouses.get(i).ApartmentsObj.GetMonthlyFee()+" \n10-Do the fees include electricity and water : "+AdvertisedHouses.get(i).ApartmentsObj.GetFeesIncludeWaterElectricity()+" \n11-Is there free internet service : "+AdvertisedHouses.get(i).ApartmentsObj.GetFreeInternet()+" \n12-Is there a private car park for the building : "+AdvertisedHouses.get(i).ResidenceObj.getAvailableParking()+"\n13-Is elevator service available : "+AdvertisedHouses.get(i).ResidenceObj.getElevatorAvailable());
			}
			System.out.println("***The array is empty***");
			return true;
		}
		
		
		public static boolean watchingReservations() {
			for(int i=0 ; i<IdAndTennantlist.size() ; i++) {
				
				System.out.println( "housing Id is : "+IdAndTennantlist.get(i).gethousingId());
				System.out.println( "Who is the tenant : "+IdAndTennantlist.get(i).getTenants());
			}
			
			return true;
			
		}
		public static boolean viewAvailableHousing(){
			if(AdvertisedHouses.isEmpty()) {System.out.println("***There are no homes available***"); return false;}
			System.out.println("The available housing : ");
			for(int i=0;i<AdvertisedHouses.size();i++) {
				 if(AdvertisedHouses.get(i).GetAvailabilityStatus()) {
					 System.out.println("name of Residence : " +AdvertisedHouses.get(i).ResidenceObj.getName()+" \nthe location of the Residence : " +AdvertisedHouses.get(i).ResidenceObj.getLocation() );
						System.out.println("the number of the apartment : "+AdvertisedHouses.get(i).ApartmentsObj.GetNumber());
				 } 
			 }
			
			 return true;
		}
		
		public static boolean viewPicturesAndInformation(){
			for(int i=0;i<AdvertisedHouses.size();i++) {
				 if(AdvertisedHouses.get(i).GetAvailabilityStatus()) {
					 System.out.println("House information is : ");
						System.out.println("1-name of Residence : " +AdvertisedHouses.get(i).ResidenceObj.getName()+" \n2-the location of the Residence : " +AdvertisedHouses.get(i).ResidenceObj.getLocation() +"\n3-the number of floors of the building : "+AdvertisedHouses.get(i).ResidenceObj.getNumberFloors()+" \n4-How many apartments per floor : "+AdvertisedHouses.get(i).ResidenceObj.getNumberApartmentsFloor());
						System.out.println("5-the number of the apartment : "+AdvertisedHouses.get(i).ApartmentsObj.GetNumber()+" \n6-What floor is the apartment on : "+AdvertisedHouses.get(i).ApartmentsObj.GetWhichFloor()+" \n7-How many people can the apartment accommodate : "+AdvertisedHouses.get(i).ApartmentsObj.GetNumberPerson()+" \n8-How space is the room : "+AdvertisedHouses.get(i).ApartmentsObj.GetSpace());
						System.out.println("9-How much are the monthly fees : "+AdvertisedHouses.get(i).ApartmentsObj.GetMonthlyFee()+" \n10-Do the fees include electricity and water : "+AdvertisedHouses.get(i).ApartmentsObj.GetFeesIncludeWaterElectricity()+" \n11-Is there free internet service : "+AdvertisedHouses.get(i).ApartmentsObj.GetFreeInternet()+" \n12-Is there a private car park for the building : "+AdvertisedHouses.get(i).ResidenceObj.getAvailableParking()+"\n13-Is elevator service available : "+AdvertisedHouses.get(i).ResidenceObj.getElevatorAvailable());
						System.out.println("14-Image link for the apartment"+AdvertisedHouses.get(i).ApartmentsObj.GetPhoto());
						System.out.println("** This house is available **");
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
		
		public static Boolean AddFurniture(String Furniture , String tenantName){
			 for ( int i=0; i <tenantList.size(); i++ ) {
				 if (tenantName.equals(tenantList.get(i).getName())){
					 tenantList.get(i).setFurniture(Furniture);
					 System.out.println("done");
					 return true;
				 }
			 }
			 return false;
		 }
		public static boolean ShowTenant(String name){
			 for ( int i=0; i <tenantList.size(); i++ ) {
			if(tenantList.get(i).getName().equals(name)){
				System.out.println(" the tenat information is : ");
				System.out.println("Name : " + tenantList.get(i).getName());
				System.out.println("phone : " + tenantList.get(i).getPhone());
				System.out.println("Age : " + tenantList.get(i).getAge());
				System.out.println("major : " + tenantList.get(i).getMajor());
				System.out.println("he is a student  : " + tenantList.get(i).getIsStudent());
				System.out.println("furniture : " + tenantList.get(i).getFurniture());

			}
			 }
			return true;
		}
		public  static boolean SeeNeighbours(String username2) {
			for ( int i=0; i <tenantList.size(); i++ ) {
				 if (username2.equals(tenantList.get(i).getName())){
					 if(tenantList.get(i).getIsStudent()) {
						 System.out.println("your neighbours : ");
							for ( int j=0; j<tenantList.size(); j++ ) {
								if( i!=j ){
									 if(tenantList.get(j).getIsStudent()) {
										 System.out.println( tenantList.get(j).getName());
										 System.out.print("major :" + tenantList.get(j).getMajor());
										 System.out.print(  "phone :" + tenantList.get(j).getPhone());
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
					System.out.println("furniture : " + tenantList.get(i).getFurniture());
					 return true;
				 }
			 }
			return false;
			}
		public static void Payment(String name){
			int fee;
			 for ( int i=0; i <IdAndTennantlist.size(); i++ ){
				 if(IdAndTennantlist.get(i).getTenants().equals(name) ) {
						fee= AdvertisedHouses.get(i).ApartmentsObj.GetMonthlyFee();
						
			 System.out.println("fee: " + fee);	
			 System.out.println("do you want to pay , Enter the letter Y=Yes or N=No only");	
			 String aa=myInput.next();
			 Paymentt(aa,name);
				 }
					}
			
		}
		
		public static boolean Paymentt(String aa,String name){
			switch(aa) {
			 case "y":
				 System.out.print("fees payed successfully " + "\npayred date : ");
				 for (int j=0; j<tenantList.size();j++ ) {
					 if (tenantList.get(j).getName().equals(name)) {
						 System.out.print(tenantList.get(j).getPayDate());
					 }
				 }
				 break;
			 case "n":
				 System.out.println("please pay soon ");
				 break;
				 
			 }
			return true;
		}
		public static void Menu() {
			System.out.println(" Choose one of these options : ");
			System.out.println(" 1- Tenant Information ");
			System.out.println(" 2- Informations about Owner and how to Contact ");
			System.out.println(" 3- the Rent and when to pay  ");
}	
		public static boolean ShowOwnerInformation(String username) {
			int ID_House =0;
			for(int i=0 ; i< IdAndTennantlist.size() ; i++) {
				 if(IdAndTennantlist.get(i).getTenants().equals(username) ) {
					 ID_House=IdAndTennantlist.get(i).gethousingId();
				 }
			}
			for (int i=0 ; i<AdvertisedHouses.size() ; i++){
			if (AdvertisedHouses.get(i).GetId()==ID_House) {

				System.out.println(" Owner name is  : " +AdvertisedHouses.get(i).OwnerObj.GetName());
				System.out.println(" Owner phone number is  : " +AdvertisedHouses.get(i).OwnerObj.GetPhoneNumber());
			}
			} 
			return true;
		}
	
		public static boolean bookacc(int id,String n) {
			 boolean flagRet=false;
			for(int i=0 ; i< AdvertisedHouses.size() ; i++) {
				 if(AdvertisedHouses.get(i).GetId() == id ) {	
					 if(AdvertisedHouses.get(i).GetAvailabilityStatus() ) {
						 counter=counter+1;
						  flagRet=true;	 
						  IdAndTennant t = new IdAndTennant(id,n);
						  IdAndTennantlist.add(t);
						  System.out.println("The house has been booked");						
						  if(AdvertisedHouses.get(i).ApartmentsObj.GetNumberPerson() == counter) {
							  AdvertisedHouses.get(i).SetAvailabilityStatus(false);
							  
						  }
						  
					  }
					  else	{
						  flagRet=false;
					  System.out.println("This house is Non available"); }

					  }
					 }
			return flagRet;
								 
				}
		
		
		
}

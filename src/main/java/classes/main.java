package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static Scanner myInput = new Scanner(System.in);
	public static  ArrayList<owners> arrayOwners = new ArrayList<owners>();
	
	 
	 public static void main(String[] args) {
		 full();
		 System.out.println("menu : ");
		 System.out.println("1-add House\n2-Modify information\n3-show House");
		 int in = myInput.nextInt();
		 switch(in) {
		 case 1:
			 	House House1 = new House();
//			 	 System.out.println(House1.owner.get_numberOfHouses()+"*****************");
				House1.set_ID(House1.apartmentsObj.get_number()+200);
				System.out.println("Enter the name of the owner : ");
				String ownerName =  myInput.nextLine();
				int index =0;
				for(int i=0;i<arrayOwners.size();i++) {
					if (arrayOwners.get(i).get_name() == ownerName) {
						index=i;
					}
				}
				System.out.println("The name of the building in which the apartment is located ?");
				House1.residenceObj.set_name(myInput.nextLine());

				System.out.println("What is the location of the Residence in which the apartment is located ?");
				House1.residenceObj.set_location(myInput.nextLine()); 
				
				System.out.println("What is the number of floors of the building?");
				House1.residenceObj.set_number_floors(myInput.nextInt());
				
				System.out.println("How many apartments per floor?");
				House1.residenceObj.set_Number_apartments_floor(myInput.nextInt());
				
				System.out.println("Enter the number of the apartment ?");
				House1.apartmentsObj.set_number(myInput.nextInt());
				
				System.out.println("What floor is the apartment on ?");
				House1.apartmentsObj.set_which_floor(myInput.nextInt());

				System.out.println("How many people can the apartment accommodate?");
				House1.apartmentsObj.set_number_person(myInput.nextInt());

				System.out.println("How space is the room ?");
				House1.apartmentsObj.set_space(myInput.nextLine());
				
				System.out.println("How much are the monthly fees ?");
				House1.apartmentsObj.set_monthly_fee(myInput.nextInt());
				
				System.out.println("Do the fees include electricity and water ? (y or n)");
				String s = myInput.nextLine();
				boolean b=true ;
				if(s=="y" && s=="Y") { b=true;}
				else if(s=="n" && s=="N") { b=false;}
				else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
				House1.apartmentsObj.set_Fees_include_water_electricity(b);

				System.out.println("Is there free internet service ? (y or n)");
				s = myInput.nextLine();
				if(s=="y" && s=="Y") { b=true;}
				else if(s=="n" && s=="N") { b=false;}
				else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
				House1.apartmentsObj.set_Free_internet(b);
				
				System.out.println("Is there a private car park for the building? (y or n)");
				s = myInput.nextLine();
				if(s=="y" && s=="Y") { b=true;}
				else if(s=="n" && s=="N") { b=false;}
				else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
				House1.residenceObj.set_available_parking(b);
				
				System.out.println("Is elevator service available? (y or n)");
				s = myInput.nextLine();
				if(s=="y" && s=="Y") { b=true;}
				else if(s=="n" && s=="N") { b=false;}
				else { System.out.println("Please, pay attention !!! Enter the letter Y=Yes or N=No only"); }
				House1.residenceObj.set_Elevator_available(b);	
				
				System.out.println("Enter a picture of the apartment");
				House1.apartmentsObj.set_photo(myInput.nextLine());
				addHouse( House1, index);
			 break;
		 case 2:
			 break;
		 case 3:
			 break;
		 }
		 
			
		  }
	 
	 
	 public static void full() {
		
		 owners owner1 = new owners(3,"bayan","059908122");
		 arrayOwners.add(owner1);
		 
		 Residence Residence1 = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 apartments apartments1=new apartments(1,1,600,4,"400*400","ww",true,true);
		 House Housee1=new House(11,Residence1,apartments1);
		 owner1.arrayHouses.add(Housee1);
		 
		 Residence Residence2 = new Residence("Al-Quqa","Nablus-Jerusalem Street",4,4,true,true);
		 apartments apartments2=new apartments(12,5,500,4,"550*600","ww",true,true);
		 House Housee2=new House(22,Residence2,apartments2);
		 owner1.arrayHouses.add(Housee2);
		 
		 Residence Residence5 = new Residence("Hajj Muhammad","Nablus-Jerusalem Street",4,4,true,true);
		 apartments apartments5=new apartments(17,8,500,4,"500*600","ww",true,true);
		 House Housee5=new House(33,Residence5,apartments5);
		 owner1.arrayHouses.add(Housee5);
		 
		 owners owner2 = new owners(2,"marah","059908134");
		 arrayOwners.add(owner2);
		 
		 Residence Residence3 = new Residence("Hajj Ahmed","Ramallah",4,4,true,true);
		 apartments apartments3=new apartments(32,3,1000,4,"900*800","ww",true,true);
		 House Housee3=new House(44,Residence3,apartments3);
		 owner2.arrayHouses.add(Housee3);
		 
		 Residence Residence4 = new Residence("Al-Quqa","Nablus-Jerusalem Street",4,4,true,true);
		 apartments apartments4=new apartments(42,8,700,4,"550*600","ww",true,true);
		 House Housee4=new House(55,Residence4,apartments4);
		 owner2.arrayHouses.add(Housee4);
		 
	 }
	 public static boolean addHouse(House House1,int index) {

			arrayOwners.get(index).arrayHouses.add(House1);
			return true;
			

		}
	 

		public void Modify_information() {
			
			System.out.println("What is the owner's name?");
			String ownerName =  myInput.nextLine();
			int index =0;
			for(int i=0;i<arrayOwners.size();i++) {
				if (arrayOwners.get(i).get_name() == ownerName) {
					index=i;
				}
			}
			System.out.println("What is the house ID that you want to change to?");
			int houseId = myInput.nextInt();
			
			House House1 = new House();
			House1=arrayOwners.get(index).arrayHouses.get(houseId-1);
			System.out.println("What information do you want to modify?");
			System.out.println("1-name of Residence \n2-the location of the Residence \n3-the number of floors of the building \n4-How many apartments per floor");
			System.out.println("5-the number of the apartment \n6-What floor is the apartment on \n7-How many people can the apartment accommodate \n8-How space is the room");
			System.out.println("9-How much are the monthly fees \n10-Do the fees include electricity and water \n11-Is there free internet service \n12-Is there a private car park for the building \n13-Is elevator service available \n14-picture of the apartment");
			
			int num = myInput.nextInt();
			System.out.println("Enter the new value");
			String new_value =  myInput.nextLine();
			switch (num) { 
			case 1:
				House1.residenceObj.set_name(new_value);
				break;
			case 2:
				House1.residenceObj.set_location(new_value);
				break;
			case 3:
				House1.residenceObj.set_number_floors(Integer.parseInt(new_value));
				break;
			case 4:
				House1.residenceObj.set_Number_apartments_floor(Integer.parseInt(new_value));
				break;
			case 5:
				House1.apartmentsObj.set_number(Integer.parseInt(new_value));
				break;
			case 6:
				House1.apartmentsObj.set_which_floor(Integer.parseInt(new_value));
				break;
			case 7:
				House1.apartmentsObj.set_number_person(Integer.parseInt(new_value));
				break;
			case 8:
				House1.apartmentsObj.set_space(new_value);
				break;
			case 9:
				House1.apartmentsObj.set_monthly_fee(Integer.parseInt(new_value));
				break;
			case 10:
				House1.apartmentsObj.set_Fees_include_water_electricity(Boolean.parseBoolean(new_value));
				break;
			case 11:
				House1.apartmentsObj.set_Free_internet(Boolean.parseBoolean(new_value));
				break;
			case 12:
				House1.residenceObj.set_available_parking(Boolean.parseBoolean(new_value));
				break;
			case 13:
				House1.residenceObj.set_Elevator_available(Boolean.parseBoolean(new_value));
				break;
			case 14:
				House1.apartmentsObj.set_photo(new_value);
				break;
			default:
				System.out.println("Wrong!!!Enter only one of the available options");
			}
			arrayOwners.get(index).arrayHouses.set(houseId-1,House1);
		}
		public void showHouse() {
			System.out.println("Choose the location where you want to rent an apartment :");
			System.out.println("1-Ramallah\n2-Nablus-Jerusalem Street");
			int choose = myInput.nextInt();
			
			System.out.println("Choose Residence :");
			if (choose==1) 
			  System.out.println("1-Hijjawi\n2-Hajj Ahmed");
				
			else if (choose==2)
			  System.out.println("1-Al-Quqa\n2-Hajj Muhammad");
			
//			System.out.println("Choose which floor do you want?");
//			System.out.println("");
		}
		
}

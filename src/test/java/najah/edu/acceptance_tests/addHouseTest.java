package najah.edu.acceptance_tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;
import classes.*;
public class addHouseTest {
	@Given("The owner has entered the house information")
	public void the_owner_has_entered_the_house_information() {
	   
	}

	@When("add new house")
	public void add_new_house() {
	   
	}

	@Then("Add the house in the house array list of this owner")
	public void add_the_house_in_the_house_array_list_of_this_owner() {
		 Residence Residence1 = new Residence("Hijjawi","Ramallah",4,4,true,true);
		 apartments apartments1=new apartments(1,1,600,4,"400*400","ww",true,true);
		 House House1=new House(11,Residence1,apartments1);
		 String ownerName="bayan";
		 int index =0;
			for(int i=0;i<main.arrayOwners.size();i++) {
				if (main.arrayOwners.get(i).get_name() == ownerName) {
					index=i;
				}
			}
	   assertTrue(main.addHouse(House1,index));
	}
}

import java.util.Date;


import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entites.Customer;

public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		Customer customer = new Customer();
		customer.setFirstName("Taha");
		customer.setLastName("Can");
		customer.setId(1);
		customer.setDateOfBirth(2001);
		customer.setNationalyId(1234567);
		
		
		
		customerManager.save(customer);
			
		
	
	}

}
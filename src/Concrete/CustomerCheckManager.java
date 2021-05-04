package Concrete;

import Abstract.ICustomerCheckService;
import Entites.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean ChekIfRealPerson(Customer customer) {
		return true;
		// TODO Auto-generated method stub
	    
	}


}

package Abstract;


import Entites.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

 
	public abstract void save(Customer customer);

}

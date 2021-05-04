package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entites.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub

		if (_customerCheckService.ChekIfRealPerson(customer)) {

			System.out.println("Saved to db" );
		} else {
			System.out.println("Not a valid person");
		}

	}

}

package Adapter;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean ChekIfRealPerson(Customer customer)  {
		// TODO Auto-generated method stub
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(customer.getNationalyId(),customer.getFirstName(),customer.getLastName(),customer.getId());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}

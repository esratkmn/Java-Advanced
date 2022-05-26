package springIntro;

public class CustomerManager implements ICustomerService {
	
	public ICustomerDal customerDal;
	   //constructor injection
	//public CustomerManager(ICustomerDal customerDal) {
	//	this.customerDal=customerDal;
		
		
	//}
	public void add() {
		//iþ kurallarý
		customerDal.add();
		
	}


	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

}

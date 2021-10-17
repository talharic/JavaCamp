package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer talha = new IndividualCustomer();
		talha.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "321654";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {talha,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}

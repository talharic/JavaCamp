package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer talha = new Customer(1,"Talha","Arýç");
		customerManager.add(talha);
	}

}

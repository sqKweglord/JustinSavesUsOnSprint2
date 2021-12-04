package people;

public class Employee extends Person 
{
	private void loginToAdmin()
	{
		
	}
	
	protected void createCustomer(String name, String phoneNumber, String addressLine1, String addressLine2, String city, String state, String zip)
	{
		Customer c1 = new Customer();
		
		editCustomerInformation(c1, name, phoneNumber, addressLine1, addressLine2, city, state, zip);
	}

	@Override
	public Order placeOrder() {
		return null;
	}
}

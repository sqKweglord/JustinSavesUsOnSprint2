package People;

public abstract class Person
{
	public String Name;
	
	public abstract Order placeOrder();
	
	public void cancelOrder(Order order)
	{
		
	}
	
	public void viewMenu()
	{
		
	}
	
	public void viewInformation()
	{
		
	}
	
	public void editCustomerInformation(Customer customer, String name, String phoneNumber, String addressLine1, String addressLine2, String city, String state, String zip)
	{
		customer.Name = name;
		customer.PhoneNumber = phoneNumber;
		
		String[] updatedAddress = new String[] {addressLine1, addressLine2, city, state, zip};
		customer.Address = updatedAddress;
	}
	
	
}

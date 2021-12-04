package People;

public class Customer extends Person 
{
	public String[] Address;
	
	private String[] PaymentInformation;
	
	public String PhoneNumber;
	

	@Override
	public Order placeOrder()
	{
		Order order = new Order();
		return order;
	}
	
	
	
	public void setPaymentInformation(String cardNumber, String securityCode, String expirationDate)
	{
		String[] updatedPaymentInformation = new String[] {cardNumber, securityCode, expirationDate};
		PaymentInformation = updatedPaymentInformation;
	}
	public String[] GetPaymentInformation()
	{
		return PaymentInformation;
	}
}

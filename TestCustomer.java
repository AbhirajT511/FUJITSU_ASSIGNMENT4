//Aggregation and Encapsulation
//Address class

class Address
{
	private String addressLine;
	private String city;
	public Address(String addressLine, String city) 
	{
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	public String getAddressLine() 
	{
		return addressLine;
	}
	public void setAddressLine(String addressLine) 
	{
		this.addressLine = addressLine;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getAddressDetails()
	{
		System.out.println(addressLine + city);
		return addressLine;
	}
}

//Customer class
class Customer
{
	private String customerName;
	private Address residentialAddress;
	Address officialAddress;

	public Customer(String customerName, Address residentialAddress, Address officialAddress) 
	{
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}
	public String getCustomerName() 
	{
		return customerName;
	}
	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	public Address getResidentialAddress() 
	{
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) 
	{
		this.residentialAddress = residentialAddress;
	}
	public Address getOfficialAddress() 
	{
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) 
	{
		this.officialAddress = officialAddress;
	}
	public String getCustomerDetails()
	{
		System.out.println("Customer: " +customerName);
		System.out.println("Residential Address: " +residentialAddress);
		System.out.println("Official Address: " +officialAddress);
		return customerName;
	}
}

//main class
public class TestCustomer 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Address add1 = new Address("Ist Main HSR Layout ", " Bangalore");
		Address add2 = new Address("Ist Main Electronics city ", " Bangalore");
		Customer cus = new Customer("John", add1, add2);
		add1.getAddressDetails();
		add2.getAddressDetails();
		cus.getCustomerDetails();
	}
}

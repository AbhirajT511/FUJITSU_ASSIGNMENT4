// Inheritance and Abstraction
//medicine class

abstract class Medicine
{
	abstract void cost(int price);	
	abstract void expiryDate(String date);
	abstract void displayLabel();
}

//tablet class
class Tablet extends Medicine
{
	@Override
	void displayLabel() 
	{
		// TODO Auto-generated method stub
		System.out.println("Store in a cool and dry place");
	}

	@Override
	void cost(int price) 
	{
		// TODO Auto-generated method stub
		System.out.println("the price is: "+price);
		return;
	}

	@Override
	void expiryDate(String date) 
	{
		// TODO Auto-generated method stub
		System.out.println("expiry date is: "+date);
		return;
	}	
}

//syrup class
class Syrup extends Medicine
{
	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("use as per doctor prescription");
	}

	@Override
	void cost(int price) 
	{
		// TODO Auto-generated method stub
		System.out.println("the price is: "+price);
		return;
	}

	@Override
	void expiryDate(String date)
	{
		// TODO Auto-generated method stub
		System.out.println("expiry date is: "+date);
		return;
	}	
}

//ointment class
class Ointment extends Medicine
{
	@Override
	void displayLabel() {
		// TODO Auto-generated method stub
		System.out.println("For external use only");
	}

	@Override
	void cost(int price) 
	{
		// TODO Auto-generated method stub
		System.out.println("the price is: "+price);
		return;
	}

	@Override
	void expiryDate(String date) 
	{
		// TODO Auto-generated method stub
		System.out.println("expiry date is: "+date);
		return;
	}	
}

//main class
public class TestMedicine 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int min=1,max=3;
		int random_int = (int)(Math.random() * (max - min + 1) + min);
		
		if(random_int == 1)
		{
			System.out.println("Value is 1, it is tablet");
			Tablet tab = new Tablet();
			tab.displayLabel();
			tab.cost(50);
			tab.expiryDate("10-09-2022");
		}
		
		else if(random_int == 2)
		{
			System.out.println("Value is 2, it is syrup");
			Syrup sy = new Syrup();
			sy.displayLabel();
			sy.cost(125);
			sy.expiryDate("12-02-2021");
		}
		
		else
		{
			System.out.println("Value is 3, it is ointment");
			Ointment oin = new Ointment();
			oin.displayLabel();
			oin.cost(45);
			oin.expiryDate("24-10-2021");
		}		
	}
}

import java.util.ArrayList;

public class Customer {
	
	private int n = 1;
	private String firstName;
	private String lastName;
	private Address altAddress;
	private ArrayList<Address> addressList = new ArrayList<Address>(n);
	
	public Customer(String firstName, String lastName, Address address) throws EmptyStringException {
		if (firstName == null) {
			throw new NullPointerException("First name is null");
		} else if (firstName.isEmpty()) {
			throw new EmptyStringException("First name is empty");
		}
		else {
			this.firstName = firstName;
		}
		
		if (lastName == null) {
			throw new NullPointerException("Last name is null");
		} else if (lastName.isEmpty()) {
			throw new EmptyStringException("Last name is empty");
		}
		else {
			this.lastName = lastName;
		}
		
		if (address == null ) {
			throw new NullPointerException("Last name is null");
		} else {
			this.addressList.add(address);
			this.altAddress = address;
		}
	}
	
	public boolean addAddress(Address address) {
		if (address == null) {
			return false;
		} else {
			this.addressList.add(address);
			return true;
		}
	}
	
	public void setAltAddress() {
		if (this.addressList.size() == 2) {
			this.altAddress = this.addressList.get(1);
		}
	}
	
	
}


public class Person {
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String teleNumber;
	private Address address;
	
	public Person() {
		}
	
	public Person(String firstName, String middleName, String lastName, String teleNumber, Address address) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.teleNumber = teleNumber;
		this.address = address;
		
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastNAme
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastNAme the lastNAme to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the teleNumber
	 */
	public String getTeleNumber() {
		return teleNumber;
	}
	/**
	 * @param teleNumber the teleNumber to set
	 */
	public void setTeleNumber(String teleNumber) {
		this.teleNumber = teleNumber;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", teleNumber=" + teleNumber + ", address="
				+ address + "]";
	}
	
	
	
}

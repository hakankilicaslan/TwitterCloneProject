package Tweeter_Clone;

public class Address {

	private String userName;
	private String city;
	private String country;
	private String street;
	private String postalCode;

	public Address(String userName, String city, String country, String street, String postalCode) {
		super();
		this.userName=userName;
		this.city = city;
		this.country = country;
		this.street = street;
		this.postalCode = postalCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@Override
	public String toString() {
		return "Address [userName=" + userName + ", city=" + city + ", country=" + country + ", street=" + street+ ", postalCode=" + postalCode + "]";
	}

}

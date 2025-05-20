
public class Address {
	String line1;
	String city;
	int pincode;
	
	public Address() {
		super();
		System.out.println("In address default constructor");
	}
	
	public Address(String line1, String city, int pincode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.pincode = pincode;
		System.out.println("In address parameterized constructor");
	}



	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
		System.out.println("in line1 setter");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("in city setter");
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
		System.out.println("in pincode setter");
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}


public class Consultant implements Payable{
	int Cid;
	String name;
	Address adr;
	
	public Consultant() {
		super();
		System.out.println("In default constructor");
	}
	
	public Consultant(int cid, String name, Address adr) { 
		super();
		this.Cid = cid;
		this.name = name;
		this.adr = adr;
		System.out.println("In Parameterized constructor");
	}
	
	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
		System.out.println("In id setter");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("In name setter");
	}
	
	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
		System.out.println("In address setter");
	}
	
	@Override
	public String toString() {
		return "Consultant [Cid=" + Cid + ", name=" + name + ", adr=" + adr + "]";
	}

	@Override
	public void pay() {
		System.out.println("Consultant pay");
	}
}

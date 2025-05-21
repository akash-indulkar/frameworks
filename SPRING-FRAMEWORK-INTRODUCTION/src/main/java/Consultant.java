import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Marks a class as a Spring-managed component (bean)
//@Lazy(true) //lazy initialization
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //for each time instance creation 
public class Consultant implements Payable{
	@Value("10") //injects default values; can be used on fields, constructors and setter methods
	int Cid;
	@Value("Akash Indulkar")
	String name;
//	@Autowired //Field Injection
	Address adr;
	
//	@Autowired //Dependency will not be initialized
	public Consultant() {
		super();
		System.out.println("In default constructor");
	}
	
//	@Autowired cannot use @Autowired on parameterized constructor having unsatisfied dependency
	public Consultant(int cid, String name, Address adr) { 
		super();
		this.Cid = cid;
		this.name = name;
		this.adr = adr;
		System.out.println("In Parameterized constructor");
	}

	@Autowired //Constructor injection
	public Consultant(Address adr) {
		super();
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
	
//	@Autowired //Setter injection
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

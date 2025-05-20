import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		Payable payee = new Consultant();
//		payee.pay();
		System.out.println("Before Application context");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"); //used to load a Spring application context from an XML configuration file located in the classpath.
		System.out.println("After Application context");
		Payable payee = (Payable)ctx.getBean("consultant"); //gives object at runtime based on bean ID, by default works on singleton pattern i.e. object will be created only once, otherwise use scope="prototype" in config
		Payable payee1 = (Payable)ctx.getBean("consultant1"); //different object will be created for different bean ID
		Payable payee2 = (Payable)ctx.getBean("consultant"); 
		payee.pay();
		System.out.println(payee);
//		System.out.println(payee.hashCode());
//		System.out.println(payee1.hashCode());
//		System.out.println(payee2.hashCode());
	}
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
//		Payable payee = new Consultant();
//		payee.pay();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"); //used to load a Spring application context from an XML configuration file located in the classpath.
		Payable payee = (Payable)ctx.getBean("consultant"); //gives object at runtime based on bean ID
		payee.pay();
	}
}

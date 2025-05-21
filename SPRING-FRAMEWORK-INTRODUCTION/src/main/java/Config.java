import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
//	@Bean
//	public Consultant createConsultant() {
//		return new Consultant();
//	}
	
	@Bean
	@Lazy(true) //lazy initialization
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //for each time instance creation 
	public Consultant createConsultant(Address adr) { //for dependency injection
		return new Consultant(adr);
	}
	
//	Oveloaded methods are not allowed
//	@Bean
//	public Consultant createConsultant(int a) {
//		return new Consultant();
//	}
	
	@Bean
	public Address createAddress() {
		return new Address();
	}
}

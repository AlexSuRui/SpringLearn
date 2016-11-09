import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.service.RentService;
import com.service.RentServiceImpl;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.web"})
public class Main {
	
	
	
	@Bean
	RentService rentService() throws Exception{
		return new RentServiceImpl();
	}
	
	public static void main(String[] args){
			SpringApplication.run(Main.class, args);
	}
}

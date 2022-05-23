package Config;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.qa.SpringbootEx.DemoApplication;

import java.time.LocalTime;

@Configuration
public class AppConfig {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		LocalTime byName = (java.time.LocalTime) context.getBean("TimeNow");
		LocalTime byType = context.getBean(LocalTime.class);
		LocalTime byBoth = context.getBean("hello", LocalTime.class);
		
		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);
	}
	
	@Bean
	public String TimeNow() {
		return "Hello";
	}

}

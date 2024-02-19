package np.edu.gces.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import np.edu.gces.library.entities.MyConfig;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Bean
	public MyConfig getAppConfig(){
		MyConfig c = new MyConfig();
		c.setAppVersion(1);
		c.setTheme("Dark");
		return c;
	}
}

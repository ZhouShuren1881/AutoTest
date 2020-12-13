package cn.edu.xmu.testserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Ming Qiu
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

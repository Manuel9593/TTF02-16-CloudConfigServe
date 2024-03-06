package ttf02.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ttf0216ActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ttf0216ActuatorApplication.class, args);
	}

}

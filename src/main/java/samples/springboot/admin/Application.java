package samples.springboot.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.system.ApplicationPidListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * Created by izeye on 14. 12. 18..
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Application.class);

		// NOTE:
		// ApplicationPidFileWriter is 1.2.0.RELEASE only.
//		application.addListeners(new ApplicationPidFileWriter());
		application.addListeners(new ApplicationPidListener());
		application.run(args);
	}

}

package link.kolyada.devops.devopskb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// java -jar ...\target\devopskb.jar link.kolyada.devops.devopskb.DevopskbApplication
// java -jar devopskb.jar link.kolyada.devops.devopskb.DevopskbApplication
// javaw -jar devopskb.jar link.kolyada.devops.devopskb.DevopskbApplication

@SpringBootApplication
public class DevopskbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopskbApplication.class, args);
	}

}
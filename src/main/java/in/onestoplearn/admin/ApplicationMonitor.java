package in.onestoplearn.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class ApplicationMonitor {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationMonitor.class, args);
    }

}

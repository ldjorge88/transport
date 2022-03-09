package co.com.edu.uco.ing.software.project.transports.infrastructure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"co.com.edu.uco.ing.software"})
@EnableJpaRepositories(basePackages = "co.com.edu.uco.ing.software")
public class ApplicationMock {
}

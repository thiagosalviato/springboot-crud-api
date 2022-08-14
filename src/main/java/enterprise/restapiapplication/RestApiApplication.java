package enterprise.restapiapplication;

import enterprise.restapiapplication.model.Employee;
import enterprise.restapiapplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee();
        employee.setFirstName("Thiago");
        employee.setLastName("Salviato");
        employee.setEmailId("thiago@gmail.com");
        employeeRepository.save(employee);

        Employee employee1 = new Employee();
        employee1.setFirstName("Robert");
        employee1.setLastName("Zane");
        employee1.setEmailId("robert@gmail.com");
        employeeRepository.save(employee1);
    }
}

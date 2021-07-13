package school.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			
			Student jeferson = new Student(
							"Jeferson",
							"jeferson@email.com",
							LocalDate.of(1967, Month.DECEMBER, 13));
			
			Student jamile = new Student(
							"Jamile",
							"jamile@email.com",
							LocalDate.of(2005, Month.JUNE, 3));
			
			Student jeter = new Student(
							"Jeter",
							"jeter@email.com",
							LocalDate.of(2012, Month.OCTOBER, 20));
			
			repository.saveAll(List.of(jeferson, jamile, jeter));
		};
	}
}

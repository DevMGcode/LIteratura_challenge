package com.example.Literatura;

import com.example.Literatura.principal.Principal;
import com.example.Literatura.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

	@Autowired
	private AutorRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.mostrarMenu();
	}
}

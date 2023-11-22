package com.devmoura.meuprojetopessoal;

import com.devmoura.meuprojetopessoal.entities.Category;
import com.devmoura.meuprojetopessoal.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

public class MeuprojetopessoalApplication implements CommandLineRunner {
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(MeuprojetopessoalApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L,"Electronucs");
		Category cat2 = new Category(2L,"Books");


		categoryRepository.save(cat1);
		categoryRepository.save(cat2);


	}
}

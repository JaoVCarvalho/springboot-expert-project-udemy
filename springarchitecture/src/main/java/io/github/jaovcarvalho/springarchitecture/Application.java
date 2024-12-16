package io.github.jaovcarvalho.springarchitecture;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


// Pode ter apenas uma classe com a anotação @SpringBootApplication
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		/*
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(Application.class);

		// Comando para retirar o banner do spring do console
		applicationBuilder.bannerMode(Banner.Mode.OFF);

		// Comando para inicializar a aplicação pelo perfil de produção, por exemplo. (Não é a abordagem mais indicada)
		applicationBuilder.profiles("production");

		// Outra forma de inicializar a aplicação
		// Apenas é possível acessar o contexto da produção depois que ela foi inicializada
		applicationBuilder.run(args);

		// ---

		ConfigurableApplicationContext applicationContext = applicationBuilder.context();
		// Comando para selecionar um Bean por meio do contexto da aplicação
		var contextBean = applicationContext.getBean("productRepository");
		// Comando para adicionar propriedades. (Também não é a abordagem mais indicada, mas é possível)
		applicationBuilder.properties("spring.datasource.url=...");
		// Comando para selecionar propriedades
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String property = environment.getProperty("spring.application.name");
		System.out.println(property);
		*/
	}

}

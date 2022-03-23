package com.danigdiaz.fundamentsspringboot;

import com.danigdiaz.fundamentsspringboot.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentsSpringbootApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public FundamentsSpringbootApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency) {
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentsSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		componentDependency.saludar();
	}
}

package com.dzsudasz.rulebooksimplifier;

import org.springframework.boot.SpringApplication;
import org.testcontainers.utility.TestcontainersConfiguration;

public class TestRulebookSimplifierApplication {

	public static void main(String[] args) {
		SpringApplication.from(RulebookSimplifierApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

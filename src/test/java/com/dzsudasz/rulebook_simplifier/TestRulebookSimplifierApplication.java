package com.dzsudasz.rulebook_simplifier;

import com.dzsudasz.rulebooksimplifier.RulebookSimplifierApplication;
import org.springframework.boot.SpringApplication;

public class TestRulebookSimplifierApplication {

	public static void main(String[] args) {
		SpringApplication.from(RulebookSimplifierApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

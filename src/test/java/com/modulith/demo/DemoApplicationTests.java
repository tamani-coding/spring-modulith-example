package com.modulith.demo;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

class DemoApplicationTests {

	@Test
	void verifiesModularStructure() {
		ApplicationModules modules = ApplicationModules.of(DemoApplication.class);
		modules.forEach(System.out::println);

		new Documenter(modules)
				.writeDocumentation()
				.writeIndividualModulesAsPlantUml();

		modules.verify();
	}

}

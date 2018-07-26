package com.example.cucumber;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

	@Override
	public void configureTypeRegistry(TypeRegistry typeRegistry) {
		typeRegistry.defineParameterType(new ParameterType<>(
			"color",
			Stream.of(Color.values()).map(Color::getValue).collect(Collectors.joining("|")), Color.class,
			Color::create));
	}

}

package com.example.cucumber;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableRowTransformer;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
	
	//private final ObjectMapper objectMapper = new ObjectMapper();

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
		typeRegistry.defineDataTableType(new DataTableType(
			Account.class, 
			new TableRowTransformer<Account>() {
				@Override
				public Account transform(List<String> row) throws Throwable {
					return new Account(Integer.valueOf(row.get(0)), row.get(1), Double.valueOf(row.get(2)));
				}
			})
		);
	}

}

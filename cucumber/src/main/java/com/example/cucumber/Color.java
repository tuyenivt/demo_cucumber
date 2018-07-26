package com.example.cucumber;

public enum Color {
	RED("red"), BLUE("blue"), GREEN("green");

	private String value;

	private Color(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public static Color create(String value) {
		for (Color color : values()) {
			if (color.value.equals(value)) {
				return color;
			}
		}
		return null;
	}
}

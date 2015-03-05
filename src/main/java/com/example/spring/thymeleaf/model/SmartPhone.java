package com.example.spring.thymeleaf.model;

public class SmartPhone {
	private String name;
	private String ram;
	private String rom;
	private String resolution;

	public SmartPhone() {
	}

	public SmartPhone(String name, String ram, String rom, String resolution) {
		this.name = name;
		this.ram = ram;
		this.rom = rom;
		this.resolution = resolution;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
}

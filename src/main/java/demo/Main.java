package demo;

import demo.utils.StringGenerator;

public class Main {

	public static void main(String[] args) {
		StringGenerator generator = new StringGenerator();
		System.out.println(generator.getEmail());
		System.out.println(generator.getAddress());
	}

}

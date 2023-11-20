package ai.aptipro.configfactory;

import org.aeonbits.owner.ConfigFactory;

public class AccessProperties {

	public static global getProperty() {
		global get = ConfigFactory.create(global.class);
		return get;
	}

	public static void main(String[] args) {

		System.out.println(getProperty().expectedHomePageUrl());
	}

}

package com.test.restassured;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getFirstName(){

		String generated = RandomStringUtils.randomAlphabetic(1);
		return("Umesh"+generated);
	}
	public static String getLastName(){

		String generated = RandomStringUtils.randomAlphabetic(1);
		return("Umesh"+generated);
	}
	public static String getLastName1(){

		String generated  = RandomStringUtils.randomAlphabetic(3);
		return("Umesh"+generated);
	}

	public static String getUserName(){

		String generated = RandomStringUtils.randomAlphabetic(3);
		return("Umesh"+generated);
	}
	public static String getPassword(){

		String generated = RandomStringUtils.randomAlphabetic(3);
		return("Umesh"+generated);
	}
	public static String getPassword1(){

		String generated = RandomStringUtils.randomAlphabetic(3);
		return("Umesh"+generated);
	}
	public static String  getEmail(){

		String generated = RandomStringUtils.randomAlphabetic(3);
		return(generated+"gmail.com");
	}
	public static String empName(){

		String generated = RandomStringUtils.randomAlphabetic(3);
		return("Umesh"+generated);
	}
	public static String empSal(){

		String generated = RandomStringUtils.randomAlphabetic(5);
		return(generated);
	}

}

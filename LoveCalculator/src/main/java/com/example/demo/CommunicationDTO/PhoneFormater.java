package com.example.demo.CommunicationDTO;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class PhoneFormater implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		
		if (phone == null) {
			return "";
		}
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		if (text == null || text.trim().isEmpty()) {
			return null;
		}

		String[] phonenumberarray = text.split("-");

		Phone phone = new Phone();
		int index = text.indexOf('-');
		if (index == -1) {

			phone.setCountryCode("91");
			phone.setUserNumber(phonenumberarray[0]);

		}else
		{
			phone.setCountryCode(phonenumberarray[0]);
			phone.setUserNumber(phonenumberarray[1]);
		}

		return phone;
	}
}

package com.example.demo.EmailService;

import org.springframework.stereotype.Service;

@Service
public class LcAppLogicImpl implements LcAppLogic{

	@Override
	public String calculateLove(String username, String crushname) {
		char ret;
		int userAndCrushNameCount = (username+crushname).toCharArray().length;
		int formulaCount = "FLAMES".toCharArray().length;
		int reminder = userAndCrushNameCount % formulaCount;
		
		if(reminder ==0)
		{
			ret = 'F';
		}else {
			ret = "FLAMES".charAt(reminder);
		}
		
		String result = whatsBetweenUs(ret); 
		return result;
	}

	@Override
	public String whatsBetweenUs(char calculateResult) {
		
		String result =null;
		if(calculateResult == 'F')
		{
			result = LoveCalculatorConstants.F_CHAR_MEANING;
		}else if(calculateResult == 'L')
		{
			result = LoveCalculatorConstants.L_CHAR_MEANING;
		}else if(calculateResult == 'A')
		{
			result = LoveCalculatorConstants.A_CHAR_MEANING;
		}else if(calculateResult == 'M')
		{
			result = LoveCalculatorConstants.M_CHAR_MEANING;
		}else if(calculateResult == 'E')
		{
			result = LoveCalculatorConstants.E_CHAR_MEANING;
		}else if(calculateResult == 'S')
		{
			result = LoveCalculatorConstants.S_CHAR_MEANING;
		}
		return result;
	}

	
}

package com.syntax.class10;

public class countryTask {
	//         ******************************************
	public static void main(String[] args) {
		/*
		 * create an array of countries.While retriving all the values from an array print
		 * capital for each country.
		 */
	String capital = null;
	String[] countries = {"Poland","Germany","Ukraine", "Russia", "UK"};
		
		for(int i=0; i<countries.length; i++) {
			
			switch(countries[i]) {
			
			case "Poland":
				capital="Warsaw";
				break;
			case "Germany":
				capital="Berlin";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Russia":
				capital="Moscow";
				break;
			case "UK":
				capital="London";
				break;
			}	
			System.out.println("The capital of the country "+countries[i]+" is "+capital);
			
		}
		System.out.println(" ------ ANOTHER WAY --------");
			
		for(String country:countries) {
				
				if(country.equals("Poland")) {
					capital="Warsaw";
				}else if(country.equals("Germany")) {
					capital="Berlin";
				}else if(country.equals("Ukraine")) {
					capital="Kiev";
				}
				System.out.println("The capital of the country "+country+" is "+capital);
			}

		}
	
	
	
	}

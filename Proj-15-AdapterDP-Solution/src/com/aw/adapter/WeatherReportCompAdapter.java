package com.aw.adapter;

import com.imd.external.WeatherReportComp;
import com.imd.external.WeatherReportCompImpl;

public class WeatherReportCompAdapter {
	public double fetchTemperature(String cityName) {
		 // get city code based on the city name  (we can get by taking to Db s/w or webService comp)
		   //(conversion1)
		int cityCode=0;
		 if(cityName.equalsIgnoreCase("hyd"))
		      cityCode=100;
	   else if(cityName.equalsIgnoreCase("delhi"))
		     cityCode=101;
	   else if(cityName.equalsIgnoreCase("mumbai"))
		   cityCode=102;
	   else if(cityName.equalsIgnoreCase("chennai"))
		   cityCode=103;
	  else
		  throw new IllegalArgumentException("Invalid city name");
		 //get external comp reference
		 WeatherReportComp external =WeatherReportCompImpl.GetInstance();
		 //invoke External comp reference
		 double temp=external.getTemperature(cityCode);
		 //convert Fahrenhite degree to celcius degree
		 temp=((temp-32)*5)/9;
		 return temp;
	}
}

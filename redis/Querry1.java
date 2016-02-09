package redis;

import java.util.Map;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class Querry1 {
	
	private static long startTime = System.currentTimeMillis();
	
	 public static void main(String[] args) {

		 
	Jedis jedis = new Jedis("localhost");
	Map<String, String> properties = jedis.hgetAll("newdata1");
	for (int i=2; i<7009729; i++) 
			{
	properties = jedis.hgetAll("newdata"+i);
	System.out.println("Data----------------"+i);
	System.out.println("Year: " + properties.get("Year"));
	System.out.println("Month: " + properties.get("Month"));
	System.out.println("DayofMonth: " + properties.get("DayofMonth"));
	System.out.println("DayofWeek: " + properties.get("DayofWeek"));
	System.out.println("Deeptime: " + properties.get("Deeptime"));
	System.out.println("CRSDepTime: " + properties.get("CRSDepTime"));
	System.out.println("ArrTime: " + properties.get("ArrTime"));
	System.out.println("CRSArrTime: " + properties.get("CRSArrTime"));
	System.out.println("UniqueCarrier: " + properties.get("UniqueCarrier"));
	System.out.println("FlightNum: " + properties.get("FlightNum"));
	System.out.println("TailNumber: " + properties.get("TailNumber"));
	System.out.println("ActualElapsedTime: " + properties.get("ActualElapsedTime"));
	System.out.println("CRSElapsedTime: " + properties.get("CRSElapsedTime"));
	System.out.println("AirTime: " + properties.get("AirTime"));
	System.out.println("ArrDelay: " + properties.get("ArrDelay"));
	System.out.println("DepDelay: " + properties.get("DepDelay"));
	System.out.println("Origin: " + properties.get("Origin"));
	System.out.println("Dest: " + properties.get("Dest"));
	System.out.println("Distance: " + properties.get("Distance"));
	System.out.println("TaxiIn: " + properties.get("TaxiIn"));
	System.out.println("TaxiOut: " + properties.get("TaxiOut"));
	System.out.println("Cancelled: " + properties.get("Cancelled"));
	System.out.println("CancellationCode: " + properties.get("CancellationCode"));
	System.out.println("Diverted: " + properties.get("Diverted"));
	System.out.println("CarrierDelay: " + properties.get("CarrierDelay"));
	System.out.println("WeatherDelay: " + properties.get("WeatherDelay"));
	System.out.println("NASDelay: " + properties.get("NASDelay"));
	System.out.println("SecurityDelay: " + properties.get("SecurityDelay"));
	System.out.println("LateAircraftDelay: " + properties.get("LateAircraftDelay"));

			}
	System.out.println("Done");
	long endTime = System.currentTimeMillis();
    System.out.println("It took " + (endTime - startTime) + " milliseconds");
	
	 }	
}


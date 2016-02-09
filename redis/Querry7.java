package redis;


import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class Querry7 {

	private static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {

		 
		Jedis jedis = new Jedis("localhost");
		Map<String, String> Flight = new HashMap<String, String>();
		
		for (int i=0; i<7009729; i++)
			{
			Flight.put("AirTimeHours3", "");
			jedis.hmset("newdata"+i, Flight);
			}
		
			System.out.println("Done");
			long endTime = System.currentTimeMillis();
		    System.out.println("It took " + (endTime - startTime) + " milliseconds");
			
		
		 }	
	
}


package redis;


import java.util.Map;

import redis.clients.jedis.Jedis;

public class Querry2 {
	
	private static long startTime = System.currentTimeMillis();

	
	public static void main(String[] args) {

		 
		Jedis jedis = new Jedis("localhost");
		Map<String, String> properties = jedis.hgetAll("newdata1");
		for (int i=2; i<7009729; i++)
				{
		properties = jedis.hgetAll("newdata"+i);
//		System.out.println("Data----------------"+i);
		System.out.println("Deeptime: " + properties.get("Deeptime"));
				}
		System.out.println("Done");
		long endTime = System.currentTimeMillis();
	    System.out.println("It took " + (endTime - startTime) + " milliseconds");
		
		
		 }	
}


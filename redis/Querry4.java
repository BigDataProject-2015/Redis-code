package redis;


import java.util.HashMap;
import java.util.Map;
 
import redis.clients.jedis.Jedis;
 
public class Querry4 {
   
    private static long startTime = System.currentTimeMillis();
 
    public static void main(String[] args) {
 
         
        Jedis jedis = new Jedis("localhost");
        Map<String, String> properties = jedis.hgetAll("newdata1");
        Map<String, String> Flight = new HashMap<String, String>();
        String str="N";
        char ch;
        char n= str.charAt(0);
       
        for (int i=2; i<7009729; i++)
                {
        properties = jedis.hgetAll("newdata"+i);
        ch=properties.get("DepDelay").charAt(0);
        if (ch != n)
        {
            if (Integer.parseInt(properties.get("DepDelay"))>30)
            {
            Flight.put("WeatherDelay", "10");
            jedis.hmset("newdata"+i, Flight);
            }
        }
        else {}
       
         } 
       
        System.out.println("Done");
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
   
    }
   
}
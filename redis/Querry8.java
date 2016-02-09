package redis;

 
import java.util.HashMap;
import java.util.Map;
 
import redis.clients.jedis.Jedis;
 
public class Querry8 {
   
    private static long startTime = System.currentTimeMillis();
 
 
    public static void main(String[] args) {
 
         
        Jedis jedis = new Jedis("localhost");
        Map<String, String> Flight = new HashMap<String, String>();
        Map<String, String> properties = jedis.hgetAll("newdata1");
        double airtime;
        String value;
        String str="N";
        char ch;
        char n= str.charAt(0);
               
       
        for (int i=2; i<7009729; i++)
            {
                properties = jedis.hgetAll("newdata"+i);
                value=properties.get("AirTime");
                ch=value.charAt(0);
            if ( ch != n)
                {
                value= properties.get("AirTime");
//                System.out.println("valueeee"+value+" i== "+ i);
                airtime= Double.valueOf(value)/60;
//                System.out.println("AirTime==="+airtime);
                Flight.put("AirTimeHours", Double.toString(airtime));
                jedis.hmset("newdata"+i, Flight);
               
                }
            else
                {
//                System.out.println(properties.get("AirTime")+"iffffff" + value.length());  
                }
            }
       
               
            System.out.println("Done");
           
            long endTime = System.currentTimeMillis();
            System.out.println("It took " + (endTime - startTime) + " milliseconds");
       
         } 
   
}
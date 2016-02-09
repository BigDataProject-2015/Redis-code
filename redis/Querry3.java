package redis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import redis.clients.jedis.Jedis;
 
public class Querry3 {
 
    private static long startTime = System.currentTimeMillis();
    public static void main(String[] args) {
 
         
        Jedis jedis = new Jedis("localhost");
        Map<String, String> properties = jedis.hgetAll("newdata1");
        String[] tailno= new String[7009730];
        int [] repeat= new int[7009730];
        int x=0;
        String dene;
        String dene1;
        int index=0;
        int dec=0; 
        int count=0;
       
        for (int i=2; i<7009729; i++)
                {
        properties = jedis.hgetAll("newdata"+i);
               
        for (int j =2; j<7009729; j++)
        {
            dene1=properties.get("TailNumber");
            if (properties.get("TailNumber").isEmpty()== true)
            {   }
            else
            {
            dene=tailno[j];                    
            if (dene1.equals(dene))
                {
                x=1;
                index=j;
                break;
                }
            }
        }      
       
        if (x==0)
        {
            tailno[i-dec]=properties.get("TailNumber");
            repeat[i-dec]=repeat[i-dec]+1;
        }
        else if (x==1)
        {
            repeat[index]=repeat[index]+1;
            dec++;
            x=0;
        }
                           
    }
        for (int i=2; i<tailno.length; i++)
        {
        if(repeat[i]!=0)
            {
            count++;
            }
        else
            break;
        }
       
        for (int i=2; i<count; i++)
        {
        System.out.println("tail "+i+ " with tailno:" + tailno[i]+ " repeated: " + repeat[i]+" times");
        }
       
        long endTime = System.currentTimeMillis();
        System.out.println("It took " + (endTime - startTime) + " milliseconds");
 
       
       
       
         } 
   
   
}
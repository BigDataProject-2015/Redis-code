package redis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
 
import redis.clients.jedis.Jedis;
 
public class Querry6 {
 
 
   
 
        private static long startTime = System.currentTimeMillis();
 
        public static void main(String[] args) {
 
             
            Jedis jedis = new Jedis("localhost");
            Map<String, String> properties = jedis.hgetAll("newdata1");
            double airtime;
            ArrayList<Double> arraylist = new ArrayList<Double>();
            double[] maxair= new double[12];
            double[] minair= new double[12];
            double[] sumair= new double[12];
            int[] avg= new int[12];
           
            String month;
            int[] mnt= new int[12];
           
            for (int j=0; j<11; j++)
                {
                sumair[j]=0;
                maxair[j]=0;
                avg[j]=0;
                }
            for (int j=0; j<11; j++)
            {
            minair[j]=1000;
            }
           
            String value;
            String str="N";
            char ch;
            char n= str.charAt(0);
           
           
            for (int i=2; i<7009729; i++)
                {
                    properties = jedis.hgetAll("newdata"+i);
                    month= properties.get("Month");
                    switch (Integer.parseInt(month)) {
                    case 1:  
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[0]=sumair[0]+airtime;
                        avg[0]=avg[0]+1;
                        if (airtime>maxair[0])
                            maxair[0]=airtime;
                        if (airtime<minair[0])
                            minair[0]=airtime;
                        }else{}
                        mnt[0]=mnt[0]+1;
                        break;
                    case 2:  
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[1]=sumair[1]+airtime;
                        avg[1]=avg[1]+1;
                        if (airtime>maxair[1])
                            maxair[1]=airtime;
                        if (airtime<minair[1])
                            minair[1]=airtime;
                        }else{}
                        mnt[1]=mnt[1]+1;
                        break;
                    case 3:  
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[2]=sumair[2]+airtime;
                        avg[2]=avg[2]+1;
                        if (airtime>maxair[2])
                            maxair[2]=airtime;
                        if (airtime<minair[2])
                            minair[2]=airtime;
                        }else{}
                        mnt[2]=mnt[2]+1;
                        break;
                    case 4:  
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[3]=sumair[3]+airtime;
                        avg[3]=avg[3]+1;
                        if (airtime>maxair[3])
                            maxair[3]=airtime;
                        if (airtime<minair[3])
                            minair[3]=airtime;
                        }else{}
                        mnt[3]=mnt[3]+1;
                        break;
                    case 5:  
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[4]=sumair[4]+airtime;
                        avg[4]=avg[4]+1;
                        if (airtime>maxair[4])
                            maxair[4]=airtime;
                        if (airtime<minair[4])
                            minair[4]=airtime;
                        }else{}
                        mnt[4]=mnt[4]+1;
                        break;
                    case 6:  
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[5]=sumair[5]+airtime;
                        avg[5]=avg[5]+1;
                        if (airtime>maxair[5])
                            maxair[5]=airtime;
                        if (airtime<minair[5])
                            minair[5]=airtime;
                        }else{}
                        mnt[5]=mnt[5]+1;
                        break;
                    case 7:  
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[6]=sumair[6]+airtime;
                        avg[6]=avg[6]+1;
                        if (airtime>maxair[6])
                            maxair[6]=airtime;
                        if (airtime<minair[6])
                            minair[6]=airtime;
                        }else{}
                        mnt[6]=mnt[6]+1;
                        break;
                    case 8:  
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[7]=sumair[7]+airtime;
                        avg[7]=avg[7]+1;
                        if (airtime>maxair[7])
                            maxair[7]=airtime;
                        if (airtime<minair[7])
                            minair[7]=airtime;
                        }else{}
                        mnt[7]=mnt[7]+1;
                        break;
                    case 9:
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[8]=sumair[8]+airtime;
                        avg[8]=avg[8]+1;
                        if (airtime>maxair[8])
                            maxair[8]=airtime;
                        if (airtime<minair[8])
                            minair[8]=airtime;
                        }else{}
                        mnt[8]=mnt[8]+1;
                        break;
                    case 10:
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[9]=sumair[9]+airtime;
                        avg[9]=avg[9]+1;
                        if (airtime>maxair[9])
                            maxair[9]=airtime;
                        if (airtime<minair[9])
                            minair[9]=airtime;
                        }else{}
                        mnt[9]=mnt[9]+1;
                        break;
                    case 11:
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[10]=sumair[10]+airtime;
                        avg[10]=avg[10]+1;
                        if (airtime>maxair[10])
                            maxair[10]=airtime;
                        if (airtime<minair[10])
                            minair[10]=airtime;
                        }else{}
                        mnt[10]=mnt[10]+1;
                        break;
                    case 12:
                        value= properties.get("AirTime");
                        ch=value.charAt(0);
                        if (ch != n)
                        {
                        value= properties.get("AirTime");
                        airtime= Double.valueOf(value);
                        sumair[11]=sumair[11]+airtime;
                        avg[11]=avg[11]+1;
                        if (airtime>maxair[11])
                            maxair[11]=airtime;
                        if (airtime<minair[11])
                            minair[11]=airtime;
                        }else{}
                        mnt[11]=mnt[11]+1;
                             break;
                    default:
                             break;
                }
                   
                   
                   
                }
                double average;
                               
                for(int h=0; h<12; h++)
                {
                average = sumair[h]/avg[h];
                arraylist.add(average);
                }
               
                Collections.sort(arraylist);
               
                for(int k=0; k<12; k++)
                {
                    for(int c=0; c<12; c++){
                        if(sumair[c]/avg[c]==arraylist.get(k))
                        {
                System.out.println("Month :" + (c+1));
                System.out.println("Month day counter :" + mnt[c] + " days");
                System.out.println("the sum airtime :" + sumair[c] + " minutes");
                System.out.println("the min airtime :" + minair[c] + " minutes");
                System.out.println("the max airtime :" + maxair[c] + " minutes");
                System.out.println("the avg airtime :" + sumair[c]/avg[c] + " minutes");
                System.out.println("--------------------------------------");
                        }}}
               
               
               
           
                long endTime = System.currentTimeMillis();
                System.out.println("It took " + (endTime - startTime) + " milliseconds");
           
             } 
   
 
 
}
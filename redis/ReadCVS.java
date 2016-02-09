package redis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

public class ReadCVS {

  public static void main(String[] args) {

	Jedis jedis = new Jedis("localhost");

	String csvFile = "/Users/anastasia/Documents/SDE1.1/BigData/Project/2008.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";

	try {
		int x=0;
		br = new BufferedReader(new FileReader(csvFile));
		while (((line = br.readLine()) != null) && (x<8000000)) {
				x=x+1;
		        // use comma as separator
			String[] country = line.split(cvsSplitBy);

//			System.out.println("Country [code= " + country[4] 
//                                 + " , name=" + country[5] + "]");
			
			Map<String, String> Flight = new HashMap<String, String>();
		      Flight.put("Year", country[0]);
		      Flight.put("Month", country[1]);
		      Flight.put("DayofMonth", country[2]);
		      Flight.put("DayofWeek", country[3]);
		      Flight.put("Deeptime", country[4]);
		      Flight.put("CRSDepTime", country[5]);
		      Flight.put("ArrTime", country[6]);
		      Flight.put("CRSArrTime", country[7]);
		      Flight.put("UniqueCarrier", country[8]);
		      Flight.put("FlightNum", country[9]);
		      Flight.put("TailNumber", country[10]);
		      Flight.put("ActualElapsedTime", country[11]);
		      Flight.put("CRSElapsedTime", country[12]);
		      Flight.put("AirTime", country[13]);
		      Flight.put("ArrDelay", country[14]);
		      Flight.put("DepDelay", country[15]);
		      Flight.put("Origin", country[16]);
		      Flight.put("Dest", country[17]);
		      Flight.put("Distance", country[18]);
		      Flight.put("TaxiIn", country[19]);
		      Flight.put("TaxiOut", country[20]);
		      Flight.put("Cancelled", country[21]);
		      Flight.put("CancellationCode ", country[22]);
		      Flight.put("Diverted ", country[23]);
		      Flight.put("CarrierDelay", country[24]);
		      Flight.put("WeatherDelay", country[25]);
		      Flight.put("NASDelay", country[26]);
		      Flight.put("SecurityDelay", country[27]);
		      Flight.put("LateAircraftDelay", country[28]);


		      jedis.hmset("newdata"+x, Flight); }
		

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	System.out.println("Done");
	
	   
//	List<String> list = jedis.lrange("code-list", 0 ,1000);
//    List<String> list2 = jedis.lrange("country-list", 0 ,1000);
//    for(int i=0; i<list.size(); i++) {
//      System.out.println("Stored string in redis:: "+list.get(i)+" + " + list2.get(i));
//    }
  
	
  }

}
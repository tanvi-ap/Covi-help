package edu.niu.z1906477.final_project;

import android.location.Location;

import java.util.HashMap;

public class LocationData
{
   static HashMap<String,Double> locationsLat=new HashMap<String,Double>();
   static HashMap<String,Double> locationsLong=new HashMap<String,Double>();
    String name;
    Double lat;
    Double longitude;

    public LocationData()
    {
        putLat();
        putLong();
    }



    public void putLat()
    {
        locationsLat.put("Illinois", 40.000000);
        locationsLat.put("California", 36.778259);
        locationsLat.put("Wisconsin", 44.500000);
        locationsLat.put("West Virginia", 39.000000);
        locationsLat.put("Vermont", 	44.000000);
        locationsLat.put("Texas", 	44.000000);
        locationsLat.put("South Dakota",44.500000);
        locationsLat.put("Rhode Island",41.742325);
        locationsLat.put("Oregon",44.000000);
        locationsLat.put("New York",43.000000);
        locationsLat.put("New Hampshire",44.000000);
        locationsLat.put("Nebraska",41.500000);
        locationsLat.put("Kansas",38.500000);
        locationsLat.put("Mississippi",33.000000);
        locationsLat.put("Delaware",39.000000);
        locationsLat.put("Connecticut",41.599998);
        locationsLat.put("Arkansas",34.799999);
        locationsLat.put("Indiana",40.273502);
        locationsLat.put("Missouri",38.573936);
        locationsLat.put("Florida",	27.994402);
        locationsLat.put("Nevada",39.876019);
        locationsLat.put("Maine",45.367584);
        locationsLat.put("Michigan",44.182205);
        locationsLat.put("Georgia",	33.247875);
        locationsLat.put("Hawaii",	19.741755);
        locationsLat.put("Alaska",66.160507);
        locationsLat.put("Tennessee",35.860119);
        locationsLat.put("Virginia",35.860119);
        locationsLat.put("New Jersey",	39.833851);
        locationsLat.put("Kentucky",	37.839333);
        locationsLat.put("North Dakota",	47.650589);
        locationsLat.put("Minnesota",		46.392410);
        locationsLat.put("Oklahoma",36.084621);
        locationsLat.put("Montana",	46.965260);
        locationsLat.put("Washington",47.751076);
        locationsLat.put("Utah",	39.419220);
        locationsLat.put("Colorado",	39.113014);
        locationsLat.put("Ohio",	40.367474);
        locationsLat.put("Alabama",	32.318230);
        locationsLat.put("Iowa",	42.032974);
        locationsLat.put("New Mexico",		34.307144);
        locationsLat.put("South Carolina",33.836082);
        locationsLat.put("Pennsylvania",41.203323);
        locationsLat.put("Arizona",	34.048927);
        locationsLat.put("Maryland",39.045753);
        locationsLat.put("Massachusetts",42.407211);
        locationsLat.put("Idaho",44.068203);
        locationsLat.put("Wyoming",	43.075970);
        locationsLat.put("North Carolina",35.782169);
        locationsLat.put("Louisiana",	30.391830);

    }//end putLat

    public void putLong()
    {
        locationsLong.put("Illinois",-89.000000);
        locationsLong.put("California",-119.417931);
        locationsLong.put("Wisconsin",-89.500000);
        locationsLong.put("West Virginia", -80.500000);
        locationsLong.put("Vermont", -72.699997);
        locationsLong.put("South Dakota", -72.699997);
        locationsLong.put("Rhode Island", -71.742332);
        locationsLong.put("Oregon",-120.500000);
        locationsLong.put("New York",-75.000000);
        locationsLong.put("New Hampshire",-71.500000);
        locationsLong.put("Nebraska",-100.000000);
        locationsLong.put("Kansas",-98.000000);
        locationsLong.put("Mississippi",-90.000000);
        locationsLong.put("Delaware",-75.500000);
        locationsLong.put("Connecticut",-72.699997);
        locationsLong.put("Arkansas",-92.199997);
        locationsLong.put("Indiana",-86.126976);
        locationsLong.put("Missouri",-92.603760);
        locationsLong.put("Florida",-81.760254);
        locationsLong.put("Nevada",-117.224121);
        locationsLong.put("Maine",-68.972168);
        locationsLong.put("Michigan",-84.506836);
        locationsLong.put("Georgia",-83.441162);
        locationsLong.put("Hawaii",-155.844437);
        locationsLong.put("Alaska",-153.369141);
        locationsLong.put("Tennessee",-86.660156);
        locationsLong.put("Virginia",	-78.024902);
        locationsLong.put("New Jersey",	-74.871826);
        locationsLong.put("Kentucky",	-84.270020);
        locationsLong.put("North Dakota",	-100.437012);
        locationsLong.put("Minnesota",	-94.636230);
        locationsLong.put("Oklahoma",		-96.921387);
        locationsLong.put("Montana",-109.533691);
        locationsLong.put("Washington",-120.740135);
        locationsLong.put("Colorado",	-105.358887);
        locationsLong.put("Ohio",	-82.996216);
        locationsLong.put("Alabama",-86.902298);
        locationsLong.put("Iowa",	-93.581543);
        locationsLong.put("New Mexico",-106.018066);
        locationsLong.put("South Carolina",	-81.163727);
        locationsLong.put("Pennsylvania",	-77.194527);
        locationsLong.put("Arizona",-111.093735);
        locationsLong.put("Maryland",-76.641273);
        locationsLong.put("Massachusetts",-71.382439);
        locationsLong.put("Idaho",-114.742043);
        locationsLat.put("Wyoming",-107.290283);
        locationsLat.put("North Carolina",	-80.793457);
        locationsLat.put("Louisiana",		-92.329102);

    }



    public static Double getLat(String name)
    {
        return locationsLat.get(name);
    }

    public static Double getLongitude(String name)
    {
        return locationsLong.get(name);

    }

}

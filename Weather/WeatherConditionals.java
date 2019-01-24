
/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class WeatherConditionals
 
{
   public static boolean getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        boolean error = true;
        String s = "snow";
        String w = "Windy";
        if (description.indexOf(w) >= 0){  
            windy=true;
        }
        else if (temperature > 30 && description.indexOf(w) >= 0){
            windy = true;
        }
        else if (temperature > 30) {
            windy = false;
        }
        else if (temperature > 30) {
            windy = true;
        }
        if (description.indexOf(s) >= 0 && temperature > 100){  
            System.out.println("Error");
        }
        return windy;
        
        
    }
   public static String getHikingAdvice(int temperature, int windchill, 
    int humidity,String description){
    
        boolean goodToHike;
        goodToHike = false;
        boolean rightTemp;
        rightTemp = false;
        boolean rightWind;
        rightWind = false;
        boolean rightHumid;
        rightHumid = false;
        String result1;
        String result2;
        String result3;
        String result4;
        String result5;
        
        temperature = 0;
        windchill = 0;
        humidity = 0;
        
        result1= "The Humidity is perfect and";
        result2= "the windchill is perfect and";
        result3 = "the Temperature is perfect";
        result4 =" it is not a good day for hiking";
         if (rightHumid = false) {
            result1 = "The Humidity is not right and";
        }
        if (rightWind = false) {        
            result2 = "the wind chill is not right and";
        }
        if (rightTemp = false) {
            result3 = "the temperature is not right";
        }
        if ((rightHumid = true) && (rightTemp = true) && (rightWind = true))
        {
            result4 = "and it is a perfect day for hiking!";
        }

        result5 = result1 + " " + result2 + " " + result3 + " " + result4;

        return result5;
    }
}
       
        
        
        
        
  
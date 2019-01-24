/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTester
{
   public static void main(){
       String message1 = "weatherCondition";
       String message2 = "mixed rain and snow";
       String message3 = "mixed rain and sleet";
       String message4 = "mixed snow and sleet";
       String message5 = "light snow showers";
       String message6 = "sleet";
       String message7 = "smoky";
       String message8 = "windy";
       String message9 = "clear(night)";
       String message10 = "sunny";
       String message11 = "mixed rain and hail";
       String message12 = "Heavy snow";
       String message13 = "heavy snow";
       
       System.out.println(message1.length());
       String weatherCondition = "thunderstorm";
       System.out.println(message2.substring(0,5));
       System.out.println(message3.substring(0,5));
       System.out.println(message4.substring(0,5));
       System.out.println(message5.substring(0,5));
       System.out.println(message6.substring(0,5));
       System.out.println(message7.substring(0,5));
       System.out.println(message8.substring(0,5));
       System.out.println(message9.substring(0,5));
       System.out.println(message10.substring(0,5));
       System.out.println(message11.substring(0,5));
       System.out.println(message12.substring(0,5));
       System.out.println(message13.substring(0,5));
       System.out.println(weatherCondition.indexOf("thunder"));    
       // System.out.println(WeatherConditionals.getWeatherAdvice(32, "heavy snow"));
    }
}

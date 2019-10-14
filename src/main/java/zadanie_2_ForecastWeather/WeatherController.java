package zadanie_2_ForecastWeather;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Controller
public class WeatherController {
Weather weather;
   private void getShowWeather() {
        RestTemplate restTemplate = new RestTemplate();

       Weather forObject = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Weather.class);
        // ExchangeRate forObject = restTemplate.getForObject("https://api.exchangeratesapi.io/latest", ExchangeRate.class);
        String location = forObject.getName();
        Location location2= forObject.getLocation();
       // System.out.println("Current EUR rate: "+ EurRate+ " PLN"); //todo is working
        System.out.println(forObject+"/ "+location);
        System.out.println(location2);
        System.out.println(forObject.getName());
        Current forObject2 = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Current.class);
//List<String> description = forObject2.getWeatherDescriptions();
      System.out.println(forObject2);
String ggg = forObject2.getIsDay();
       System.out.println(ggg);

    }

}

package zadanie_2_ForecastWeather;

import com.vaadin.flow.router.Route;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//@Route("weather")
@Controller
public class WeatherController {

    public WeatherController() {


       // private void getShowWeather () {
            RestTemplate restTemplate = new RestTemplate();

       Weather forObjectWeather = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Weather.class);
//         //ExchangeRate forObject = restTemplate.getForObject("https://api.exchangeratesapi.io/latest", ExchangeRate.class);
//           String location = forObject.getName();//todo its making error
    Location location2 = forObjectWeather.getLocation();
        String locationName = forObjectWeather.getLocation().getName();
//         //System.out.println("Current EUR rate: "+ EurRate+ " PLN"); //todo is working
//            System.out.println(forObject + "/ " + location);
        //   System.out.println(location);
            System.out.println(location2);
        System.out.println("Twoja wybrana lokalizacja: " +locationName);
           Current forObjectCurrent = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Current.class);
//List<String> description = forObject2.getWeatherDescriptions();
       List<String> weatherCondition = forObjectCurrent.getWeatherDescriptions();
        List<String> weatherCondition2 = forObjectCurrent.getWeatherIcons();
//double weatherCondition3 = forObjectCurrent.getTemperature();
        System.out.println("Opis pogody "+weatherCondition);
        System.out.println("Ikonka z pogodą " +weatherCondition2);
     //   System.out.println("Temperatura "+ weatherCondition3);
        //System.out.println(weatherCondition3);
        //System.out.println(description);//todo null
//            System.out.println(forObject2);
      //     List<String> sunny = forObject2.getWeatherDescriptions();//todo null
        //    System.out.println(sunny);

        }

}

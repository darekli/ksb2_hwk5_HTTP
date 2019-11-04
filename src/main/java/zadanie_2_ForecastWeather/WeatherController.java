package zadanie_2_ForecastWeather;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Route("weather")
@Controller
public class WeatherController  {
    private RestTemplate restTemplate;
    public WeatherController() {
      restTemplate = new RestTemplate();
    }
//        Weather forObjectWeather = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Weather.class);
//
//        Location location2 = forObjectWeather.getLocation();
//        String locationName = forObjectWeather.getLocation().getName();
//        System.out.println("1. " + location2);
//        System.out.println("Twoja wybrana lokalizacja: " + locationName);
//        Current forObjectCurrent = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Current.class);
//        List<String> weatherCondition = forObjectCurrent.getWeatherDescriptions();
//        List<String> weatherCondition2 = forObjectCurrent.getWeatherIcons();
//
//        System.out.println("Opis pogody " + weatherCondition);
//        System.out.println("Ikonka z pogodą " + weatherCondition2);
//private String city;
//        private ResponseEntity<Location>connectToApi(){
//            RestTemplate restTemplate = new RestTemplate();
//            ResponseEntity<Location> location = restTemplate.location(
//            "http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=" + city,
//                    HttpMethod.GET,
//                    HttpEntity.EMPTY,
                   // zadanie_2_ForecastWeather.Location.class);
          //  return location;
//        }
}

package zadanie_2_ForecastWeatherV2;


import com.fasterxml.jackson.databind.JsonNode;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import zadanie_2_ForecastWeather.Location;
import zadanie_2_ForecastWeather.Weather;

import java.util.Arrays;
import java.util.List;


@Controller
class WeatherController2 extends VerticalLayout {
    //private RestTemplate restTemplate;
WeatherController2 weatherController2;
Current current;

    public WeatherController2() {
        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject( "http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin",String.class) ;
        System.out.println("1. "+forObject);

//        JsonNode temperature = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin",JsonNode.class).get("temperature");
//        System.out.println("2. "+current.getTemperature());
//       // System.out.println("2. "+temperature.toString());


        Location forObject2 = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin",Location.class) ;
        System.out.println(forObject2);//todo drukuje nulle
        System.out.println(forObject2.getName());
        Current forObject3 = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin",Current.class) ;
        System.out.println(forObject3);//todo drukuje nulle
        System.out.println(forObject3.getTemperature());
    }

//        public List<Location> getLocationsList(String name){
//            String url = "http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=" + name;
//            Location[] locationArray = restTemplate.getForObject(url, Location[].class);
//            return Arrays.asList(locationArray);
//        }
//
//        public Location getWeather(String name){
//        String url = "http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=" +name;
//            return restTemplate.getForObject(url, Location.class);
//        }



}


























        //Weather forObjectWeather = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Weather.class);
//         //ExchangeRate forObject = restTemplate.getForObject("https://api.exchangeratesapi.io/latest", ExchangeRate.class);
//           String location = forObject.getName();//todo its making error

        //Location forObjectLocation = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Location.class);

       // Location location2 = forObjectWeather.getLocation();
       // String location3 = forObjectLocation.getCountry();

       // String locationName = forObjectWeather.getLocation().getName();
//         //System.out.println("Current EUR rate: "+ EurRate+ " PLN"); //todo is working
//            System.out.println(forObject + "/ " + location);
        //   System.out.println(location);
      //  System.out.println("1. "+location2);
        //System.out.println(location3+"location3");
     //   System.out.println("Twoja wybrana lokalizacja: " +locationName);
        //Current forObjectCurrent = restTemplate.getForObject("http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=Szczecin", Current.class);
      //  List<String> weatherCondition = forObjectCurrent.getWeatherDescriptions();
      //  List<String> weatherCondition2 = forObjectCurrent.getWeatherIcons();
//double weatherCondition3 = forObjectCurrent.getTemperature();
      //  System.out.println("Opis pogody "+weatherCondition);
      //  System.out.println("Ikonka z pogodą " +weatherCondition2);
        //   System.out.println("Temperatura "+ weatherCondition3);
        //System.out.println(weatherCondition3);
        //System.out.println(description);//todo null
//            System.out.println(forObject2);
        //     List<String> sunny = forObject2.getWeatherDescriptions();//todo null
        //    System.out.println(sunny);


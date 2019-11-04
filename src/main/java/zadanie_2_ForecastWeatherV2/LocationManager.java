//package zadanie_2_ForecastWeatherV2;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//import zadanie_2_ForecastWeather.Weather;
//
//import java.util.Arrays;
//import java.util.List;
//@Component
//public class LocationManager {
//
//    RestTemplate restTemplate;
//
//    public LocationManager(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    public List<Location> getLocationList(String keyword){
//        String url = "http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=" + keyword;
//        Location[] locationsArray = restTemplate.getForObject(url,Location[].class);
//        return Arrays.asList(locationsArray);
//    }
//
//    public Location getLocation(String name){
//        String url = "http://api.weatherstack.com/current?access_key=bee9823c5b680ef0e45834c2cc477727&query=" + name;
//        return restTemplate.getForObject(url,Location.class);
//    }
//
//    public Weather getWeather(int id){
//        String url = "https://www.metaweather.com/api/location/" + id;
//        return restTemplate.getForObject(url,Weather.class);
//    }
//
//
//}

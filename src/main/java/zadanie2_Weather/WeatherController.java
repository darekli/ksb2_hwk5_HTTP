package zadanie2_Weather;

import com.vaadin.flow.component.textfield.TextField;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import static com.sun.tools.internal.xjc.reader.Ring.add;


@Controller
public class WeatherController {

    @Value("${api-openweathermap.url}")
    private String url;
    @Value("${api-openweathermap.appid}")
    private String appid;

    public WeatherController() {

    }



    private YourCityWeather getWeatherForCity(String city) {
        RestTemplate restTemplate = new RestTemplate();
        YourCityWeather weather = new YourCityWeather();
        String city2 = "Berlin";
        weather = restTemplate.getForObject(url + city2 + "&appid=" + appid, YourCityWeather.class);
        String iconName = weather.getWeather().get(0).getIcon();
        String imgUrl = "http://openweathermap.org/img/w/" + iconName + ".png";
        weather.getWeather().get(0).setSrc(imgUrl);
        return weather;
    }

    @GetMapping("/weather")
    public String get(Model model, @RequestParam String city2) {
        model.addAttribute("weather", getWeatherForCity(city2));
        return "weatherView";


    }




}

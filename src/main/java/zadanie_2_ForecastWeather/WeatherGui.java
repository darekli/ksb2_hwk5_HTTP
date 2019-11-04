package zadanie_2_ForecastWeather;

import com.vaadin.flow.component.dependency.StyleSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
@StyleSheet("/style.css")
public class WeatherGui
{
    @Autowired
   WeatherController weatherController;

        @GetMapping
        public String get ( @RequestHeader String query){
            return "";
        }


}

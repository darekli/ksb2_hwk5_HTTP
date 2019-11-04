package zadanie2_Weather;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("weather2")
public class WeatherGui extends VerticalLayout {
    private WeatherController weatherController;
    YourCityWeather yourCityWeather;

    @Autowired
    public WeatherGui(WeatherController weatherController) {
        this.weatherController = weatherController;


        TextField textField = new TextField("test");
        add(textField);
    }
}

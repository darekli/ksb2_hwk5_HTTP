package zadanie_2_ForecastWeatherV2;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.stereotype.Component;

@Component
@Route("weather")
public class WeatherView extends VerticalLayout {
private TextField location;

    public WeatherView() {



        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        location = new TextField("Wpisz nazwę miasta");

        add(location);
    }
}

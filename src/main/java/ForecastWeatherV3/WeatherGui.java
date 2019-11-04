package ForecastWeatherV3;


import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Route("weather")
@StyleSheet("/style.css")
public class WeatherGui extends VerticalLayout {

    private String city;

    private ResponseEntity<WeatherApi> connectToApi() {


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherApi> exchange = restTemplate.exchange(
                "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=metric&APPID=e5cedde7dc5237ac4ed1453b7613d699",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                ForecastWeatherV3.WeatherApi.class
        );

        return exchange;
    }

    public WeatherGui() {


        setAlignItems(Alignment.CENTER);
        TextField textFieldSetCity = new TextField("Enter a city:");
        Button buttonCheckWeather = new Button("Check weather!");


        LocalDate timeNow = LocalDate.now();


        //setAlignItems(Alignment.CENTER);
        Label labelCityAndCountry = new Label();
        Image weatherIcon = new Image();
        Label labelTemperature = new Label();
        Label labelPressure = new Label();
        Label labelWind = new Label();
        Label labelWindSpeed = new Label();
        Label labelWindDegrees = new Label();
        Label labelLocation = new Label();
        Label labelLocationLongitude = new Label();
        Label labelLocationLatitude = new Label();
        Label labelTimeNow = new Label();
        labelTimeNow.setText(String.valueOf("Today: "+timeNow));


        buttonCheckWeather.addClickListener(clickEvent -> {
            this.city = textFieldSetCity.getValue();

            labelCityAndCountry.setText(connectToApi().getBody().getName() + ", " + connectToApi().getBody().getSys().getCountry());
            weatherIcon.setSrc("http://openweathermap.org/img/wn/" + connectToApi().getBody().getWeather().get(0).getIcon() + "@2x.png");
            labelTemperature.setText("Temperature: " + connectToApi().getBody().getMain().getTemp().intValue() + "°C");
            labelPressure.setText("Pressure: " + connectToApi().getBody().getMain().getPressure() + " hPa");
            labelWind.setText("Wind:");
            labelWindSpeed.setText("Speed: " + connectToApi().getBody().getWind().getSpeed() + " m/s");
//            labelWindDegrees.setText("Degrees: " + connectToApi().getBody().getWind().getDeg() + "°");
//            labelLocation.setText("Location of city:");
//            labelLocationLongitude.setText("Longitude: " + connectToApi().getBody().getCoord().getLon());
//            labelLocationLatitude.setText("Latitude: " + connectToApi().getBody().getCoord().getLat());

            textFieldSetCity.setValue("");
        });

        buttonCheckWeather.addClickShortcut(Key.ENTER);

        add(


                textFieldSetCity,
                buttonCheckWeather,
                labelTimeNow,
                labelCityAndCountry,
                weatherIcon,
                labelTemperature,
                labelPressure,
                labelWind,labelWindSpeed

               // labelWindDegrees,
               // labelLocation,
                //labelLocationLongitude,
                //labelLocationLatitude
        );
    }
}

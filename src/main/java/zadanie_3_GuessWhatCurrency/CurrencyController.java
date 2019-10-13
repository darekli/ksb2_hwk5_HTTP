package zadanie_3_GuessWhatCurrency;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.catalina.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class CurrencyController {

    public CurrencyController() {

        getShowCurrencyRate();


    }

    private void getShowCurrencyRate() {
        RestTemplate restTemplate = new RestTemplate();

        // Rate forObject = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/2019-10-10/", Rate.class);
        ExchangeRate forObject2 = restTemplate.getForObject("https://api.exchangeratesapi.io/latest", ExchangeRate.class);
        //for (ExchangeRate euroRate : forObject2) {
        System.out.println("1 forObject2 "+forObject2);

      System.out.println("2 forObject2.getRates() "+forObject2.getRates());
       double exchangeRate = forObject2.getRates().getAUD();
        System.out.println("AUD "+ exchangeRate );

    }
    @GetMapping("/game")
    public String get() {
        getShowCurrencyRate();
        return "currencyGame";
    }
}



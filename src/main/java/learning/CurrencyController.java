package learning;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CurrencyController {

    public CurrencyController() {

        RestTemplate restTemplate = new RestTemplate();

        Rate forObject = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/2019-10-10/", Rate.class);
EuroRate forObject2 = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/2019-10-10/", EuroRate.class);
        //for (EuroRate euroRate : forObject) {

           System.out.println(forObject.getMid());//todo null??
        System.out.println(forObject2.getRates());
        double EurRate = forObject2.getRates().get(0).getMid();
        System.out.println("Current EUR rate: "+ EurRate+ "PLN"); //todo is working


        }
    }



















//http://api.nbp.pl/api/exchangerates/rates/a/gbp/2012-01-02/

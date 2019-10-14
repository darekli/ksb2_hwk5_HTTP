package learning;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class CurrencyController {

    public CurrencyController() {

        RestTemplate restTemplate = new RestTemplate();

       // Rate forObject = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/2019-10-10/", Rate.class);
EuroRate forObject2 = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/2019-10-10/", EuroRate.class);
        //for (EuroRate euroRate : forObject) {

          // System.out.println(forObject.getMid());//todo null??
       // System.out.println(forObject2.getRates());
        double eurRate = forObject2.getRates().get(0).getMid();
        String euroRateDate = forObject2.getRates().get(0).getEffectiveDate();
        String euroRateNo = forObject2.getRates().get(0).getNo();

        System.out.println("Current EUR rate: "+ eurRate+ " PLN"); //todo is working
        System.out.println("Date "+euroRateDate);
        System.out.println(euroRateNo);



        }
    }



















//http://api.nbp.pl/api/exchangerates/rates/a/gbp/2012-01-02/

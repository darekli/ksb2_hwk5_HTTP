package zadanie_1_Http_Vaadin;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import learning.EuroRate;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import static com.sun.tools.internal.xjc.reader.Ring.add;
@Route("rate")
@Controller
public class CurrencyController extends VerticalLayout {


//
//        @GetMapping("/euroRate")
//        public String get() {
//            return "euroRate";
//        }

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


            System.out.println("Current EUR rate: " + eurRate + " PLN"); //todo is working!!
            System.out.println("Date " + euroRateDate);//todo is working!!
            System.out.println(euroRateNo);//todo is working!!



        }



}

package zadanie_1_Http_Vaadin;

import ch.qos.logback.core.net.server.Client;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import learning.EuroRate;
import org.apache.catalina.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class CurrencyController {


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


            System.out.println("Current EUR rate: " + eurRate + " PLN"); //todo is working
            System.out.println("Date " + euroRateDate);
            System.out.println(euroRateNo);
            TextField textField = new TextField("jhghjgjgjhg");
            Button button = new Button();

            Dialog dialog = new Dialog();
            dialog.add(new Label("Close me with the esc-key or an outside click"));

            dialog.setWidth("400px");
            dialog.setHeight("150px");

            button.addClickListener(event -> dialog.open());

        }

}

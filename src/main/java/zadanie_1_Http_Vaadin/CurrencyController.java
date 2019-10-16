package zadanie_1_Http_Vaadin;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import learning.EuroRate;
import org.springframework.web.client.RestTemplate;

@Route("rate")  //Albo route albo controller?

public class CurrencyController extends VerticalLayout {


        public CurrencyController() {

            RestTemplate restTemplate = new RestTemplate();

            // Rate forObject = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/2019-10-10/", Rate.class);
            EuroRate forObject2 = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/today/", EuroRate.class);

            Double eurRate = forObject2.getRates().get(0).getMid();
            String euroRateDate = forObject2.getRates().get(0).getEffectiveDate();
            String euroRateNo = forObject2.getRates().get(0).getNo();

            System.out.println("Current EUR rate: " + eurRate + " PLN");
            System.out.println("Date " + euroRateDate);
            System.out.println(euroRateNo);

            Button button = new Button("EUR rate current Date: "+ euroRateDate+ " Click!");
            Dialog dialog = new Dialog();
            dialog.add(new Label("Date: " + euroRateDate+" "+" Rate number: " + euroRateNo+ " EUR = " + eurRate + " PLN"));

            dialog.setWidth("500px");
            dialog.setHeight("30px");

            button.addClickListener(event -> dialog.open());
            add(button, dialog);
        }
}

package zadanie_3_GuessWhatCurrency;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

@Route("rate")
@Controller
public class CurrencyController extends VerticalLayout {


    public CurrencyController() {


        RestTemplate restTemplate = new RestTemplate();

        //   Rate forObject = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/2019-10-10/", Rate.class);
        ExchangeRate forObject2 = restTemplate.getForObject("https://api.exchangeratesapi.io/latest", ExchangeRate.class);

        System.out.println("Tabela walut i kursów: " + forObject2);
        String[] currencies = {"CAD", "HKD", "ISK", "PHP", "DKK", "HUF", "CZK", "AUD", "RON", "SEK", "IDR", "INR", "BRL", "RUB", "HRK", "JPY", "THB", "CHF", "SGD", "PLN", "BRN", "TRY", "CNY", "NOK", "NZD", "ZAR", "USD", "MXN", "ILS", "GBP", "KRW", "MYR"};
        int howManyCurrencies = currencies.length;
        System.out.println("Liczba walut: " + howManyCurrencies);


        Random rn = new Random();
        int randomCountry = rn.nextInt(howManyCurrencies);
        String yourCurrencyCountry = currencies[randomCountry];
        System.out.println("Wylosowana waluta nr: " + randomCountry);
        System.out.println("Waluta: " + yourCurrencyCountry);

        double rate=0;

//todo nie jestem dumny z tej części poniżej :/
        if (randomCountry == 0) {
          rate = forObject2.getRates(currencies).getCAD();

        } else if (randomCountry == 1) {
            rate = forObject2.getRates(currencies).getHKD();
        } else if (randomCountry == 2) {
            rate = forObject2.getRates(currencies).getISK();
        } else if (randomCountry == 3) {
             rate = forObject2.getRates(currencies).getPHP();
        } else if (randomCountry == 4) {
             rate = forObject2.getRates(currencies).getDKK();
        } else if (randomCountry == 5) {
             rate = forObject2.getRates(currencies).getHUF();
        } else if (randomCountry == 6) {
             rate = forObject2.getRates(currencies).getCZK();
        } else if (randomCountry == 7) {
             rate = forObject2.getRates(currencies).getAUD();
        } else if (randomCountry == 8) {
             rate = forObject2.getRates(currencies).getRON();
        } else if (randomCountry == 9) {
             rate = forObject2.getRates(currencies).getSEK();
        } else if (randomCountry == 10) {
             rate = forObject2.getRates(currencies).getIDR();
        } else if (randomCountry == 11) {
             rate = forObject2.getRates(currencies).getINR();
        } else if (randomCountry == 12) {
             rate = forObject2.getRates(currencies).getBRL();
        } else if (randomCountry == 13) {
             rate = forObject2.getRates(currencies).getRUB();
        } else if (randomCountry == 14) {
             rate = forObject2.getRates(currencies).getHRK();
        } else if (randomCountry == 15) {
             rate = forObject2.getRates(currencies).getJPY();
        } else if (randomCountry == 16) {
             rate = forObject2.getRates(currencies).getTHB();
        } else if (randomCountry == 17) {
             rate = forObject2.getRates(currencies).getCHF();
        } else if (randomCountry == 18) {
             rate = forObject2.getRates(currencies).getSGD();
        } else if (randomCountry == 19) {
             rate = forObject2.getRates(currencies).getPLN();
        } else if (randomCountry == 20) {
             rate = forObject2.getRates(currencies).getBGN();
        } else if (randomCountry == 21) {
             rate = forObject2.getRates(currencies).getTRY();
        } else if (randomCountry == 22) {
             rate = forObject2.getRates(currencies).getCNY();
        } else if (randomCountry == 23) {
             rate = forObject2.getRates(currencies).getNOK();
        } else if (randomCountry == 24) {
             rate = forObject2.getRates(currencies).getNZD();
        } else if (randomCountry == 25) {
             rate = forObject2.getRates(currencies).getZAR();
        } else if (randomCountry == 26) {
             rate = forObject2.getRates(currencies).getUSD();
        } else if (randomCountry == 27) {
             rate = forObject2.getRates(currencies).getMXN();
        } else if (randomCountry == 28) {
             rate = forObject2.getRates(currencies).getILS();
        } else if (randomCountry == 29) {
             rate = forObject2.getRates(currencies).getGBP();
        } else if (randomCountry == 30) {
             rate = forObject2.getRates(currencies).getKRW();
        } else if (randomCountry == 31) {
             rate = forObject2.getRates(currencies).getMYR();
        } else {
            System.out.println("Błąd w kodzie");
        }
        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean wynik = false;
        int ktory_raz = 1;
        Random rand = new Random();
        double liczba = rate;

        double liczba2x0 = (double) Math.round(liczba * 100) / 100;
        while (wynik == false) {
            //System.out.println(aUD);
            System.out.print("Wprowadź wartość waluty (np. 4.24, wystarczą dwa miejsca po \"przecinku\", kropka zamiast przecinka!): ");
            System.out.println();
            // double zgadnij = Integer.parseInt(reader.readLine());
            Double zgadnij = null;
            try {
                zgadnij = Double.valueOf(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (zgadnij == liczba2x0) {
                System.out.println("Znalazłeś szukaną wartość!!!");
                wynik = true;
            } else if (zgadnij > liczba2x0) {
                System.out.println("Podałeś większą wartość kursu.");
                wynik = false;
                ktory_raz++;
            } else if (zgadnij < liczba2x0) {
                System.out.println("Podałeś mniejszą wartość kursu.");
                wynik = false;
                ktory_raz++;
            }
        }

    }
}

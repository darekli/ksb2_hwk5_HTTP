package zadanie_3_GuessWhatCurrency;

import learning.Rate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Controller
public class CurrencyController {


    //RandomCurrency randomCurrency;
   public CurrencyController() {

        //getShowCurrencyRate();


 //   }

  //  private void getShowCurrencyRate() {
        RestTemplate restTemplate = new RestTemplate();

     //   Rate forObject = restTemplate.getForObject("http://api.nbp.pl/api/exchangerates/rates/a/eur/2019-10-10/", Rate.class);
        ExchangeRate forObject2 = restTemplate.getForObject("https://api.exchangeratesapi.io/latest", ExchangeRate.class);
     //   for (ExchangeRate euroRate : forObject2) {
        System.out.println("1 forObject2 "+forObject2);
        String [] currencies = {"CAD", "HKD", "ISK", "PHP", "DKK", "HUF", "CZK", "AUD", "RON", "SEK", "IDR", "INR", "BRL", "RUB", "HRK", "JPY", "THB", "CHF", "SGD", "PLN", "BRN", "TRY", "CNY", "NOK", "NZD", "ZAR", "USD", "MXN", "ILS", "GBP", "KRW", "MYR"};
        int howManyCurrencies = currencies.length;
        System.out.println(howManyCurrencies);
        System.out.println(currencies[0]);

        Random rn = new Random();
        int randomCountry = rn.nextInt(howManyCurrencies) -1;
String yourCurrencyCountry = currencies[randomCountry];
       System.out.println("randomCountry "+randomCountry);

        System.out.println("currencies[randomCountry]"+currencies[randomCountry]);
        System.out.println("yourCurrencyCountry"+yourCurrencyCountry);
//double skjhfd = Double.parseDouble((forObject2.getRates().get(yourCurrencyCountry)));
       // System.out.println("skjhfd"+ skjhfd);
       // System.out.println("2 forObject2.getRates() "+forObject2.getRates();
        System.out.println();
        System.out.println("jhgfhfgjh"+forObject2.getRates(yourCurrencyCountry));

      // double exchangeRate = forObject2.getRates(get(yourCurrencyCountry)).getAUD();
//      String exchangeRate2 = forObject2.getRates().get(currencies[randomCountry]);
//      double exchangeRate3 = forObject2.getRates().get(yourCurrencyCountry);

       //System.out.println(exchangeRate3);
   //    System.out.println("AUD "+ exchangeRate );


//        System.out.println(exchangeRate2);
//        System.out.println("Random country: "+randomCurrency);
//      RandomCurrency exchangeRate2 = forObject2.getRates().get(randomCurrency);
//        System.out.println(exchangeRate2);//todo null problem

    }
//    @GetMapping("/game")
//    public String get(String yourCurrencyCountry) {
//        getShowCurrencyRate();
//        return "currencyGame";
//    }
}



package zadanie_3_GuessWhatCurrency;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ZgadnijLiczbe {

CurrencyController currencyController = new CurrencyController();
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        // TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean wynik = false;
        int ktory_raz=1;
        Random rand = new Random();
        double liczba = 4.44; //todo wstaw kurs USD here
      //double liczba = rand.nextDouble(100.00);

        double liczba2x0 = (double) Math.round(liczba * 100) / 100;
        while (wynik==false)
        {
            //System.out.println(aUD);
            System.out.print("Wprowadź liczbę z zakresu 0,00-5,00: ");
           // double zgadnij = Integer.parseInt(reader.readLine());
           Double zgadnij = Double.valueOf(reader.readLine());
            if(zgadnij==liczba2x0)
            {
                System.out.println("Znalazłeś szukaną liczbę!!!");
                wynik=true;
            }
            else if (zgadnij>liczba2x0)
            {
                System.out.println("Podałeś większą liczbę.");
                wynik=false;
                ktory_raz++;
            }
            else if (zgadnij<liczba2x0)
            {
                System.out.println("Podałeś mniejszą liczbę.");
                wynik=false;
                ktory_raz++;
            }
        }
       // System.out.println("Zgadłeś za "+ktory_raz+" razem.");

}}

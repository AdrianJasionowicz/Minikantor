package Minikantor;

import java.util.Scanner;

public class Minikantor {
    
    public static void main(String[] args) {
    
    System.out.println(" Witaj w Minikantorze ");
    System.out.println("Wszystkie kursy będą bazowały na aktualnych kursach NBP");
    Tablet();

    
            Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz Walute z Ktorej chcesz dokonać wymiany ");
        String currencyCode = scanner.next().toUpperCase();
        double value = 1;
        switch (currencyCode) {
        case ("THB"):
        value = 0.1255;
        break;
        case ("USD"):
        value = 4.1978;
        break;
        case ("AUD"):
        value = 3.1538;
        break;
        case ("HKD"):
        value = 0.5358;
        break;
        case ("CAD"):
        value = 3.3584;
        break;
        case ("NZD"):
        value = 2.9115;
        break;
        case ("SGD"):
        value = 3.0948;
        break;
        case ("EUR"):
        value = 4.6428;
        break;
        case ("HUF"):
        value = 1.2634;
        break;
        case ("CHF"):
        value = 4.5431;
        break;
        case ("GBP"):
        value = 5.5114;
        break;
        case ("UAH"):
        value = 0.1467;
        break;
        case ("JPY"):
        value = 3.4247;
        break;
        case ("CZK"):
        value = 0.1906;
        break;
        case ("DKK"):
        value = 0.6241;
        break;
        case ("ISK"):
        value = 3.2696;
        break;
        case ("NOK"):
        value = 0.4785;
        break;
        case ("SEK"):
        value = 0.4487;
        break;
        case ("HRK"):
        value = 0.6129;
        break;
        case ("RON"):
        value = 0.9388;
        break;
        case ("BGN"):
        value = 2.3738;
        break;
        case ("TRY"):
        value = 0.2858;
        break;
        case ("ILS"):
        value = 1.3111;
        break;
        case ("CLP"):
        value = 0.5335;
        break;
        case ("PHP"): 
        value = 0.0813;
        break;
        case ("MXN"):
        value = 0.2114;
        break;
        case ("ZAR"):
        value = 0.2876;
        break;
        case ("BRL"):
        value = 0.8857;
        break;
        case ("MYR"):
        value = 0.9970;
        break;
        case ("IDR"):
        value = 2.9218;
        break;
        case ("INR"):
        value = 5.5259;
        break;
        case ("KRW"):
        value = 0.3450;
        break;
        case ("CNY"):
        value = 0.6598;
        break;
                }
                
        System.out.println("Podaj Kwotę do wymiany");
        double ammount = scanner.nextDouble();
        double reward = ammount * value; 
        System.out.println("Twoja kwota na PLN to: " + reward);
        exchange(reward);
    

    
    }
    
    
    
    
 
    
    public static double exchange(double reward) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz Walute na Ktora chcesz dokonać wymiany ");
        String currencyCode2 = scanner.next().toUpperCase();
        double value2 = 0;
        switch (currencyCode2) {
        case ("THB"):
        value2 = 0.1255;
        break;
        case ("USD"):
        value2 = 4.1978;
        break;
        case ("AUD"):
        value2 = 3.1538;
        break;
        case ("HKD"):
        value2 = 0.5358;
        break;
        case ("CAD"):
        value2 = 3.3584;
        break;
        case ("NZD"):
        value2 = 2.9115;
        break;
        case ("SGD"):
        value2 = 3.0948;
        break;
        case ("EUR"):
        value2 = 4.6428;
        break;
        case ("HUF"):
        value2 = 1.2634;
        break;
        case ("CHF"):
        value2 = 4.5431;
        break;
        case ("GBP"):
        value2 = 5.5114;
        break;
        case ("UAH"):
        value2 = 0.1467;
        break;
        case ("JPY"):
        value2 = 3.4247;
        break;
        case ("CZK"):
        value2 = 0.1906;
        break;
        case ("DKK"):
        value2 = 0.6241;
        break;
        case ("ISK"):
        value2 = 3.2696;
        break;
        case ("NOK"):
        value2 = 0.4785;
        break;
        case ("SEK"):
        value2 = 0.4487;
        break;
        case ("HRK"):
        value2 = 0.6129;
        break;
        case ("RON"):
        value2 = 0.9388;
        break;
        case ("BGN"):
        value2 = 2.3738;
        break;
        case ("TRY"):
        value2 = 0.2858;
        break;
        case ("ILS"):
        value2 = 1.3111;
        break;
        case ("CLP"):
        value2 = 0.5335;
        break;
        case ("PHP"): 
        value2 = 0.0813;
        break;
        case ("MXN"):
        value2 = 0.2114;
        break;
        case ("ZAR"):
        value2 = 0.2876;
        break;
        case ("BRL"):
        value2 = 0.8857;
        break;
        case ("MYR"):
        value2 = 0.9970;
        break;
        case ("IDR"):
        value2 = 2.9218;
        break;
        case ("INR"):
        value2 = 5.5259;
        break;
        case ("KRW"):
        value2 = 0.3450;
        break;
        case ("CNY"):
        value2 = 0.6598;
        break;
                }
                
        
        double reward3 = reward / value2; 
        System.out.println("Twoja kwota na " + currencyCode2 + " to: " + reward3);
        return reward3; 
        
        
        
        
    }
    
    public static void Tablet() {
    System.out.println("Lista Walut oraz ich skrótów do Użytku");
    
        
    String[] Table = {"Tajlandia - THB" , "Dolar Amerykański - USD" , "Dolar Australijski - AUD" , "Dolar Hongkongu - HKD" , "Dolar Kanadyjski - CAD" , "Dolar Nowozelandzki - NZD" , "Dolar Singapurski - SGD" , "Euro - EUR" , "Forint (Węgry) -  HUF" , "Frank Szwajcarski - CHF" , "Funt Szterling -  GBP" , "Hrywna (Ukraina) -  UAH" , "Jen (Japonia) - JPY" , "Korona Czeska - CZK" , "Korona Duńska -  DKK" , "Korona Islandzka -  ISK" , "Korona Norweska - NOK" , "Korona Szwedzka - SEK" , "Kuna (Chorwacja) - HRK" , "Lej Rumuński - RON" , "Lew (Bułgaria) - BGN" , "Lira Turecka - TRY" , "Nowy Izraelski Szekel - ILS" , "Peso Chilijskie - CLP" , "Peso Filipińskie	- PHP" , "Peso Meksykańskie - MXN" , "Rand (Republika Południowej Afryki) - ZAR" , "Real (Brazylia) - BRL" , "Ringgit (Malezja)	- MYR" , "Rupia Indonezyjska - IDR" , "Rupia Indyjska - INR" , "Won Południowokoreański - KRW" , "Yuan Renminbi (Chiny) - CNY"};
         
        for (String i : Table) {
            System.out.println(i);
        }
             
         
        
        
    }
}
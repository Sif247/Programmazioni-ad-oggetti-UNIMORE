import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice {
    public static void main(String[] args) {
        Random prezzoCasuale = new Random();
        int prezzo = prezzoCasuale.nextInt(101);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Utente 1 indovina il prezzo:");
        int tentativo1 = scanner.nextInt();
        if(tentativo1 < 0)
        {
            Math.abs(tentativo1);
        }
        System.out.println("Utente 2 indovina il prezzo:");
        int tentativo2 = scanner.nextInt();
        if(tentativo1 < 0)
        {
            Math.abs(tentativo1);
        }

        int risultato1 = Math.abs(tentativo1 - prezzo);
        int risultato2 = Math.abs(tentativo2 - prezzo);

        if( risultato1 < risultato2)
        {
            System.out.println("Ha vinto l'utente1");
        }
        else if (risultato2 < risultato1)
        {
            System.out.println("Ha vinto l'utente2");
        }
        else
        {
            System.out.println("pareggio");
        }

        System.out.println("il prezzo esatto era " + prezzo);
    }
}
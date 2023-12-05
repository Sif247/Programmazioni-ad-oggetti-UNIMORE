import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int inizio = 4;

        Random num = new Random();
        Scanner scanner = new Scanner(System.in);

        num.nextInt(inizio);
        System.out.println("Benvenuto al gioco di indovinare il numero tra 0 e 3!");
        int risultato;

        do{
            System.out.println("inserisci un numero tra 0 e 3");
            risultato = scanner.nextInt();

            if(risultato < 0 || risultato > 3)
            {
                System.out.println("numero non regolare");
            }
            else if(risultato != 0)
            {
                System.out.println("numero sbaglato");
            }
            else
            {
                System.out.println("HAI VINTOOOOOOO");
                break;
            }
        }   while(true);
    }
}

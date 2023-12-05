
import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hai due scimmie, a e b. Rispondi con 'true' se una scimmia sta sorridendo e 'false' se non lo è.");

        System.out.print("La scimmia a sta sorridendo? ");
        boolean aSmile = scanner.nextBoolean();

        System.out.print("La scimmia b sta sorridendo? ");
        boolean bSmile = scanner.nextBoolean();

        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            System.out.println("Siamo nei guai!");
        } else {
            System.out.println("Siamo al sicuro.");
        }
    }
}
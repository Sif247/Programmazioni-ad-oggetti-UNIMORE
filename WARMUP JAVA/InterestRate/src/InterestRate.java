public class InterestRate {
    public static void main(String[] args) {
        double saldoIniziale = 1000;

        System.out.println("il saldo di partenza è " + saldoIniziale);

        double saldoPrimoAnno = saldoIniziale + (1000 /100) * 5;
        double saldoSecondoAnno = saldoPrimoAnno + (saldoPrimoAnno / 100) * 5;
        double saldoTerzoAnno = saldoSecondoAnno + (saldoSecondoAnno / 100) * 5;

        System.out.println("il primo anno il saldo è " + saldoPrimoAnno);
        System.out.println("il secondo anno il saldo è " + saldoSecondoAnno);
        System.out.println("il terzo anno il saldo è " + saldoTerzoAnno);
    }
}
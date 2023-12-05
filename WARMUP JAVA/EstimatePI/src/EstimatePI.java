public class EstimatePI {
    public static void main(String[] args) {
        int numTrials = 1000000; // Il numero di tentativi (puoi cambiarlo per ottenere stime più accurate)
        int numInsideCircle = 0; // Il numero di punti che cadono all'interno del cerchio
        for (int i = 0; i < numTrials; i++) {
            double x = Math.random() * 2 - 1; // Genera una coordinata x casuale tra -1 e 1
            double y = Math.random() * 2 - 1; // Genera una coordinata y casuale tra -1 e 1
            // Calcola la distanza dal punto all'origine (0,0)
            double distance = Math.sqrt(x * x + y * y);
            // Se il punto è all'interno del cerchio (la distanza è inferiore a 1), incrementa il contatore
            if (distance <= 1) {
                numInsideCircle++;
            }
        }

        // Calcola una stima di π
        double piEstimate = 4.0 * numInsideCircle / numTrials;

        // Calcola l'errore percentuale rispetto al valore vero di π
        double error = ((piEstimate - Math.PI) / Math.PI) * 100;

        // Stampa i risultati
        System.out.printf("[trial=%d] [error=%.6fpc] [estimate=%.16f]\n", numTrials, error, piEstimate);
    }
}
    

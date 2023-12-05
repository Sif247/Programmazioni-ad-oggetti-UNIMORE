package PossibileBilanciamento;

public class CanBalance {
    public static boolean canBalance(int[] v)
    {
        int sommaOpposta;
        int sommacorrente = 0;
        int conteggio;
        for(int i = 0; i < v.length; i++)
        {
            sommacorrente += v[i];
            conteggio= v.length - 1;
            sommaOpposta = 0;
            while(conteggio > i)
            {
                sommaOpposta += v[conteggio];
                conteggio--;
            }
            if(sommaOpposta == sommacorrente)
            {
                return true;
            }
        }
        return false;
    }
}

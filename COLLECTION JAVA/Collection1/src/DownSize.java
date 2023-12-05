import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n) {
        int i = n - 1; // Inizia con l'indice n-1
        while (i < list.size()) {
            list.remove(i);
            i += n - 1; // Aggiungi n-1 all'indice per spostarsi avanti
        }
    }
}
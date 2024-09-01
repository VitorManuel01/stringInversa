import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String palavra = "Voei";
        List<Character> caracteres = new ArrayList<>();
        int reverso = palavra.length() - 1;

        StringBuilder sb = new StringBuilder(palavra);

        for(int i=0; i< reverso; i++){
            caracteres.add(sb.charAt(i));

            char marca = sb.charAt(i);

            sb.setCharAt(i, sb.charAt(reverso));

            sb.setCharAt(reverso, marca);

            reverso--;
        }

        String palavraInvertida = sb.toString();
        System.out.println("Palavra invertido: " + palavraInvertida);
    }
}

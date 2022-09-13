import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String[] letras = {"A", "B", "C", "L", "X"};


        for(int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));

        int[] numeros = {9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length;i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];

        }
        System.out.println("Maior: "+ maior);
        System.out.println("Menor: "+menor);
        System.out.println("Media: "+(float)media/numeros.length);
    }
}
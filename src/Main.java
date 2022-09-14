import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nomeOriginal = "Lucas";
        saudacao(nomeOriginal);

        int result = soma(2,3);
        System.out.println(result);
    }

    public static void saudacao(String nomeParimetro){
        System.out.println("Hello, "+nomeParimetro);
    }

    public static int soma(int a, int b){
        return a + b;
    }
}
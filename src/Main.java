public class Main {
    public static void main(String[] args) {
    //Condicional
    //Separar por graduação A 80 B 70 C 60 D 0

        int nota = 50;
        String graduacao;
        if(nota >= 80){
            graduacao = "A";
        }else if(nota < 80 && nota >= 70){
            graduacao = "B";
        }else if (nota < 70 && nota >= 50){
            graduacao = "C";
        } else if(nota < 50 && nota >= 0){
            graduacao = "D";
        }else{
            graduacao = "";
        }

        switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno reprovado");
                break;
            default:
                System.out.println("Graduação inválida");
        }





    }
}
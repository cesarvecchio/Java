import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        String[][] matriz = new String[5][2];
        Scanner leitor = new Scanner(System.in);
        String nome;

        for(int i = 0; i < matriz.length; i++) {
            System.out.println("Amigo " + (i + 1));

            for(int j = 0; j < matriz[0].length; j++) {

                String texto = j == 0 ? "Nome:" : "Numero:";
//                if(j == 0) {
//                    System.out.println("Nome:");
                System.out.println(texto);
                    matriz[i][j] = leitor.next();
//                } else {
//                    System.out.println("Numero:");
//                    matriz[i][j] = leitor.next();
//                }
            }
        }

        System.out.println("Digite um nome");
        nome = leitor.next();

        for(int i = 0; i < matriz.length; i++) {
            if(matriz[i][0].equals(nome)) {
                System.out.println("|----------------------|");

                System.out.printf("|%-10s | %-9s|%n", "NOME", "TELEFONE");

                System.out.printf("|%-10s | %-9s|%n",
                        matriz[i][0],
                        matriz[i][1]);

                System.out.println("|----------------------|");

                return;
            }
        }

        System.out.println("Nome não encontrado!");

    }
}

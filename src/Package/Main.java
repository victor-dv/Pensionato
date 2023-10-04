package Package;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroQuarto;
        int quantidadeQuarto = 10;
        int numeroAluguel;
        Estudantes[] quartosAlugados = new Estudantes[quantidadeQuarto];


        Estudantes estudantes = new Estudantes();
        System.out.println("==== Quantos quartos serão alugados: ====");
        numeroAluguel = scanner.nextInt();
        System.out.println("");

        for (int i = 0; i <  numeroAluguel; i++){
            int quarto = i + 1;
            System.out.printf("Quarto # %d", quarto);
            System.out.println();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Numero do quarto: ");
            numeroQuarto = scanner.nextInt();
            System.out.println("");

            quartosAlugados[numeroQuarto] = new Estudantes(nome, email);
        }
        System.out.println("==== Quartos ocupados: ====" + "\n");
        for (int i = 0; i < quantidadeQuarto; i++){
            if (quartosAlugados[i] != null){
                System.out.println(i + ": " + quartosAlugados[i].getNome() + " ," + quartosAlugados[i].getEmail());
            } else if (quartosAlugados[i] == null) {
                System.out.println(i + ": vazio");
            }

        }


    }
}

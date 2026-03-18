package challenge_orchestra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Orquestra {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Instrumento> instrumentos = new ArrayList();
        instrumentos.add(new Violao());
        instrumentos.add(new Bateria());
        instrumentos.add(new Piano());

        int opcao = 0;
        while (opcao != instrumentos.size() + 1){
            System.out.println("\n ---- ORQUESTRA VIRTUAL -----");
            System.out.println("Escolha um instrumento para tocar:");

            //Exibe o menu dinamicamente

            for (int i = 0;  i < instrumentos.size();i++){
                System.out.println((i + 1) + "-" + instrumentos.get(i).getNome());
            }
            System.out.println((instrumentos.size() + 1) + " - Sair da Orquestra");
            System.out.print("Sua escolha: ");

            // Try para tratar eerros de input

            try {
                opcao = scanner.nextInt();
                if (opcao > 0 && opcao <= instrumentos.size()){
                    Instrumento inst = instrumentos.get(opcao-1);
                    System.out.println("Tocando " + inst.getNome());
                    inst.emitirSom();
                }


            }catch(InputMismatchException e){
                System.out.println("Erro ao tocar o instrumento: " + e);
            }
        }

    }


}

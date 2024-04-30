package edu.carlos.segundasemana;

import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Carlos", "Maria", "Isabella", "João"};

        double media = calculadoraMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculadoraMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma+= nota;
        }

        return soma / alunos.length;
    }

}

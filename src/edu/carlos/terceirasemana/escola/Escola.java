package edu.carlos.terceirasemana.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe");
        felipe.setIdade(9);
        felipe.setSexo("masculino");

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos " + "e tem como sexo " + felipe.getSexo());

        Aluno maria = new Aluno();

        maria.setNome("Maria");
        maria.setIdade(8);
        maria.setSexo("feminino");

        System.out.println("O(A) aluno(a) " + maria.getNome() + " tem " + maria.getIdade() + " anos " + "e tem como " +
                "sexo " + maria.getSexo());
    }
}

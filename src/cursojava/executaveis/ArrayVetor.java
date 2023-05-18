package cursojava.executaveis;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

import javax.swing.*;

public class ArrayVetor {

    public static void main(String[] args) {

        double[] notasJava = {8.8, 2.0, 1.9, 1.8};
        double[] notasLogica = {1.7, 9.9, 0.8, 9.8};

        /*Criação  do aluno*/
        Aluno aluno = new Aluno();
        aluno.setNome("Felipe batista");
        aluno.setNomeEscola("Treinamento JAva");

        //*Criação de disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso java");
        disciplina.setNota(notasJava);
        aluno.getDisciplinas().add(disciplina);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Lógica de programação");
        disciplina2.setNota(notasLogica);
        aluno.getDisciplinas().add(disciplina2);

        System.out.println("Nome do aluno: " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
        System.out.println("----------------Disciplinas do aluno----------------");

        //*primeiro for percorre a lista de disciplina
        for (Disciplina disci : aluno.getDisciplinas()) {
            System.out.println("Disciplina: " + disci.getDisciplina());
            System.out.println("As notas da disciplina são: ");

            //*Segundo for usado para percorer as notas da disciplina
            for (int pos = 0; pos < disciplina.getNota().length; pos++) {
                System.out.println("Nota " + (pos + 1) + " é igual: " + disci.getNota()[pos]);
            }
        }


    }
}

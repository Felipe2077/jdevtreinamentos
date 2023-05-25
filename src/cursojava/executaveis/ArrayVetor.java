package cursojava.executaveis;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
    //---------------------------------------------------------------------------------
        Aluno[] arrayAlunos = new Aluno[1];
        arrayAlunos[0] = aluno;

        for (int pos =0; pos < arrayAlunos.length; pos++){
            System.out.println("Nome do aluno: "+arrayAlunos[pos].getNome());
            for (Disciplina d : arrayAlunos[pos].getDisciplinas()){
                System.out.println("nome da disciplina: "+d.getDisciplina());

                for (int posNota =0; posNota < d.getNota().length; posNota++){
                    System.out.println("A nota é: "+d.getNota()[posNota]);
                }
            }
        }



    }
}

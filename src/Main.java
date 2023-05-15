import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {

            List<Aluno> alunos = new ArrayList<Aluno>();

            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

            String login = "admin";
            String senha = "admin";

            if (login.equals("admin") && senha.equals("admin")) {

                for (int qtd = 0; qtd <= 2; qtd++) {
                    String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + "?");
                    String idade = JOptionPane.showInputDialog("Qual a idade?");
                    String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
                    String registroGeral = JOptionPane.showInputDialog("Qual o RG? ");
                    String numeroCpf = JOptionPane.showInputDialog("Qual o CPF? ");
//                  String nomeMae = JOptionPane.showInputDialog("Qual o nome da mae? ");
//                  String nomePai = JOptionPane.showInputDialog("Qual o nome do pai? ");
//                  String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrícula: ");
//                  String serie = JOptionPane.showInputDialog("Qual a série? ");
//                  String escola = JOptionPane.showInputDialog("Qual o nome da escola: ");

                    Aluno aluno1 = null;

                    aluno1.setNome(nome);
                    aluno1.setIdade(Integer.parseInt(idade));
                    aluno1.setDataNascimento(dataNascimento);
                    aluno1.setRegistroGeral(registroGeral);
//                  aluno1.setNumeroCpf(numeroCpf);
//                  aluno1.setNomeMae(nomeMae);
//                  aluno1.setNomePai(nomePai);
//                  aluno1.setSerieMatriculado(serie);
//                  aluno1.setDataMatricula(dataMatricula);
//                  aluno1.setNomeEscola(escola);


                    //Criando a disciplina
                    for (int count = 0; count < 4; count++) {
                        String nomeDaDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina: ");
                        String notaDisciplina = JOptionPane.showInputDialog("Digite a sua nota disciplina: ");


                        Disciplina disciplina = new Disciplina();
                        disciplina.setDisciplina(nomeDaDisciplina);
                       // disciplina.setNota(Double.parseDouble(notaDisciplina));

                        aluno1.getDisciplinas().add(disciplina);
                    }

                    // yes = 0 / no = 1;
                    int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
                    if (escolha == 0) {
                        int continuarRemover = 0;
                        while (continuarRemover == 0) {
                            String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1,2,3,4?");
                            aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - 1);
                            continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                        }
                    }

                    alunos.add(aluno1);

                }

                for (int i = 0; i < alunos.size(); i++) {
                    Aluno aluno = alunos.get(i);

                    if (aluno.getNome().equalsIgnoreCase("felipe")) {
                        Aluno trocar = new Aluno();
                        trocar.setNome("aluno foi trocado");
                        trocar.setIdade(88);
                        trocar.setDataNascimento("88/88");
                        trocar.setRegistroGeral("889977");

                        Disciplina disciplina = new Disciplina();
                        disciplina.setDisciplina("Matematica");
                      //  disciplina.setNota(88.0);

                        trocar.getDisciplinas().add(disciplina);

                        alunos.set(i, trocar);
                        aluno = alunos.get(i);

                    }
                }


//            //PREECHENDO A LISTA COM ALUNO POR STATUS DE NOTAS
//            for (Aluno aluno : alunos) {
//                if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
//                    alunosAprovados.add(aluno);
//                } else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
//                    alunosAprovados.add(aluno);
//                } else {
//                    alunosAprovados.add(aluno);
//                }
//            }


                for (Aluno aluno : alunos) {
                    System.out.println(aluno.toString());
                    System.out.println("Media do aluno " + aluno.getNome() + " nota é: " + aluno.getMediaNota());
                    System.out.println("Resultado = " + aluno.getAlunoAprovado());
                    System.out.println("-----------------------------------------");
                    System.out.println(aluno.getDisciplinas());
                }


            } else {
                JOptionPane.showConfirmDialog(null, "usuário e ou senha invalidos");
            }

        }catch (Exception e){

            e.printStackTrace();

        }
    }
}
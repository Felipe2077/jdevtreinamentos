package cursojava.classes;

import cursojava.constantes.StatusAluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{


    private	String dataMatricula;
    private	String nomeEscola;
    private	String serieMatriculado;

    String login;
    String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private List <Disciplina> disciplinas = new ArrayList<Disciplina>();

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Aluno() {
        // TODO Auto-generated constructor stub
    }






    /*Metodo SET recebe dados*/

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }


    /*metodo que retorna a media do aluno*/
    public double getMediaNota() {
        Double totalNota = 0.0;

        for (Disciplina disciplina : disciplinas) {
            totalNota += disciplina.getNota();
        }
        return totalNota / disciplinas.size();
    }

    public String getAlunoAprovado (){
        double media = this.getMediaNota();

        if (media >= 50){
            if (media>= 70){
                return StatusAluno.APROVADO;
            }else{
                return  StatusAluno.RECUPERACAO;
            }
        }else{
            return StatusAluno.REPROVADO;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +

                ", dataMatricula='" + dataMatricula + '\'' +
                ", nomeEscola='" + nomeEscola + '\'' +
                ", serieMatriculado='" + serieMatriculado + '\'' +

                '}';
    }



    public boolean autenticar(String login, String senha){
        this.login = login;
        this.senha = senha;
        return login.equals("admin") && senha.equals("admin");
    }
}
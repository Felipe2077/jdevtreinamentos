package cursojava.leituradearquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
  public static void main(String[] args) throws IOException {




    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa();
    Pessoa pessoa3 = new Pessoa();

    pessoa1.setEmail("pessoa1@gmail.com");
    pessoa1.setNome("Felipe");
    pessoa1.setIdade(28);

    pessoa2.setEmail("pessoa2@gmail.com");
    pessoa2.setNome("Peter");
    pessoa2.setIdade(1);

    pessoa3.setEmail("pessoa3@gmail.com");
    pessoa3.setNome("Thaty");
    pessoa3.setIdade(27);

    List<Pessoa> pessoas = new ArrayList<Pessoa>();
    pessoas.add(pessoa1);
    pessoas.add(pessoa2);
    pessoas.add(pessoa3);


    File arquivo = new File("/home/felipe-cpd/IdeaProjects/jdevtreinamentos/arquivo.txt");

    if (!arquivo.exists()) {
      arquivo.createNewFile();
    }

    FileWriter escrever_no_arquivo = new FileWriter(arquivo);


    for (Pessoa pessoa: pessoas) {
      escrever_no_arquivo.write(pessoa.getNome()+";"+pessoa.getEmail()+";"+pessoa.getIdade()+"\n");


    }

    escrever_no_arquivo.flush();
    escrever_no_arquivo.close();

  }
}

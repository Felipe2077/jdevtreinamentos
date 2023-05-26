package cursojava.leituradearquivos;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApachePoi {
   public static void main(String[] args) throws IOException {
      File file = new File("/home/felipe-cpd/IdeaProjects/jdevtreinamentos/src/cursojava/leituradearquivos/arquivo_excel.xls");

      if (!file.exists()) {
         file.createNewFile();
      }

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

      HSSFWorkbook hssfWorkbook = new HSSFWorkbook();//*usado para escrever a planilha
      HSSFSheet linhaPessoa = hssfWorkbook.createSheet("Planilha de pessoas JdevTreinamentos");


      int numeroLinha = 0;
      for (Pessoa pessoa: pessoas) {
         Row linha = linhaPessoa.createRow(numeroLinha++); //* criando a linha na planilha

         int celula = 0;

         Cell celNome = linha.createCell(celula++);
         celNome.setCellValue(pessoa.getNome());

         Cell celEmail = linha.createCell(celula++);
         celEmail.setCellValue(pessoa.getEmail());

         Cell celIdade = linha.createCell(celula++);
         celIdade.setCellValue(pessoa.getIdade());

      }//* terminou de montar a planilha

      FileOutputStream saida = new FileOutputStream(file);
      hssfWorkbook.write(saida);
      saida.flush();
      saida.close();

      System.out.println("Planilha foi criada com sucesso!");

   }
}

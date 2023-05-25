package cursojava.ApiDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;



public class NovaApiDataJAva {
    public static void main(String[] args) throws ParseException {

        //*Nova API de data a partir do Java 8*/
        LocalDate dataAtual = LocalDate.now();

        LocalDate vencimento = LocalDate.of(2023,05,20);

        if (dataAtual.isAfter(vencimento)){
            System.out.println("O boleto está vencido");
        }else{
            System.out.println("O boleto nao está vencido");
        }



        System.out.println("Data atual: "+dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalTime horaAtual = LocalTime.now();

        System.out.println("Agora são: "+horaAtual.format(DateTimeFormatter.ofPattern("hh:mm")));

        LocalDateTime dataEHoraAtual = LocalDateTime.now();

        //Foratando a data com a nova api
        System.out.println("data e hora atuais: "+ dataEHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));

    }
}

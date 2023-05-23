package cursojava.ApiDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NovaApiDataJAva {
    public static void main(String[] args) throws ParseException {

        /*Nova API de data a partir do Java 8*/
        LocalDate dataAtual = LocalDate.now();

        System.out.println("Data atual: "+dataAtual);

        LocalTime horaAtual = LocalTime.now();

        System.out.println("Agora são: "+horaAtual + " horas");

        LocalDateTime dataEHoraAtual = LocalDateTime.now();

        System.out.println("data e hora atuais: "+new SimpleDateFormat("dd/MM/yyyy").format(dataEHoraAtual.toLocalDate()));

    }
}

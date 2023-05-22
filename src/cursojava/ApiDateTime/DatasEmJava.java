package cursojava.ApiDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DatasEmJava {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        System.out.println("Data em milisegundos: "+date.getTime());

        System.out.println("Dia do mês: "+date.getDate());

        System.out.println("Dia da semana: "+date.getDay());

        System.out.println("hora do dia: "+date.getHours());
        System.out.println("minuto da hora: "+date.getMinutes());
        System.out.println("segundos: "+date.getSeconds());



        /*-------------------------------simple date format-------------------------------*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm.ss");

        System.out.println("Data atual em formato padrão de String: "+simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

        System.out.println("Data para o padrão de banco de dados: "+ simpleDateFormat.format(date));

        System.out.println("Objeto date: "+simpleDateFormat.parse("1987-05-18 11:34.15"));
    }
}

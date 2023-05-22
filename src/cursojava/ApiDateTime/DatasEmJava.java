package cursojava.ApiDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DatasEmJava {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();

        System.out.println("Data em milisegundos: "+date.getTime());
        System.out.println("Calendar em milisegundos: "+calendar.getTimeInMillis());

        System.out.println("Dia do mês: "+date.getDate());
        System.out.println("Calendar do mês: "+calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Dia da semana: "+date.getDay());
        System.out.println("Dia da semana: "+(calendar.get(Calendar.DAY_OF_WEEK)-1));

        System.out.println("hora do dia: "+date.getHours());
        System.out.println("hora do dia: "+calendar.get(Calendar.HOUR_OF_DAY));


        System.out.println("minuto da hora: "+date.getMinutes());
        System.out.println("minuto da hora: "+calendar.get(Calendar.MINUTE));


        System.out.println("segundos: "+date.getSeconds());
        System.out.println("segundos: "+calendar.get(Calendar.SECOND));



        /*-------------------------------simple date format-------------------------------*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm.ss");


        System.out.println("Data atual em formato padrão de String: "+simpleDateFormat.format(date));
        System.out.println("Calendar atual: "+calendar.getInstance().getTime());
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");

        System.out.println("Data para o padrão de banco de dados: "+ simpleDateFormat.format(date));

        System.out.println("Objeto date: "+simpleDateFormat.parse("1987-05-18 11:34.15"));
    }
}

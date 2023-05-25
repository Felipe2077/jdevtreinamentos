package cursojava.ApiDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        Calendar calendar = Calendar.getInstance();//*pega a data atual
//
//        System.out.println("Data em milisegundos: "+date.getTime());
//        System.out.println("Calendar em milisegundos: "+calendar.getTimeInMillis());
//
//        System.out.println("Dia do mês: "+date.getDate());
//        System.out.println("Calendar do mês: "+calendar.get(Calendar.DAY_OF_MONTH));
//
//        System.out.println("Dia da semana: "+date.getDay());
//        System.out.println("Dia da semana: "+(calendar.get(Calendar.DAY_OF_WEEK)-1));
//
//        System.out.println("hora do dia: "+date.getHours());
//        System.out.println("hora do dia: "+calendar.get(Calendar.HOUR_OF_DAY));
//
//
//        System.out.println("minuto da hora: "+date.getMinutes());
//        System.out.println("minuto da hora: "+calendar.get(Calendar.MINUTE));
//
//
//        System.out.println("segundos: "+date.getSeconds());
//        System.out.println("segundos: "+calendar.get(Calendar.SECOND));

        //* Simulando a data que vem do banco de dados.

        calendar.setTime(new SimpleDateFormat("dd/MM/yyy").parse("10/03/2021"));

        calendar.add(Calendar.DAY_OF_WEEK, 5); //*Data de hoje mais 5 dias

        System.out.println(new SimpleDateFormat("dd-MM-yyy").format(calendar.getTime()));

        calendar.add(Calendar.MONTH, 5); //*Data de hoje mais 5 MESES

        System.out.println(new SimpleDateFormat("dd-MM-yyy").format(calendar.getTime()));




        /*-------------------------------simple date format-------------------------------*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm.ss");

//
//        System.out.println("Data atual em formato padrão de String: "+simpleDateFormat.format(date));
//        System.out.println("Calendar atual: "+calendar.getInstance().getTime());
//        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
//
//        System.out.println("Data para o padrão de banco de dados: "+ simpleDateFormat.format(date));
//
//        System.out.println("Objeto date: "+simpleDateFormat.parse("1987-05-18 11:34.15"));


        /*-------------------------------- comparando datas menores e maiores -----------------------*/

        SimpleDateFormat dataSimples = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoBoleto = dataSimples.parse("25/05/2023");

        Date dataAtualHoje = dataSimples.parse("23/05/2023");

        if (dataVencimentoBoleto.after(dataAtualHoje)){
           // System.out.println("Boleto não vencido");
        }else{
          //  System.out.println("Boleto vencido");
        }

        /*-------------------------------- Dias entre datas -----------------------*/

       // Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");

       long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-05-20"), LocalDate.now());

        System.out.println("Possui "+dias+" dias entre datas");



    }
}

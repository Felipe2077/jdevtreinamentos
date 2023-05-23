package cursojava.ApiDateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJavaBoleto {
    public static void main(String[] args) throws ParseException {


       Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("10/05/2023");

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(dataInicial);

        for (int parcela = 1; parcela <= 12; parcela++){
            calendar.add(Calendar.MONTH, 1);

            System.out.println("Parcela numero: "+ parcela +" Vencimento é em: "+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }

    }
}

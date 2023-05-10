package cursojava.classes;

import javax.swing.*;

public class ArrayVetor {

    public static void main(String[] args) {

        String tamanhoArray = JOptionPane.showInputDialog("quantas notas serão cadastradas?");

        double[] array = new double[Integer.parseInt(tamanhoArray)];


        for (int i = 0; i < array.length; i++) {
            String entrada = JOptionPane.showInputDialog("Digite a nota:");
            array[i] = Double.parseDouble(entrada);

            System.out.println("Nota "+i+ ": "+entrada);
        }

        //passando varios tipos de dados (basta fazer um array de strings):
        String[] valores = new String[4];


    }
}

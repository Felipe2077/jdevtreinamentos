package cursojava.threads;

import javax.swing.*;

public class Threads {

    public static void main(String[] args) throws InterruptedException {

        //*processo paralelo para o envio de email
        new Thread() {
            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println("Enviando o email...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }.start(); // liga a thread e fica processado em paralelo


        //* Divisão das threads*****************************************************************************

        //* processo paralelo para o envio NOTA FISCAL
        new Thread() {
            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println("Enviando NOTA FISCAL...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }.start(); // liga a thread e fica processado em paralelo





        //fluxo do sistema
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }
}

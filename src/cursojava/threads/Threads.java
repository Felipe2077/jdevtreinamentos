package cursojava.threads;

import javax.swing.*;

public class Threads {

    public static void main(String[] args) throws InterruptedException {

        new Thread() {
            public void run() {

                for (int i = 0; i < 10; i++) {
                    System.out.println("Enviando o email...");
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

package cursojava.threads;

import javax.swing.*;

public class Threads {

    public static void main(String[] args) throws InterruptedException {

        //*processo paralelo para o envio de email
        Thread threadEmail = new Thread(thread1);
        threadEmail.start();

        Thread threadNF = new Thread(thread2);
        threadNF.start();


        //fluxo do sistema
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }

    private static Runnable thread1 = new Runnable() {
        @Override
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
    };

    public static Runnable thread2 = new Runnable() {
        @Override
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
    };
}

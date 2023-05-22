package cursojava.threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();


    public static void add(ObjetoFilaThread objetoFilaThread) {
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {
        System.out.println("Fila rodando");


        while (true) {

            synchronized (pilha_fila) { //bloquear o acesso a esta lista por outros processos

                Iterator iteracao = pilha_fila.iterator();
                while (iteracao.hasNext()) {
                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

                    System.out.println(processar.getEmail());
                    System.out.println(processar.getNome());

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    iteracao.remove();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

}


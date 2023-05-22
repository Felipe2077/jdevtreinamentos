package cursojava.threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{
    private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

    public static void add(ObjetoFilaThread objetoFilaThread){
        pilha_fila.add(objetoFilaThread);
    }

    @Override
    public void run() {
        Iterator iteracao = pilha_fila.iterator();

        synchronized (iteracao){ //bloquear o acesso a esta lista por outros processos
            while (iteracao.hasNext()){
                ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

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

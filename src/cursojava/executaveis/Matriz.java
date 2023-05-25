package cursojava.executaveis;

public class Matriz {

    public static void main(String[] args) {
        int notas[][] = new int[4][4];

        notas[0][0] = 80;
        notas[0][1] = 30;
        notas[0][2] = 99;
        notas[0][3] = 65;

        notas[1][0] = 66;
        notas[1][1] = 57;
        notas[1][2] = 44;
        notas[1][3] = 39;

        notas[2][0] = 97;
        notas[2][1] = 53;
        notas[2][2] = 19;
        notas[2][3] = 25;

        notas[3][0] = 90;
        notas[3][1] = 80;
        notas[3][2] = 88;
        notas[3][3] = 99;


        for (int countLinha =0; countLinha < notas.length; countLinha++){
            int linhaTemporaria = countLinha == 0 ? 0 : countLinha -1 ; // variavel temporária para armazenar o index anterior no loop, para comparação.

            //loop na coluna
            for (int countColuna =0; countColuna < notas[countLinha].length; countColuna++){

                if (countLinha == linhaTemporaria){ // Se a linha atual for igual a temporaria

                    //imprime a linha sem quebra
                    System.out.print(notas[countLinha][countColuna]+" ");

                }else{// caso a linha atual for diferente da anterior, significa que estamos em uma linha diferente

                    //quebra de linha vazia
                    System.out.println("");

                    //imprime a linha sem quebra
                    System.out.print(notas[countLinha][countColuna]+" ");

                    //atualiza a linha anterior para que fique igual a atual
                    linhaTemporaria = countLinha;
                }

            }


        }

    }
}

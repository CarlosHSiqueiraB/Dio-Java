package com.estudos;

import java.io.*;

public class ExIO_Caracter {
    public static void receberTecladoIC() throws IOException {
//        InputStream is = System.in; //Recebe do teclado
//        InputStreamReader isr = new InputStreamReader(is);//Converte pra caractere
//        BufferedReader br = new BufferedReader(isr); //Armazena em um buffer
        System.out.println("Recomende 3 filmes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); //Lê linhas

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//Fluxo de saída

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!(line.isEmpty()));
        //Descarregando o buffer
        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        receberTecladoIC();
    }
}

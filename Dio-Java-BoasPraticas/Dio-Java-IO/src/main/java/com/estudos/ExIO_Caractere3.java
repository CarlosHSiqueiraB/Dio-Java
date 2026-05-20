package com.estudos;

import java.io.*;

//Vamos fazer uma copia do arquivo de recomendações.txt, e vamos adicionar recomendações de livros
public class ExIO_Caractere3 {

    public static void copiarArquivo() throws IOException {
        File f = new File("/home/paodebatalha/Documentos/ProjetosPessoais/Dio-Java/Recomendações.txt");
        String nomeArquivo = f.getName();

        // Reader r = new FileReader(nomeArquivo);
        // BufferedReader br = new BufferedReader(r);

        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = br.readLine();

        String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("copia.txt");
        File fcopia = new File(nomeArquivoCopia);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopia.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null);
        bw.flush();
        System.out.printf("Arquivo \"%s\" copiado com Sucesso!\n", f.getName());
        System.out.printf("Arquivo \"%s\" criado com Sucesso!\n", fcopia.getName());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Recomende 3 livros: ");
        pw.flush();

        adcInfoArquivo(fcopia.getName());

        pw.printf("Ok! tudo certo!");
        pw.flush();
        br.close();
        bw.close();
        pw.close();
    }

    public static void adcInfoArquivo(String arquivo) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        String line = br.readLine();
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("fim")));
        bw.flush();

        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}

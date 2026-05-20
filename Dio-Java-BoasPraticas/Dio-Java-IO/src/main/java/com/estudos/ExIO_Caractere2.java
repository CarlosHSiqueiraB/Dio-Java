package com.estudos;

import java.io.*;
import java.util.Scanner;

public class ExIO_Caractere2 {
    public static void LerEscreverDoc() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações ed filme: ");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("Recomendações.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = scan.nextLine();
        } while (!(line.equalsIgnoreCase("fim")));
        bw.flush();
        bw.close();

        pw.printf("Arquivo \"%s\" Gerado com Sucesso!", f.getName());
        pw.close();
        scan.close();
    }

    public static void main(String[] args) throws IOException {
        LerEscreverDoc();
    }
}

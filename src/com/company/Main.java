package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // PRIMEIRA APLICAÇÃO
        Scanner ler = new Scanner(System.in); // instanciando e criando um objeto Scanner

        float n1, n2, n3, n4, media;
        System.out.println("DIGITE SUA PRIMEIRA NOTA:");
        n1 = ler.nextFloat();
        System.out.println("DIGITE SUA SEGUNDA NOTA:");
        n2 = ler.nextFloat();
        System.out.println("DIGITE SUA TERCEIRA NOTA:");
        n3 = ler.nextFloat();
        System.out.println("DIGITE SUA QUARTA NOTA:");
        n4 = ler.nextFloat();

        media = (n1 + n2 + n3 + n4)/4; // CALCULO DE NOTAS
        System.out.printf("Sua Média foi: %.2f\n", media); //EXIBINDO RESULTADO

        if (media >= 4.75)
        {
            System.out.print("VOCÊ FOI APROVADO!");
        }
        else
        {
            System.out.print("VOCÊ FOI REPROVADO, ESTUDE MAIS!");
        }
    }
}

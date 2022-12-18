import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        DecimalFormat df = new DecimalFormat("0.00");

        Scanner sc = new Scanner(System.in);

        float[] notas = {100, 50, 20, 10, 5, 2};

        float[] moedas = {1, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f};

        int[] countNotas = new int[notas.length];
        int[] countMoedas = new int[moedas.length];

        System.out.println("INFORME UM VALOR");
        Float valor = sc.nextFloat();

        while (valor <= 0 || valor > 1000000.00){
            System.out.println("DIGITE UM NÚMERO ENTRE 1 e 1000000.00!");
            valor = sc.nextFloat();
        }

        for(int i = 0; i< notas.length; i++){
            while (valor >= notas[i]){
                countNotas[i]++;
                valor -=notas[i];
            }
        }

        for(int i = 0; i< moedas.length; i++){
            while (valor >= moedas[i]){
                countMoedas[i]++;
                valor -=moedas[i];
            }
        }

        System.out.println("----------------------NOTAS--------------------------");

        for (int i=0; i<notas.length; i++) {

                System.out.println(countNotas[i]+" Notas de " + df.format(notas[i]));

        }
        System.out.println("------------------------MOEDAS----------------------");


        for (int i=0; i<notas.length; i++) {

                System.out.println(countMoedas[i]+" Moedas de "+df.format(moedas[i]));

        }

        sc.close();
    }
}
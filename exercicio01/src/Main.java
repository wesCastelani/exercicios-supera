
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- DIGITE A QUANTIDADE DE NÚMEROS QUE DESEJA ORDENAR -----");
        Integer n = sc.nextInt();

        while (n <= 0 || n > Math.pow(10, 5)){
            System.out.println("DIGITE UM NÚMERO ENTRE 1 e 100000!");
            n = sc.nextInt();
        }


        System.out.println("---- ADICIONE OS NÚMEROS NA LISTA PARA SEREM ORDERNADOS -----");
        ArrayList<Integer> num = new ArrayList<>();

        for(int i=1; i <= n; i++) {
            num.add(sc.nextInt());
        }

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                pares.add(num.get(i));
            }
            else{
                impares.add(num.get(i));
            }
        }

        pares.sort(Comparator.naturalOrder());
        impares.sort(Comparator.reverseOrder());

        ArrayList<Integer> ordenado = new ArrayList<>();

        ordenado.addAll(pares);
        ordenado.addAll(impares);


        System.out.println("---- LISTA ORDENADA: -----");
        System.out.println(ordenado);
        sc.close();
    }

}
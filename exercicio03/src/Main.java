import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite K");
        int alvo = sc.nextInt();

        System.out.println("Digite N");
        int n = sc.nextInt();

        ArrayList<Integer> valores = new ArrayList<>();


        System.out.println("Digite os valores da lista");
        for(int i = 0; i < n; i++){
            //System.out.println("Adicione valores na lista");
            valores.add(sc.nextInt());
        }

       int count = 0;


        for(int i=0; i < valores.size(); i++){
            for(int j = 1; j< valores.size(); j++){
                if(valores.get(j) > valores.get(i)) {
                    if (valores.get(j) - valores.get(i) == alvo) {
                        count = count + 1;
                    } else {
                        break;
                    }
                }else if(valores.get(i) > valores.get(j)){
                    if (valores.get(i) - valores.get(j) == alvo) {
                        count = count + 1;
                    } else {
                        break;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
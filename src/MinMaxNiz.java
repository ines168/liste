import java.util.*;

public class MinMaxNiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2.MinMaxNiz");

        List<Integer> lista = new ArrayList<>();

        int ucitanBroj = 0;

        do {
            System.out.println("Unesi cijeli broj: (ako si gotov, izađi s nulom 0)");
            ucitanBroj = sc.nextInt();
            if (ucitanBroj != 0) {
                lista.add(ucitanBroj);
            }

        } while (ucitanBroj != 0);

        //Rješenje sortiranjem niza

//        System.out.println("Ovo je lista: " + lista);
//        Collections.sort(lista);
//        System.out.println("Ovo je sortirana lista: " + lista);
//        System.out.println("Najmanji broj : " + lista.get(0));
//        System.out.println("Najveći broj : " + lista.get(lista.size()-1));

        //Rješenje dva for petljom
        int max = lista.get(0);
        int min = lista.get(0);

        for (Integer i : lista) {
            if(max<i) {
                max = i;
            }
            if(min>i) {
                min = i;
            }
        }
        System.out.println("Najmanji broj je: " + min);
        System.out.println("Najveći broj je: " + max);


        sc.close();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimjerArrayList {
    public static void main(String[] args) {
        //Napišite program koji učitava brojeve sve dok korisnik ne upiše broj -1
        System.out.println("2.ArrayList");
        Scanner sc = new Scanner(System.in);

        //ArrayList<Integer> lista = new ArrayList<>();
        List<Integer> lista = new ArrayList<>();

        int ucitanBroj = 0;

        do {
            System.out.println("Unesi broj:");
            ucitanBroj = sc.nextInt();
            if (ucitanBroj != -1) {
                lista.add(ucitanBroj);
            }

        } while (ucitanBroj != -1);

        System.out.println("Ovo je lista: " + lista);
        System.out.print("Uneseni brojevi su redom: ");
        for (Integer i : lista) {
            System.out.print(i+ " ");
        }
        sc.close();

        lista.remove(1);
        System.out.println("\nOvo je lista nakon remove: " + lista);
        System.out.print("Uneseni brojevi su nakon remove: ");
        for (Integer i : lista) {
            System.out.print(i+ " ");
        }
        System.out.println("\nLista je veličine: " + lista.size());

        //petlja for
        System.out.println("\nOvako sa petljom for: ");
        for(int i = 0; i< lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}

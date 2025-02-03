import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Euri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi iznosa za vratiti: ");
        double iznos = Double.parseDouble(sc.nextLine());

        List<Integer> novcanice = new ArrayList<>();
        novcanice.add(500);
        novcanice.add(200);
        novcanice.add(100);
        novcanice.add(50);
        novcanice.add(20);
        novcanice.add(10);
        novcanice.add(5);
        List<Double> kovanice = new ArrayList<>();
        kovanice.add(2d);
        kovanice.add(1d);
        kovanice.add(0.5);
        kovanice.add(0.2);
        kovanice.add(0.1);
        kovanice.add(0.05);
        kovanice.add(0.02);
        kovanice.add(0.01);


        //Rješenje jedan s brojačem
        for(int i = 0; i < novcanice.size(); i++) {
            int brojac = 0;
            while (iznos > novcanice.get(i)) {
                iznos -= novcanice.get(i);
                brojac++;
            }
            if (brojac != 0) {
                System.out.println(brojac + " * " + novcanice.get(i));
            }

        }
        for(int i = 0; i < kovanice.size(); i++) {
            int brojac = 0;
            while (iznos > kovanice.get(i)) {
                iznos -= kovanice.get(i);
                brojac++;
            }
            if (brojac != 0) {
                System.out.println(brojac + " * " + kovanice.get(i));
            }

        }

        //Rješenje dva množenje
//        for (Integer v : novcanice) {
//            int kolicina = (int) (iznos/v);
//            if (kolicina != 0) {
//                System.out.println(kolicina + " * " + v);
//            }
//            iznos -= kolicina * v;
//        }
//        for (Double v : kovanice) {
//            int kolicina = (int) (iznos/v);
//            if (kolicina != 0) {
//                System.out.println(kolicina + " * " + v);
//            }
//            iznos -= kolicina * v;
//        }

        sc.close();

    }
}

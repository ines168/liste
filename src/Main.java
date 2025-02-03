public class Main {
    public static void main(String[] args) {
        //Popunjavanje polja random brojevima
        System.out.println("1.Random");
        int[] polje = new int[5];
        for (int i = 0; i< polje.length; i++) {
            polje[i] = (int) ((Math.random()*5)+1);
        }
        for(int broj: polje) {
            System.out.println(broj + " ");
        }
        System.out.println();
    }
}
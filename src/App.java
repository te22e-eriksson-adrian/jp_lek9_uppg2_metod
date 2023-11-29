public class App {
    public static void main(String[] args) throws Exception {
        //A
        String svar = capitalize("b");
        System.out.println("Gemenen 'b' är "+svar+" som versal.");
        System.out.println("     ");

        //A - 2
        String svar2 = capitalize("z");
        System.out.println("Gemenen 'z' är "+svar2+" som versal.");
        System.out.println("     ");
    }
    static String capitalize(String gemen){
        String versal = gemen.toUpperCase();
        return versal;
    }
}
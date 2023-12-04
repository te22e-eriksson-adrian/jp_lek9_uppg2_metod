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

        //B
        int tal = 2;
        boolean svar3 = ärPrimtal(tal);
        System.out.println("Är "+tal+" ett primtal?: "+svar3);

        //C
        int bas = 2;
        int exponent = 3;
        int svar4 = potens(bas, exponent);
        System.out.println(bas+" upphöjt till "+exponent+" är lika med: "+svar4);
    }
    static String capitalize(String gemen){
        String versal = gemen.toUpperCase();
        return versal;
    }
    static boolean ärPrimtal(int tal){
        for (int täljare = 1; täljare<10; täljare++)
        {
            if(täljare==tal){
                continue;
            }
            double rest = tal%täljare;
            if (rest==0) {
                return false;
            }
            
        }
        return true;
    }
    static int potens(int bas, int exponent){
        int utrakningssvar = 1;
        for (int antal = 1; antal<=exponent; antal++){
            utrakningssvar = utrakningssvar*bas;
        }
        return utrakningssvar;
    }
}
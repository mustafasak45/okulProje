import java.io.IOException;
import java.util.Scanner;

public class Depo {//3 tane method olur.
    // Bunlar;
    //public static void anaMenu()
    //public static void okulBilgileriniYazdir()
    //public static void projeDurdur()

    //Burada ki  projeDurdur() Q ya da q 'ya basilinca projenin durmasi icin yazilan ozel bir method:

    // public static void projeDurdur() {
    //        System.err.println("Projeler.Okul projesinden ciktiniz");
    //        System.exit(0);//Sistemin tamamen durmasi icin kullanilir
    //    }

    //Kullanicidan tercih almak icin scanner class'indan faydalaniriz
    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException, IOException {
        System.out.println("");
        //Ana menu :menuden ana menu secilince gidilecek yer olmali.
        //Kullanicidan tercih alip ,bu tercihi do-while loop'unda switch case ile istenen yere yonlendirmeliyiz

        //           "                   =========== YILDIZ KOLEJI =============" +
        //           "                   ==============  ANA MENU ==============" +
        //           "                        1- Projeler.Okul Bilgileri Goruntule" +
        //           "                        2- Ogretmen Menu\n" +
        //           "                        3- Ogrenci Menu\n" +
        //           "                        Q- ÇIKIŞ");

        String tercih = "";
        do {
            System.out.println("");
            System.out.println(SET_BOLD_TEXT+ANSI_BLUE+"""
                    =========== YILDIZ KOLEJI =============\n"""+ANSI_RESET+SET_BOLD_TEXT+
                    """
                    ==============  ANA MENU ==============
                    1-Okul Bilgileri Goruntule
                    2- Ogretmen Menu
                    3- Ogrenci Menu
                    Q- ÇIKIŞ"""+ANSI_RESET);
            System.out.println(SET_ITALIC_TEXT+"Lutfen Menu'den tercihinizi yapiniz"+ANSI_RESET);
            tercih = scan.nextLine();
            switch (tercih) {
                case "1":
                    okulBilgileriniYazdir();
                    break;
                case "2":
                    Ogretmen.ogretmenMenu();
                    break;
                case "3":
                    Ogrenci.ogrenciMenu();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println(SET_ALTICIZILI_TEXT+"Lutfen gecerli bir tercih yapiniz"+ANSI_RESET);


            }
        } while (!tercih.equalsIgnoreCase("Q"));
        projeDurdur();


    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("");
        System.out.println(SET_ITALIC_TEXT+"""
                =========== YILDIZ KOLEJI =============
                Adres : """ + Okul.adres + """
                \nTelefon : """ + Okul.telefon+ANSI_RESET);
        Thread.sleep(3000);
    }

    public static void projeDurdur() {
        System.out.println("");
        System.err.println(SET_BOLD_TEXT+"Okul projesinden ciktiniz"+ANSI_RESET);
        System.exit(0);
    }
    public static final String SET_ITALIC_TEXT = "\033[0;3m";
    public static final String SET_ALTICIZILI_TEXT = "\033[0;4m";
    public static final String SET_BOLD_TEXT = "\033[0;1m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

}

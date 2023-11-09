import java.util.*;
/**
 * @author Marcel
 */
public class Main{
/**
 * Hlavná trieda ktorá ma za ulohu spustenie celeho programu pozostavajucich z tried a metod ktoré su v nich ale aj ktoré su v iných triedach.Na úvod sa spustí hlavné menu z ktorého si vyberieme jeden výber a nasledne nám to ukaže dalšie menu alebo si ištancia Scanner začne pýtať hodnoty
 ktoré má uložiť do zadefinovaných parametrov.
 * Výber sa nasledne ošetrí pomocou metody.
 Načítanie 
 Cyklus while ktorý sa nachádza na konci slúži na vybratie si možnosti ukončit program alebo ho začat odznova.
 System.exit(parameter)-slúži na ukončenie programu. 
    */
 public static void main(String arg[]){
   double a=0;
   double b=0;
   double c=0;
   double d=0;
   double vyska=0;
   int volba2;
   int pocetStran=1;
   Scanner klav=new Scanner(System.in);
   int podtrieda;
   int volba3;
    do{
        System.out.println("\fDobrý deň , vítam Vás v programe S.N-U. ");
        System.out.println("Tento program slúži na výpočet niektorých vlastností n-uholníkov. ");
        System.out.println();
        System.out.println("OBSAH :");
        System.out.println();
        System.out.println("[1]:Trojuholnik");
        System.out.println("[2]: Štvoruholník");
        System.out.println("[3]: N-Uholník");
        System.out.println("[0]: Koniec");

    do{
        System.out.println("Zadaj volbu : ");
        volba2=osetrenieVstupuPreInt(0,3);
    }while(volba2<0||volba2>3);
   
    switch(volba2){
        case 1:
            System.out.println("Vybrali ste si trojuholník - n=3");
            do{
                System.out.println("Zadajte stranu a: ");
                a=osetrenieVstupuPreDouble(0);
                System.out.println("Zadajte stranu b: ");
                b=osetrenieVstupuPreDouble(0);
                System.out.println("Zadajte stranu c: ");
                c=osetrenieVstupuPreDouble(0);
            }while((a<0)&&(b<0)&&(c<0));
            Trojuholnik a3=new Trojuholnik(a,b,c);
            System.out.println("\f");
            if(a3.daSaZostrojitTrojuholnik()==true){
            System.out.printf("Obvod je:                       %.2f\n",a3.obvod());
            System.out.printf("Obsah je:                       %.2f\n",a3.obsah());
            System.out.printf("Polomer Kruznice Opisanej je:   %.2f\n",a3.polomerOpisanejKruznice());
            System.out.printf("Polomer kruznice vpisanej je:   %.2f\n",a3.polomerVpisanejKruznice());
            System.out.printf("Vysky= v1:                      %.2f\n",a3.vyskaNaA());
            System.out.printf("Vysky= v2:                      %.2f\n",a3.vyskaNaB());
            System.out.printf("Vysky= v3:                      %.2f\n",a3.vyskaNaC());
            System.out.printf("Uhly=  u1:                      %.2f\n",a3.alfa());
            System.out.printf("Uhly=  u2:                      %.2f\n",a3.beta());
            System.out.printf("Uhly=  u3:                      %.2f\n",a3.gama());
        }
        break;
        case 2:
            System.out.println("\fVybrali ste si štvoruholník - n=4");
            do{
                System.out.println("OBSAH : ");
                System.out.println();
                System.out.println("[21] Štvorec");
                System.out.println("[22] Obdlžník");
                System.out.println("[23] Kosoštvorec");
                System.out.println("[24] Kosodlžník");
                System.out.println("[25] Lichobežník");
                System.out.println();
                System.out.println("Vyberte si podtriedu : ");
                podtrieda=osetrenieVstupuPreInt(21,25);
                    switch(podtrieda){

                        case 21:
                            do{
                                System.out.println("Zadajte stranu štvorca: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            Stvorec a1=new Stvorec(a);
                            System.out.printf("Obvod je:                    %.2f\n",a1.obvod());
                            System.out.printf("Obsah je:                    %.2f\n",a1.obsah());
                            System.out.printf("Uhlopriecka =                %.2f\n",a1.uhlopriecka());
                            System.out.printf("Polomer Kruznice Opisanej je:%.2f\n",a1.polomerKruzniceOpisanej());
                            System.out.printf("Polomer kruznice vpisanej je:%.2f\n",a1.polomerKruzniceVpisanej());
                            break;
                        case 22:
                            do{
                               System.out.println("Zadajte stranu a v obdlzniku : ");
                               a=osetrenieVstupuPreDouble(0);
                               System.out.println("Zadajte stranu b v obdlzniku : ");
                               b=osetrenieVstupuPreDouble(0);
                            }while((a<0)&&(b<0));
                            Obdlznik a2=new Obdlznik(a,b);
                            System.out.printf("\fObvod je:                     %.2f\n",a2.obvod());
                            System.out.printf("Obsah je:                     %.2f\n  ",a2.obsah());
                            System.out.printf("Uhlopriecka =                 %.2f\n  ",a2.uhlopriecka());
                            System.out.printf("Polomer opisanej kruznice je: %.2f\n  ",a2.polomerKruzniceOpisanej());
                            break;
                        case 23:
                            do{
                                System.out.println("Zadajte stranu kosoštvorca: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            do{
                                System.out.println("Zadajte výšku kosoštvorca: ");
                                vyska=osetrenieVstupuPreDouble(0);
                            }while(vyska<0);
                            Kosostvorec a4=new Kosostvorec(a,vyska);
                            if(vyska<=a){
                            System.out.printf("Obvod je: %.2f\n",a4.obvod());
                            System.out.printf("Obsah je: %.2f\n",a4.obsah());
                        }
                        else
                        System.out.println("Neda sa zostrojit!!!");
                            break;
                        case 24:System.out.println("24 Kosodlžník");
                            do{
                                System.out.println("Zadajte stranu a v kosodlžníku: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            do{
                                System.out.println("Zadajte stranu b v kosodlžníku: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                             do{
                                System.out.println("Zadajte výšku kosodlžníka: ");
                                vyska=osetrenieVstupuPreDouble(0);
                            }while(vyska<0);
                            Kosodlznik a5=new Kosodlznik(a,b,vyska);
                            if(vyska<=b){
                            System.out.printf("Obvod je:   %.2f\n",a5.obvod());
                            System.out.printf("Obsah je:   %.2f\n",a5.obsah());
                        }
                        else
                        System.out.println("Neda sa zostrojit!!!");
                            break;
                        case 25:System.out.println("25 Lichobežník");
                            do{
                                System.out.println("Zadajte stranu a v lichobežníku: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            do{
                                System.out.println("Zadajte stranu b v lichobežníku: ");
                                b=osetrenieVstupuPreDouble(0);
                            }while(b<0);
                            do{
                                System.out.println("Zadajte stranu b v lichobežníku: ");
                                c=osetrenieVstupuPreDouble(0);
                            }while(c<0);
                            do{
                                System.out.println("Zadajte stranu d v lichobežníku: ");
                                d=osetrenieVstupuPreDouble(0);
                            }while(d<0);
                             do{
                                System.out.println("Zadajte výšku lichobežníka: ");
                                vyska=osetrenieVstupuPreDouble(0);
                            }while(vyska<0);
                            Lichobeznik a6=new Lichobeznik(a,b,c,d,vyska);
                            System.out.printf("Obvod je:   %.2f\n",a6.obvod());
                            System.out.printf("Obsah je:   %.2f\n",a6.obsah());
                            
                            break;

                    }
                  
            }while((podtrieda>25)||(podtrieda<21));
            break;
        case 3:
                            System.out.println("Vybrali ste si n-Uholník - n>4" );
                            do{
                                System.out.println("Zadajte stranu a v n-Uholniku: ");
                                a=osetrenieVstupuPreDouble(0);
                            }while(a<0);
                            do{
                                System.out.println("Zadajte pocet stran a v n-Uholniku: ");
                                pocetStran=osetrenieVstupuPreInt(5,101);
                            }while(pocetStran<0);
                            NUholnik a7=new NUholnik(a,pocetStran);
                            System.out.printf( "Obvod je:             %.2f\n",a7.obvod());
                            System.out.printf( "Vyska je:             %.2f\n",a7.vyska());
                            System.out.printf ("Obsah je:             %.2f\n",a7.obsah());
                            System.out.printf( "Pocet uhlopriecok je: %.2f\n",a7.pocetUhlopriecok());
                            System.out.printf( "Stredový uhol je:     %.2f\n",a7.stredovyUhol());
                            System.out.printf( "Obvodový uhol je:     %.2f\n",a7.vnutornyUhol());
                                                     
            break;
       case 0: System.exit(volba2);
      break;
    }
           System.out.println();
           System.out.println("Chcete pokracovat? ");
           System.out.print("Ak ano zadajte [1] ak nie zadajte [0]: ");
           volba3=osetrenieVstupuPreInt(0,1);
           if(volba3==0)
           System.exit(volba3);
        }while(volba3!=1||volba3!=0);

}
/**
 * Metóda ktorá slúži na ošetrenie zadaneho vstupu v rozsahu cisel typu Int.Vstup načítame ako string potom to prevedieme na integer ak sa prevod nepodari alebo číslo nebude také aké ma byť vyhodí výnimku .
 * @param min Je to číslo ktoré slúži ako minimum v rosahu.
 * @param max Je to číslo ktoré slúži ako maximum v rosahu.
     * @return ošetrenie zadaneho vstupu v rozsahu cisel typu Int
 */
public static int osetrenieVstupuPreInt(int min,int max){
 boolean vstupOK = false;
 java.util.Scanner klav = new java.util.Scanner(System.in);
 int volba=0;
 
      while ( ! vstupOK )
      {
          try {
      
              String vstupStr = klav.nextLine();      // nacitanie retazca
              volba = Integer.parseInt(vstupStr);      // pokus o konverziu
              if (volba<min || volba>max)
                     throw new java.util.InputMismatchException("Vstup mimo povoleny rozsah");
                                            //vyhodi vlastnu vynimku
              vstupOK = true;               // ak sa vsetko podarilo
             } 
          catch (java.lang.NumberFormatException  ex ) //chyba pri konverzii
              { 
              System.out.println("Zle zadane cele cislo - zadajte znova" );  
              }
          catch (java.util.InputMismatchException  ex ) //zachytenie vlastnej 
                                                        //vyhodenej vynimky
              { 
              System.out.println("Chyba: "+ex.getMessage()
                                 +" - zadajte znova" );//oznam o vzniku chyby
              }
      }
      return volba;
}
/**
 * Metóda ktorá slúži na ošetrenie zadaneho vstupu v rozsahu cisel typu Double.Vstup načítame ako string potom to prevedieme na double ak sa prevod nepodari alebo číslo nebude také aké ma byť vyhodí výnimku .
 * @param min Je to číslo ktoré slúži ako minimum v rosahu.
     * @return ošetrenie zadaneho vstupu v rozsahu cisel typu Double
 */
public static double osetrenieVstupuPreDouble(double min){
 boolean vstupOK = false;
 java.util.Scanner klav = new java.util.Scanner(System.in);
 double volba=0;
 
      while ( ! vstupOK )
      {
          try {
      
              String vstupStr = klav.nextLine();      // @nacitanie retazca
              volba = Double.parseDouble(vstupStr);      //@pokus o konverziu
              if (volba<min)
                     throw new java.util.InputMismatchException("Vstup mimo povoleny rozsah");
                                            //@vyhodi vlastnu vynimku
              vstupOK = true;               //@ ak sa vsetko podarilo
             } 
          catch (java.lang.NumberFormatException  ex ) //chyba pri konverzii
              { 
              System.out.println("Zle zadane cele cislo - zadajte znova" );  
              }
          catch (java.util.InputMismatchException  ex ) //zachytenie vlastnej 
                                                        //vyhodenej vynimky
              { 
              System.out.println("Chyba: "+ex.getMessage()
                                 +" - zadajte znova" );//oznam o vzniku chyby
              }
      }
      return volba;
}
}
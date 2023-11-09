/**
 * @author Marcel
 */
public class Trojuholnik{
/**
 * @param a Strana a v trojuholníku.
 * @param b Strana b v trojuholníku.
 * @param c Strana c v trojuholníku.
 */ 
 private double a;
  private double b;
  private double c;
  private double gamaa;
 /**
 * Vytvori trojuholnik o stranach a b a c.
 * @param a Strana a v trojuholníku.
 * @param b Strana b v trojuholníku.
 * @param c Strana c v trojuholníku.
 */
 public Trojuholnik(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
        
        
 }
 /**
 * Zisti ci sa da zostrojit trojuholnik 
 * pomocou matematickych vzorcov.
     * @return ci sa da zostrojit
 */ 
 public boolean daSaZostrojitTrojuholnik(){
   if ((this.a+this.b)>this.c &(this.b+this.c)>this.a&(this.a+this.c)>this.b){
        System.out.println("Trojuholnik zo stranami a="+a+", b="+b+" a c="+c+" sa da zostrojit.");
        return true;
    }
        else{
                System.out.println("Trojuholnik zo stranami a="+a+", b="+b+" a c="+c+" sa neda zostrojit.");
        return false;
        }

    }
 /**
 * Zisti obvod trojuholnika.
 * 
     * @return obvod trojuholnika
 */
 public double obvod(){
    return a+b+c;
 }  
 /**
 * Zisti obsah trojuholnika.
 * 
     * @return obsah trojuholnika
 */
 public double obsah(){
   double s,o=0;
   s=(this.a+this.b+this.c)/2;
   o=Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
   return o;
 }
 /**
 * Zisti uhol alfa.
     * @return uhol alfa
 */
 public double alfa(){
   double alfaa;
   alfaa=Math.acos(((b*b)+(c*c)-(a*a))/(2*b*c));
   return (alfaa*180)/Math.PI;
 }
 /**
 * Zisti uhol beta.
     * @return uhol beta
 */
 public double beta(){
   double betaa;
   betaa=Math.acos(((a*a)+(c*c)-(b*b))/(2*a*c));
   return (betaa*180)/Math.PI;
 }
 /**
 * Zisti uhol gama.
     * @return uhol gama
 */
 public double gama(){
   double gamaa;
   gamaa=Math.acos(((a*a)+(b*b)-(c*c))/(2*a*b));
   return (gamaa*180)/Math.PI;
 }
 /**
 * Zisti vysku na stranu C.
     * @return vyska na stranu C
 */
 public double vyskaNaC(){
   double vyska;
   vyska=b*(Math.sin(c/b));
   return vyska;
 }
 /**
  * Zisti vysku na stranu B.
     * @return vyska na stranu B
  */
 public double vyskaNaB(){

   return a*(Math.sin(b/c));
 }
 /**
  * Zisti vysku na stranu A.
     * @return vyska na stranu A
  */
 public double vyskaNaA(){

   return b*(Math.sin(a/c));
 }
 /**
  * Zisti polomer vpisanej Kruznice.
     * @return polomer vpisanej Kruznice
  */
 public double polomerVpisanejKruznice(){
   double p,s;
   s=(this.a+this.b+this.c)/2;
   p=Math.sqrt(s*(s-a)*(s-b)*(s-c));
   return p/s;
 }
 /**
  * Zisti polomer opisanej  Kruznice.
     * @return polomer opisanej  Kruznice
  */
 public double polomerOpisanejKruznice(){
    return a/(2*(a/c));
 }
}
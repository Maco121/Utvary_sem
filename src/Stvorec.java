/**
 * @author Marcel
 */
public class Stvorec{
  private double stranaA;
 /**
 * Konštruktor s parametrom ktorý označuje stranu a na štvorci.
 * @param a Zadaná strana a.
 */
 public Stvorec(double a){
   this.stranaA=a;
 }
 /**Konstruktor bez parametra ktorý je nastavení na hodnotu strany 5
  * 
  */
 public Stvorec(){
   this(5);
 }
 /**
  * Metóda ktorá zistí obsah štvorca.
     * @return obsah štvorca
  */
 public double obsah(){
  return stranaA*stranaA;
 }
 /**
  * Metóda ktorá zistí obvod štvorca.
     * @return obvod štvorca
  */
 public double obvod(){
   return 4*stranaA;
 }
 /**
  * Metóda ktorá zistí dĺžku uhlopriečky. 
     * @return dĺžka uhlopriečky
  */
 public double uhlopriecka(){
   return stranaA*Math.sqrt(2);
 }
 /**
  * Metóda ktorá zistí polomer opísanej kružnice.
     * @return polomer opísanej kružnice
  */
 public double polomerKruzniceOpisanej(){
   return (stranaA/2)*Math.sqrt(2);
 }
 /**
  * Metóda ktorá zistí polomer vpísanej kružnice
     * @return polomer vpísanej kružnice
  */
 public double polomerKruzniceVpisanej(){
   return stranaA/2;
 }
}
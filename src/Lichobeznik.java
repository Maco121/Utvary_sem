/**
 * @author Marcel
 */
public class Lichobeznik{
 /**
  * @param a Zadaná strana a.
  * @param b Zadaná strana b.
  * @param c Zadaná strana c.
  * @param d Zadaná strana d.
  * @param vyska Zadaná vyska.
  */  
private double a=0;
  private double b=0;
  private double c=0;
  private double d=0;
  private double vyska=0;
 /**
  * Konštruktor s parametrom ktorý označuje stranu a stranu b stranu c stranu d  a výšku v lichobežníku.
  * @param a Zadaná strana a.
  * @param b Zadaná strana b.
  * @param c Zadaná strana c.
  * @param d Zadaná strana d.
  * @param vyska Zadaná vyska.
  */
 public Lichobeznik(double a,double b,double c,double d,double vyska){
   this.a=a;
   this.b=b;
   this.c=c;
   this.d=d;
   this.vyska=vyska;
 }
 /**
  * Metóda ktorá zistí obsah lichobežníka.
     * @return obsah lichobežníka
  */
 public double obsah(){
  return ((a+c)/2)*vyska;
 }
 /**
  * Metóda ktorá zistí obvod lichobežníka.
     * @return obvod lichobežníka
  */
 public double obvod(){
  return a+b+c+d;
 }
}
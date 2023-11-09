
/**
 * @author Marcel
 */
public class Kosostvorec{
/**
 * @param a Zadaná strana a.
 * @param vyska Zadaná výška.
 */  
private double a;
  private double vyska;
 /**
 * Konštruktor s parametrom ktorý označuje stranu a v Kosoštvorci.
 * @param a Zadaná strana a.
 * @param vyska Zadaná výška.
 */
  public Kosostvorec(double a,double vyska){
   this.a=a;
   this.vyska=vyska;
 }
  /**
  * Metóda ktorá zistí obvod kosoštvorca.
     * @return obvod kosoštvorca
  */
 public double obvod(){
   return 4*a;
 }
  /**
  * Metóda ktorá zistí obsah kosoštvorca.
     * @return obvod kosoštvorca
  */
 public double obsah(){
   return a*vyska;
 }
}

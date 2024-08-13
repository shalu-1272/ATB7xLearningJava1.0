package ex_08042024.accessmodifiers.police;

public class Cop {
 public int gun;
 public String idCard;

 public Cop(int gun)
 {
     this.gun = gun;
 }
 protected void canIShoot()   //protected allows in the same package not other package
 {
     System.out.println("Shoot");
 }
}

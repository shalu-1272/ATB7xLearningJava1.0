package ex_08042024.accessmodifiers.criminal;

import ex_08042024.accessmodifiers.police.Cop;

public class thief {
    public static void main(String[] args) {
        Cop c = new Cop(50);
        System.out.println(c.gun);
      //  c.canIShoot(); this method is now private

    }
}

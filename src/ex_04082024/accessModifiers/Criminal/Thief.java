package ex_04082024.accessModifiers.Criminal;

import ex_04082024.accessModifiers.police.Cop;

public class Thief {

    public static void main(String[] args) {

        Cop c = new Cop(100);
        System.out.println(c.gun);
       //   c.canIShoot();
    }
}

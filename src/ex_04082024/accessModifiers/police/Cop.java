package ex_04082024.accessModifiers.police;

public class Cop {

    public  int gun;
    public String idCard;

    public Cop(int gun){
        this.gun=gun;

    }
    private void canIShoot() {
        System.out.println("Yes,You can!!");
    }
}

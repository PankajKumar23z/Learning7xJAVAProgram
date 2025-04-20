package ex_04082024.multilevelinheritence;

public class Lab174 {

    public static void main(String[] args) {
        // Multi Level
        // GF -> F -> Child
        Child c1 = new Child();
        c1.home(); // If name is same CHILD -> Father -> GrandFather
        c1.c();
        c1.gf();
        c1.f();
    }
}

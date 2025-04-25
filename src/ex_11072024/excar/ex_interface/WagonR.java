package ex_11072024.excar.ex_interface;

public class WagonR implements Engine {

    void drive(){
        startEngine();
        stopEngine();
    }


    @Override
    public void startEngine() {
        System.out.println("Wagon R is Starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Wagon R is Stopping");



    }
}

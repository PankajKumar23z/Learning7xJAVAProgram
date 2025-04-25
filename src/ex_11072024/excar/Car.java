package ex_11072024.excar;

abstract class Car extends Engine {


    // Engine
    // GearBox
    // Keys

    // Tesla is A Car
    // Tesla - DRIVE()


    @Override
    void start() {
        System.out.println("Start a Car");

    }

    @Override
    void stop() {
        System.out.println("Stop a Car");

    }

    @Override
    void speed() {
        System.out.println("Car");

    }

    @Override
    void partGearBox() {
        System.out.println("Part of Gearbox");

    }

    @Override
    void openCar() {
        System.out.println("Open Car with keys");

    }
}


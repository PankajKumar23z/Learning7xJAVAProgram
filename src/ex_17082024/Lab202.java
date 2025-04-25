package ex_17082024;

public class Lab202 {

    public static void main(String[] args) {

        car c = new car("Lambo");
        c.drive();

        // to access the inner class Object creation.
        car.GearBox cg = c.new GearBox();
        cg.m2();

    }


}

    class car{
        private String make;

        public car(String make) {
            this.make = make;
        }

        // Method
        void drive(){
            System.out.println("You can dirver car ");
        }

        class GearBox {
            void m2() {
                System.out.println("m2");
            }

            class NutBolts{

            }
        }
    }


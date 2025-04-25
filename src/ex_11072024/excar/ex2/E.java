package ex_11072024.excar.ex2;

public interface E {

    void startengine();
    void stopengine();

    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2(); // Incomplete methods
    void m3();// Incomplete  methods

    //   void m4(){
//       System.out.println("Not possible");
//   }
}





package ex_11072024.excar.ex_interface;

public class Lab191 {

    public static void main(String[] args) {

        // I i = new I();
    }
}

// IQ***

interface I{}
class  A{} // Concrete class
class B{}
abstract class C{}
class Test1 extends A{} // ok - yes
class Test2 extends B{} // ok - yes
//class Test3 extends A,B{} // ok - not ok multiple inheritence
class Test0 implements I{} // possible ? - yes
interface I1{ }  //possible ? - yes
interface I2{} //possible ? - yes
class Test4 implements I1,I2{} // Possible -yes Multiple Inheritence with interface(by using interfacesonly
class Test5 extends A implements I1,I2{}//Possible - yes we can extend one class and get everything from I1,I2
//class Test6 implements I1 extends A{} // Not possible - Extend should come first
// interface I3 extends A{} // Not Possible - Interface cannot extend any thing
// interface I4 implements A{} // Not Possible - As A is a concrete class
// interface I5 extends A,B{} // Not Possible
   interface I6 extends I1,I2{} // Possible - Interface can extend another interfaces but not class
//   interface I7 extends C{} // Not Possible - Interface cannot extend class but only extend interfaces











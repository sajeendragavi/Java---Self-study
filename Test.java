public class Test



/*
//while /do while
public class Test{
    public static void main(String args []) {
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);

        }

    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }
    }

*/
        /*int count = 6;
        /*
            while(count != 6){
                System.out.println("Count value is " + count);
                count++;
            }

            for(int i = 6; i!=6; i++){
                System.out.println("Count value is "+ count);
            }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count ++;
        } while(count != 6);
*/


    }





/*//find prime numbers
public class Test{
    public static void main(String args []){
        int count = 0;
        for(int i =10; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number" + i + "is a prime number");
                if(count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }

            }

        }

    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;

    }

}

*/

/*
//switch statement
public class Test{
    public static void main(String args []){
        int value = 3;
        if(value == 1) {
            System.out.println("value was 1 ");
        }else if (value == 2){
            System.out.println("value was 2");
        }else {
            System.out.println("was not  1 or 2");
        }

        int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("vale was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
                System.out.println("was not 1 or 2");
                break;
        }

        char charValue = 'G';
        switch(charValue){
            case 'A':
                System.out.println("A was not found");
                break;
            case 'B':
                System.out.println("B was not found");
                break;
            case 'C' : case 'D': case 'E':
                System.out.println(charValue + "was found");
                break;
            default:
                System.out.println("Could not find A, B, C ,D or E");
                break;

        }


    }

}

*/




/*

interface I{
    public abstract void m();
    public static final int x = 10;
}

class A implements I{
    public void m(){
        System.out.println("m method");
    }
}
*/
/*
//abstraction
abstract class A{
    abstract void m();
}

abstract class B extends A{
    void m(){
        System.out.println("m method");
    }
}

class C extends B{

}

class Test {
    public static void main(String args []){
        //A a = new A();
        B b = new C();
    }

}

*/


/*=
//method overloading
class A{
    void m(){
        System.out.println("A class m method");
    }
}

class B{
    void m(int x){
        System.out.println("B class m method");
    }
}

public class Test{
    public static void main(String args []){
        A a = new A();
        B b = new B();
        a.m();
        b.m(2);

    }

}
*/

/*
class Animal{
    void run(){
        System.out.println("Animal run");

    }
}

class Dog extends Animal{
    void run(){
        System.out.println("Dog run");
    }
}

class Cat extends Animal{
    void run(){
        System.out.println("Cat run");
    }
}

class Lion extends Animal{
    void run(){
        System.out.println("Lion run");
    }
}

class Test{
    public static void main(String args []){
        Animal a = new Dog();
        Animal b = new Cat();
        Animal c = new Lion();

        a.run();
        b.run();
        c.run();
    }
}
*/


/*
//overriding example
class Parent{
    int height = 120;
    void sing(){
        System.out.println("Parent sing");
    }
}

class Child extends Parent{
    void sing(){
        System.out.println("Child sing");
    }
    void jump(){
        System.out.println("child jump");
    }

}

class Test{
    public static void main(String args[]){
        Parent a = new Parent();
        a.sing();
        System.out.println(a.height);
        Child c = new Child();
        c.sing();
        System.out.println(c.height);
        Parent d = new Child();
        d.sing();
        System.out.println(d.height);
        c.jump();
    }
}
*/



/*
//inheritance OOP concepts
class Parent{
    int height = 120;
    void sing(){
        System.out.println("classical");
    }
}

class Child extends Parent{

}

class Test{
    public static void main(String args []){
        Parent a = new Parent();
        a.sing();
        System.out.println(a.height);
        Child c = new Child();
        c.sing();
        System.out.println(c.height);

    }
}
*/


/*class Test {
    public static void main(String args []){
        for(int x=0; x<4; x++){
            for(int y = 3; x<y ; y--){
                System.out.println(" ");

            }
            for(int z=0; x>=z; z++){
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }


}

*/


/*class Test{
    public static void main(String args []){
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
}
*/

/*class Test {
    public static void main(String args[]){
        System.out.println("Hello ");
        int myFirstNumber = (10 + 5) + (4 * 5);
        System.out.println(myFirstNumber);
    }
}
*/
package c322.Homeworks.homework1;

//import jdk.incubator.vector.VectorOperators;

public abstract class Duck {
    public abstract void display();
    public abstract void flying();
    public void swim(){
            System.out.println("The duck is swimming!");
    }
    public void quack(){
        System.out.println("Quack");
    }
}
class Mallard extends Duck{
    public void display(){
        System.out.println("The duck is Mallard");
    }
    public void flying(){
        System.out.println("Mallard ducks can fly");
    }
}
class Redhead extends Duck{
    public void display(){
        System.out.println("The duck is Redhead");
    }
    public void flying(){
            System.out.println("Redhead ducks can fly");
    }
}
class Alabio extends Duck{
    public void display(){
        System.out.println("The duck is Alabio");
    }
    public void flying(){
        System.out.println("Alabio ducks can fly");
    }
}
class Domestic extends Duck{
    public void display(){
        System.out.println("The duck is Domestic");
    }
    public void flying(){
        System.out.println("Domestic ducks does not have the ability to fly");
    }
}
class Canvasback extends Duck{
    public void display(){
            System.out.println("The duck is Canvasback");
    }
    public void flying(){
            System.out.println("Canvasback ducks can fly");
    }
}
class Whistling extends Duck{
    public void quack(){
            System.out.println("Whistling ducks does not quack");
    }
    public void display(){
            System.out.println("The duck is Whistling");
    }
    public void flying(){
            System.out.println("Whistling ducks can fly");
    }
}
class RubberDucks extends Duck{
    public void quack(){
            System.out.println("Rubber ducks does not quack");
    }
    public void display(){
            System.out.println("It is a Rubber Duck");
    }
    public void flying(){
            System.out.println("Rubber ducks does not fly");
    }
}
class DecoyDuck extends Duck{
    public void quack(){
            System.out.println("Decoy Ducks does not quack");
    }
    public void display(){
            System.out.println("The duck is a Decoy");
    }
    public void flying(){
            System.out.println("Decoy ducks does not fly");
    }
}
class test{
    public static void main(String[] args) {
        Mallard x = new Mallard();
        x.quack();
        x.display();
        x.swim();
        x.flying();

        System.out.println();

        Redhead z = new Redhead();
        z.quack();
        z.display();
        z.swim();
        z.flying();

        System.out.println();

        Alabio y = new Alabio();
        y.quack();
        y.display();
        y.swim();
        y.flying();

        System.out.println();

        Domestic c = new Domestic();
        c.quack();
        c.display();
        c.swim();
        c.flying();

        System.out.println();

        Canvasback s = new Canvasback();
        s.quack();
        s.display();
        s.swim();
        s.flying();

        System.out.println();

        Whistling a = new Whistling();
        a.display();
        a.swim();
        a.quack();
        a.flying();

        System.out.println();

        RubberDucks w = new RubberDucks();
        w.display();
        w.swim();
        w.quack();
        w.flying();

        System.out.println();

        DecoyDuck m = new DecoyDuck();
        m.display();
        m.quack();
        m.swim();
        m.flying();

        System.out.println("    :)");
    }
}
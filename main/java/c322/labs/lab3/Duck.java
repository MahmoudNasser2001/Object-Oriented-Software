package c322.labs.lab3;

import c322.labs.Homework.homework1.*;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public Duck() {
    }
    public void setFlyBehavior(FlyBehavior FlyB) {
        flyBehavior = FlyB;
    }
    public void setQuackBehavior(QuackBehavior QuackB) {
        quackBehavior = QuackB;
    }
    abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        System.out.println("All ducks swim");
    }
}
interface FlyBehavior {
    public void fly();
}
class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I can fly");
    }
}
class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I do not have the ability to fly");
    }
}
interface QuackBehavior {
    public void quack();
}
class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("MUTE....");
    }
}
class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("It is a Mallard duck");
    }
}
class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("It is a Red Headed duck");
    }
}
class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("It is a decoy duck");
    }
}
class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = () -> System.out.println("Squeak");
    }
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    public void display() {
        System.out.println("It is a rubber Duck");
    }
}
class test{
    public static void main(String[] args) {
        MallardDuck M = new MallardDuck();
        M.quackBehavior.quack();
        M.swim();
        M.performFly();
        M.display();
        M.performQuack();
    }
}
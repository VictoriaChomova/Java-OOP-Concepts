package Ex3;

import Ex1.Animal;

public class Human extends Monkey implements Animals {

    public Human () {

    }

    @Override
    public void jump() {
        System.out.println ("Human jumps on two feet");
    }

    @Override
    public void bite() {
        System.out.println ("Human doesn't bite");
    }

    @Override
    public void eat() {
        System.out.println ("Human eats meet and plants");
    }

    @Override
    public void sleep() {
        System.out.println ("Human sleeps at night");
    }
}

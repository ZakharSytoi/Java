package org.example.Strategy.DuckApp.behaviour;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("That duck does not fly(");
    }
}

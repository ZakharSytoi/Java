package org.example.Strategy.DuckApp.behaviour;

public class SimpleFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying..................");
    }
}

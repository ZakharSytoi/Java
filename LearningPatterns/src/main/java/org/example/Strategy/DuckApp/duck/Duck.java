package org.example.Strategy.DuckApp.duck;


import org.example.Strategy.DuckApp.behaviour.FlyBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    /*Different kinds of ducks can fly differently, so it is useful to extract the way
    * they fly in separated specialized classes with one interface above them
    * this way we can have multiple kinds of ducks with no need to implement
    * same things in ducks with same behaviour and also we can easily add new kinds of
    * behaviour*/
    public void fly(){
        flyBehaviour.fly();
    }
}

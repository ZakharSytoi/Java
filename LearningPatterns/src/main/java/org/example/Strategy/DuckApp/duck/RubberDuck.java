package org.example.Strategy.DuckApp.duck;

import org.example.Strategy.DuckApp.behaviour.NoFly;

public class RubberDuck extends Duck{
    RubberDuck(){
        flyBehaviour = new NoFly();
    }
    /*
    * also we can change the way each particular duck flies with Setters*/
}

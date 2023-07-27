package org.example.Strategy.DuckApp.duck;

import org.example.Strategy.DuckApp.behaviour.SimpleFly;

public class SimpleDuck extends Duck{
    SimpleDuck(){
        flyBehaviour = new SimpleFly();
    }
}

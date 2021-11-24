package com.company;

public class RabbitAndTurtle {

    public static void main(String[] args) {
        AnimalThread turtle = (new AnimalThread("черепаха", 10));
        AnimalThread rabbit = (new AnimalThread(" кролик ", 1));
        turtle.start();
        rabbit.start();
    }
}



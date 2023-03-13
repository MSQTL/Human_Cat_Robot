package org.example;

import Ex1.*;
import Ex2.*;

public class Main {

    public static void main(String[] args) {
        ex3();
    }
    public static void ex3(){

        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();
        Competitor[] competitors = new Competitor[]{human, cat, robot};


        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        Exercise[] exercises = new Exercise[]{wall, treadmill, wall};

        for(int i = 0; i < exercises.length; i++){
            System.out.println("Упражнение №" + (i + 1));
            for(int j = 0; j < competitors.length; j++){
                competitors[j].doExercise(exercises[i]);
            }
        }
    }


//    public static void ex2(){
//        Human human = new Human();
//        Cat cat = new Cat();
//        Robot robot = new Robot();
//
//        Treadmill treadmill = new Treadmill();
//        Wall wall = new Wall();
//
//        treadmill.doExercise(human);
//        treadmill.doExercise(cat);
//        treadmill.doExercise(robot);
//
//        wall.doExercise(human);
//        wall.doExercise(cat);
//        wall.doExercise(robot);
//    }
    public static void ex1(){
        Human human = new Human();
        human.run();
        human.jump();

        Cat cat = new Cat();
        cat.run();
        cat.jump();

        Robot robot = new Robot();
        robot.run();
        robot.jump();
    }
}















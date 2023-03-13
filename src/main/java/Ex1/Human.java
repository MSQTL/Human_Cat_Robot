package Ex1;

import Ex2.Exercise;

import java.util.Objects;

public class Human implements Competitor{

    public void run(){
        System.out.println("Человек бежит...");
    }
    public void jump(){
        System.out.println("Человек прыгает...");
    }

    @Override
    public void doExercise(Exercise exercise) {
        if (Objects.equals(exercise.getValue(), 2)){
            jump();
            System.out.println("Человек прыгнул\n");
        }
        else {
            run();
            System.out.println("Человек пробежал\n");
        }
    }
}

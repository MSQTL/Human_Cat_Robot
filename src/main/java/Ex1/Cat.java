package Ex1;

import Ex2.Exercise;

import java.util.Objects;

public class Cat implements Competitor{

    public void run(){
        System.out.println("Кот бежит...");
    }
    public void jump(){
        System.out.println("Кот прыгает...");
    }

    @Override
    public void doExercise(Exercise exercise) {
        if (Objects.equals(exercise.getValue(), 2)){
            jump();
            System.out.println("Кот прыгнул\n");
        }
        else {
            run();
            System.out.println("Кот пробежал\n");
        }
    }
}



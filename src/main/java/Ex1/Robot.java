package Ex1;

import Ex2.Exercise;

import java.util.Objects;

public class Robot implements Competitor{

    public void run(){
        System.out.println("Робот бежит...");
    }
    public void jump(){
        System.out.println("Робот прыгает...");
    }

    @Override
    public void doExercise(Exercise exercise) {
        if (Objects.equals(exercise.getValue(), 2)){
            jump();
            System.out.println("Робот не смог прыгнуть\n");
        }
        else {
            run();
            System.out.println("Робот не смог пробежать\n");
        }
    }
}

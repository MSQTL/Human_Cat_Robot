package Ex1;

import Ex2.Exercise;

import java.util.Objects;

public class Human implements Competitor{

    boolean isInGame = true;
    int maxRun;
    int maxJump;
    public Human(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public void run(){
        System.out.println("Человек бежит...");
    }
    public void jump(){
        System.out.println("Человек прыгает...");
    }

    @Override
    public void doExercise(Exercise exercise) {
        if(isInGame) {
            if (Objects.equals(exercise.getValue(), 2)) {
                jump();
                if (maxJump < exercise.getLength()) {
                    System.out.println("Человек не смог прыгнуть\nЧеловек выбыл\n");
                    isInGame = false;
                } else {
                    System.out.println("Человек прыгнул\n");
                }

            } else {
                run();
                if (maxRun < exercise.getLength()) {
                    System.out.println("Человек не смог пробежать\nЧеловек выбыл");
                    isInGame = false;
                } else {
                    System.out.println("Человек пробежал\n");
                }
            }
        }
    }
}


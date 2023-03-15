package Ex1;

import Ex2.Exercise;

import java.util.Objects;

public class Robot implements Competitor{

    boolean isInGame = true;
    int maxRun;
    int maxJump;
    public Robot(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public void run(){
        System.out.println("Робот бежит...");
    }
    public void jump(){
        System.out.println("Робот прыгает...");
    }

    @Override
    public void doExercise(Exercise exercise) {
        if(isInGame) {
            if (Objects.equals(exercise.getValue(), 2)) {
                jump();
                if (maxJump < exercise.getLength()) {
                    System.out.println("Робот не смог прыгнуть\nРобот выбыл\n");
                    isInGame = false;
                } else {
                    System.out.println("Робот прыгнул\n");
                }

            } else {
                run();
                if (maxRun < exercise.getLength()) {
                    System.out.println("Робот не смог пробежать\nРобот выбыл\n");
                    isInGame = false;
                } else {
                    System.out.println("Робот пробежал\n");
                }
            }
        }
    }
}

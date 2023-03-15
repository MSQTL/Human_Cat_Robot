package Ex1;

import Ex2.Exercise;

import java.util.Objects;

public class Cat implements Competitor{

    boolean isInGame = true;
    int maxRun;
    int maxJump;
    public Cat(int maxRun, int maxJump){
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public void run(){
        System.out.println("Кот бежит...");
    }
    public void jump(){
        System.out.println("Кот прыгает...");
    }

    @Override
    public void doExercise(Exercise exercise) {
        if(isInGame) {
            if (Objects.equals(exercise.getValue(), 2)) {
                jump();
                if (maxJump < exercise.getLength()) {
                    System.out.println("Кот не смог прыгнуть\nКот выбыл\n");
                    isInGame = false;
                } else {
                    System.out.println("Кот прыгнул\n");
                }

            } else {
                run();
                if (maxRun < exercise.getLength()) {
                    System.out.println("Кот не смог пробежать\nКот выбыл\n");
                    isInGame = false;
                } else {
                    System.out.println("Кот пробежал\n");
                }
            }
        }
    }
}



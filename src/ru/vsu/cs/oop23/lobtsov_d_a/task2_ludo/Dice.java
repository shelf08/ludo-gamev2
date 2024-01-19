package ru.vsu.cs.oop23.lobtsov_d_a.task2_ludo;

import java.util.Random;

class Dice {

//    int roll() {
//        return new Random().nextInt(6) + 1;
//    }

    public int DiceNum(){
        int min = 1;
        int max = 6;
        int rnd = rnd(min,max);
        return rnd;
    }
    public int rnd(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
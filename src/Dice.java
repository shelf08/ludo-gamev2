import java.util.Random;

class Dice {

    public int DiceNum(){
        int min = 1;
        int max = 6;
        int rnd = rnd(min,max);
        return rnd;
    }
    public static int rnd(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
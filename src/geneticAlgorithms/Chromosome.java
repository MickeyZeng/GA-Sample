package geneticAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Chromosome {
    double fitness = 0.0;

    ArrayList<ArrayList<Integer>> chromosome = new ArrayList<ArrayList<Integer>>();

    public Chromosome(){
        randomCreate();
    }

    public void randomCreate(){
        Random randomInt = new Random();

        for (int i = 0; i < 27; i++) {
            chromosome.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{randomInt.nextInt(256), randomInt.nextInt(256), randomInt.nextInt(256)})));
        }
    }

    public double getFitness(){
        //这里要插入你计算电量的函数呀宝贝
        fitness = 0.0;
        return fitness ;
    }

    public void output(String message){
        System.out.println(message + fitness);
    }


    public ArrayList<ArrayList<Integer>> getChromosome() {
        return chromosome;
    }

    public void setChromosome(ArrayList<ArrayList<Integer>> chromosome) {
        this.chromosome = chromosome;
    }
}

package hillClimber;

import geneticAlgorithms.Chromosome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HillClimber {
    public static Chromosome run(Chromosome instance){
        ArrayList<ArrayList<Integer>> RGB = instance.getChromosome();
        ArrayList<ArrayList<Integer>> rgb = new ArrayList<ArrayList<Integer>>();

        Random ran = new Random();

        int changepoint = ran.nextInt(27);
        for(int i = 0; i < RGB.size(); i++){
            if(i == changepoint){
                rgb.add(new ArrayList<Integer> (Arrays.asList(new Integer[]{ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)})));
                continue;
            }
            rgb.add(RGB.get(i));
        }

        double before = instance.getFitness();
        instance.setChromosome(rgb);
        double after = instance.getFitness();
        if(before > after){
            instance.setChromosome(RGB);
        }
        return instance;

    }
}

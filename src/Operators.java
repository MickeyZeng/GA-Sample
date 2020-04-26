import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Operators {
    public static Chromosome[] selection(Population population){
        /**
         *
         * 我先随便选两个
         *
         * */
        Random random = new Random();
        Chromosome[] parents = new Chromosome[2];

        parents[0] = population.get(random.nextInt(population.size() - 1));
        parents[1] = population.get(random.nextInt(population.size() - 1));

        return parents;
    }

    public static Chromosome crossover(Chromosome[] parents){
        Random random = new Random();
        int point = random.nextInt(28);
        Chromosome child = new Chromosome();
        ArrayList<ArrayList<Integer>> rgb = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < parents[0].getChromosome().size(); i++) {
            if(i < point){
                rgb.add(parents[0].getChromosome().get(i));
            }else{
                rgb.add(parents[1].getChromosome().get(i));
            }
        }
        child.setChromosome(rgb);
        return child;
    }

    public static Chromosome mutation(Chromosome chromosome){
        Random random = new Random();
        int position = random.nextInt(28);
        ArrayList<ArrayList<Integer>> rgb = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < chromosome.getChromosome().size(); i++) {
            if(i == position){
                rgb.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{random.nextInt(256), random.nextInt(256), random.nextInt(256)})));
            }else{
                rgb.add(chromosome.getChromosome().get(i));
            }
        }
        chromosome.setChromosome(rgb);
        return chromosome;
    }

    public static Chromosome getBest(Population population){
        Chromosome best = population.get(0);
        double bestFitness = 0.0; //计算暂时最好的是多少
        /**
         * 计算best的fitness
         * */
        for (int i = 1; i < population.size(); i++) {
            double tempFitness = 0.0; //这里需要变成计算tempFitness的公式
            if(tempFitness > bestFitness){
                bestFitness = tempFitness;
                best = population.get(i);
            }
        }
        return best;
    }
}

package geneticAlgorithms;

public class GA {

    public static Chromosome run(int times, int size){
        Population p = new Population(size);
        p.create();

        for (int i = 0; i < times; i++) {
            Population newPopulation = new Population(size);
            while(!newPopulation.isFull()){
                //1step Select
                Chromosome[] parents = Operators.selection(p);
                //2step Crossover
                Chromosome child = Operators.crossover(parents);
                //3step Mutation
                child = Operators.mutation(child);
                //判断先判断耗电量 再判断欧拉距离
                /**
                 * 两个IF 判断电量 和 欧拉距离
                 *
                 * */
            }
            p = newPopulation;

        }
        Chromosome best = Operators.getBest(p);
        return best;
    }

}

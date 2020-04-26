package geneticAlgorithms;

import java.util.ArrayList;

public class Population{
    ArrayList<Chromosome> population = new ArrayList<>();

    int size;

    public Population(int size){
        this.size = size;
    }

    public void create(){
        for (int i = 0; i < size; i++) {
            Chromosome c = new Chromosome();
            population.add(c);
        }
    }

    public void add(Chromosome tempChromosome){
        if(population.size() >= size){
            System.out.println("Full");
        }else{
            population.add(tempChromosome);
        }
    }

    public Chromosome get(int i ){return population.get(i);}

    public void setEmpty(){population = new ArrayList<Chromosome>();}

    public boolean isFull(){
        if(population.size() >= size){
            return true;
        }else{
            return false;
        }
    }

    public int size() {
        // TODO Auto-generated method stub
        return population.size();
    }

}

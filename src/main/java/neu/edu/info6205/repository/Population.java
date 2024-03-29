package neu.edu.info6205.repository;

public interface Population {

    Individual[] getIndividuals();
    Individual getFittest(int offset);
    void setPopulationFitness(double fitness);
    double getPopulationFitness();
    int size();
    Individual setIndividual(int offset, Individual individual);
    Individual getIndividual(int offset);
    void shuffle();

}


/**
 * Assignment2: design and implement a class called Country
 * Programmer: Baunu Ebrahimi
 */
public class Country {
    // declare instance variables 
    private String name;
    private long population; 
    private long area;

    // create constructor
    public Country(String name, long population, long area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }
    // get methods
    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public long getArea() {
        return area;
    }  
    // set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setArea(long area) {
        this.area = area;
    }

    // get density method
    public double getDensity() {
        // return calculated density
        return (getPopulation()*1.0/getArea());
    }

    // print method that prints all country data
    public void printCountry() {
        System.out.print("Name: " + getName());
        System.out.print("      Population: " + getPopulation());
        System.out.print("      Area: " + getArea());
        System.out.printf("     Density: %.2f", getDensity());        
    }
}

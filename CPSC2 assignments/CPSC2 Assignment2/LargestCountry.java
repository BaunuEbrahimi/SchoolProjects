import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class LargestCountry {                   
    /**
    Reads a country in from a file. @return all countries in an arraylist
     */
    public static ArrayList<Country> readCountry(String fileName) throws FileNotFoundException {
        // create an ArrayList
        ArrayList<Country> countries = new ArrayList<Country>();
        // read from the file passed as a parameter ("countrydata.txt")
        File inputFile = new File(fileName);
        Scanner scan = new Scanner(inputFile);
        // "skip" over the header in the file
        scan.nextLine();
        // while the file has another line...
        while(scan.hasNextLine()) {
            // make a variable that is set to the information in that file line
            String line = scan.nextLine();
            // make sure that the multiple spaces in between country info is turned into one space
            line = line.replaceAll("\\s+", " ");
            // create an array of the line data, split by the space
            String[] splitCountryData = line.split(" ");
            /* create a Country object and put the country name located in splitCountryData at 
            position 0, the population at position 1 and the area at position 2, as the parameters */
            Country country = new Country(splitCountryData[0], Long.parseLong(splitCountryData[1]), Long.parseLong(splitCountryData[2]));
            // add this data to the countries ArrayList
            System.out.println(country);
            countries.add(country);
        }
        // return countries ArrayList
        return countries;
    }

    /** @return the country with the largest area
     */
    public static Country countryWithLargestArea(ArrayList<Country> countries) {
        // get the first country in the ArrayList
        Country country = countries.get(0);     
        // go through all of the countries...
        for(int i = 1; i < countries.size(); i++) {
            // if the area of the first country is less than the area of the next country...
            if(country.getArea() < countries.get(i).getArea()) {
                // set the country with the largest area to the next country until the largest area is found
                country = countries.get(i);
            }
        }
        // return the country with the largest area
        return country;
    }

    /** @return the country with the largest population   */
    public static Country countryWithLargestPopulation(ArrayList<Country> countries) {
        // get the first country in the ArrayList
        Country country = countries.get(0);
        // go through all of the countries...
        for(int i = 1; i < countries.size(); i++) {
            // if the population of the first country is less than the population of the next country...
            if(country.getPopulation() < countries.get(i).getPopulation()) {
                // set the country with the largest population to the next country until the largest population is found
                country = countries.get(i);
            }
        }
        // return the country with the largest population
        return country;       
    }

    /** @return the country with the largest density
     */
    public static Country countryWithLargestDensity(ArrayList<Country> countries) {
        // get the first country in the ArrayList
        Country country = countries.get(0);
        // go through all of the countries...
        for(int i = 1; i < countries.size(); i++) {
            // if the density of the first country is less than the density of the next country...
            if(country.getDensity() < countries.get(i).getDensity()) {
                // set the country with the largest density to the next country until the largest density is found
                country = countries.get(i);
            }
        }
        // return the country with the largest density
        return country;
    }

    public static void main(String[] args) {        
        try { 
            // create an ArrayList to get all of the country data in the file using the readCountry method
            ArrayList<Country> countries = readCountry("countrydata.txt");
            // print out the country with the largest area and its data
            System.out.println("The country with the largest area: ");
            countryWithLargestArea(countries).printCountry();
            // print out the country with the largest population and its data
            System.out.println("\n\nThe country with the largest population: ");
            countryWithLargestPopulation(countries).printCountry();
            // print out the country with the largest population density and its data
            System.out.println("\n\nThe country with the largest population density: ");
            countryWithLargestDensity(countries).printCountry();
        } catch(FileNotFoundException e) {
            // if the file does not exist catch the exception
            System.out.println("File not found!");
        }
    } 
}
package animals;

import java.util.*;

public class Main
{
    public static ArrayList<Animal> filteredList = new ArrayList<Animal>();
	
	public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester)
	{
		filteredList.clear();
        System.out.println();

		for (Animal a : animals)
		{
			if (tester.test(a))
			{
				System.out.println(a.getName() + " " + a.getYearDiscovered() + " " + a.move() + " " + a.breathe() + " " + a.reproduce());
				filteredList.add(a);
			}
		}
    }
    
    public static void main(String[] args)
    {
        //Mammals
        Mammal panda = new Mammal("Panda", 1896);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        //Birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        //Fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<Animal> aList = new ArrayList<Animal>();
        aList.add(panda);
        aList.add(zebra);
        aList.add(koala);
        aList.add(sloth);
        aList.add(armadillo);
        aList.add(raccoon);
        aList.add(bigfoot);
        aList.add(pigeon);
        aList.add(peacock);
        aList.add(toucan);
        aList.add(parrot);
        aList.add(swan);
        aList.add(salmon);
        aList.add(catfish);
        aList.add(perch);

        System.out.println("****Animals List");
        System.out.println(aList.toString());

        //Descending order by year
        System.out.println("\n**** Descending Year Named ****");
        aList.sort((a1, a2) -> a2.getYearDiscovered().compareTo(a1.getYearDiscovered()));
        aList.forEach((a) -> System.out.println(a.getName() + " " + a.getYearDiscovered()));

        //Alphabetically
        System.out.println("\n**** Alphabetically ****");
        aList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        aList.forEach((a) -> System.out.println(a.getName()));

        //List ordered by movement
        System.out.println("\n**** Movement ****");
        aList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        aList.forEach((a) -> System.out.println(a.move() + " " + a.getName()));

        //Lung breathers
        System.out.println("\n**** Lung Breathers ****");
        printAnimals(aList, a -> a.breathe() == "lungs");
        //same as
        printAnimals(aList, a -> (a instanceof Bird) || (a instanceof Mammal));

        //Lung breathers named in 1758
        System.out.println("\n**** Lung Breathers Named in 1758 ****");
        printAnimals(aList, a -> (a.breathe() == "lungs") && (a.getYearDiscovered()==1758));

        //Animals that lay eggs and breath with lungs; so birds.
        System.out.println("\n**** Lung Breathers that Lay Eggs, aka Birds ****");
        printAnimals(aList, a -> (a.breathe() == "lungs") && (a.reproduce()=="eggs"));
        //same as
        printAnimals(aList, a -> a instanceof Bird);

        //Named in 1758, alphabetically
        System.out.println("\n**** Named in 1758, not alphabetical yet ****");
        printAnimals(aList, a -> a.getYearDiscovered() == 1758);
        System.out.println();
        System.out.println("\n**** Named in 1758, Alphabetically ****");
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach((a) -> System.out.println(a.getName()+ " " + a.getYearDiscovered()));

        //STRETCH
        //first the mammals, not alphabetical
        System.out.println("\n**** Mammals ****");
        printAnimals(aList, a -> a instanceof Mammal);
        System.out.println();
        System.out.println("\n**** Mammals Alphabetically ****");
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach((a) -> System.out.println(a.getName()));



    }
}
    

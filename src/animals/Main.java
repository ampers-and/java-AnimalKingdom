package animals;

import java.util.*;

public class Main
{
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


    }
}
    

package exercises.Constructor;
//Define a testing class (e.g. Tester, Start or another reasonable name you prefer) with a main method where:
//you declare two House variables house1 and house2
//you create two House objects and assign them to the variables house1 and house2
public class Main {
    public static void main(String[] args) {


        House house1 = new House("Piazza Roma,81", 1, new String[]{"Luigi Sferruzzi", "Nicola Farina"});
        House house2 = new House("Piazza Orsini, 12", 2, new String[]{"Mario Rossi", "Gianfranco Livornesi"});
        House house3 = new House("Piazza Roma,81", 1, new String[]{"Ernesto Micco", "Alfredo Pesolo"});


        System.out.println(house1.address);
        System.out.println(house2.numberOfFloors);
        System.out.println(house1.residentsNames[0]);


    }
}

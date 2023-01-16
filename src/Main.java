public class Main {
    public static void main(String[] args) {

       Fish fish = new Fish();
       fish.setName("Mare");
       fish.setAge(2);
       fish.setBreed("Marlin");
       fish.setWeight(1.5);
       fish.setHeight(5.1);

        System.out.println(fish.getName() + ","  +  fish.getAge() +  ","  + fish.getBreed() + ","  + fish.getWeight() + ","  + fish.getHeight());

       fish.Fish();

        System.out.println();
       Parrot parrot = new Parrot();
       parrot.setName("Popugay");
       parrot.setAge(1);
       parrot.setColour("brown");
       parrot.setWeight(1.2);

        System.out.println(parrot.getName() + "," + parrot. getAge() + "," + parrot.getColour() + "," + parrot.getWeight());
        parrot.parrot();
        System.out.println();

        Cat cat = new Cat();
        cat.setName( "Koshka");
        cat.setAge(2);
        cat.setWeight(1.7);
        cat.setColour("white");
        System.out.println(cat.getName()+ "," +cat.getAge()+ "," + cat.getWeight()+ "," + cat.getColour());
        cat.cat();
        System.out.println();

        Dog dog = new Dog();
        dog.setName("Bingo");
        dog.setAge( 3 );
        dog.setWeight(5);
        dog.setHeight(18.5 );

        System.out.println(dog.getName()+"," + dog.getAge()+","+ dog.getWeight()+"," + dog.getHeight());
        dog.dog();
    }
}
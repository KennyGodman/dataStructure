
public class Animal {
    private String name;
    private int age;
    private String gender;
    private String relationship;

    public Animal(String animalName, int animalAge, String animalGender, String animalRelationship){
        name = animalName;
        age = animalAge;
        gender = animalGender;
        relationship = animalRelationship;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getRelationship() {
        return relationship;
    }
    public String toString() {
        return String.format("%s %d %s %s%n", name, age,gender, relationship);
    }
}



//public class Animal {
//
//
//    public boolean getBreed() {
//    }
//}
//
//class Amphibia extends Animal {
//    public Amphibia(String name, String type, int size) {
//        super(name, type, size);
//    }
//
//}
//class Reptilia extends Animal {
//    public Reptilia(String name, String type, int size) {
//        super(name, type, size);
//    }
//
//    public void animalSound() {
//        System.out.println("I am eating");
//    }
//}
//
//class Aves extends Animal {
//    public Aves(String name, String type, int size) {
//        super(name, type, size);
//    }
//
//    public void animalSound() {
//        System.out.println("I am eating ");
//    }
//}
//
////class Main {
////    public static void main(String[] args) {
////    }
////}

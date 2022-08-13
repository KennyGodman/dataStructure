public class Main {
    public static void main(String[] args) {
        Toad smallToad = new Toad("ISREAL", 10, "MALE", "single", "MALU");
        smallToad.run();
        System.out.println(smallToad.getBreed());

        Snake smallSnake = new Snake("UBUNTU", 20, "MALE", "engaged", "python");
        smallSnake.bite();
        System.out.println(smallSnake.getBreed());

        Bird smallBird = new Bird("PHYSIQUE", 15, "MALE", "ashawo", "angry bird");
        smallBird.fly();
        System.out.println(smallBird.getBreed());
    }

}









//            Animal myAnimal = new Animal();
//            Animal toad  = new Amphibia();
//            Animal snake = new Reptilia();
//            Animal bird = new Aves(9);
//            myAnimal.animalSound();
//            toad.animalSound();
//            snake.animalSound();
//            bird.animalSound();



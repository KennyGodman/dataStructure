 public class Toad extends Animal{

        private String breed;

        public Toad(String animalName, int animalAge, String animalGender, String animalRelationship, String smallToadBreed) {
            super(animalName, animalAge, animalGender, animalRelationship);
            breed = smallToadBreed;
        }

        public String getBreed() {
            return breed;
        }

     public void run() {
         System.out.println("i am eating food ");
     }

}


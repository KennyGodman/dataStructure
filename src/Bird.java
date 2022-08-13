
    public class Bird extends Animal{
        private String breed;

        public Bird(String animalName, int animalAge, String animalGender, String animalRelationship, String smallBirdBreed) {
            super(animalName, animalAge, animalGender, animalRelationship);
            breed = smallBirdBreed;
        }

        public String getBreed() {
            return breed;
        }

        public void fly() {
            System.out.println("I am eating food");

        }
    }

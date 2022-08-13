
    public class Snake extends Animal{
        private String breed;

        public Snake(String animalName, int animalAge, String animalGender, String animalRelationship, String smallSnakeBreed) {
            super(animalName, animalAge, animalGender, animalRelationship);
            breed = smallSnakeBreed;
        }

        public String getBreed() {
            return breed;
        }

        public void bite() {
            System.out.println("i am eating food");
        }

}

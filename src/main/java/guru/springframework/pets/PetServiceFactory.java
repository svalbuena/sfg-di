package guru.springframework.pets;

public class PetServiceFactory {
    public PetService getPetService(final String petType) {
        switch (petType) {
            case "cat":
                return new CatPetService();
            case "dog":
            default:
                return new DogPetService();
        }
    }
}

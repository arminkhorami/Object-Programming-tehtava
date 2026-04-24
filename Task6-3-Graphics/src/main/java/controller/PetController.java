package controller;

import model.Pet;

public class PetController {
    private Pet pet;

    public PetController() {
        this.pet = new Pet(100, 100);
    }

    public void updatePetPosition(double mouseX, double mouseY) {
        pet.moveTo(mouseX, mouseY);
    }

    public double getPetX() { return pet.getX(); }
    public double getPetY() { return pet.getY(); }
}
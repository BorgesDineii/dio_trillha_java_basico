public class PetMachine {
    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void takeAShower() {
        if(this.pet == null) {
            System.out.println("Coloque o pet na maquina para iniciar a maquina");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet" + pet.getName() + "está limpo");
    }

    public void addWater() {
        if(water ==  30) {
            System.out.println("A capacidade de agua da maquina esta no maximo.");
            return;
        }
        water += 2;
    }
    public void addShhampoo() {
        if(shampoo == 10) {
            System.out.println("A capacidade de shampoo esta no maximo.");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }
    public int shampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }
    public void setPet(Pet get) {
        if(this.clean) {
            System.out.println("A maquina esta suja, para colocar o pet é necessario limpar");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet" + this.pet.getName() + " está na maquina nesse momento.");
            return;
        }
    }
    this.pet = pet;

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " está limpo");
        this.pet = null;
    }
    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println(" A maquina esta limpa.");
    }
}

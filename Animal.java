public abstract class Animal {
    private boolean isMakingSound;

    public Animal() {
        this.isMakingSound = false;
    }

    public abstract void makeSound();

    public void startMakingSound() {
        if (!isMakingSound) {
            isMakingSound = true;
            makeSound();
        } else {
            System.out.println("Animal is already making sound.");
        }
    }

    public void stopMakingSound() {
        if (isMakingSound) {
            isMakingSound = false;
            System.out.println("Animal has stopped making sound.");
        } else {
            System.out.println("Animal is not making any sound.");
        }
    }
}
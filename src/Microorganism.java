public class Microorganism extends Bacterium {

    public Microorganism(String name, String skill) {
        super(name, skill);
    }

    public void sayMicroorganism() {
        System.out.println("\n" + getName() + " издает какой-то не понятный звук..." + ".Любит - " + getSkill() + "\n");
    }
}


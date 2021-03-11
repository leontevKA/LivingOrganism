public class Monkey extends Bacterium {

    public Monkey(String name, String skill) {
        super(name, skill);
    }

    public void say() {
        System.out.println("Я генетическая обезьяна!");
    }

    public void sayMonkey() {
        System.out.println("\nУ-у-у-у-у-у-у-у-а! Уаа-аааа-ааа-уу! Ауу-уаау-уа!" +
                " - издает звуки \""+ getName() +"\". И он(а) любит - " + getSkill() + "\n");
    }
}

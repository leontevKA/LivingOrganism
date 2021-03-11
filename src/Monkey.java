public class Monkey extends Microorganism {

    public Monkey(String name, String skill) {
        super(name, skill);
    }

    public void sayMonkey() {
        System.out.println("У-у-у-у-у-у-у-у-а! Уаа-аааа-ааа-уу! Ауу-уаау-уа! - издает звуки \""+ getName() +"\". И она любит - " + getSkill());
    }
}

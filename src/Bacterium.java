public class Bacterium {

    private String ANSI_RESET = "\u001B[0m";
    private String ANSI_RED = "\u001B[31m";

    private String name;
    private String skill;

    public Bacterium(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    public void say() {
        System.out.println("\nЯ - бактерия, и я тут самая главная! И первое слово - всегда за мной!");
    }

    public void sayBacterium() {
        System.out.println("\nЯ - " + getName() + "!И я люблю - " + getSkill() + ".\n" +
                "Вы вправе злиться на меня, потому что я бываю вредной, но а кто не бывает таким? Правильно, бывают все!\n" +
                "Кстати, я любительница патогенной среды, и порой, вам бывает достаточно плохо, \nно вы не расстраивайтесь, " +
                "ведь у вас есть мои подруги, которые умирают защищая вас от меня.\n"
        );
    }

    public void infection() {
        System.out.print(ANSI_RED + "Работает вредная бактерия, пожалуйста, подождите, идет заражение живого организма." + ANSI_RESET);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

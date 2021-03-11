public class Bacterium {

    private String name;
    private String skill;

    public Bacterium(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    public void say() {
        System.out.println("Я - " + getName() + "!И я люблю - " + getSkill() + ".\n" +
                "Вы вправе злиться на меня, потому что я бываю вредной, но а кто не бывает таким? Правильно, бывают все!\n" +
                "Кстати, я любительница патогенной среды, и порой, вам бывает достаточно плохо, \nно вы не расстраивайтесь, " +
                "ведь у вас есть мои подруги, которые умирают защищая вас от меня.\n"
        );
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

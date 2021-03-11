public class Human extends Monkey {

    public Human(String name, String skill) {
        super(name, skill);
    }

    public void sayHuman() {
        System.out.println("Ну наконец-то я могу сказать! Слава богу, что эволюционная цепочка не такая большая, как мне казалось!\n" +
                "Кстати, меня зовут: " + getName() + ".И да, я люблю - " + getSkill()
        );
    }
}

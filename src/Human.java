public class Human extends Monkey {

    public Human(String name, String skill) {
        super(name, skill);
    }

    public void say() {
        System.out.println("\nЯ эволюционировал от обезьяны!");
    }

    public void sayHuman() {
        System.out.print("\nНу наконец-то я могу сказать! Слава богу, что эволюционная цепочка не такая большая, как мне хотелось бы её описать!\n" +
                "Кстати, меня зовут: " + getName() + ".И да, я люблю - " + getSkill() +
                "\nКонечно, жаль, что во мне столько бактерий, но от этого никак не убежать." +
                "\nОднако, есть у меня и плюс, это то, что я могу говорить, как обезьяна: "
        );
    }
}

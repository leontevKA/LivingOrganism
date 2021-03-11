public class Main {

    public static void main(String[] args) {
        Bacterium bacterium = new Bacterium("Вредная бактерия", "Размножение");
        Microorganism microorganism = new Microorganism("Злой микроб", "Размножение");
        Monkey monkey = new Monkey("Обезьянка-Нюша", "Поедать бананы");
        Human human = new Human("Константин-повелитель бактерий", "Программирование");
        bacterium.say();
        microorganism.sayMicroorganism();
        monkey.sayMonkey();
        human.sayHuman();
    }
}

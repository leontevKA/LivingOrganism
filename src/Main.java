/**
 * Работа, выполненная с принципами ООП - инкапсуляция, наследования (как от суперкласса к классам, так и от класса к классу),
 * полиморфизм - также, выполнен, стоит обратить внимание на строчки 17, 47, в этом месте работает данный принцип.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {


        /* Объявление и инициализация объектов */
        Bacterium bacterium = new Bacterium("Вредная бактерия", "Размножение");
        Bacterium monkey1 = new Monkey("Человеко-подобный", "Убивать");
        Microorganism microorganism = new Microorganism("Злой микроб", "Размножение");
        Monkey monkey = new Monkey("Обезьянка-Нюша", "Поедать бананы");
        Human human = new Human("Константин-повелитель бактерий", "Программирование");

        /* Объявление переменной для работы мозговой активности живого организма */
        int selectAction;

        /* Считывание потока ввода данных */
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вас приветствует живой организм, в который интегрирован искусственный интеллект");
        System.out.println("Пожалуйста, выберите интересующий вас раздел, и следуйте дальнейшим инструкциям: " +
                "\n1. Бактерия" +
                "\n2. Микроорганизм" +
                "\n3. Обезьянка" +
                "\n4. Человек" +
                "\n5. Завершить работу");
        System.out.print("Пожалуйста, выберите раздел: ");
        while (true) {
            try {
                selectAction = Integer.parseInt(input.readLine());
                if (selectAction == 1) {
                    bacterium.sayBacterium();
                } else if (selectAction == 2) {
                    microorganism.say();
                    microorganism.infection();
                    Thread.sleep(5000);
                    microorganism.sayMicroorganism();
                } else if (selectAction == 3) {
                    monkey.say();
                    monkey.infection();
                    Thread.sleep(5000);
                    monkey.sayMonkey();
                } else if (selectAction == 4) {
                    human.infection();
                    Thread.sleep(5000);
                    human.sayHuman();
                    human.sayMonkey();

                } else if (selectAction == 5) {
                    break;
                }
                System.out.print("Пожалуйста, выберите раздел: ");
            } catch (NumberFormatException e) {
                System.out.print("Пожалуйста, выберите раздел: ");
            }
        }
    }
}

// Клиентский вход - вызывает выполнение основной логики программы
// класс это шаблон ( пример хрущевка или человек)
// Могут быть и класс в классе ( паспорт человека) но пишутся отдельно
// Входной класс который является входной точкой программы таких входных точек может быть много но основная одна

import lesson1.Task1;
import lesson1.Task2;
import model.Human;

public class Main {
    public static void main(String[] args) {
//      System.out.println("Привет мир");   // sout
        Human human = new Human("Alex");
        Human human1 = new Human("Oleg", 34, "m");
        //       System.out.println(human1.getName());
        String str = "aaaaaa";
        int i = 0;
        //     int,byte,short, float, long, boolean, char, double
        //     boolean - 1 bit
        //     byte - 8
        //     short float - 16
        //     int, char - 32
        //     long, double - 64
        //     string -> char char char

//        System.out.println(str.length());
        //       System.out.println(human.getName());
        //       human.setName("Mary");
        //       System.out.println(human.getName());

        Task1 task = new Task1();
        task.revers("Добро пожаловать на курс по Java");
        Task2 hello = new Task2();
        hello.hello();
    }
}
// Вычислить треугольное число от 1 до n(1000)
//n
// 1 + 2 = 3
//1 + 2 + 3 = 6
// факториал  от 1 до n
// все простые числа от 1 до n
// простой калькулятор свич


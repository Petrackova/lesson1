package lesson1;

public class Task1 {
    // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

    public void revers(String str) {
        String[] array = str.split(" ");
        for (int i = (array.length)-1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}

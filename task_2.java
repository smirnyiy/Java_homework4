// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task_2 {    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите размер массива : ");
        int size = Scanner.nextInt();
        System.out.print("Какое число добавим : ");
        int num = Scanner.nextInt();
        Scanner.close();

        LinkedList<Integer> originalList = fillList(size);

        System.out.println("");
        System.out.printf("Исходный список: %s \n", originalList);
        System.out.printf("Добавили элемент в конец %s \n", enqueue(originalList, num));
        System.out.println("");
        System.out.printf("Достали первый элемент %s \n", dequeue(originalList));
        System.out.printf("Список после удаления первого элемента : %s \n", originalList);
        System.out.println("");
        System.out.printf("Достали первый элемент списка %s \n", first(originalList));
        System.out.printf("Список без удаления первого элемента: %s \n", originalList);
    }

    private static LinkedList<Integer> fillList (int size) {    
        LinkedList<Integer> originalList = new LinkedList<>();
        Random rand = new Random();

            for (int i = 0; i < size; i++) {
                originalList.add(i, rand.nextInt(100));
        }
        return originalList;        
    }

    //enqueue() - помещает элемент в конец очереди,
    public static LinkedList<Integer> enqueue(LinkedList<Integer> originalList, int num) {
        originalList.addLast(num);
        return originalList;
    }

    //dequeue() - возвращает первый элемент из очереди и удаляет его,
    public static int dequeue(LinkedList<Integer> originalList) {
        int num = originalList.getFirst();
        // System.out.printf("Первый элемент в списке: %s \n", list.getFirst());
        originalList.removeFirst();
        return num;
    }

    //first() - возвращает первый элемент из очереди, не удаляя
    public static int first(LinkedList<Integer> originalList) {
        return originalList.getFirst();
    }
}
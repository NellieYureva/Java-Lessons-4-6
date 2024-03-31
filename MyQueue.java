// В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди
// Пример
// queue.enqueue(1);
// queue.enqueue(10);
// queue.enqueue(15);
// queue.enqueue(5);
// System.out.println(queue.getElements()); 
// Результат:
// [1, 10, 15, 5]
// queue.dequeue();
// queue.dequeue();
// System.out.println(queue.getElements());
// Результат:
// [15, 5]
// System.out.println(queue.first());
// Результат:
// 15

import java.util.LinkedList;

class MyQueue<T> {
        // Напишите свое решение ниже
    private LinkedList<Integer> elements = new LinkedList<>();
    public void enqueue(int element){
        // Напишите свое решение ниже
        elements.add(element);
    }

    public int dequeue(){
        // Напишите свое решение ниже
        return elements.removeFirst();
    }

    public int first(){
        // Напишите свое решение ниже
        return elements.getFirst();
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже
        return elements;
    }
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}
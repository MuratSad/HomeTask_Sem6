import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Sem4 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());

//        task0();
//    task1();
    }

    static void task0() {
        /*
        Задание 0:
        Замерьте время, за которое в ArrayList добавятся 10000 элементов.
        Замерьте время, за которое в LinkedList добавятся 10000 элементов.Сравните предыдущие.
         */
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }

    static void task1() {
        /*
        Задача 1:
        Реализовать консольное приложение которое :
        1) принимает от пользователя строку вида
        text~num
        1. Нужно расплитить строку по ~, сохранить text в связанный список на позиции num
        2. Если введенно print~num , выводит строку из позиции num, и удаляет её из связанного списка.
         */
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
boolean work = true;
        while (work) {
            System.out.println("input string ");
            String line = scanner.nextLine();
            if(line.equals("exit")){
                System.out.println("Bye");
                return;
            }
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text){
                case "print":
                    System.out.println(list.remove(num));

                default :
                    list.add(num,text);

            }
        }
    }

    static void task2(){
        /*
        Реализовать консольное приложение, которое:
        1)Принимает от пользователя и запоминает строки
        2)Если пользователь вводит print , то она выводит строки так, что та,
         которая была введена последней стоит на первом месте, а первая на последнем.
         3)Если введено revert , то удаляет предыдущую строку из памяти.
         */
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("input string ");
            String line = scanner.nextLine();
            if(line.equals("exit")){
                System.out.println("Bye");
                return;
            }
            switch (line){
                case "print":
                    ListIterator iterator = list.listIterator(list.size());
                    while(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                break;
                case "revert":
                    list.removeLast();
                    System.out.println("element has been deleted ");
                    break;
                default :
                    list.add(line);
                    System.out.println("list added ");

            }
        }
    }
}

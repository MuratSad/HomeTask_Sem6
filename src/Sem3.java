import java.util.*;

public class Sem3 {
    public static void main(String[] args) {
//task0();
//task1(createList(10,10,100));
//task2();
        List<List<String>> list =new ArrayList<>();
        addBook("korol","comedy",list);
        addBook("comy","comedy",list);
        addBook("hork","horror",list);
        addBook("dopel","romance",list);
        addBook("cat","romance",list);
        System.out.println(list);
    }
    static void task0(){
        /*
Текст Задачи: Даны следующие строки, сравнить их с помощью == и метода equals() класса object
String s1 = "hello";
String s2 = "hello";
String s3 = "s1";
String s4 = "h"+"e"+"l"+"l"+"o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h','e','l','l','o'});
         */
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h"+"e"+"l"+"l"+"o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h','e','l','l','o'});
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

    }
    static void task1(List<Integer> list){
        /*
Заполнить список 10-ю случайными числами,
 отсортировать методом sort() и вывести его на экран
         */
        Collections.sort(list);
        System.out.println(list);
    }
    static void task2(){
        /*
        Создать список типа ArrayList<string>, поместить в него как строки
        так и целые числа.Пройти по списку , найти и удалить целые числа.
         */
        ArrayList<Object> list=new ArrayList<>();
        list.add("asdad");
        list.add(124);
        list.add("test");
        list.add("aga");
        list.add(341);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if (o instanceof Integer)
            {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    static void task3(){
        /*
        Текст задачи: Каталог товаров в книжном магазине сохранен в виде
         двумерного списка List<ArrayList<String>>, так что на 0-й позиции написан жанр , а на остальных
         название книг. Напишите метод . для заполнения данной структуры.
         */

    }
    static void addBook(String name,String janre,List<List<String>> bookShop){
    for(int i=0;i< bookShop.size();i++)
    {
        if (bookShop.get(i).get(0).equals(janre)){
            bookShop.get(i).add(name);
            return;
        }
    }
    List<String> list=new ArrayList<>();
    list.add(janre);
    list.add(name);
    bookShop.add(list);
    }
    static List<Integer> createList(int size,int min,int max){
        ArrayList<Integer> list=new ArrayList<>(size);
        Random random = new Random();
        for(int i=0;i<size;i++)
        {
            list.add(random.nextInt(min,max));
        }
        return list;
    }
}

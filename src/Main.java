import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a=123;
//        int res=a-- - --a;
//        System.out.println(res);
//task0();
//        task1();
//        task2();
//    task3("Добро пожаловать на курс по Java");
    task4(2,0);
    }

    static void task0() {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) System.out.println("Доброе утро " + name);
        else if (hour < 18) System.out.println("Добрый день " + name);
        else if (hour < 23) System.out.println("Добрый вечер  " + name);
        else System.out.println("Доброй ночи " + name);
    }

    static void task1() {
        /*Дан массив двоичных чисел,
        например [1,1,0,1,1,1], вывести максимальное количество идущих подряд 1-к.
         */
        int[] array = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) count++;
            if (array[i] == 0) {
                if (count > maxOnes) maxOnes = count;
                count = 0;
            }
        }
        if (count > maxOnes) maxOnes = count;
        System.out.println(maxOnes);
    }
    static void task2(){
        /*
        Дан массив nums=[3,2,2,3 и число val =3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом первые числа массива должны быть отличные от заданного числа , а остальные равны ему
         */
        int[] nums={3,2,2,3,2,3,5,7};
        int val = 3;
        int[] temp=new int[nums.length];
        Arrays.fill(temp,val);
        for(int i=0,j=0;i< nums.length;i++)
        {
            if(nums[i]!=val)
            {
                temp[j++]=nums[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    static void task3(String str){
        /*
Задача 3: Во фразе "Добро пожаловать на курс по Java" Переставить слова в обратном порядке.
         */
        String[] arr = str.split(" ");
//        System.out.println(Arrays.toString(arr))
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    static void task4(int a,int b){
        /*
Реализовать функцию возведения числа а в степень b.  a,b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: a=3,b=2, ответ: 9;
Пример 2: a=2,b=-2, ответ: 0,25;
Пример 3: a=3,b=0, ответ: 1
         */
        double result=1;
    for (int i=0;i<Math.abs(b);i++){
        result*=a;
    }
    result=(b>0? result:1/result);
    System.out.println(result);
    }
}
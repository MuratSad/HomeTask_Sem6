import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem2 {
    public static void main(String[] args) {
//        task0(10,'a','h');
//        task1("aaaabbbcdd");
    task2Log(RepeatString("Test",5));
    }

    static void task0(int N, char c1, char c2) {
        /*
        Текст Задачи: Дано четное число N (>0) и символы c1 и c2
        Написать метод который вернет строку длины N,из чередущихся
         символов с1 и с2 , начиная с с1.
         */
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N / 2; i++) {
            stringBuilder.append(c1).append(c2);
        }
        System.out.print(stringBuilder);
    }

    static void task1(String str) {
        /*
        Текст задачи: Напишите метод который сжимает строку.
         Пример: вход "aaaabbbcdd" вывод: a4b3c1d2
         */
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                stringBuilder.append(chars[i - 1]).append(count + 1);
                count = 0;
            }
            if (i == chars.length - 1) {
                stringBuilder.append(chars[i - 1]).append(count + 1);
            }

        }
        System.out.println(stringBuilder);
    }

    static void task2Log(String str) {
        /*
        Текст задачи: Напишите метод который составит строку , состоящий из 100 повторения слова Test
         и метод который запишет эту строку в простой текстовый файл,обработайте исключения.
         */
        String path="wdsaq/atext.txt";
        Logger logger= Logger.getAnonymousLogger();
        FileHandler fileHandler=null;
        try {
            fileHandler=new FileHandler("log.txt",true);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter simpleFormatter=new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        try (FileWriter fw=new FileWriter(path,false)){
            fw.write(str);
            fw.flush();
        } catch (IOException e) {
            logger.log(Level.INFO,e.getMessage());
            e.printStackTrace();
        }

    }

    static String RepeatString(String str,int n) {
//        StringBuilder stringBuilder=new StringBuilder();
//        for(int i=0;i<n;i++){
//            stringBuilder.append(str);
//        }
        return str.repeat(n);
    }
}


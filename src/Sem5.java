import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Sem5 {
    public static void main(String[] args) {
//task0();
//        System.out.println(task1("foo","bar"));
//        System.out.println(task1("paper","title"));
        System.out.println(task2("[6+(3*3)]"));
    }

    static void task0(){
        /*
Создать структуру хранения номеров Паспортов и фамилий сотрудников организации№
123456 Иванов
324155 Васильев
134221 Петрова
123451 Иванов
123456 Петрова
125792 Иванов
         */
Passports passports = new Passports();
passports.add("Иванов", "123456");
passports.add("Васильев","324155");
passports.add("Петрова","134221");
passports.add("Иванов","123451");
passports.add("Петрова","123456");
passports.add("Иванов","125792");
        System.out.println(passports.getByLastName("Петрова"));
        System.out.println(passports.getByPassNum("123456"));
        System.out.println(passports.getAllShort());

    }
    static boolean task1(String str1,String str2){
        /*
        Даны 2 строки, написать метод который вернет true , если эти строки являются изоморфными
        и false если нет.
        Строки являются изоморфными если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом

        Пример1:
        input: s = "foo" ,t="bar"
        output: false

        Пример2:
          input: s = "paper" ,t="title"
        output: true

         */
        if (str1.length()!=str2.length()) return false;
         Map<Character,Character> map = new HashMap<>();
         char[] c1 = str1.toCharArray();
         char[] c2 = str2.toCharArray();
         for (int i =0;i< c1.length;i++){
             map.putIfAbsent(c1[i],c2[i]);
             if(map.containsKey(c1[i])){
                 if(c2[i]!=map.get(c1[i])) return false;
             }
         }
         return true;
    }
    static boolean task2(String str){
        /*
        Написать программу, определяющую правильность расстановки скобок в выражении:
        примеры:
        [a+(d*3)  - ложь
        [6+(3*3)]  - истина
        {a}[+]{(d*3)} - истина
        <{a}+{(d*3)}> - истина
        {a+]}{(d*3)}  - ложь
         */
        Stack<Character> stack =new Stack<>();
        char[]c = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='(') stack.add(c[i]);
            if(c[i]==')'){
                if(stack.empty() || stack.pop()!='(')
                    return false;
            }
        }
        return stack.empty();
    }
}

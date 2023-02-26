import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task2 {
    

    public static void main(String[] args) {
        /*
        Взять набор строк, например, "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись"
        Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
        */
    }

    private static void sortByLenght(String text){
        //парсим текст на слова
        //печатаем слова в порядке возрастания длины
        String[] splitText = text.split(" ");
        Map<Integer, List<String>> db = new TreeMap<>();
        for (String string : splitText) {
            List<String> temp = new ArrayList<String>();
            
            if(db.containsKey(string.length())){
                temp = db.get(string.length());
            }
            
            temp.add(string);
            db.putIfAbsent(string.length(), temp);            
        }

        System.out.println(db);
    }

    // private static void sortByLenght(String text){
    //     //парсим текст на слова
    //     //печатаем слова в порядке возрастания длины
    //     String[] splitText = text.split(" ");
    //     Map<Integer, String> db = new TreeMap<>();
    //     for (String string : splitText) {
    //         int count = 0;

    //         while(db.containsKey(string.length() * 100 + count)){
    //             count++;
    //         }

    //         db.putIfAbsent(string.length() * 100 + count, string);
    //     }

    //     System.out.println(db);
    // }
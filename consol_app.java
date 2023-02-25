// Реализовать консольное приложение, которое:
//1. Принимает от пользователя строку вида text~num
//2. Расспливает строку по--, сохранить text в связный список на позицию num.
//3. Если введено print--num, выводит строку из позиции num в связном списке и удаляет её из списка.

import java.util.ArrayList;
import java.util.Scanner;

public class consol_app {

    static ArrayList <String> List_words = new ArrayList<>();
    
    public static void main (String[] args) { //Считываю что вводит пользователь
        Scanner iScanner = new Scanner (System.in);
        for (int i = 0; i < 7; i++) {
            System.out.printf("Введите строку вида text--num: ");
            String s = iScanner.nextLine();
            String [] split_arr = s.split("--");
            String word = split_arr[0];
            String numberS = split_arr[1];
            Integer numberI = Integer.parseInt(numberS);
            if (word.contains("print")) {
                work_arr_print(numberI);
            }
            else{
                work_arr_add(word, numberI);
            }
        }
        iScanner.close();
    }
        
    public static void work_arr_add (String word, Integer numberI) {
        if (List_words.size()<numberI) {
            for (int i = List_words.size(); i < numberI+1; i++) {
                List_words.add(i, null);
                }
            }
        List_words.set(numberI, word);
    }

    public static void work_arr_print (Integer numberI) {
        if (numberI<List_words.size()) {
            System.out.println("По индексу "+ numberI + " найдено значение " + List_words.get(numberI));
        }
        else {
            System.out.println("Индекса "+ numberI + " нет в списке");
        }
    }
}
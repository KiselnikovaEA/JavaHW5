import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.putIfAbsent(101, "Иванов Иван Иванович 28 м");
        people.putIfAbsent(102, "Петров Пётр Петрович 47 м");
        people.putIfAbsent(103, "Анечкина Анна Ивановна 33 ж");
        people.putIfAbsent(104, "Андреев Андрей Андреевич 65 м");
        people.putIfAbsent(105, "Сидорова Юлия Алексеевна 25 ж");

        for (var item: people.entrySet()) {     // замена регистров пола и одновременно вывод в формате Фамилия И.О.
            String[] tmp = item.getValue().split(" ");
            tmp[tmp.length - 1] = tmp[tmp.length - 1].toUpperCase();
            System.out.println(tmp[0] + " " + tmp[1].charAt(0) + "." + tmp[2].charAt(0) + ".");
            item.setValue(String.join(" ", tmp));
        }
        System.out.println();
        System.out.println(people);

    }
}
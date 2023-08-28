package LeetcodeAndOtherTasks.RandomTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*"У лукоморья дуб зелёный;
Златая цепь на дубе том:
И днём и ночью кот учёный
Всё ходит по цепи кругом;
Идёт направо — песнь заводит,
Налево — сказку говорит.
Там чудеса: там леший бродит,
Русалка на ветвях сидит;"

Необходимо распечатать построчно цифру, обзначабщая кол-во букв в слове и кол-во слов с такой длиной. 
1 - 5 в тексте 5 слов с одной буквой
2 - 3 в тексте 3 слова с двумя буквами */
public class Tsak5 { 
    public static void main(String[] args) {
       String string1 = "У лукоморья дуб зелёный; Златая цепь на дубе том: И днём и ночью кот учёный Всё ходит по цепи кругом; Идёт направо — песнь заводит,  Налево — сказку говорит. Там чудеса: там леший бродит,  Русалка на ветвях сидит;";

        string1 = string1.replaceAll("\\pP", ""); // Удаляем знаки препинания и пробелы
        String[] words = string1.split(" "); // Разделяем текст на слова по пробелам
        List<String> list = Arrays.asList(words); 

        Map<Integer, Integer> wordCountByLength = list.stream()  // Начинаем потоковую обработку списка
        .filter(word -> !word.isEmpty())    // Фильтруем слова, не являющиеся пустыми
        .filter(word -> word.length() > 0)   // Фильтруем слова, имеющие длину больше нуля
        .collect(Collectors.toMap(   // Собираем результат в виде Map
             word -> word.length(),   // - используется как ключ для `Map`. Ключом будет длина слова.
             word -> 1,    // Значение - единица (количество слов)
             (word1, word2) -> word1 + word2   // Функция для объединения значений при наличии коллизий ключей
        ));

System.out.println(wordCountByLength);
int count =1;
for (Map.Entry<Integer, Integer> entry : wordCountByLength.entrySet()) {
    
    System.out.println(count + ") с " + entry.getKey() + " буквой " + entry.getValue() + " слова");
    count++;
    /*`for (Map.Entry<Integer, Integer> entry : wordCountByLength.entrySet())` - это цикл `for-each`, 
    который перебирает все элементы `Map.Entry` в `wordCountByLength`.
`Map.Entry<Integer, Integer>` - это класс, представляющий ключ и значение пары в `Map`. 
В данном случае, ключ - это `Integer`, представляющий длину слова, а значение - также `Integer`, представляющий количество слов определенной длины.
`entry` - это переменная, которая будет использоваться для получения ключей и значений пары.
`wordCountByLength.entrySet()` - это метод `entrySet()`, который возвращает набор всех пар ключ-значение в `wordCountByLength`.
Итак, при выполнении `for (Map.Entry<Integer, Integer> entry : wordCountByLength.entrySet())`, 
каждая итерация цикла присваивает переменной `entry` очередную пару ключ-значение из `wordCountByLength`. */
}
    }
}

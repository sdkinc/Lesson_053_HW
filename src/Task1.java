import java.util.ArrayList;
import java.util.List;

public class Task1 {

  /*
  Петя перешёл в другую школу. На уроке физкультуры ему понадобилось определить своё место
  в строю. Помогите ему это сделать.
  Программа получает на вход невозрастающую последовательность натуральных чисел, означающих
  рост каждого человека в строю. После этого вводится число X – рост Пети. Все числа
  во входных данных натуральные и не превышают 200.

  Выведите номер, под которым Петя должен встать в строй. Если в строю есть люди с одинаковым
  ростом, таким же, как у Пети, то он должен встать после них.
   */
  public static void main(String[] args) {
    List<Integer> listSport = readList();
    int heightWasya = 150;
    int indexWasya = -1;
    for (int i = 0; i < listSport.size(); i++) {
      if (heightWasya>listSport.get(i)){
        listSport.add(i,heightWasya);
        indexWasya = i;
        break;
      }
    }
    if (indexWasya==-1){
      indexWasya =listSport.size();
      listSport.add(indexWasya,heightWasya);
    }
    System.out.printf("We are putting Wasya to a place %d",indexWasya+1);

  }

//  private static int indexOf(List<Integer> numbers, int target) {
//    if(numbers.size()==0){
//      return -1;
//    }
//
//    int left = 0; // левая граница
//    int right = numbers.size();
//    int indexOfMid = -1;
//    while (left < right - 1) { // пока расстояние больше одного элемента
//      int mid = (left + right) / 2; // индекс среднего элемента
//      int midElem = numbers.get(mid); // сам средний элемент
//      if (midElem > target) { // середина меньше, чем то, что нам нужно; то, что нам нужно, справа
//        left = mid + 1; // сдвигаем левую границу вправо
//      } else if (midElem < target) { // середина больше цели, цель слева
//        right = mid - 1; // сдвигаем правую границу влево
//      } else { // не меньше и не больше, значит, нашли
//        return mid; // досрочно нашли ответ
//      }
//    }
//
//    // сузили границы поиска до одного элемента: [left, right) - значит, проверяем индекс left
//    if (numbers.get(left) == target) {
//      return left;
//    }
//    // последний вариант не подошёл, числа в списке нет
//    return -1;
//  }

  public static List<Integer> readList(){
    List<Integer> result = new ArrayList<>();
    result.add(165);
    result.add(165);
    result.add(164);
    result.add(164);
    result.add(163);
    result.add(163);
    result.add(162);
    result.add(162);
    result.add(161);
    result.add(161);
    result.add(160);
    result.add(157);
    result.add(157);
    result.add(155);
    result.add(154);
    return result;
  }
}
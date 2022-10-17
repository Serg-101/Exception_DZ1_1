import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
/*
Второе задание:  differenceArray
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.

Третье задание:   divideArray
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */
public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,9};
        int[] array2 = {0,1,2,3,3,2,1,2,3};
        System.out.println("first array "+ Arrays.toString(array1));
        System.out.println("second array "+ Arrays.toString(array2));
        System.out.println("разница двух  массивов " + differenceArray(array1, array2));

        System.out.println("частное двух массивов " + divideArray(array1, array2));
    }

    public static ArrayList<Integer> differenceArray(int[] a1, int[] a2){
        Logger log = Logger.getAnonymousLogger();
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length,a2.length);
        int max = Math.max(a1.length,a2.length);
        if (min < 1){
            log.info("один из массивов пуст");
            return null;
        }
        if (min<max) {
            log.info("один из массивов больше другого");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i]-a2[i]);
        }
        return res;
    }

    public static ArrayList<Float> divideArray(int[] a1, int[] a2){
        Logger log = Logger.getAnonymousLogger();
        ArrayList<Float> res = new ArrayList<>();
        int min = Math.min(a1.length,a2.length);
        int max = Math.max(a1.length,a2.length);
        if (min < 1){
            log.info("один из массивов пуст");
            return null;
        }
        if (min<max) {
            log.info("один из массивов больше другого");
        }
        for (int i = 0; i < min; i++) {
            if (a2[i]!=0) {
                res.add((float) (a1[i] / a2[i]));
            }
            else {
                log.info("Исключение: Деление на ноль");
                res.add(0f);
            }

        }
        return res;
    }

}
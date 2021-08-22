/*
2.Создать метод, который умеет принемать множество чисел.
Метод находит наименьшее из них и возвращает его.
 */
public class Main2 {
    public static void main(String[] args) {

        //ищем минимальное среди int
        int val1 = (int) (Math.random() * 100);
        int val2 = (int) (Math.random() * 100);
        int val3 = (int) (Math.random() * 100);
        int val4 = (int) (Math.random() * 100);

        System.out.printf("Числа int: %d, %d, %d, %d \n", val1, val2, val3, val4);
        System.out.printf("Минимальное: %d \n", min(val1, val2, val3, val4));

        //ищем минимальное среди double
        double dval1 = Math.random() * 100;
        double dval2 = Math.random() * 100;
        double dval3 = Math.random() * 100;

        System.out.println();

        System.out.printf("Числа double: %.3f; %.3f; %.3f  \n", dval1, dval2, dval3);
        System.out.printf("Минимальное: %.3f \n", min(dval1, dval2, dval3));

    }

    //Минимальное число из последовательности, перегрузка double
    private static double min(double... arr)
    {
        double  min = arr[0];

        for (double val : arr) {
            if (val < min) {
                min = val;
            }
        }

        return min;
    }

    //Минимальное число из последовательности, перегрузка int
    //Необязательно- для int могли использовать  (int)double min(double... arr)
    private static int min(int... arr)
    {
        int  min = arr[0];

        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }

        return min;
    }


}

/*
1.Создать метод, который умеет принимать множество чисел.
Метод считает среднее арифметическое из них и возвращает его.
 */
public class Main1 {

    public static void main(String[] args) {
	// write your code here

        //Среднее для int
        int val1 = (int) (Math.random() * 100);
        int val2 = (int) (Math.random() * 100);
        int val3 = (int) (Math.random() * 100);
        int val4 = (int) (Math.random() * 100);

        System.out.printf("Числа int: %d, %d, %d, %d \n", val1, val2, val3, val4);
        System.out.printf("Среднее: %.3f \n", average(val1, val2, val3, val4));

        //Среднее для double
        double dval1 = Math.random() * 100;
        double dval2 = Math.random() * 100;
        double dval3 = Math.random() * 100;

        System.out.println();

        System.out.printf("Числа double: %.3f; %.3f; %.3f  \n", dval1, dval2, dval3);
        System.out.printf("Среднее: %.3f \n", average(dval1, dval2, dval3));

    }

    private static double average(double... arr) {     //среднее
        double  averVal = 0;

        for (double val : arr) {
            averVal += val;
        }

        return averVal / arr.length;
    }



}

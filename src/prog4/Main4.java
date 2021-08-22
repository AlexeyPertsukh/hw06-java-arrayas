/*
4* Создать массив из телефонов.
Пройтись циклом по массиву и вызвать у
каждого телефона метод info;
 */

package DZ6_04;

public class Main4 {

    public static void main(String[] args) {

        //иницализация массива объектов
        Phone[] phone = new Phone[5];

        for (int i = 0; i < phone.length; i++) {
            phone[i] = new Phone();
        }

        //заполнение массива объектов (без использования конструктора)
        phone[0].model = "Xiaomi Readme 5A";
        phone[0].diag = 5;
        phone[0].rom = 2;
        phone[0].flash = 16;
        phone[0].batCapacity = 5000;

        phone[1].model = "2E E450A 2018";
        phone[1].diag = 4.5;
        phone[1].rom = 1;
        phone[1].flash = 8;
        phone[1].batCapacity = 1500;

        phone[2].model = "Galaxy S21 5G";
        phone[2].diag = 6.2;
        phone[2].rom = 8;
        phone[2].flash = 128;
        phone[2].batCapacity = 4000;

        phone[3].model = "Nokia 1.3";
        phone[3].diag = 5.71;
        phone[3].rom = 1;
        phone[3].flash = 16;
        phone[3].batCapacity = 3000;

        phone[4].model = "Lenovo K520";
        phone[4].diag = 5.7;
        phone[4].rom = 4;
        phone[4].flash = 32;
        phone[4].batCapacity = 3000;

        //Выводим на печать через метод info()
        System.out.println("Массив объектов класса Телефон");
        System.out.println("------------------------------");

        for (int i = 0; i < phone.length; i++) {
              System.out.println("Телефон " + (i + 1));
              phone[i].info();
              System.out.println();
        }

//        for (Phone phoneTmp : phone) {    //вариант с for each
//            phoneTmp.info();
//            System.out.println();
//        }

    }


}

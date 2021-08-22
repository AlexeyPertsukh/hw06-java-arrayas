package DZ6_04;

//Класс - телефон
public class Phone {
    String  model;          //модель
    double  diag;           //диагональ
    double  rom;            //ОЗУ
    double  flash;          //флэш
    int     batCapacity;    //емкость аккумулятора

    public void info()
    {
        System.out.printf("Модель: %s \n", model );
        System.out.printf("Диагональ: %.2f\" \n", diag );
        System.out.printf("ОЗУ: %.1f Гб \n", rom );
        System.out.printf("Флэш: %.1f Гб \n", flash );
        System.out.printf("Емкость аккумулятора: %d мАч \n", batCapacity );
    }
}

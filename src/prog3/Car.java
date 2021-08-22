package DZ6_03;

//Класс - автомобиль
public class Car {
    String  model;
    String  color;
    int     year;       //год выпуска
    double  engVolume;  //объем двигателя

    public void info()
    {
        System.out.printf("Модель: %s \n", model );
        System.out.printf("Год выпуска: %d \n", year );
        System.out.printf("Цвет: %s \n", color );
        System.out.printf("Объем двигателя: %.1f л\n", engVolume );
    }

}

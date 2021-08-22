package DZ6_03;

//Класс - собака
public class Dog {
    String  nickname;       //кличка
    String  breed;          //порода
    double  weight;         //вес
    boolean vaccina;        //прививки

    public void info()
    {
        String vacStr = vaccina ? "есть" : "нет";

        System.out.printf("Кличка: %s \n", nickname );
        System.out.printf("Порода: %s \n", breed );
        System.out.printf("Вес: %.1f кг \n", weight );
        System.out.printf("Прививки: %s \n", vacStr );
    }
}

package DZ6_03;

//Класс - государство
public class State {
    String  name;               //название
    String  capitalCity;        //столица
    double populationMln;       //население млн. чел.
    double  area;               //площадь км2

    public void info()
    {
        System.out.printf("%s \n", name );
        System.out.printf("Столица: %s \n", capitalCity );
        System.out.printf("Население: %.3f млн. чел. \n", populationMln);
        System.out.printf("Площадь: %.1f км2 \n", area );
    }

}

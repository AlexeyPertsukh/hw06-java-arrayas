/*
3. Создать три класса(любые: автомобиль, собака, государство)
Реализовать метод info - печатает на консоль.
В main создать по три объекта каждого.
Демонстрация метода info.
 */
package DZ6_03;

public class Main3 {
    public static void main(String[] args) {

        //Создание объектов и их заполнение (без использования конструктора)
        //Государства
        State   state1 = new State();
        state1.name = "Канада";
        state1.capitalCity = "Оттава";
        state1.populationMln = 37.60;
        state1.area = 9_984_670;

        State   state2 = new State();
        state2.name = "ФРГ";
        state2.capitalCity = "Берлин";
        state2.populationMln = 83.01;
        state2.area = 357_385;

        State   state3 = new State();
        state3.name = "Монголия";
        state3.capitalCity = "Улан-Батор";
        state3.populationMln = 3.25;
        state3.area = 1_564_116;


        System.out.println("\n---ГОСУДАРСТВА---");
        state1.info();

        System.out.println();
        state2.info();

        System.out.println();
        state3.info();

        //Автомобили
        Car car1 = new Car();
        car1.model = "ЗАЗ 965";
        car1.year  = 1969;
        car1.color = "красный";
        car1.engVolume = 0.4;

        Car car2 = new Car();
        car2.model = "Daewoo Lanos";
        car2.year  = 2004;
        car2.color = "желтый";
        car2.engVolume = 1.5;

        Car car3 = new Car();
        car3.model = "BMW 520";
        car3.year  = 1989;
        car3.color = "черный";
        car3.engVolume = 2.0;

        System.out.println("\n---АВТОМОБИЛИ---");
        car1.info();

        System.out.println();
        car2.info();

        System.out.println();
        car3.info();

        //Собаки
        Dog dog1 = new Dog();
        dog1.nickname = "Шварцнейгер";
        dog1.breed = "болонка";
        dog1.weight = 1.2;
        dog1.vaccina = true;

        Dog dog2 = new Dog();
        dog2.nickname = "Тузик";
        dog2.breed = "дворняга";
        dog2.weight = 3.5;
        dog2.vaccina = false;

        Dog dog3 = new Dog();
        dog3.nickname = "Фриц";
        dog3.breed = "немецкая овчарка";
        dog3.weight = 8;
        dog3.vaccina = true;

        System.out.println("\n---СОБАКИ---");
        dog1.info();

        System.out.println();
        dog2.info();

        System.out.println();
        dog3.info();

    }
}

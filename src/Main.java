public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

        private static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        }

    private static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
    }

    private static void task3() {
        System.out.println ("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
    }

    private static void task4() {
        System.out.println ("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    private static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    private static void task6() {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeightBoxer = boxer1 + boxer2;
        System.out.println("Общий вес бойцов " + totalWeightBoxer + " кг");
        var weightDifferenceBoxer = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + weightDifferenceBoxer + " кг");
    }

    private static void task7() {
        System.out.println("Задание 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeightBoxer = boxer2 - boxer1;
        System.out.println ("Разница между весами бойцов " + totalWeightBoxer + " кг");
        totalWeightBoxer = boxer2 % boxer1;
        System.out.println ("Разница между весами бойцов с помощью функции остатка " + totalWeightBoxer + " кг");
    }

    private static void task8() {
        System.out.println("Задание 8");
        var hourOfOperation = 640;
        var DedicatedTimeToWork = 8;
        var people = hourOfOperation / DedicatedTimeToWork;
        System.out.println ("Всего работников в компании - " + people + " человек.");
        var people1 = 80;
        var people2 = 94;
        var totalNumberOfPeople = people1 + people2;
        var dividedWorkingHours = hourOfOperation / totalNumberOfPeople;
        System.out.println("Если в компании работает " + totalNumberOfPeople + " человек, " + "то всего " + dividedWorkingHours + " часа работы может быть поделено между сотрудниками.");
    }
    }
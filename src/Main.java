public class Main {
    public static void main(String[] args) {
        task1();    //задача ввывод данных.
        task2();    //задача на сложение.
        task3();    //задача на сообразительность.
        task4();    //сложение и деление.
        task5();    //операции с нецелым числом.
        task6();    //операции сложения и вычитания используя имя переменной.
        task7();    //% операция остаток от деления.
        task8();    //общая задача с выводом sout.
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task2 () {
        System.out.println(" "); // это пропуск строки между заданиями
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("2000 years later..."); // оповещение об изменении значений
        dog += 4; // dog = dog + 4;
        cat += 4; // cat = cat + 4;
        paper += 4; // paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task3(){
        System.out.println(" "); // пропуск строки
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println("После рапродажи. Подсчет остатка."); // оповещение об изменении значений
        dog -= 3.5; // dog = dog - 3.5;
        cat -= 1.6; // cat = cat - 1.6;
        paper -= 7639; // paper = paper -
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
    public static void task4(){
        System.out.println(" "); // пропуск строки
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = "+ friend);
        friend = friend + friend;
        System.out.println("friend = "+ friend);
        friend /= 7; // friend = friend / 7;
        System.out.println("friend = "+ friend);
    }
    public static void task5(){
        System.out.println(" "); // пропуск строки
        System.out.println("Задача 5");
        var frog =3.5;
        System.out.println("frog = "+ frog);
        frog *= 10; // frog = frog * 10;
        System.out.println("frog = "+ frog);
        frog /= 3.5;
        System.out.println("frog = "+ frog);
        frog += 4;
        System.out.println("frog = "+ frog);
    }
    public static void task6(){
        System.out.println(" "); // пропуск строки
        System.out.println("Задача 6");
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        System.out.println("Вес первого бойца = "+ firstFighter + " кг.");
        System.out.println("Вес второго бойца = "+ secondFighter + " кг.");
        var sum = firstFighter + secondFighter;
        System.out.println("Вес двух бойцов = "+ sum + " кг.");
        var dif = secondFighter - firstFighter; // тунельное решение c преднамеренным знанием что второй весит больше чем первый. лучше делать через int и if.
        System.out.println("Разница веса двух бойцов = "+ dif + " кг.");
    }
    public static void task7(){
        System.out.println(" "); // пропуск строки
        System.out.println("Задача 7");
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var subtraction = secondFighter - firstFighter;
        System.out.println("Результат вычитания = " + subtraction + " кг.");
        var modulo = secondFighter % firstFighter;
        System.out.println("Остаток от деления = " + modulo + " кг.");
    }
    public static void task8(){
        System.out.println(" "); // пропуск строки
        System.out.println("Задача 8");
        var staff = 640 / 8;
        System.out.println("Всего работников в компании — " + staff + " человек");
        var moreStaff = 94;
        var allStaff = moreStaff+staff;
        var SumTime = allStaff * 8;
        System.out.println("Если в компании работает " +allStaff+ " человек, то всего " +SumTime+ " часов работы может быть поделено между сотрудниками.");
    }
}
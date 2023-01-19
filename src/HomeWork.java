public class HomeWork {

    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
        task4();
        taskTest();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task0() {
        System.out.println("Задача ТЕСТ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);

        }
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Число " + i);
        }

    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Число " + i);

        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);

        }

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);

        }
    }

    public static void taskTest() {
        System.out.println();
        System.out.println("Задача ТЕСТ");
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Високосный год " + i);

        }

    }

    public static void task5() {
        System.out.println();
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");

        }
    }

    public static void task6() {
        System.out.println();
        System.out.println("Задача 6");
        for (int i = 0; i <= 100; i = i + 7) {
            System.out.println(i);

        }

    }

    public static void task7() {
        System.out.println();
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);

        }
    }

    public static void taskTest2() {
        System.out.println();
        System.out.println("Задача ТЕСТ2");
        int salary = 65535;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;

            System.out.println("Месяц " + i + " Итого " + total);


        }
        System.out.println(total);
    }

    public static void task8() {
        System.out.println();
        System.out.println("Задача 8");
        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накопления равна " + total + " рублей.");
        }


    }

    public static void task9() {
        System.out.println();
        System.out.println("Задача 9");
        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накопления равна " + total + " рублей.");
        }

    }
    public static void task10() {
        System.out.println();
        System.out.println("Задача 10");
        int a = 6;
        for (int i = 1; i <=10 ; i++) {

                System.out.println(a + "*" + i + "=" + (a*i));
        }

    }
}



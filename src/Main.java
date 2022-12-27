public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1() {
        int age = 18;
        if(age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний ");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг" +
                    " совершеннолетия, нужно немного подождать ");
        }
    }

    public static void task2() {
        int temperatureOutdoor = 6;
        if(temperatureOutdoor < 5) {
            System.out.println("На улице " + temperatureOutdoor + " градусов, нужно надеть шапку.");
        }
        if(temperatureOutdoor > 5) {
            System.out.println("На улице " + temperatureOutdoor + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        int speed = 70;
        if(speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if(speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        int age = 14;
        if(age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if(age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if(age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if(age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        int age = 9;
        if(age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if(age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно " +
                    "кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if(age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему" +
                    " можно кататься без сопровождения взрослого");
        }
    }

    public static void task6() {
        int numberOfSeatsInTheVan = 61;
        if (numberOfSeatsInTheVan < 60) {
            System.out.println("В вагоне есть сидячее место.");
        }
        if (numberOfSeatsInTheVan >= 60 && numberOfSeatsInTheVan < 102) {
            System.out.println("В вагоне есть стоячее место.");
        }
        else {
            System.out.println("Вагон полностью забит.");
        }
    }

    public static void task7() {
        int one = 121;
        int two = 22;
        int three = 34;
        if (one > two) {
            if (one > three) {
                System.out.println("Самое большое число one: " + one);
            }
            else {
                System.out.println("Самое большое число three: " + three);
            }
        }
        else {
            if (two > three) {
                System.out.println("Самое большое число two: " + two);
            }
            else {
                System.out.println("Самое большое число three: " + three);
            }
        }
    }
}





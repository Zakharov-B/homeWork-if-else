//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // task 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        // task 2
        int temperature = 0;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        // task 3
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        // task 4
        int personAge = 50;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        }
        if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        }
        if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то его место в университете");
        }
        if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу");
        }
        // task 5
        int childAge = 22;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        // task 6
        int passengers = 85;
        int totalSeats = 102;
        int sittingSeats = 60;
        if (passengers < sittingSeats) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (passengers >= sittingSeats && passengers < totalSeats) {
            System.out.println("В вагоне есть только стоячие места");
        }
        if (passengers >= totalSeats) {
            System.out.println("Вагон уже полностью забит");
        }
        // task 7
        int one = 10;
        int two = 25;
        int three = 15;
        int max;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число в переменной one, равно" + one);
        } else {
            if (two >= three) {
                System.out.println("Наибольшее число в переменной two, равно" + two);
            } else {
                System.out.println("Наибольшее число в переменной three, равно" + three);
            }

        }
    }
}


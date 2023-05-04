public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();

    }
    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("i", "I");
        fullName = fullName.replace("v", "V");
        fullName = fullName.replace("a", "A");
        fullName = fullName.replace("n", "N");
        fullName = fullName.replace("o", "O");
        fullName = fullName.replace("c", "C");
        fullName = fullName.replace("h", "H");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println();

        System.out.println("или");
        System.out.println();
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}
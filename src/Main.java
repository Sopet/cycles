public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }


        System.out.println("\nЗадача 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }


        System.out.println("\nЗадача 3");
        for (int i = 0; i <= 17; i = i + 2){
            System.out.println(i);
        }


        System.out.println("\nЗадача 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }


        System.out.println("\nЗадача 5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i + " год является високосным");
        }


        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }


        System.out.println("\nЗадача 7");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }


        System.out.println("\nЗадача 8");
        int salary = 29000;
        int total = 0;
        for (int month = 1; month <= 12; month++){
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }


        System.out.println("\nЗадача 9");
        int salaryProcent = 29000;
        int totalProcent = 0;
        for (int month = 1; month <= 12; month++){
            totalProcent = totalProcent + salaryProcent/100;
            totalProcent = totalProcent + salaryProcent;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalProcent + " рублей");
        }


        System.out.println("\nЗадача 10");
        for (int i = 1; i <= 10; i++){
            System.out.println("2*" + i + "=" + 2*i);
        }
    }
}
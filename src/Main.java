public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
    }

    public static void task1() {
        int z = 0;
        while (z < 10) {
           z = z + 1;
            System.out.print(z);
        }
        System.out.println ();
        for (int i = 10; i >= 1; i -= 1) {
            System.out.print(i);

        }
    }



    public static void task2() {
        int firstFridayDT = 3;
        int monthLength = 31;
        for (;firstFridayDT <= monthLength;  firstFridayDT += 7) {
            System.out.println("Сегодня пятница, " + firstFridayDT + "-е число. Необходимо подготовить отчет.");
        }

    }


    public static void task3() {
        int year = 2022;
        int yearBefore = year - 200;
        int yearComet = 0;
        do {
            if (yearComet >= yearBefore && yearComet <= year) {
                System.out.println(yearComet);
            }
            yearComet += 79;
        } while (yearComet <= year);
        System.out.println(yearComet);
        }

    }






//((date - firstFridayDT) % 7 == 0 || date == firstFridayDT);date <= monthLength)
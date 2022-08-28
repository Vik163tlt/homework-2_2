public class Main {
    public static void main(String[] args) {
//Задание 1
        System.out.println("Задание 1");
        int dog = 44;
        System.out.println("Значение переменной dog с типом int равно " + dog);
        short cat = 12;
        System.out.println("Значение переменной cat с типом short равно " + cat);
        byte mouse = 2;
        System.out.println("Значение переменной mouse с типом byte равно " + mouse);
        long elephant = 1900L;
        System.out.println("Значение переменной elephant с типом long равно " + elephant);
        double sugarWeight = 7.11;
        System.out.println("Значение переменной sugarWeight с типом double равно " + sugarWeight);
        float saltWeight = 3.12f;
        System.out.println("Значение переменной saltWeight с типом float равно " + saltWeight);

//Задание 2
        System.out.println("Задание 2");
        double bed = 27.12;
        byte table = 67;
        float tv = 2.786f;
        int sofa = -159;
        short wardrobe = 569;
        long hanger = 987678965549L;
        short bath = 27897;
        char minus = 45;
        boolean bedIsAdult = bed < 8;
        System.out.println(bed);
        System.out.println(table);
        System.out.println(tv);
        System.out.println(sofa);
        System.out.println(wardrobe);
        System.out.println(hanger);
        System.out.println(minus);
        System.out.println(bath);
        System.out.println(bedIsAdult);

//Задание 3
        System.out.println("Задание 3");
        int lp = 23;
        int as = 27;
        int ea = 30;
        int sheetsAll = 480;
        System.out.println("На каждого ученика расчитано " + sheetsAll / (lp + as + ea) + " листов бумаги");

//Задание 4
        System.out.println("Задание 4");
        int machineBottle = 16;
        int minuts20 = 20;
        int day = 24 * 60;
        int day3 = day * 3;
        int month = day * 30;
        machineBottle = machineBottle / 2;
        System.out.println("За 20 минут машина произвела " + machineBottle * minuts20 + " шт. бутылок");
        System.out.println("За сутки машина произвела " + machineBottle * day + " шт. бутылок");
        System.out.println("За 3 дня машина произвела " + machineBottle * day3 + " шт. бутылок");
        System.out.println("За месяц машина произвела " + machineBottle * month + " шт. бутылок");

//Задание 5
        System.out.println("Задание 5");
        int bankAll = 120;
        int classAll = 2;
        int class1 = 2;
        int class2 = 4;
        System.out.println("В школе, где " + classAll + " класса, нужно " + bankAll / (class1 + class2) * class1 + " банок белой краски и " + bankAll / (class1 + class2) * class2 + " банок коричневой краски");

//Задание 6
        System.out.println("Задание 6");
        int bananasQuantity = 5;
        int bananasWeight = 80;
        int milkVolume = 2;
        int milk100ml = 105;
        int milkWeight = milk100ml + 5;
        int iceCreamQuantity = 2;
        int iceCreamWeight = 100;
        int egsQuantity = 4;
        int egsWeight = 70;
        double totalWeight = bananasQuantity * bananasWeight + milkWeight * milkVolume + iceCreamWeight * iceCreamQuantity + egsWeight * egsQuantity;
        System.out.println("Общий вес спортивного завтрака: " + totalWeight + " грамм");
        double totalWeightKg = totalWeight / 1000;
        System.out.println("Общий вес завтрака в кг: " + totalWeightKg + " кг");

//Задание 7
        System.out.println("Задание 7");
        var weightAll = 7000;
        var weight250 = 250;
        var weight500 = 500;
        var dayWeght250 = weightAll / weight250;
        var dayWeight500 = weightAll / weight500;
        var dayAverage = (dayWeght250 + dayWeight500) / 2;
        System.out.println("Если боксер будет худеть на 250 грамм в день, то он похудеет на " + weightAll / 1000 + "кг. за " + dayWeght250 + " дней. А если будет худеть на 500 грамм в день, то похудеет за " + dayWeight500 + " дней.");
        System.out.println("В среднем потребуется " + dayAverage + " день, чтобы добиться результата похудения.");

//Задание 8
        System.out.println("Задание 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int salaryIncreasePercent = 10;
        int salarylncreaseMasha = salaryMasha + salaryMasha * salaryIncreasePercent / 100;
        int salarylncreaseDenis = salaryDenis + salaryDenis * salaryIncreasePercent / 100;
        int salarylncreaseKristina = salaryKristina + salaryKristina * salaryIncreasePercent / 100;
        int salaryDifferenceMasha = salarylncreaseMasha - salaryMasha;
        int salaryDifferenceDenis = salarylncreaseDenis - salaryDenis;
        int salaryDifferenceKristina = salarylncreaseKristina - salaryKristina;

        System.out.println("Зарплата Маши после повышения зарплаты составляет: " + salarylncreaseMasha + "р. Дениса: " + salarylncreaseDenis + "р. Кристины: " + salarylncreaseKristina + "р.");
        System.out.println("Зарплата Маши увеличилась на " + salaryDifferenceMasha + "р., Дениса на: " + salaryDifferenceDenis + "р., Кристины на: " + salaryDifferenceKristina + "р.");

    }
}
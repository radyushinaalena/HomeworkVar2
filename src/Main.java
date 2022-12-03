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
    public static void task1() {
        System.out.println("Задача 1");
        int a = 1000000;
        byte b = -10;
        short c = 5000;
        long d = 8975L;
        float e = 5.8f;
        double f = 6.98727365555435;
        System.out.println("Значение переменной a с типом int равно "+a);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной c с типом short равно "+c);
        System.out.println("Значение переменной d с типом long равно "+d);
        System.out.println("Значение переменной e с типом float равно "+e);
        System.out.println("Значение переменной f с типом double равно "+f);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("d = "+d);
        System.out.println("e = "+e);
        System.out.println("f = "+f);
        System.out.println("g = "+g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte l = 23;
        byte a = 27;
        byte e = 30;
        short list = 480;
        short uchenikov = (short)(l+a+e);
        short listik = (short)(list/uchenikov);
        System.out.println("На каждого ученика рассчитано "+listik+" листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte but2Min = 16;
        byte butMin = (byte)(but2Min/2);
        byte a = 20;
        short prA = (short)(butMin*a);
        System.out.println("За "+a+" минут машина произвела "+prA+" бутылок");
        short chasov=24;
        short minut = (short)(chasov*60);
        int prB = minut*butMin;
        System.out.println("За сутки машина произвела "+prB+" бутылок");
        int troeSut = minut*3;
        int prC = troeSut*butMin;
        System.out.println("За 3 дня машина произвела "+prC+" бутылок");
        int mes = minut*30;
        int prD = mes*butMin;
        System.out.println("За месяц машина произвела "+prD+" бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whiteForOne = 2;
        byte brownForOne = 4;
        byte cansForOne = (byte)(whiteForOne+brownForOne);
        byte classes = (byte)(totalCans/cansForOne);
        byte white = (byte)(whiteForOne*classes);
        byte brown = (byte)(brownForOne*classes);
        System.out.println("В школе, где "+classes+" классов, нужно "+white+" банок белой краски и "+brown+" банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        short milkIn100 = 105;
        byte plombir = 2;
        short plombirWeight  = 100;
        byte eggs = 4;
        byte eggsWeight = 70;
        int weightInGr = bananas*bananaWeight+(milk/100)*milkIn100+plombir*plombirWeight+eggs*eggsWeight;
        double weightInKg = weightInGr/1_000D;
        System.out.println("Вес завтрака "+weightInGr+" грамм или "+weightInKg+" килограмм");
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte massInKg = 7;
        short massInGr = (short)(massInKg*1000);
        short days250 = (short)(massInGr/250);
        short days500 = (short)(massInGr/500);
        short daysAverage = (short)((days250+days500)/2);
        System.out.println("На похудение уйдет "+days250+" дней, если терять по 250 г в день.");
        System.out.println("На похудение уйдет "+days500+" дней, если терять по 500 г в день.");
        System.out.println("В среднем на похудение уйдет "+daysAverage+" дней.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        float masha = 67760f;
        float den = 83690f;
        float kris = 76230f;
        float mashaNew = masha*1.1f;
        float denNew = den*1.1f;
        float krisNew = kris*1.1f;
        double mashaPerYear = masha*12;
        double denPerYear = den*12;
        double krisPerYear = kris*12;
        double mashaPerYearNew = mashaNew*12;
        double denPerYearNew = denNew*12;
        double krisPerYearNew = krisNew*12;
        double mashaDiff = mashaPerYearNew-mashaPerYear;
        double denDiff = denPerYearNew-denPerYear;
        double krisDiff = krisPerYearNew-krisPerYear;
        System.out.println("Маша теперь получает "+mashaNew+" рублей. Годовой доход вырос на "+mashaDiff+" рублей.");
        System.out.println("Денис теперь получает "+denNew+" рублей. Годовой доход вырос на "+denDiff+" рублей.");
        System.out.println("Кристина теперь получает "+krisNew+" рублей. Годовой доход вырос на "+krisDiff+" рублей.");
    }
}
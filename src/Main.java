public class Main {

    public static void main( String [] args) {
        // Задание 1

        byte apple = 2;
                System.out.println(apple);
short pear = 10;
System.out.println(pear);
int watermelon = 100;
System.out.println(watermelon);
long melon = 500L;
System.out.println(melon);
float sugar = 1.5f;
System.out.println(sugar + " кг.");
double flour = 2000.30;
System.out.println(flour + " кг.");
char c = 33;
char d = '!';
System.out.println(c + " = " + d);
int age = 20;


        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOfAllBoxers + " кг.");
        System.out.println("Разница в весе боксеров " + weightDifference + " кг.");

        // Задание 3
        int bananes = 5 * 80;
        System.out.println(bananes + " гр.");
        int milk = 200 * 105 / 100;
        System.out.println(milk + " гр.");
        int iceCreamSundae = 2 * 100;
        System.out.println(iceCreamSundae + " гр.");
        int rawEggs = 4 * 70;
        System.out.println(rawEggs + " гр.");
        int weightGr = bananes + milk + iceCreamSundae + rawEggs;
        System.out.println("Общий вес спорт-завтрака " + weightGr + " гр.");
        int grPerKg = 1000;
        float weghtKg = weightGr / (float)grPerKg;
        System.out.println("Общий вес спорт-завтрака " + weghtKg + " кг.");

        // Задание 4
        int totalWeight = 7 * 1000;
        short a = 250;
        short b = 500;
        int dayA = totalWeight/ a;
        System.out.println("Если терять по 250 гр. в день, нужно " + dayA + " дней");
        int dayB = totalWeight / b;
        System.out.println("Если терять по 500 гр. в день, нужно " + dayB + " дней");

        // Задание 5
        int mashaGetsMonth = 67760;
        int denisGetsMonth = 83690;
        int kristinaGetsMonth = 76230;
        int mashaGetsYear = mashaGetsMonth * 12;
        int denisGetsYear = denisGetsMonth * 12;
        int kristinaGetsYear = kristinaGetsMonth * 12;
        long mashaWillGetMonth = mashaGetsMonth + 67760 / 100 * 10;
        long denisWillGetMonth = denisGetsMonth + 83690 / 100 * 10;
        long kristinaWillGetMonth = kristinaGetsMonth + 76230 / 100 * 10;
        long mashaWillGetYear = mashaWillGetMonth * 12 - mashaGetsYear;
        long denisWillGetYear = denisWillGetMonth * 12 - denisGetsYear;
        long kristinaWillGetYear = kristinaWillGetMonth * 12 - kristinaGetsYear;
        System.out.println("Маша теперь получает " + mashaWillGetMonth + " рублей в месяц. Годовой доход вырос на " + mashaWillGetYear + " рублей");
        System.out.println("Денис теперь получает " + denisWillGetMonth + " рублей в месяц. Годовой доход вырос на " + denisWillGetYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinaWillGetMonth + " рублей в месяц. Годовой доход вырос на " + kristinaWillGetYear + " рублей");















    }
}
public class Main {
    public static void main(String[] args) {byte a =66;
        System.out.println(a);
        short b = 31166;
        System.out.println(b);
        int c = 1223322568;
        System.out.println(c);
        long d = 7568462486248624862l;
        System.out.println(d);
        float e = -2.4f + 34;
        System.out.println(e);
        double f = 1.6d + 230;
        System.out.println(f);

        double z =  27.12;
        long x = 987678965549l;
        double v = 2.786;
        short n = 569;
        short m = -159;
        short l = 27897;
        byte k = 67;

        byte luda = 23;
        byte anna = 27;
        byte katy = 30;
        short paper = 480;
        int student = luda + anna + katy;
        System.out.println(" Колличество всех " + student + " учеников ");
        int sheetsOfPaper = paper / student;
        System.out.println(" На каждого ученика расчитано " + sheetsOfPaper + " листов бумаги ");

        byte bottle = 16;
        byte time = 2;
        int timeBottle = bottle / time;
        System.out.println(" колличество " + timeBottle + " бутылок за 1 минуту ");
        byte time20 = 20;
        int time1 = timeBottle * time20;
        System.out.println(" За 20 минут машина произвела " + time1 + " штук бутылок ");
        short timeDai = 1440;
        int timeBottle2 = timeBottle * timeDai;
        System.out.println(" За сутки машина произвела " + timeBottle2 + " штук бутылок ");
        short  timeDai3 = 3;
        int timeBottle3 = timeBottle2 * timeDai3;
        System.out.println(" За 3 дня машина произвела " + timeBottle3 + " штук бутылок ");
        byte timeMonth = 30;
        int timeBottle4 = timeBottle2 * timeMonth;
        System.out.println(" За 1 месяц машина произвела " + timeBottle4 + " штук бутылок ");

        System.out.println(" задача № 5 ");
        byte jarDye = 120;
        byte whiteDye = 2;
        byte brownDye = 4;
        int whiteBrown = whiteDye + brownDye;
        System.out.println(" Колличество белой и коричневой " + whiteBrown + " банок на один класс");
        int clasDye = jarDye / whiteBrown;
        System.out.println(" Колличество" + clasDye + " классов  ");
        int whitePrint = whiteDye * clasDye;
        System.out.println( " Колличество белой " + whitePrint + " краски " );
        int brownPrint = brownDye * clasDye;
        System.out.println( " Колличесство коричневой " + brownPrint + " краски ");

        System.out.println( " Задачача № 6 ");
        byte bananas = 5;
        long milk = 2;
        byte iceCream = 2;
        byte egs = 4;
        long babanasMassa = bananas * 80;
        System.out.println(" Масса бананов" + babanasMassa + " грамм ");
        long milkMassa = milk * 105;
        System.out.println(" Масса молока " + milkMassa + " грамм ");
        long iceCreamMassa = iceCream * 100;
        System.out.println( " Масса молока " + iceCreamMassa + " грамм ");
        long egsMassa = egs * 70;
        System.out.println(" Масса яиц " + egsMassa + " грамм ");
        long massa = babanasMassa + milkMassa + iceCreamMassa + egsMassa;
        System.out.println( " Масса завтрака " + massa + " грамм ");
        float massaKg = massa / 1000f;
        System.out.println( " Масса завтрака " + massaKg + " кг ");

        System.out.println( " задача № 7");
        int oneDay = 250;
        int twyDay = 500;
        int needReset = 7000;
        int needOneDay = needReset / oneDay;
        System.out.println( " За " + needOneDay + " дней ");
        int needTwyDay = needReset / twyDay;
        System.out.println(" За " + needTwyDay + " дней"); }}




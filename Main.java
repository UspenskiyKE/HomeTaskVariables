public class Main {
    public static void main(String[] args)
    {
        // Задача 1
       byte a=7;
       short b=15;
       int c=218;
       long D=7000000000L;
       float E=7.384f;
       double F=88.3333888852;
       char G=45;
       char H='M';
       boolean I=true;

       //Задача 2
        float firstBoxerWeight=78.2f;
        float secondBoxerWeight=82.7f;
        float totalBoxersWeight=firstBoxerWeight+secondBoxerWeight;
        float diffBoxersWeight=secondBoxerWeight-firstBoxerWeight;
        System.out.println("Общий вес двух бойцов: "+totalBoxersWeight);
        System.out.println("Разница между весами бойцов: "+diffBoxersWeight);


       //Задача 3
        int bananaWeight=80;
        int milkWeight=105;
        int icecreamWeight=100;
        int eggWeight=70;
        float totalWeight=5*bananaWeight+2*milkWeight+2*icecreamWeight+4*eggWeight;
        float totalWeightKg=totalWeight/1000;
        System.out.println("Общий вес завтрака в килограммах: "+totalWeightKg);

        //Задача 4
        int overWeight=7000;
        int weightDrop1=250;
        int weightDrop2=500;
        int numberDays1=overWeight/weightDrop1;
        int numberDays2=overWeight/weightDrop2;
        System.out.println("Количество дней в первом случае: "+numberDays1);
        System.out.println("Количество дней во втором случае: "+numberDays2);

        //Задача 5
       double monthMasha=67760;
       double monthDenis=83690;
       double monthKristina=76230;
       double monthMashaNew=monthMasha*1.1;
       double monthDenisNew=monthDenis*1.1;
       double monthKristinaNew=monthKristina*1.1;
       double yearMashaNew=12*monthMashaNew;
       double yearDenisNew=12*monthDenisNew;
       double yearKristinaNew=12*monthKristinaNew;
       double yearMasha=12*monthMasha;
       double yearDenis=12*monthDenis;
       double yearKristina=12*monthKristina;
       double diffMasha=yearMashaNew-yearMasha;
       double diffDenis=yearDenisNew-yearDenis;
       double diffKristina=yearKristinaNew-yearKristina;
       System.out.println("Маша теперь получает: "+monthMashaNew+". Годовой доход вырос на "+diffMasha);
       System.out.println("Денис теперь получает: "+monthDenisNew+". Годовой доход вырос на "+diffDenis);
       System.out.println("Кристина теперь получает: "+monthKristinaNew+". Годовой доход вырос на "+diffKristina);


    }
}

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int total = 0;
        int money = 15000;
        int i = 0;
        while(total<2459000){
            i++;
            total+=money;
            System.out.println("Месяц "+ i +" , сумма накоплений равна " + total + " рублей");
        }
        // Задача 2
        i=0;
        while(i<10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for(i=10;i>0;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //Задача 3
        int population = 12_000_000;
        int birthRate =17;
        int deathRate = 8;
        for(int k=1;k<=10;k++){
            population=population+17*population/1000-deathRate;
            System.out.println("Год " + k + " численность населения составляет "+ population);
        }

    }
}
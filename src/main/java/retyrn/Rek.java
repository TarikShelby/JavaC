package retyrn;

public class Rek {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.age = 10;
        baby.name = "Misha";
        baby.jump();
        baby.speak();
        Baby baby1 = new Baby();
        baby1.name = "Serega";
        baby1.age = 11;
        baby1.jump();
        baby1.speak();
        int myshka = baby.CalculatorDoPensii();
        int myshka1 = baby1.CalculatorDoPensii();
        System.out.println("Меня звать " + baby.name +  " До 18 лет мне осталось : " + myshka);
        System.out.println("Меня звать " + baby1.name + " До 18 лет мне осталось : " + myshka1);


    }

    static class Baby {
        String name;
        int age;

        void speak() {
            System.out.println("Hello меня звать " + name + " Мне " + age + " Лет");
        }

        void jump() {
            System.out.println(" ПРРыг ");
        }

        int CalculatorDoPensii() {
            int po = 18 - age;
            return po;
        }

    }
}

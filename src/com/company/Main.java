package com.company;

import org.w3c.dom.css.CSSCharsetRule;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        Car деген класс тузунуз (Id, номер авто)
//        Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
//        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.

        HashMap<Integer, String> map = new HashMap<Integer,String>();
        map.put(1,"h");
        map.put(2,"i");
        map.put(3," ");



        HashMap<Car, DataOfCar> hashMap = new HashMap<Car,DataOfCar>();
        hashMap.put(new Car(1,123),new DataOfCar("white", "Lexus ES", 24000, 2012));
        hashMap.put(new Car(2,12234),new DataOfCar("blue","BMW X6", 16200, 2009));
        hashMap.put(new Car(3,12345),new DataOfCar("white with black","Toyota Crown Majesta", 13200, 2010));
        hashMap.put(new Car(4,123456), new DataOfCar("black", "Mercedes-Benz G-class", 22000, 2003));

        System.out.println("Initial Mappings are: \n" + hashMap);

        System.out.println("\nThe set is: \n" + hashMap.entrySet());



        /*Map<Integer, String> school = new HashMap();
        school.put(1,"peaksoft");
        school.put(2,"70");
        school.put(3,"13");

        System.out.println(school);
        System.out.println("----------------");

        System.out.println(school.get(3));
        System.out.println("----------------");

        for (Integer java: school.keySet() ) {
            System.out.println(school.get(java));
        }
        System.out.println("----------------");

        for (Map.Entry map: school.entrySet()) {
            System.out.println(school.entrySet());
        }
        System.out.println("----------------"); */
    }
}

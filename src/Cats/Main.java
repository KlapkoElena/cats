package Cats;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        System.out.println("Available cats: \n" + getListCat());

        System.out.println("""
                List of cats after the change of residence:
                - Persian - to Tehran;
                - Himalayan - to Tibet;
                - Sphinxes - to Giza: \n""");
        List<Cat> list = newCity();
        System.out.println(list);
    }

    // создание объектов "Кот" и добавление их в список
    public static List<Cat> getListCat() {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Simba", "Persian", "Kyiv"));
        catList.add(new Cat("Tabby", "Himalayan", "Dnipro"));
        catList.add(new Cat("Shaman", "Persian", "Harkiv"));
        catList.add(new Cat("Argo", "Sphinxes", "Lviv"));
        catList.add(new Cat("Brid", "Himalayan", "Odessa"));
        return catList;
    }

    // смена города кота в зависимости от породы
    public static List<Cat> newCity() {
        List<Cat> newCity = getListCat();
        for (Cat cat : newCity) {
            if (Objects.equals(cat.getBreed(), "Persian")) {
                cat.setCity("Tehran");
            } else if (Objects.equals(cat.getBreed(), "Himalayan")) {
                cat.setCity("Tibet");
            } else if (Objects.equals(cat.getBreed(), "Sphinxes")) {
                cat.setCity("Giza");
            }
        }
        return newCity;
    }
}



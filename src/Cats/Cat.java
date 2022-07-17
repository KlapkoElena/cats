package Cats;

public class Cat {

    public String name;
    public String breed;
    public String city;

    public Cat(String name, String breed, String city) {
        this.name = name;
        this.breed = breed;
        this.city = city;
    }

    public String setCity(String city) {
        this.city = city;
        return city;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "CatName - '" + name + '\'' +
                ", breed - '" + breed + '\'' +
                ", city - '" + city + '\'' + "; \n";
    }
}





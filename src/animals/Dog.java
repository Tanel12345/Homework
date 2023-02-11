package animals;

public class Dog {
    private String name;
    private Integer age;
    private String gender;
    private Integer weight;
    private String race;

    public Dog(String name, Integer age, String gender, Integer weight, String race) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.race = race;
    }
    public Dog(String gender, String race){
        new Dog("Sparky", 1, gender,1 , race);
    }



    public void setAge(Integer age) {

        if(age <= 0){
            System.out.println("Incorrect age was spsecified. pleas use values greader than zero");
            return;
        }
        this.age = age;
    }

    public void setWeight(Integer weight) {

        if(weight <= 0){
            System.out.println("Incorrect weight was spsecified. pleas use values greader than zero");
            return;
        }
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }
}

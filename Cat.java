package Task3_Cat;

public class Cat {

    private int age;
    private String name;

    public Cat() { // this is constructor
        age = 0;
        name = "CAT";
    }

    public Cat(int age, String name) {
      this.age = age;
      this.name = name;
    }

    @Override
    public String toString() {
        return "My cat name is " + this.getName() + ", it's age: " + this.getAge() + " year old.";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

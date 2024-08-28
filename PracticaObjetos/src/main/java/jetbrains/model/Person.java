package jetbrains;

public class Person {
    private String name;
    private String height;
    private String age;
    public Person(String name, String height, String age) {
        this.name = name;
        this.height = height;
        this.age = age;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }


}

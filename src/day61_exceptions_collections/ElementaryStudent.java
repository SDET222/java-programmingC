package day61_exceptions_collections;

public class ElementaryStudent {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty");
        }else{

            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<5 || age>12){
            throw new IllegalArgumentException("Age cannot be < 5 or > 12");
        } else{

            this.age = age;
        }
    }
}

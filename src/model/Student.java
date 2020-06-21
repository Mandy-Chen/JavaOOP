package model;

public class Student {
    private String name;
    private Integer age;
    private String gender;
    private Integer id;

    public Student(String name,Integer age,String gender,Integer id) {
        this.name = name;
        this.age=age;
        this.gender=gender;
        this.id=id;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

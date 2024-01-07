package cd.tomcat.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "Student")
public class Student {
    @JsonProperty
    private String name;
    @JsonProperty
    private int age;

    public Student() {}

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
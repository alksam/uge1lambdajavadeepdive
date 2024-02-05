package org.example;

public class Person {

    private String Birthday;
    private String name;


    public Person(String Birthday, String name) {
        this.Birthday = Birthday;
        this.name = name;

    }

    public String getBirthday() {
        return Birthday;
    }

    public String getName() {
        return name;
    }



    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }
}


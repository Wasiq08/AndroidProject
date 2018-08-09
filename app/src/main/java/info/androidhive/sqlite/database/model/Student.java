package info.androidhive.sqlite.database.model;

public class Student {

    String name ;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String address;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    int marks;

    public int getNumber() {
        return number;
    }


    Student(){

    }
    public void setNumber(int number) {
        this.number = number;
    }

    int number ;



}

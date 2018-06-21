public class UndergraduateStudent extends Student {
    private int year;
    //constructor
    public UndergraduateStudent(String name){
        super(name, 18);
        this.year = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //Write a version of the setAge method in the UndergraduateStudent class that not only sets the age but also
    //increments the year field’s value by one.

    @Override
    public void setAge(int age) {
        super.setAge(age);
        this.year++;
    }
}
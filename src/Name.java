public class Name {
    private String firstName;
    private String lastName;
    private char middleInitialName;

    public Name(String initialFirstName, char InitialMiddleInitialName, String initialLastName){
        this.firstName = initialFirstName;
        this.middleInitialName = InitialMiddleInitialName;
        this.lastName = initialLastName;
    }
    public String getNormalOrder(){
        return firstName + " " + middleInitialName + " " + lastName;
    }
    public String getReverseOrder(){
        return lastName + ", " + firstName + " " + middleInitialName;
    }
    public String toString() {
        return firstName + " " + middleInitialName + " " + lastName;
    }
    //define asking metodos.
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public char getmiddleInitialName(){
        return middleInitialName;
    }
    //define mutator metodos
    public void setMiddleInitialName(char middleInitialName) {
        this.middleInitialName = middleInitialName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
}

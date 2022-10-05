public class person {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        person myObj = new person();
        System.out.println("Name: "+ myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}

public class myclass2 {
    int x = 5;
    int y = 3;
    int z;
    int a = 10;

    public static void main(String[] args) {
        myclass2 myObj = new myclass2();
        System.out.println(myObj.x);

        myObj.z = 40;
        System.out.println(myObj.z);

        myObj.a = 25; //x is now 25
        System.out.println(myObj.a);

        myclass2 myObj1 = new myclass2(); // object 1
        myclass2 myObj2 = new myclass2(); // object 2

        myObj2.x =25;
        System.out.println(myObj1.x); //output 5
        System.out.println(myObj2.x); // output 25
    }
}

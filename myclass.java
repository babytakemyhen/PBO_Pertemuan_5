public class myclass {
      int x; // class attribute

    public myclass(int y){
        x=y;
    }
    // Create a class constructor for the Myclas class
    public myclass(){
        x = 5; // set the initial value for the class attribut x
    }

    public static void main(String[] args) {
        myclass myObj = new myclass(); //create an object of Class MyClas
        System.out.println(myObj.x);//print the value of x

        myclass myObj1 = new myclass(5);
        System.out.println(myObj1.x);
    }
}


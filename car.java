public class car {
    int modelYear;
    String modelName;

    public car(int year, String name){
        modelYear= year;
        modelName = name;
    }

    public static void main(String[] args) {
        car mycar = new car(1998,"Mustang");
        System.out.println(mycar.modelYear +" "+ mycar.modelName);

    }
}


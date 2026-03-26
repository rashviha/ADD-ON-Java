

class Car{
    //static variable
    static String owner = "java";
    String carname = "Mustang";
    void ManufactureYear(int year){
        System.out.println(year);
    }
}
class mustang{
    public static void main (String[] args){
        Car c = new Car();
        System.out.println(c.carname);
        
        c.ManufactureYear(1000);

}
}

public class Demo{
    String Sname;
    Demo(String Sname){
        this.Sname = Sname;
        System.out.println("This is Constructor: ");
    }
    public static void main(String[] args) {
        Demo d = new Demo("js");
        System.out.println(d.Sname);
    }
    
    }

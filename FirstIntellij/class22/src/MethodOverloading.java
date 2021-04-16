public class MethodOverloading {
    public  void print1(){
        System.out.println(" Hello");

    }
    public void print1(String name , int number ){
        for (int i = 0; i < number ; i++) {
            System.out.println(" Hello"+name+ number);
        }
    }
    public void print1(int number, String name){
        System.out.println("Hello"+number+name);

    }
    public static void main(String[] args) {
        MethodOverloading s=new MethodOverloading();
        s.print1();
        s.print1(123,"Halima");
        s.print1("Haline", 45);



    }
}


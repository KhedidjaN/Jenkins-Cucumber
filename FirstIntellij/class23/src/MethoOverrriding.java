class AnotherClass {

  private  void privateMethod(){
     System.out.println("Private");
 }
    void  defaultMethod(){
        System.out.println("default");
    }
    protected void protectedMethod(){
        System.out.println("protected");
    }
    public void publicMethod(){
        System.out.println("public");
    }  }
     class Mainn {
         public static void main(String[] args) {

    AnotherClass s=new AnotherClass();
    s.defaultMethod();
    s.protectedMethod();
    s.publicMethod();
     } }
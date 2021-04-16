 class A1 {
    // Write program to inherit class A that has
    //method printF which is static and call or
    //reuse that method into class B
   static void printF(){
       System.out.println(" I love Java");
   }

}
 class B1 extends A1{
     public static void main(String[] args) {
         A1 s=new A1();
         s.printF();

     }

         }

class ShoppingStore{
    String item;
    double price;
    double quantity;
    public ShoppingStore(String item, double price, double quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;

    }
     double itemTotalPrice(){
        double totalValue;
        totalValue=price*quantity;
        return totalValue;
    }

}

class Main {
    //Create two Object of ShoppingStore and pass the parameters to Constructor.
    //then using each object call the method itemTotalPrice.
    //Store the returned value of each object.
    //Calculate sum of both object and print the result.
    public static void main(String[]arg){
        ShoppingStore s=new ShoppingStore("Blanket",49.99,2);
        ShoppingStore s1=new ShoppingStore("Mattress", 219.59,  2);
        s.itemTotalPrice();
        s1.itemTotalPrice();
        double num1= s.itemTotalPrice();
        double num2=s1.itemTotalPrice();
        System.out.println("You purchased "+ num1*num2+ " today");
    }
}
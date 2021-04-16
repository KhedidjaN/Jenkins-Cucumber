class Area {
    //Create 1 class in which create a method that will calculate the area (volume) of
    //Rectangle
    //Square
    //Box
    //Use separate class to test your code
   double volume(int length, int width){

      return length*width;
   }
    double volume(int side ){
      return side*side;
   }
   double volume(int length ,int width , int height){
       return length*width*height;
   }

    public static void main(String[] args) {
       Area s= new Area();
       s.volume(5,4);
       s.volume(5);
       s.volume(1,5,7);

    }
}
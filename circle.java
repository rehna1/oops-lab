public class Circle
 {
  int r=5;
  double area;  

  
  public Circle() {
       area=2*3.14*r; 
  }

  public static void main(String[] args)
 {
    Circle Obj = new Circle(); 
    System.out.println(Obj.area); 
  }
}


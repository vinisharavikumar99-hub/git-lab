interface Resizable
{
void resizeWidth(int width);
void resizeHeight(int height);
}
class Rectangle implements Resizable {
int width;
int height;
Rectangle(int width, int height){
this.width=width;
this.height=height;
}
public void resizeWidth(int width){
this.width=width;
}
public void resizeHeight(int height){
this.height=height;
}
void display(){
System.out.println("Width:"+width);
System.out.println("Height:"+height);
}
}
public class Rect{
public static void main(String[]args){
Rectangle rectangle=new Rectangle(10,5);
System.out.println("Original Rectangle:");
rectangle.display();
rectangle.resizeWidth(20);
rectangle.resizeHeight(15);
System.out.println("\n Resized Rectangle:");
rectangle.display();
}
}



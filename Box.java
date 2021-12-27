import java.util.*;
class Box
{
 int height,width,depth;
 void get(){
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the values of height, width and depth ");
            height=sc.nextInt();
            width=sc.nextInt();
            depth=sc.nextInt();
           }
 int area(){
            int vol=height*width*depth;
            return vol;
           }
}
package package1;

import java.util.Scanner;

/*
Assignment1---((((10+2)+2)-2)*2)/2)

Assignment2-- ((((10/2)-2)+2)-2)*2)

*/

public class Airthematic {
    public int Sum(int a,int b){
        return (a+b);
    }
    public int Sub(int a,int b){
        return (a-b);
    }
    public int Mul(int a,int b){
        return (a*b);
    }
    public int Div(int a,int b){
        return (a/b);
    }

    public static void main(String[] args) {
        Airthematic res = new Airthematic();

        //Assignment1---((((10+2)+2)-2)*2)/2)

        int result1 = res.Div(res.Mul(res.Sub(res.Sum(res.Sum(10,2),2),2),2),2);
        System.out.println(result1);

       // Assignment2-- ((((10/2)-2)+2)-2)*2)
        int result2 = res.Mul(res.Sub(res.Sum(res.Sub(res.Div(10,2),2),2),2),2);
        System.out.println(result2);
        
        //((((x1+x2)+x3)-x4)*x5)/x6)
        System.out.println("please eneter the values of six integer variables ");
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int x3 = s.nextInt();
        int x4 = s.nextInt();
        int x5 = s.nextInt();
        int x6 = s.nextInt();
        int result3 = res.Div(res.Mul(res.Sub(res.Sum(res.Sum(x1,x2),x3),x4),x5),x6);
        System.out.println(result3);        
               
   }
}

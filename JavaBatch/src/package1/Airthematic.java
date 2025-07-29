package package1;

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

    }
}

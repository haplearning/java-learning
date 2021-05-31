// class Animal{

// }
 
// class Dog extends Animal{

// }

public class Operator{
    public static void main(String[] args){
        // int a = 10;
        // int b = 20;
        // int c = 25;
        // int d = 25;
        // int x = c++;
        // int y = ++d;
        // System.out.println("a + b = " + (a + b) ); //30
        // System.out.println("a - b = " + (a - b) ); //-10
        // System.out.println("a * b = " + (a * b) ); //200
        // System.out.println("b / a = " + (b / a) ); //2
        // System.out.println("b % a = " + (b % a) ); //0
        // System.out.println("c % a = " + (c % a) ); //5
        // System.out.println("a++   = " +  (a++) ); //10
        // System.out.println("a--   = " +  (a--) ); //11
        // // 查看  d++ 与 ++d 的不同
        // System.out.println("x=c++ =" +  (x)+"; c="+(c) ); //25, x=c, c=c+1 所以 x=25,c=26
        // System.out.println("y=++d =" +  (y)+"; d="+(d) ); //27, d=d+1, y=d 所以 y=d=26

        // System.out.println("a == b = " + (a == b) ); //false
        // System.out.println("a != b = " + (a != b) ); //true
        // System.out.println("a > b = " + (a > b) ); //false
        // System.out.println("a < b = " + (a < b) ); //true
        // System.out.println("b >= a = " + (b >= a) ); //true
        // System.out.println("b <= a = " + (b <= a) ); //false

        // //a=10 1010
        // //b=20 10100
        // System.out.println("a & b = " + c );  
        // System.out.println("a | b = " + c );
        // System.out.println("a ^ b = " + c );
        // System.out.println("~a = " + c );
        // System.out.println("a << 2 = " + c );
        // System.out.println("a >> 2  = " + c );
        // System.out.println("a >>> 2 = " + c );

        // int a = 60; /* 60 = 0011 1100 */ 
        // int b = 13; /* 13 = 0000 1101 */   
        // System.out.println("a & b = " + (a & b) ); //12 = 0000 1100
        // System.out.println("a | b = " + (a | b) ); //61 = 0011 1101
        // System.out.println("a ^ b = " + (a ^ b) ); //49 = 0011 0001
        // System.out.println("~a = " + ~a ); //-61 = 1100 0011
        // System.out.println("a << 2 = " + (a << 2) ); //240 = 1111 0000
        // System.out.println("a >> 2  = " + (a >> 2) ); //15 = 1111
        // System.out.println("a >>> 2 = " + (a >>> 2) ); //15 = 0000 1111

        // boolean a = true;
        // boolean b = false;
        // System.out.println("a && b = " + (a&&b));
        // System.out.println("a || b = " + (a||b) );
        // System.out.println("!(a && b) = " + !(a && b));

        // int a = 10;
        // int b = 20;
        // int c = 0;
        // c = a + b;
        // System.out.println("c = a + b = " + c );
        // c += a ;
        // System.out.println("c += a  = " + c );
        // c -= a ;
        // System.out.println("c -= a = " + c );
        // c *= a ;
        // System.out.println("c *= a = " + c );
        // a = 10;
        // c = 15;
        // c /= a ;
        // System.out.println("c /= a = " + c );
        // a = 10;
        // c = 15;
        // c %= a ;
        // System.out.println("c %= a  = " + c );
        // c <<= 2 ;
        // System.out.println("c <<= 2 = " + c );
        // c >>= 2 ;
        // System.out.println("c >>= 2 = " + c );
        // c >>= 2 ;
        // System.out.println("c >>= 2 = " + c );
        // c &= a ;
        // System.out.println("c &= a  = " + c );
        // c ^= a ;
        // System.out.println("c ^= a   = " + c );
        // c |= a ;
        // System.out.println("c |= a   = " + c );

        int a , b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 20 : 30;
        System.out.println( "Value of b is : " +  b );
    
        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 20 : 30;
        System.out.println( "Value of b is : " + b );

        int x=10;
        while (x<20){
            System.out.println(x);
            x++;
        };

        do{
            System.out.println("x is "+x);
            x++;
        }while(x<20);
        System.out.println(x);
        int i=10;
        for (;i<20;i++){
            System.out.println(i);
        };

        String[] names={"James","Larry", "Tom", "Lacy"};
        for (String name:names){
            System.out.println(name);
        }
        
        int [] numbers = {10,20,30,40,50,60};
        for (int n:numbers){
            if (n==30){
                continue;
            }
            if (n==50){
                break;
            }
            System.out.println(n);
        }



        // Dog d1 = new Dog();
        // Animal d2 = new Dog(); //子类可以被声明为父类
        // Animal a1 = new Animal();  
        // // Dog a2 = new Animal(); //父类不能被声明为子类，无法编译
        // System.out.println("d1 instanceof Dog："+(d1 instanceof Dog));  //true
        // System.out.println("d1 instanceof Animal："+(d1 instanceof Animal)); //true
        // System.out.println("d2 instanceof Dog："+(d2 instanceof Dog)); //true
        // System.out.println("d2 instanceof Animal："+(d2 instanceof Animal)); //true
        // System.out.println("a1 instanceof Dog："+(a1 instanceof Dog)); //false

        // short s = 10;
        // // s = s - 3; //编译不通过
        // // s = (short)(s + 1); //不建议如此实现
        // s -= 3;    //既可以实现运算，又不会更改s的数据类型
        // System.out.println("输出变量:"+(s));

        
    }
}
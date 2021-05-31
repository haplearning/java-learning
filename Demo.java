import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

class FreshJuice{
    enum FreshJuiceSize {SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}

class Dog{
    //简单的类案例
    String breed;
    int age;
    String color;

    void eat(){
    }
    void sleep(){
    }
    void run(){
    }

}


public class Demo {
    static byte age=-;
    
    
    public static void main(String []arg){
        /* new 创建实例
        FreshJuice fresh = new FreshJuice();
        fresh.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println(fresh.size);
        System.out.println("hello world!");
        */

        /* 基本数据类型
         // byte  
         System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);  
         System.out.println("包装类：java.lang.Byte");  
         System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);  
         System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);  
         System.out.println();  
   
         // short  
         System.out.println("基本类型：short 二进制位数：" + Short.SIZE);  
         System.out.println("包装类：java.lang.Short");  
         System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);  
         System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);  
         System.out.println();  
   
         // int  
         System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);  
         System.out.println("包装类：java.lang.Integer");  
         System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);  
         System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);  
         System.out.println();  
   
         // long  
         System.out.println("基本类型：long 二进制位数：" + Long.SIZE);  
         System.out.println("包装类：java.lang.Long");  
         System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);  
         System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);  
         System.out.println();  
   
         // float  
         System.out.println("基本类型：float 二进制位数：" + Float.SIZE);  
         System.out.println("包装类：java.lang.Float");  
         System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);  
         System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);  
         System.out.println();  
   
         // double  
         System.out.println("基本类型：double 二进制位数：" + Double.SIZE);  
         System.out.println("包装类：java.lang.Double");  
         System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);  
         System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);  
         System.out.println();  
   
         // char  
         System.out.println("基本类型：char 二进制位数：" + Character.SIZE);  
         System.out.println("包装类：java.lang.Character");  
         // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台  
         System.out.println("最小值：Character.MIN_VALUE="  
                 + (int) Character.MIN_VALUE);  
         // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台  
         System.out.println("最大值：Character.MAX_VALUE="  
                 + (int) Character.MAX_VALUE);  */

        /**/     
        // char c='a';
        // int i=c;
        // double d=i;
        // System.out.println("char 转换为 int 后为："+i);
        // System.out.println("char 转换为 int 后为："+d);

        Integer x=;
        Integer y = Integer.valueOf();
        Integer z = Integer.valueOf("");
        Integer w = Integer.valueOf("",);
        int a = Integer.parseInt("");
        int b = Integer.parseInt("",);
        double c = Double.parseDouble("");


        System.out.println(x.byteValue()); //
        System.out.println(x.shortValue()); //
        System.out.println(x.longValue()); //
        System.out.println(x.floatValue()); //.f
        System.out.println(x.doubleValue()); //.

        System.out.println(x.compareTo()); //
        System.out.println(x.compareTo()); //
        System.out.println(x.compareTo()); //-

        System.out.println(x.equals()); //false

        System.out.println(y); //
        System.out.println(z); //
        System.out.println(w); //
        System.out.println(y instanceof Integer); //true

        System.out.println(x.toString()); //""
        System.out.println(Integer.toString()); //""

        System.out.println(a); //
        System.out.println(b); //
        System.out.println(c); //.    

        // System.out.println(x.compareTo());
        // System.out.println(x.equals());
        // Integer x = valueOf()
        // System.out.println(x.valueOf(String));
         
        //
        Character ch = 'a';

        char cha = ch;
        System.out.println(cha);

        
    }
}



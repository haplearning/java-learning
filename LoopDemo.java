import javax.swing.plaf.synth.SynthStyle;

import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

public class LoopDemo {
    public static void main(String[] args){
        //while 循环
        int x=10;
        while (x<20){
            System.out.println("while 循环："+x);
            x++;
        };
        //do...while 循环
        do{
            System.out.println("do...while 循环："+x);
            x--;
        }while(x>10);
        //for 循环
        for(int i=0;i<10;i++){
            System.out.println("for 循环："+i);
        }
        //for...each 循环
        String [] names = {"James","Larry", "Tom", "Lacy"};
        for (String name:names){
            System.out.println("for...each 循环："+name);
        }
        //break 和 continue
        int [] numbers = {10,20,30,40,50,60};
        for (int n:numbers){
            if (n==30){
                continue;
            }
            if (n==50){
                break;
            }
            System.out.println("break and continue："+n);
        }

        //案例
        //九九乘法表
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.printf("%d*%d=%d ", i,j,i*j);
            };
            System.out.println();
        }
        //等腰三角形
        for (int i=0;i<5;i++){
            for (int j=0;j<10;j++){
                if (Math.abs(5-j)<=i){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

            //char grade = args[0].charAt(0);
            char grade = 'C';
        
            switch(grade)
            {
                case 'A' :
                    System.out.println("优秀"); 
                    // break;
                case 'B' :
                case 'C' :
                    System.out.println("良好");
                    // break;
                case 'D' :
                    System.out.println("及格");
                    // break;
                case 'F' :
                    System.out.println("你需要再努力努力");
                    // break;
                default :
                    System.out.println("未知等级");
            }
            System.out.println("你的等级是 " + grade);

            System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
            System.out.println("0度的余弦值：" + Math.cos(0));  
            System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
            System.out.println("1的反正切值： " + Math.atan(1));  
            System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
            System.out.println(Math.PI);  


    }
}

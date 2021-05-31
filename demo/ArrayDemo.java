import java.util.Arrays;

import javax.swing.text.html.HTMLDocument.RunElement;

public class ArrayDemo{

    static String[] reverse(String[] arr){//
        //数组可以作为参数，也可以作为返回值
        String[] result= new String[arr.length];
        for (int i=0,j=arr.length-1;i<arr.length;i++){
            result[i] = arr[j];
        }
        return result ;
    }

    public static void main(String[] args){
        double[] arr1 = {1.2, 3.14, 5.0, 7.7};
        double[] arr6 = new double[4];
        arr6[0] = 1.2;
        arr6[1] = 3.14;
        arr6[2] = 5.0;
        arr6[3] = 7.7;
        
        String[] arr2 = new String[5];
        arr2[0]="one";
        arr2[1]="two";
        arr2[2]="three";
        arr2[3]="four";
        arr2[4]="five";
        
        double arrSum=0;
        for (double nub:arr1){
            arrSum+=nub;
        }
        System.out.println(arrSum); //17.04
        String[] result = ArrayDemo.reverse(arr2);
        System.out.println(result[0]); //five


        int[][] arr3= {{1,2},{3,4}};
        for (int[] arr:arr3){
            for (int a:arr){
                System.out.println(a);
            }
        }
        String[][] arr4 = new String[2][];
        arr4[0] = new String[2]; //单独指定空间
        arr4[1] = new String[3];
        arr4[0][0] = new String("Good");
        arr4[0][1] = new String("Luck");
        arr4[1][0] = new String("to");
        arr4[1][1] = new String("you");
        arr4[1][2] = new String("!");

        Arrays.fill(arr1, 1, 3,5);
        System.out.println(Arrays.equals(arr2, result));
        System.out.println(Arrays.equals(arr1, arr6));
        Arrays.sort(arr1);
        for (double s:arr1){
            System.out.println(s);
        }
    }
}
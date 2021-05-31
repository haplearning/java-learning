import java.util.*;

import jdk.internal.net.http.common.Cancelable;

import java.text.*;

public class DateDemo{
    public static void main(String[] args){
        // Date date1 = new Date();
        // Date date2 = new Date(19879699);
        // Date date3 = new Date();
        // date3.setTime(162143562);

        // System.out.println(date1); //Wed May 19 22:40:43 GMT+08:00 2021
        // System.out.println(date2);//Thu Jan 01 13:31:19 GMT+08:00 1970
        // System.out.println(date3); //Tue Jan 20 02:23:55 GMT+08:00 1970
        // System.out.println(date1.after(date2)); //true
        // System.out.println(date1.equals(date1.clone())); //true
        // System.out.println(date1.compareTo(date2)); //1
        // System.out.println(date1.getTime()); //1621435936340
        // System.out.println(date1.hashCode()); //-2062393947
        // System.out.println(date1.toString()); //Wed May 19 22:40:43 GMT+08:00 2021

        // Date date = new Date();
        // SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // System.out.println(ft.format(date)); //2021-05-19 11:04:00


        // System.out.printf("全部日期和时间信息：%tc",date); //三 5月 19 23:15:38 GMT+08:00 2021
        // System.out.printf("年-月-日格式：%tF",date); //2021-05-19
        // System.out.printf("月/日/年格式：%tD",date); //05/19/21
        // System.out.printf("HH:MM:SS PM格式（12时制）：%tr",date); //11:15:38 下午
        // System.out.printf("HH:MM:SS格式（24时制）：%tT",date); //23:15:38
        // System.out.printf("HH:MM格式（24时制）：%tR",date); //23:15


        // System.out.printf("%1$s %2$tF %2$tR", "Due date:", date);
        // System.out.printf("%s %tF %<tR %n", "Due date:", date);


        // String str=String.format(Locale.US,"英文月份简称：%tb",date);       
        // System.out.println(str);                                                                              
        // System.out.printf("本地月份简称：%tb%n",date);  
        // //B的使用，月份全称  
        // str=String.format(Locale.US,"英文月份全称：%tB",date);  
        // System.out.println(str);  
        // System.out.printf("本地月份全称：%tB%n",date);  
        // //a的使用，星期简称  
        // str=String.format(Locale.US,"英文星期的简称：%ta",date);  
        // System.out.println(str);  
        // //A的使用，星期全称  
        // System.out.printf("本地星期的全称：%tA%n",date);  
        // //C的使用，年前两位  
        // System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n",date);  
        // //y的使用，年后两位  
        // System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n",date);  
        // //j的使用，一年的天数  
        // System.out.printf("一年中的天数（即年的第几天）：%tj%n",date);  
        // //m的使用，月份  
        // System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n",date);  
        // //d的使用，日（二位，不够补零）  
        // System.out.printf("两位数字的日（不足两位前面补0）：%td%n",date);  
        // //e的使用，日（一位不补零）  
        // System.out.printf("月份的日（前面不补0）：%te%n",date);  
        // System.out.printf("12小时制的小时： %tI",date);
        // SimpleDateFormat ft1 = new SimpleDateFormat ("yyyy-MM-dd"); 
 
        // String input = args.length == 0 ? "1818-11-11" : args[0]; 
   
        // System.out.print(input + " Parses as "); 
   
        // Date t; 
   
        // try { 
        //     t = ft1.parse(input); 
        //     System.out.println(t); 
        // } catch (ParseException e) { 
        //     System.out.println("Unparseable using " + ft); 
        // }

        // try { 
        //     System.out.println(new Date( ) + "\n"); 
        //     Thread.sleep(1000*3);   // 休眠3秒
        //     System.out.println(new Date( ) + "\n"); 
        // } catch (Exception e) { 
        //     System.out.println("Got an exception!"); 
        // }

        // try{
        // long start = System.currentTimeMillis();
        // Thread.sleep(3*60*10);
        // long end = System.currentTimeMillis();
        // long diff = end-start;
        // System.out.println("Different time: "+diff);
        // }catch(Exception e){
        //     System.out.println("Got an exception!");
        // }

        Calendar ca1 = Calendar.getInstance();
        Calendar ca2 = Calendar.getInstance();
        Calendar ca3 = Calendar.getInstance();
        ca2.set(2021,05,20); //set直接设置日期
        ca3.set(Calendar.YEAR, 2020); //set分别设置日期
        ca3.add(Calendar.MONTH, 6); //add 添加日期
        ca3.add(Calendar.DATE, 21); //add 添加日期

        System.out.println("当前日期：" + ca1.get(Calendar.DATE)); //20
        System.out.println("当前月份：" + ca1.get(Calendar.MONTH)); //4
        System.out.println("当前年份：" + ca1.get(Calendar.YEAR)); //2021
        System.out.println("当周的第几天：" + ca1.get(Calendar.DAY_OF_WEEK));//5
        System.out.println("当月的第几天：" + ca1.get(Calendar.DAY_OF_MONTH)); //20
        System.out.println("当年的第几天：" + ca1.get(Calendar.DAY_OF_YEAR)); //140
        System.out.println("当前周N是当年的第几个周N" + ca1.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //3
        System.out.println("当月的第几周：" + ca1.get(Calendar.WEEK_OF_MONTH)); //4
        System.out.println("当年的第几周：" + ca1.get(Calendar.WEEK_OF_YEAR)); //21

        System.out.println("12时制的小时：" + ca1.get(Calendar.HOUR));//4
        System.out.println("24时制的小时：" + ca1.get(Calendar.HOUR_OF_DAY));//16
        System.out.println("分钟：" + ca1.get(Calendar.MINUTE));//5
        System.out.println("秒：" + ca1.get(Calendar.SECOND));//39
        System.out.println("毫秒：" + ca1.get(Calendar.MILLISECOND)); //152
        System.out.println(ca2);
        System.out.println(ca3);
    
        

        
    }
}


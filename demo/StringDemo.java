import javax.sound.midi.SysexMessage;

public class StringDemo {
    public static void main(String[] args){
        String str="Hello";
        String str1= new String("world");

        str = "hello ";
        System.out.println(str);

        char[] charArray = {'h','e','l','l','o','!'};
        String hello = new String(charArray);
        System.out.println(hello);  //hello!
        System.out.println(hello.length()); //6

        String ft = String.format("浮点型变量的值为 " +
        "%f, 整型变量的值为 " +
        " %d, 字符串变量的值为 " +
        " %s", 10.3f, 25, "hello");
        System.out.println(ft); //
        
        System.out.println(hello.charAt(3)); //l
        System.out.println(hello.compareTo("world")); //-15
        System.out.println(hello.compareTo(str)); //32
        System.out.println(hello.compareToIgnoreCase(str)); //1
        System.out.println(hello.concat(str1)); //hello!world
        StringBuffer sbu = new StringBuffer("hello!"); //true
        System.out.println(hello.contentEquals(sbu)); //false
        char[] ch={'h','e','l','l','o','w','o','r','l','d'};
        System.out.println(String.copyValueOf(ch)); //helloworld
        System.out.println(hello.endsWith("o"));//false
        System.out.println(hello.equals("hello!")); //true 值比较
        System.out.println(hello.equalsIgnoreCase("hellO!")); //true
        System.out.println(hello.getBytes()); //[B@214c265e
        char[] cha = new char[6];
        hello.getChars(1, 3, cha, 0);
        System.out.println(cha); //el
        System.out.println(hello.hashCode()); //-1220935281
        System.out.println(hello.indexOf('l')); //2
        System.out.println(hello.indexOf("lo")); //3
        System.out.println(hello.length()); //6
        System.out.println(hello.matches("(.*)!")); //true
        System.out.println(hello.replace("!", " world!"));
        String str2 = "www.baidu.com";
        for (String string:str2.split("\\.")){
            System.out.println(string); //www baidu com
        }
        System.out.println(hello.substring(1)); //ello!
        System.out.println(hello.substring(1,3)); //el
        System.out.println(hello.subSequence(1, 3)); //el
        System.out.println(hello.toCharArray()); //hello!
        System.out.println(hello.toUpperCase()); //HELLO!
        System.out.println(hello.toLowerCase()); //hello!
        System.out.println(hello.trim()); //hello!
        System.out.println(String.valueOf(3.14)); //3.14
        System.out.println(String.valueOf(hello.toCharArray())); //hello!
        System.out.println(hello.contains("he")); //true
        System.out.println(hello.isEmpty());
        System.out.println(hello.isBlank());

        StringBuilder sb = new StringBuilder(5);
        sb.append("hello");
        sb.append(" world !");
        sb.insert(0, "abc ");
        sb.delete(0, 1);
        System.out.println(sb); //bc hello world !
        System.out.println(sb.reverse()); //! dlrow olleh cb
        System.out.println(sb.replace(0,3,""));//lrow olleh cb
        System.out.println(sb.capacity());//28
        System.out.println(sb.charAt(1));
        System.out.println(sb.length());
    }
}

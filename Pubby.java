public class Pubby{
    // int pubbyAge;
    // public Pubby(String name){
    //     System.out.println("小狗的名字为："+name);
    // }
    // public void setAge(int age){
    //     pubbyAge = age;
    // }
    // public int getAge(){
    //     System.out.println("小狗的年龄为："+pubbyAge);
    //     return pubbyAge;
    // }
    // public static void main(String[] args){
    //     Pubby myPubby = new Pubby("Tom");
    //     myPubby.setAge(3);
    //     System.out.println(myPubby.getAge());
    //     System.out.println(myPubby.pubbyAge);
    // }
    static String breed="哈士奇";
    int pubbyAge;
    public Pubby(String name, int age){
        String pubbyName=name;
        pubbyAge = age;
        System.out.println(pubbyName);
    }
    public static void main(String[] args){
        System.out.println(breed);
        Pubby pubby = new Pubby("tom",3);
        System.out.println(pubby.pubbyAge);
        System.out.println(pubby.breed);
        System.out.println(Pubby.breed);
        // System.out.println(pubby,pubbyName);
    }

}
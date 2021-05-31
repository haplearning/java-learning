
class Animal{
    private String name;
    private int id;
    public Animal(String myName, int myId){
        this.name = myName;
        this.id = myId;
        System.out.println("animal");
    }

    public void eat(){
        System.out.println(this.name + "正在吃");
    }
    public void sleep(){
        System.out.println(this.name + "正在睡");
    }

    public void introduction(){
        System.out.println("大家好！我是"         + id + "号" + name + ".");
    }
}

class Cat extends Animal{
    private String name;
    private int id;

    public Cat(String myName, int myId){
        // super(myName,myId);
        super()
        this.name = myName;
        this.id = myId;
    }

    public void introduction(){
        super.introduction();
    }
}


public class ObjectOriented{

    public static void main(String[] args){

        Cat cat = new Cat("tom",1);
        cat.eat();
        cat.sleep();
        cat.introduction();
    }
}





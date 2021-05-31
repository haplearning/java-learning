class AccessDemo{
    private String priValue; //私有变量
    public String getValue(){
        //设置公共方法getter方法获取私有变量
        //可以被所属类访问
        return this.priValue;
    }
    public void setValue(String value){
        //为私有变量设置值
        this.priValue=value;
    }

    String defaultValue="default"; //默认访问
    boolean defaultMethod(){
        return true;
    }

    protected String protectValue;
    protected void setProtect(String value){
        this.protectValue=value;
    }
    protected String getProtect(){
        return this.protectValue;
    }
}

class NonAccessDemo{
    private static int numInstances=0;
    protected static int getCount(){
        return numInstances;
    }

    private static void addInstance(){
        numInstances++;
    }

    NonAccessDemo(){
        NonAccessDemo.addInstance();
    }

    final int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";
    
    public void changeValue(){
        // value = 12; //报错，不能修改
    }
}

abstract class AbsDemo{
    abstract void m();
}

class SubAbsDemo extends AbsDemo{
    void m(){
        System.out.println("子类实现父类的抽象方法");
    }
}

public class Modifier {
    public static transient int a=33;
    public static void main(String[] args){
        AccessDemo acces =new  AccessDemo();
        acces.setValue("private_value");
        System.out.println(acces.getValue()); //out: private_value
        // System.out.println(acces.priValue); //私有变量不能通过实例访问
        // System.out.println(AccessDemo.priValue); //私有变量不能通过实例访问

        System.out.println(acces.defaultValue); //out: default
        System.out.println(acces.defaultMethod()); //out: true
        // System.out.println(AccessDemo.defaultValue); //out: default
        // System.out.println(AccessDemo.defaultMethod()); //out: true

        acces.setProtect("protected_value");
        System.out.println(acces.protectValue); //out: protected_value
        System.out.println(acces.getProtect()); //out: protected_value
        System.out.println("start with "+NonAccessDemo.getCount()+" instances");
        for (int i=0;i<500;i++){
            new NonAccessDemo();
        }
        System.out.println("created "+NonAccessDemo.getCount()+" instances");

        System.out.println(new NonAccessDemo().value);
        System.out.println(NonAccessDemo.BOXWIDTH);

        System.out.println(a);
    }
}

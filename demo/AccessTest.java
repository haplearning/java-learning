
public class AccessTest extends AccessDemo{

    public static void main(String[] args){
        AccessDemo demo = new AccessDemo();
        
        AccessTest test = new AccessTest();
        test.setProtect("protect_value");
        test.setValue("value");
        System.out.println(test.protectValue);
        System.out.println(test.getProtect());
        System.out.println(test.defaultValue);
        // System.out.println(test.priValue);
    }
}
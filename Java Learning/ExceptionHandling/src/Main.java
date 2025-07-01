//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            method1();
            method2();
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            method2();
        }
    }
    static void method1() throws ArithmeticException{
        int total = 1/0;
        throw new ArithmeticException("ArithmeticException");
    }
    static void method2() {
        System.out.println("Important task");
    }
}
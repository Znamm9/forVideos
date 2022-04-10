import org.testng.annotations.Test;

public class TestClassForJavaDemo {

    int AGE = 35;
    Integer ageI = new Integer(40);

    @Test
    public void doIt(){
        int result = summ(50, 50);
        System.out.println(result + 5);
    }


    public void run(){
        System.out.println("running");
    }

    public int summ(int firstVariable, int secondVariable){
        return firstVariable + secondVariable;
    }
}

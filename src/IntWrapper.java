import java.util.Scanner;

// wrapper class
public class IntWrapper {
    private int value;
    public IntWrapper(int value) {
        this.value = value;
        // this->value = value in c++
    }
    // get vale
    public int getValue() {
        return value;
    }
    
    public void setValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int value = sc.nextInt();
        // global var/ class var = local var
        this.value = value;
    }
}

package OOM;

/**
 * 栈溢出
 * VM: Args: -Xss128k
 */
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLength() {
        stackLength++;
        stackLength();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLength();
        } catch (Throwable e) {
            System.out.println("stack lenth: " + oom.stackLength);
            throw e;
        }
    }
}

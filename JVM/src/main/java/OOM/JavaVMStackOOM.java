package OOM;

/**
 * 栈内存溢出，可能导致操作系统假死
 * VM Args: -Xss2M(这个时候不妨设置大些)
 */
public class JavaVMStackOOM {

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {

        while (true) {
            new Thread(() -> {
                dontStop();
            });
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}

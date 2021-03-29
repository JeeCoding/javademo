package designpatterns.behaviorpatterns.chainofresponsibility.demo3;

/**
 * @author huzh
 * @date 2021.3.26 12:57
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}

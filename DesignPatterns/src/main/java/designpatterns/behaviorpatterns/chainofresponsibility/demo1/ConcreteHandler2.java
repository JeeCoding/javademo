package designpatterns.behaviorpatterns.chainofresponsibility.demo1;

/**
 * @author huzh
 * @date 2021.3.26 12:32
 * 具体处理者角色2
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("two".equals(request)) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}

package designpatterns.behaviorpatterns.chainofresponsibility.demo2;

/**
 * @author huzh
 * @date 2021.3.26 12:48
 * 例子：http://c.biancheng.net/view/1383.html
 */
public class LeaveApprovalTest {
    public static void main(String[] args) {
        //组装责任链
        Leader teacher1 = new ClassAdviser();
        Leader teacher2 = new DepartmentHead();
        Leader teacher3 = new Dean();
        //Leader teacher4=new DeanOfStudies();
        teacher1.setNext(teacher2);
        teacher2.setNext(teacher3);
        //teacher3.setNext(teacher4);
        //提交请求
        teacher1.handleRequest(8);
    }
}

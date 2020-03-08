package designpatterns.AdapterPattern.ObjectAdapter;

/**
 * 优点：一个对象适配器可以把多个不同的适配者适配到同一个目标
 * 缺点：不能置换适配者的方法
 */
public class PowerAdapter implements PowerTarget {

    private PowerAdaptee powerAdaptee;

    public PowerAdapter(PowerAdaptee powerAdaptee) {
        super();
        this.powerAdaptee = powerAdaptee;
    }

    @Override
    public int output5V() {
        int output = powerAdaptee.output220V();
        System.out.println("电源适配器开始工作，此时输出电压是：" + output);
        output = output / 44;
        System.out.println("电源适配器工作完成，此时输出电压是：" + output);
        return output;
    }
}

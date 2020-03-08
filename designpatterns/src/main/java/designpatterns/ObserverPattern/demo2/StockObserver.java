package designpatterns.ObserverPattern.demo2;

public class StockObserver extends Observer {

    private boolean watchingStock;
    private String status;

    public StockObserver(String name, Subject subject) {
        super(name, subject);
        this.watchingStock = true;
    }

    @Override
    public void update() {
        this.watchingStock = false;
        this.status = subject.getStatus();
    }

    public boolean isWatchingStock() {
        return watchingStock;
    }

    public void setWatchingStock(boolean watchingStock) {
        this.watchingStock = watchingStock;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
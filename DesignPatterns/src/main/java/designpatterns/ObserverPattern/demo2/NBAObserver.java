package designpatterns.ObserverPattern.demo2;


public class NBAObserver extends Observer {
    private boolean watchingNBA;

    private String status;

    public NBAObserver(String name, Subject subject) {
        super(name, subject);
        this.watchingNBA = true;
    }

    @Override
    public void update() {
        this.watchingNBA = false;
        this.status = subject.getStatus();
    }

    public boolean isWatchingNBA() {
        return watchingNBA;
    }

    public void setWatchingNBA(boolean watchingNBA) {
        this.watchingNBA = watchingNBA;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
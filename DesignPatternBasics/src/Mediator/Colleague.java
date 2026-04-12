package Mediator;

public abstract class Colleague {
    private Mediator mediator;
    private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected abstract void controlColleague(String message);
}
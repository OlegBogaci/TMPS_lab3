package observer;

public class Dealer extends Observer {

    public Dealer(Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    public void buyPhone() {
        subject.setState(subject.getState()-1);
    }

    @Override
    void update() {
        System.out.println("To dealer - Phone stock changed: " + subject.getState());
    }
}
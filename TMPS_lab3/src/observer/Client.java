package observer;


public class Client extends Observer {

    public Client(Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    public void unsubscribe(){
        subject.unsubscribe(this);
    }

    public void buyPhone() {
        subject.setState(subject.getState()-1);
    }

    @Override
    void update() {
        System.out.println("To client - Phone stock changed: " + subject.getState());
    }
}
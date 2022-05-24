package observer;

public class ObserverDemo {

    public static void main(String[] args) {
        Subject subject = new Darwin();

        Client client = new Client(subject);
        Client client1 = new Client(subject);
        Client client2 = new Client(subject);
        Dealer dealer = new Dealer(subject);

        client.buyPhone();
        dealer.buyPhone();

        client1.unsubscribe();

        client.buyPhone();
        dealer.buyPhone();
    }
}
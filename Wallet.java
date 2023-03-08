public class Wallet {

    private float balance;
    int id;
    Card card;

    public Wallet(int id) {

        balance = 0;
        this.id = id;
    }

    public void addBalance(float money) {

        balance += money; // balance = balance + money;
    }
    public void addCard(Card card) { 

        this.card = card;
    }
    public float getBalance () {
        return balance; //or this.balance 

    }
    
}

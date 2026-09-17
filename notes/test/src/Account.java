public class Account {
    private int balance = 0; // Euros

    public int getBalance() {
        return this.balance;
    }

    public int getCADBalance() {
        return(int) (this.balance * 1.35);
    }
}

// 1. Define Service Interface
interface WalletService {
    void addMoney(double amount);
    void makePayment(double amount);
    void showBalance();
}

// 2. Create User Class
class User {
    String name;
    double balance;

    User(String name) {
        this.name = name;
        this.balance = 0;
    }

    void displayUser() {
        System.out.println("User: " + name + ", Balance: Rs." + balance);
    }
}

// 3. Create Wallet Class (Implements Service)
class DigitalWallet implements WalletService {
    User user;

    DigitalWallet(String name) {
        user = new User(name);
    }

    public void addMoney(double amount) {
        user.balance += amount;
        System.out.println("Rs." + amount + " added successfully.");
    }

    public void makePayment(double amount) {
        if (user.balance >= amount) {
            user.balance -= amount;
            System.out.println("Payment of Rs." + amount + " successful.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: Rs." + user.balance);
    }
}

// 4. Main Class (Driver Program)
public class WalletApp {
    public static void main(String[] args) {

        DigitalWallet wallet = new DigitalWallet("Lisha");

        wallet.addMoney(1000);
        wallet.showBalance();

        wallet.makePayment(300);
        wallet.showBalance();

        wallet.makePayment(800);
    }
}

class Account {
	int balance;
	
	public Account() {
		balance = 0;
		System.out.println("새로운 계좌가 만들어졌습니다.");
	}
	
	public void withdraw(int amount) {
		balance -= amount;
		System.out.println(amount  + "원 인출");
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원 저축");
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
}

public class AccountTest {
	public static void main(String args[]) {
		
		Account obj1 = new Account();
		obj1.deposit(50000);
		
		Account obj2 = new Account();
		obj2.deposit(100000);
		
		System.out.println("고객 #1의 계좌 잔고=" + obj1.getBalance());
		System.out.println("고객 #2의 계좌 잔고=" + obj2.getBalance());
	}

}


class Account {
	int balance;
	
	public Account() {
		balance = 0;
		System.out.println("���ο� ���°� ����������ϴ�.");
	}
	
	public void withdraw(int amount) {
		balance -= amount;
		System.out.println(amount  + "�� ����");
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "�� ����");
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
		
		System.out.println("�� #1�� ���� �ܰ�=" + obj1.getBalance());
		System.out.println("�� #2�� ���� �ܰ�=" + obj2.getBalance());
	}

}

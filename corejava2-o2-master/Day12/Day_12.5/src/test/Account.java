package test;

@Entity
@Table("accounts")
public class Account {
	@Column( name = "acc_number", columnDefinition = "INT")
	@ID
	private int number;
	@Column( name = "name", columnDefinition = "VARCHAR(100)")
	private String name;
	@Column( name = "acc_type", columnDefinition = "VARCHAR(50)")
	private String type;
	@Column( name = "balance", columnDefinition = "FLOAT")
	private float balance;
	public Account() {
	}
	public Account(int number, String name, String type, float balance) {
		this.number = number;
		this.name = name;
		this.type = type;
		this.balance = balance;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", type=" + type + ", balance=" + balance + "]";
	}
}

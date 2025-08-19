package August18_DSA01;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BankAccount {
	String name;
	long value;
	long AccNumber;
	static int count=0;
	BankAccount(){
		name="Unknown";
		value=0;
		count++;
	}
	BankAccount(String name, int value){
		this.name=name;
		this.value=value;
		AccNumber = (long) (Math.random() * 900000000) + 100000000;
		count++;
	}
	BankAccount(String name){
		this.name=name;
		value=0;
		AccNumber = (int) (Math.random() * 9000) + 1000;
		count++;
	}
	//	Random r = new Random();
	void Show(){
		System.out.println("Customer "+count+"\n"+name +"\n"+"AccNumber of {"+ AccNumber+"}"+"\n"+"Deposit "+ value+"\n"+"THANK YOU FOR DEPOSIT"+"\n"+"\n");
	}
//	void CountCoustomer(){
//		System.out.println("Count of Coustomer:"+ count);
//	}

	public static void main(String[] args) {
		BankAccount c1 = new BankAccount("james");
		c1.Show();
		BankAccount c2 = new BankAccount("Prajwal",1000);
		c2.Show();
		BankAccount c3 = new BankAccount("jones",40000);
		c3.Show();

		BankAccount c4 = new BankAccount("Sam" , 1000000);
		c4.Show();

//		List<BankAccount> al = Arrays.asList(new BankAccount("Daivik"),
//				new BankAccount("Aradhya", 109876),
//				new BankAccount("Xrs",3456789));
//		for(BankAccount c : al){
//			c.Show();
//		}
		System.out.println("Total Customer:"+ BankAccount.count);

	}
}

public class BankAccount{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	private String accountType;
	public BankAccount(String accountNumber,String accountHolderName,String accountType){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.accountType=accountType;
		this.balance=0.0;
	}
	public BankAccount(String accountNumber,String accountHolderName,String accountType,double intialDeposit){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.accountType=accountType;
		if (intialDeposit>0){
			this.balance=intialDeposit;
		}
		else{
			this.balance=0.0;
		}
	}
	public void deposit(double amount){
		if(amount>=0){
			balance=+amount;
			System.out.println("Deposited amount = "+amount);
		}
		else{
			System.out.println("Insufficient amount");
		}
	
	}
	public void withdraw(double amount){
		if(amount<=0){
			System.out.println("Account Balance is zero ");
		}
		else if(amount>balance){
			System.out.println("Withdraw not possible because of Insufficient Balance");
		}
		else{
			balance-=amount;
			System.out.println("Remaining balance= "+amount);
		}
		
	}
	public double getBalance(){
		return balance;
		
	}
	public void displayAccountInfo(){
		System.out.println("Account number:"+accountNumber);
		System.out.println("Account Holder Name:"+accountHolderName);
		System.out.println("Account Type: "+accountType);
		System.out.println("Balance:"+ balance);
		
	}
	public static void main(String args[]){
		BankAccount a1=new BankAccount("ARE123"," aish","savings",20000);
		a1.deposit(1000);
		a1.withdraw(300);
		a1.displayAccountInfo();
		BankAccount a2=new BankAccount("FRT546"," Sahasra","Current");
		a2.deposit(500);
		a2.withdraw(200);
		a2.displayAccountInfo();
	}
}
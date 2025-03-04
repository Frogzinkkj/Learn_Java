package OPP.L1_Poo;




public class BankAccount {

  double accountNumber;
  String holder;
  double balance;
  double valueBalance;


  
  public BankAccount(double accountNumber, String holder, double balance){

    this.accountNumber = accountNumber;
    this.holder = holder;
    this.balance = balance;
    this.valueBalance = 0;
  }

  public void deposit(double valueBalance){
    this.balance += valueBalance;
    this.valueBalance = valueBalance;

  
  }

  public void showDetails(){
    System.out.println("Number Account : "+accountNumber);
    System.out.println("Holder of Account : "+ holder);
    System.out.println("Actual Balance: "+balance);
    System.out.println("Last Deposit: "+valueBalance);

      
  } 




  public double getAccountNumber() {
    return accountNumber;
  }



  public void setAccountNumber(double accountNumber) {
    this.accountNumber = accountNumber;
  }



  public String getHolder() {
    return holder;
  }



  public void setHolder(String holder) {
    this.holder = holder;
  }



  public double getCash() {
    return balance;
  }
  


  public void setCash(double cash) {
    this.balance = balance;
  }

  public double getvalueBalance(){

    return valueBalance;
  }
  public void setvalueBalance(double valueBalance){

    this.valueBalance = valueBalance;
  }
  

  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount(49285.86, "MR. Potter", 190000);
    myAccount.deposit(500);
    myAccount.showDetails();
  }
  




}

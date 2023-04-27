public class accaunt {
  private float balance;

  public accaunt(float initialBalance) {
      balance = initialBalance;
  }

  public void deposit(float amount) {
      balance = balance+amount;
  }

  public void withdraw(float amount) {
      if (balance >= amount) {
          balance= balance - amount;
      } else {
          System.out.println("Insufficient funds");
      }
  }

  public float getBalance() {
      return balance;
  }



  public static void main(String[] args) {
      accaunt atm = new accaunt(2000);
      atm.withdraw(500.0f);
      atm.deposit(3000);
      System.out.println("Balance after withdraw: " + atm.getBalance());
      
  }

  
}


















// public class ATM {
//     private float balance;
  
//     public ATM(float initialBalance) {
//       balance = initialBalance;
//     }
  
//     public void deposit(float amount) {
//       balance += amount;
//     }
  
//     public void withdraw(float amount) {
//       if (balance >= amount) {
//         balance -= amount;
//       } else {
//         System.out.println("Insufficient funds");
//       }
//     }
  
//     public float getBalance() {
//       return balance;
//     }
//   }







// class account{
//     String accNum,accType;
//     int accBalance;

// public class encap {
//     public static void main(String[] args) {
//         String accNum,accType;
//     int accBalance;

// account acct1=new account();
// acct1.accNum="1000 73088393";
// acct1.accType="BK saving";
// acct1.accBalance=100000;
// System.out.println("my account number is "+acct1.accNum);
        
//     }
// }
// }
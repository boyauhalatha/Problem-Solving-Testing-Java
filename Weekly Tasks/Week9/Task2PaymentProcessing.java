/*
 * TASK 4: PAYMENT PROCESSING SYSTEM
 *
 * PROBLEM STATEMENT:
 * Design a Payment Processing System using a Java interface
 * and an abstract class.
 *
 * Payment methods:
 * 1 -> Credit Card : 2% processing fee
 * 2 -> UPI         : 1% processing fee
 * 3 -> Net Banking : 1.5% processing fee
 *
 * INPUT:
 * 3
 * 1 1000
 * 2 2000
 * 3 5000
 *
 * OUTPUT:
 * CreditCard 1020.00
 * UPI 2020.00
 * NetBanking 5075.00
 */
package Week9;
import java.util.*;
interface Payment{
    void pay(double amount);
}
class CreditCardPayment implements Payment{
    double amount;
    public void pay(double amount){
        this.amount=amount;
    }
}
class UPIPayment implements Payment{
    double amount;
    public void pay(double amount){
        this.amount=amount;
    }
}
class NetBankingPayment implements Payment{
    double amount;
    public void pay(double amount){
        this.amount=amount;
    }
}
abstract class PaymentProcessor{
    abstract double processPayment(Payment payment,double amount);
}
class OnlinePaymentProcessor extends PaymentProcessor{
    double processPayment(Payment payment,double amount){
        payment.pay(amount);
        if(payment instanceof CreditCardPayment){
            return amount*1.02;
        }else if(payment instanceof UPIPayment){
            return amount*1.01;
        }else{
            return amount*1.015;
        }
    }
}
public class Task2PaymentProcessing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        OnlinePaymentProcessor processor=new OnlinePaymentProcessor();
        for(int i=0;i<n;i++){
            int paymentType=sc.nextInt();
            double amount=sc.nextDouble();
            Payment payment;
            String paymentName;
            if(paymentType==1){
                payment=new CreditCardPayment();
                paymentName="CreditCard";
            }else if(paymentType==2){
                payment=new UPIPayment();
                paymentName="UPI";
            }else{
                payment=new NetBankingPayment();
                paymentName="NetBanking";
            }
            double finalAmount=processor.processPayment(payment,amount);
            System.out.printf("%s %.2f%n",paymentName,finalAmount);
        }
        sc.close();
    }
}
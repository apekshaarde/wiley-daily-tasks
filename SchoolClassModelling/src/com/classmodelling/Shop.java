package com.classmodelling;

class Customer {
        int cust_id;
        int acc_id;
        int acc_bal;

        public Customer(int cust_id,int acc_id,int acc_bal){
            this.cust_id = cust_id;
            this.acc_id = acc_id;
            this.acc_bal = acc_bal;
        }

        public boolean doPayment(Payment p){
            boolean status = p.pay(this);
            return status;
        }
    }
    class Payment{
        int pay_id;
        char pay_type;
        float amount;

        public Payment(int pay_id,char pay_type,float amount){
            this.pay_id = pay_id;
            this.pay_type = pay_type;
            this.amount = amount;
        }

        public boolean pay(Customer c){
            if(c.acc_bal > amount)
                return true;
            return false;
        }
    }
    public class Shop{
    public static void main(String[] args) {
        Customer c = new Customer(101,34344,56000);
        Payment p = new Payment(102,'c',34000.22f);

        boolean status = c.doPayment(p);
        System.out.println(status);
    }
}

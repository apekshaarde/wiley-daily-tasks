package com.program;

class Table{
    public synchronized void printTable(int no){
        for (int i=1;i<=10;i++){
            try {
                System.out.println(no + "*" + i + "----->" + no * i);
                Thread.sleep(1000);
            }catch (Exception ex){
                System.out.println("Exception is : "+ex);
            }
        }
    }
}
class Two extends Thread{
    private Table table;
    public Two(Table table){
        this.table=table;
    }
    public void run(){
        table.printTable(2);
    }
}
class Three extends Thread{
    private Table table;
    public Three(Table table){
        this.table = table;
    }
    public void run(){
        table.printTable(3);
    }
}
public class ThreadApp {
    public static void main(String[] args) {
        Table t = new Table();
        Two two = new Two(t);
        two.start();
//        try {
//            two.join();
//        }catch (Exception ex){
//            System.out.println("Exception is : "+ex);
//        }
        Three three = new Three(t);
        three.start();
    }
}

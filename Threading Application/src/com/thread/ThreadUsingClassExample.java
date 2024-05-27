package com.thread;

//class FileDownloader extends Thread{
//    public void download(){
//        System.out.println("===Downloading File===");
//        for(int i=1;i<=10;i++)
//        {
//            System.out.println("From "+getName()+" : "+ i*10+"% download");
//            try {
//                Thread.sleep(700);
//            }catch (InterruptedException e){
//                throw new RuntimeException(e.getMessage());
//            }
//        }
//    }
//    public void run(){
//        download();
//    }
//}

class FileDownloader{
    public synchronized void download(){
        System.out.println("===Downloading File===");
        for(int i=1;i<=10;i++)
        {
            try {
                System.out.println(i*10+"% download");
                Thread.sleep(700);
            }catch (InterruptedException e){
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}

class Task1 extends Thread{
    private FileDownloader fileDownloader;

    public Task1(FileDownloader fileDownloader){
        this.fileDownloader = fileDownloader;
    }
    public void run(){
        fileDownloader.download();
    }
}


class Task2 extends Thread{
    private FileDownloader fileDownloader;

    public Task2(FileDownloader fileDownloader){
        this.fileDownloader = fileDownloader;
    }
    public void run(){
        fileDownloader.download();
    }
}

public class ThreadUsingClassExample {
    public static void main(String[] args) {

            FileDownloader fileDownloader1 = new FileDownloader();

            Task1 task1 = new Task1(fileDownloader1);
            Task2 task2 = new Task2(fileDownloader1);

            task1.setName("Task-1 Downloading");
            task2.setName("Task-2 Downloading");

            task1.start();
            task2.start();

            try {

                    task1.join();
                    task2.join();
                //fileDownloader1.join();
                //fileDownloader2.join();
            }catch (InterruptedException e){
                throw new RuntimeException(e.getMessage());
            }
    }
}

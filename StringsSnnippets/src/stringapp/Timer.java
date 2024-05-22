package stringapp;

public class Timer {
    public static long time(Runnable r){
        long time = System.currentTimeMillis();
        r.run();
        time += System.currentTimeMillis();

        System.out.println("took "+ time +" ms");
        return time;
    }
}

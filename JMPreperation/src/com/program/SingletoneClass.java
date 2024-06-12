package com.program;

class Player{
    private static Player p = null;

    private Player(){
        System.out.println("Hello ");
    }

    public static Player getInstance(){
        if(p==null){
            p = new Player();
        }
        return p;
    }
}

public class SingletoneClass {

    public static void main(String[] args) {
        Player p = Player.getInstance();
    }
}

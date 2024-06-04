package com.program;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

class Players{
    private int id;
    private String name;
    private int run;

    public Players(int id, String name, int run) {
        this.id = id;
        this.name = name;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return id == players.id && run == players.run && Objects.equals(name, players.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, run);
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", run=" + run +
                '}';
    }
}
public class StreamApiExample {
    public static void main(String[] args) {
        List<Players> list = new ArrayList<>(List.of(new Players(1,"Virat Kohali",89),
                new Players(2,"Hardik Pandya",78),
                new Players(3,"Sachin Tendulkar",95),
                new Players(4,"Shruti Manadana",95)));

        List<Players> getPlayers = list.stream().filter(t->t.getRun()>90).collect(Collectors.toList());
        getPlayers.forEach(System.out::println);

        System.out.println("Non Repeating Players : ");
        List<Players> nonRepeating = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(t->t.getValue()==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        nonRepeating.forEach(v-> System.out.println("["+v.getId()+","+v.getName()+","+v.getRun()+"]"));
    }
}

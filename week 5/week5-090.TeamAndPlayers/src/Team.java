
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jing
 */
public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players = new ArrayList<Player>();
    
    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }
    
    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player){
        if(players.size() < maxSize){
            players.add(player); 
        }
    }
    
    public void printPlayers(){
        String membersAsString = "";
        for(Player player : players){
            membersAsString += player.getName() + ", goals " + player.goals() + "\n";
        }
        System.out.println(membersAsString);
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
        
    }
    
    public int size(){
        return players.size();
    }
    
    public int goals(){
        int sum = 0;
        for(Player player : players){
            sum += player.goals();
        }
        return sum;
    }

    
}

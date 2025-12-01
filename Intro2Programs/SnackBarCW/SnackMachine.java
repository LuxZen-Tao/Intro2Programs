import java.util.ArrayList;
 

public class SnackMachine
{
    private ArrayList<PackOfCrisps> packets;
    private int capacity;
    private int cost;
    private int payment;
    private ArrayList<Penny> pennies;
    
    public SnackMachine(int capacity, int cost)
    { 
        this.capacity = capacity;
        this.cost = cost;
        this.payment = 0;
        packets = new ArrayList<>();
        pennies = new ArrayList<>();
    }
    
    public int getCost(){
        return cost;
    }
    
    public void addPack(PackOfCrisps pack){
        if (packets.size() < capacity)
                packets.add(pack);
         else { 
            System.out.println("The machince is full!");
        }
    }
    
    public int countPacks (String flavour){
        int count = 0;
        for (PackOfCrisps pack : packets) {
            if (pack.getFlavour().equals(flavour)) {
                count += 1;
            }
        }
        return count;
    }
    
    public void insertMoney(Penny penny){
        pennies.add(penny);
        payment+=1;
    }
       
    public PackOfCrisps buyPack(String flavour){  
        if (payment < cost){
            System.out.println("This item costs "+ cost +" Pennie(s). Your balance is "+ payment + " Please insert teh required amount of pennies to purchase this pack!");
            return null;
        }  else {for (int i = 0; i < packets.size(); i++)
                    if (packets.get(i).getFlavour().equals(flavour)){
                        PackOfCrisps selected = packets.get(i);
                        packets.remove(i);
                        payment = 0;
                       return selected;
                    }
        }
            System.out.println(""+ flavour + " is currently out of stock");
                        return null;
        }
    
    public void describe(){
        System.out.println("#==============================~~~=====================================#");
        System.out.println("The Snackmachine has " + packets.size() + " packet(s) of crisps avaliable");
        System.out.println("Each pack costs " + cost + "Pennies to purchase ");
        System.out.println("There are " + pennies.size() + " pennie(s) inserted in this machine");
        System.out.println("#==============================~~~=====================================#");
    }
        
        
        
        
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GorgCalc;
import java.util.Scanner; 
import java.util.Random;

/**
 *
 * @author Patrick
 */
public class LootGeneratorMKI
{
    public static void main (String[] args)
    {
        
        int numofgorg;
        int currentgorg = 0;
        int numofgorgling;
        int currentgorgling = 0;
        int numofsplinter;
        int currentsplinter = 0;
        int numoftunneler;
        int currenttunneler = 0;
        int numofhivemother;
        int currenthivemother = 0;
        int numofacidicmauler;
        int currentacidicmauler = 0;
        int numofshrike;
        int currentshrike = 0;
        Random rando = new Random();
        int randohold;
        int lootnum;
        Scanner scan = new Scanner(System.in);
        
        //Used if the party is on a timer
        boolean timelimit;
        int hours;
        int minutes;
        int seconds;
        final int CONVERT = 60;
        int totaltime = 0;
        int players;
        int timespent = 0;
        //time it takes a single player to loot a small enemy
        final int loottime = 60;
        final int largeloottime = 300;

        //specific lootable items
        int gorgmeatchunx = 0;
        int gorgteeth = 0;
        int gorglingmeatchunx = 0;
        int tunnelermeatchunx = 0;
        int splintermeatchunx = 0;
        int hivemothermeatchunx = 0;
        int shrikemeatchunx = 0;
        int gorgspike = 0;
        int shrikewing = 0;
        int gorgstinger = 0;
        int largegorgspike = 0;
        int gorgscythe = 0;
        int splinterplate = 0;
        int gorgmandible = 0;
        int largegorgmandible = 0;
        int enragepheremone = 0;
        int broodegg = 0;
        int evomat1 = 0;
        int smallgem = 0;
        int medgem = 0;
        int smalldiamond = 0; 
        int morteanshard = 0;
        
        //for magic items
        int miring = 0;
        int miscroll = 0;
        int miwand = 0;
        int miwep = 0;
        
        //This will determine if there is a certain amount of time the players 
        //wish to spend looting
        System.out.print("Is there a time limit? Type 'true' or 'false' ");
        timelimit = scan.nextBoolean();
        if (timelimit == true)
        {   
    System.out.print("Enter number of hours: ");
    hours = scan.nextInt();
    System.out.print("Enter number of minutes: ");
    minutes = scan.nextInt();
    System.out.print("Enter number of seconds: ");
    seconds = scan.nextInt();
    
    totaltime = ((hours * CONVERT * CONVERT) + (minutes * CONVERT) + seconds);
        }
        
        
        System.out.print("How many players are looting? ");
        players = scan.nextInt();
        System.out.print("How many Gorg are being looted? ");
        numofgorg = scan.nextInt();
        System.out.print("How many Gorglings are being looted? ");
        numofgorgling = scan.nextInt();
        System.out.print("How many Splinters are being looted? ");
        numofsplinter = scan.nextInt();
        System.out.print("How many Tunnelers are being looted? ");
        numoftunneler = scan.nextInt();
        System.out.print("How many Hive Mothers are being looted? ");
        numofhivemother = scan.nextInt();
        System.out.print("How many Acidic Maulers are being looted? ");
        numofacidicmauler = scan.nextInt();
        System.out.print("How many Shrikes are being looted? ");
        numofshrike = scan.nextInt();
        
        //Acidic Mauler ________________________________________________________________
        //This loop loots the gorg without a timer
        while (numofacidicmauler > currentacidicmauler && timelimit == false)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 65)
            {
            miring++;
            }
            else if (randohold <= 75)
            {
            miwand++;
            }
            else if (randohold <= 85)
            {
            miwep++;
            }
            else if (randohold <= 95)
            {
            miwep++;
            }    
            else if (randohold <= 100)
            {
            morteanshard++;
            }    
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentacidicmauler++;
            timespent = timespent + (loottime / players );
        }  
        
        //This loop loots the gorg with a timer
        while (numofgorg > currentgorg && timelimit == true && timespent < totaltime)
        {
        while (numofacidicmauler > currentacidicmauler && timelimit == false)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 65)
            {
            miring++;
            }
            else if (randohold <= 75)
            {
            miwand++;
            }
            else if (randohold <= 85)
            {
            miwep++;
            }
            else if (randohold <= 95)
            {
            miwep++;
            }    
            else if (randohold <= 100)
            {
            morteanshard++;
            }    
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentacidicmauler++;
            timespent = timespent + (loottime / players );
        }
        }  
        
        
        //Shrike ____________________________________________________________
        //This loop loots the gorg without a timer
        while (numofshrike > currentshrike && timelimit == false)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;
            }
            else if (randohold <= 25)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            }
            else if (randohold <= 40)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            gorgstinger++;
            }
            else if (randohold <= 50)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            }
            else if (randohold <= 80)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            }    
            else if (randohold <= 90)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            lootnum = rando.nextInt(3) + 1;
            smallgem += lootnum;
            
            }    
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            lootnum = rando.nextInt(2) + 1;
            smalldiamond += lootnum;
            }  
            else if (randohold <= 99)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            medgem++;
            }
            else if (randohold == 100)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            lootnum = rando.nextInt(3) + 1;
            if (lootnum == 1)
                miscroll++;
            if (lootnum == 2)
                miring++;
            if (lootnum ==3)
                miwand++;
            }
            
            
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentshrike++;
            timespent = timespent + (loottime / players );
        }  
        
        //This loop loots the gorg with a timer
        while (numofshrike > currentshrike && timelimit == true && timespent < totaltime)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;
            }
            else if (randohold <= 25)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            }
            else if (randohold <= 40)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            gorgstinger++;
            }
            else if (randohold <= 50)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            }
            else if (randohold <= 80)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            }    
            else if (randohold <= 90)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            lootnum = rando.nextInt(3) + 1;
            smallgem += lootnum;
            
            }    
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            lootnum = rando.nextInt(2) + 1;
            smalldiamond += lootnum;
            }  
            else if (randohold <= 99)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            medgem++;
            }
            else if (randohold == 100)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmandible += lootnum;            
            lootnum = rando.nextInt(3) + 1;
            shrikemeatchunx += lootnum;
            lootnum = rando.nextInt(2) + 1;
            shrikewing += lootnum;
            gorgstinger++;
            lootnum = rando.nextInt(3) + 1;
            if (lootnum == 1)
                miscroll++;
            if (lootnum == 2)
                miring++;
            if (lootnum ==3)
                miwand++;
            }
            
            
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentshrike++;
            timespent = timespent + (loottime / players );
        } 
        
        //Hive mother ____________________________________________________________
        //This loop loots the gorg without a timer
        while (numofhivemother > currenthivemother && timelimit == false)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            }
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            }
            else if (randohold <= 34)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            }
            else if (randohold <= 60)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            }
            else if (randohold <= 75)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(6) + 1;
            smallgem += lootnum;
            }    
            else if (randohold <= 80)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            smalldiamond += lootnum;
            }    
            else if (randohold <= 85)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            medgem += lootnum;
            }  
            else if (randohold <= 90)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            broodegg++;
            }
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            smalldiamond += lootnum;
            broodegg++;
            }    
            else if (randohold <= 99)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            smalldiamond += lootnum;
            lootnum = rando.nextInt(6) + 1;
            smallgem += lootnum;
            }    
            else if (randohold <= 100)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            smalldiamond += lootnum;
            lootnum = rando.nextInt(4) + 1;
            smallgem += lootnum;
            lootnum = rando.nextInt(4) + 1;
            medgem += lootnum;
            }
            
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currenthivemother++;
            timespent = timespent + (largeloottime / players );
        }  
        
        //This loop loots the gorg with a timer
        while (numofhivemother > currenthivemother && timelimit == true && timespent < totaltime)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            }
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            }
            else if (randohold <= 34)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            }
            else if (randohold <= 60)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            }
            else if (randohold <= 75)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(6) + 1;
            smallgem += lootnum;
            }    
            else if (randohold <= 80)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            smalldiamond += lootnum;
            }    
            else if (randohold <= 85)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            medgem += lootnum;
            }  
            else if (randohold <= 90)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            broodegg++;
            }
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            smalldiamond += lootnum;
            broodegg++;
            }    
            else if (randohold <= 99)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            smalldiamond += lootnum;
            lootnum = rando.nextInt(6) + 1;
            smallgem += lootnum;
            
            }    
            else if (randohold <= 100)
            {
            lootnum = rando.nextInt(10) + 1;
            hivemothermeatchunx = hivemothermeatchunx + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgscythe += lootnum;
            lootnum = rando.nextInt(6) + 1;
            largegorgspike += lootnum;
            lootnum = rando.nextInt(2) + 1;
            largegorgmandible += lootnum;
            lootnum = rando.nextInt(2) + 1;
            enragepheremone += lootnum;
            evomat1++;
            lootnum = rando.nextInt(4) + 1;
            smalldiamond += lootnum;
            lootnum = rando.nextInt(4) + 1;
            smallgem += lootnum;
            lootnum = rando.nextInt(4) + 1;
            medgem += lootnum;
            }
            
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currenthivemother++;
            timespent = timespent + (largeloottime / players );
        } 
        
        
        
        
        //Tunneler ____________________________________________________________
        //This loop loots the gorg without a timer
        while (numoftunneler > currenttunneler && timelimit == false)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(5) + 1;
            gorgteeth = gorgteeth + lootnum;
            }
            else if (randohold <= 35)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            }
            else if (randohold <= 55)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            }
            else if (randohold <= 80)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            }    
            else if (randohold <= 90)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            smallgem++;
            }    
            else if (randohold <= 98)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            medgem++;
            }  
            else if (randohold == 100)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            smalldiamond++;
            }
            
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currenttunneler++;
            timespent = timespent + (loottime / players );
        }  
        
        //This loop loots the gorg with a timer
        while (numoftunneler > currenttunneler && timelimit == true && timespent < totaltime)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(5) + 1;
            gorgteeth = gorgteeth + lootnum;
            }
            else if (randohold <= 35)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            }
            else if (randohold <= 55)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            }
            else if (randohold <= 80)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            }    
            else if (randohold <= 90)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            smallgem++;
            }    
            else if (randohold <= 98)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            medgem++;
            }  
            else if (randohold == 100)
            {
            lootnum = rando.nextInt(3) + 1;
            tunnelermeatchunx = tunnelermeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            lootnum = rando.nextInt(4) + 1;
            gorgspike = gorgspike + lootnum;
            smalldiamond++;
            }
            
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currenttunneler++;
            timespent = timespent + (loottime / players );
        }  
        
        
        //Splinter ____________________________________________________________
        //This loop loots the gorg without a timer
        while (numofsplinter > currentsplinter && timelimit == false)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            }
            else if (randohold <= 35)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            }
            else if (randohold <= 50)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            }
            else if (randohold <= 85)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgspike = gorgspike + lootnum;
            }    
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(2) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgspike = gorgspike + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgspike = gorgspike + lootnum;
            }    
            else if (randohold <= 99)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            smallgem++;
            }  
            else if (randohold == 100)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            smalldiamond++;
            }
            
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentsplinter++;
            timespent = timespent + (loottime / players );
        }  
        
        //This loop loots the gorg with a timer
        while (numofsplinter > currentsplinter && timelimit == true && timespent < totaltime)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            }
            else if (randohold <= 35)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            }
            else if (randohold <= 50)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            }
            else if (randohold <= 85)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgspike = gorgspike + lootnum;
            }    
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(2) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgspike = gorgspike + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgmandible = gorgmandible + lootnum;
            }    
            else if (randohold <= 99)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            smallgem++;
            }  
            else if (randohold == 100)
            {
            lootnum = rando.nextInt(3) + 1;
            splintermeatchunx = splintermeatchunx + lootnum;
            lootnum = rando.nextInt(4) + 1;
            splinterplate = splinterplate + lootnum;
            smalldiamond++;
            }
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentsplinter++;
            timespent = timespent + (loottime / players );
        }        
        
        //Gorglings ____________________________________________________________
        //This loop loots the gorg without a timer
        while (numofgorgling > currentgorgling && timelimit == false)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            }
            else if (randohold <= 92)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgspike = gorgspike + lootnum;
            }
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            smallgem = smallgem + lootnum;
            }
            else if (randohold <= 98)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            smalldiamond++;
            }    
            else if (randohold <= 100)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            medgem++;
            }    
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentgorgling++;
            timespent = timespent + (loottime / players );
        }  
        
        //This loop loots the gorg with a timer
        while (numofgorgling > currentgorgling && timelimit == true && timespent < totaltime)
        {
                randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            }
            else if (randohold <= 92)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            gorgspike = gorgspike + lootnum;
            }
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            lootnum = rando.nextInt(2) + 1;
            smallgem = smallgem + lootnum;
            }
            else if (randohold <= 98)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            smalldiamond++;
            }    
            else if (randohold <= 100)
            {
            lootnum = rando.nextInt(4) + 1;
            gorglingmeatchunx = gorglingmeatchunx + lootnum;
            lootnum = rando.nextInt(10) + 1;
            gorgteeth = gorgteeth + lootnum;
            medgem++;
            }
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentgorgling++;
            timespent = timespent + (loottime / players );
        }        
        
        
        
        
        //Gorg ________________________________________________________________
        //This loop loots the gorg without a timer
        while (numofgorg > currentgorg && timelimit == false)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmeatchunx = gorgmeatchunx + lootnum;
            }
            else if (randohold <= 25)
            {
            lootnum = rando.nextInt(3) + 1;
            gorgteeth = gorgteeth + lootnum;
            }
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmeatchunx = gorgmeatchunx + lootnum;  
            lootnum = rando.nextInt(3) + 1;
            gorgteeth = gorgteeth + lootnum;
            }
            else if (randohold <= 99)
            {
            smallgem++;
            }    
            else if (randohold == 100)
            {
            smalldiamond++;
            }    
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentgorg++;
            timespent = timespent + (loottime / players );
        }  
        
        //This loop loots the gorg with a timer
        while (numofgorg > currentgorg && timelimit == true && timespent < totaltime)
        {
            randohold = rando.nextInt(100) + 1;
            
            if(randohold <= 10){}
            else if (randohold <= 20)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmeatchunx = gorgmeatchunx + lootnum;
            }
            else if (randohold <= 25)
            {
            lootnum = rando.nextInt(3) + 1;
            gorgteeth = gorgteeth + lootnum;
            }
            else if (randohold <= 95)
            {
            lootnum = rando.nextInt(2) + 1;
            gorgmeatchunx = gorgmeatchunx + lootnum;  
            lootnum = rando.nextInt(3) + 1;
            gorgteeth = gorgteeth + lootnum;
            }
            else if (randohold <= 99)
            {
            smallgem++;
            }    
            else if (randohold == 100)
            {
            smalldiamond++;
            }    
            //System.out.println("Rolled " + randohold);
            //system out to check the loot roller
            currentgorg++;
            timespent = timespent + (loottime / players );
        }  
        
 
        
        
        
        
        
        
        
        
        
            //Time to collect our loot!
            System.out.println("__________");
            System.out.println("Total loot");
            if (currentgorg > 0)
                System.out.println("from " + currentgorg + " gorg");
            if (currentgorgling > 0)
                System.out.println("from " + currentgorgling + " gorglings");
            if (currentsplinter > 0)
                System.out.println("from " + currentsplinter + " splinters");
            if (currenttunneler > 0)
                System.out.println("from " + currenttunneler + " tunnelers");
            if (currenthivemother > 0)
                System.out.println("from " + currenthivemother + " hive mothers");
            if (currentshrike > 0)
                System.out.println("from " + currentshrike + " shrikes");
            if (currentacidicmauler > 0)
                System.out.println("from " + currentacidicmauler + " acidic maulers");
            System.out.println("__________");

            if (gorgmeatchunx > 0)
               System.out.println("Pounds of Gorg Meat: " + gorgmeatchunx);
            if (gorglingmeatchunx > 0)
               System.out.println("Pounds of Gorgling Meat: " + gorglingmeatchunx);
            if (splintermeatchunx > 0)
                System.out.println("Pounds of Splinter Meat: " + splintermeatchunx);
            if (splintermeatchunx > 0)
                System.out.println("Pounds of Tunneler Meat: " + tunnelermeatchunx);
            if (hivemothermeatchunx > 0)
                System.out.println("Pounds of Hive Mother Meat: " + hivemothermeatchunx);
            if (shrikemeatchunx > 0)
                System.out.println("Pounds of Shrike Meat: " + shrikemeatchunx);
            if (gorgmandible > 0)
               System.out.println("Gorg Mandibles: " + gorgmandible);
            if (largegorgmandible > 0)
               System.out.println("Large Gorg Mandibles: " + largegorgmandible);
            if (splinterplate > 0)
               System.out.println("Splinter Plates: " + splinterplate);
            if (gorgteeth > 0)
               System.out.println("Gorg Teeth: " + gorgteeth);
            if (gorgstinger > 0)
                System.out.println("Gorg Stingers: " + gorgstinger);
            if (shrikewing > 0)
                System.out.println("Shrike Wings: " + shrikewing);
            if (gorgspike > 0)
               System.out.println("Gorg Spikes: " + gorgspike);
            if (largegorgspike > 0)
               System.out.println("Large Gorg Spikes: " + largegorgspike);
            if (gorgscythe > 0)
               System.out.println("Gorg Scythes: " + gorgscythe);
            if (enragepheremone > 0)
               System.out.println("Enrage Pheremone: " + enragepheremone);
            if (evomat1 > 0)
               System.out.println("Gallons of Evolution Material: " + evomat1);
            if (broodegg > 0)
               System.out.println("Gorg Brood Eggs: " + broodegg);
            if (smallgem > 0)
                System.out.println("Small gemstones: " + smallgem);
            if (medgem > 0)
                System.out.println("Medium gemstones: " + medgem);
            if (smalldiamond > 0)
                System.out.println("Small diamonds: " + smalldiamond);
            if (miwand > 0)
                System.out.println("Minor Wands: " + miwand);
            if (miring > 0)
                System.out.println("Minor Rings: " + miring);            
            if (miscroll > 0)
                System.out.println("Minor Scrolls: " + miscroll);
            if (morteanshard > 0)
                System.out.println("Mortean Shards: " + morteanshard);
            
            hours = timespent / 3600;
            timespent = timespent - (hours * 3600);
            minutes = timespent / 60;
            timespent = timespent - (minutes * 60);
            seconds = timespent;

            System.out.println("__________");
            System.out.println("This took \n" + hours + " hours\n" +
                    minutes + " minutes\n" + seconds + " seconds");
            
            

        
    }
}

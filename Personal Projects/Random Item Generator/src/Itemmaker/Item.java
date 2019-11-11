package Itemmaker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Patrick is a pimp
 */
public class Item 
{
    private String type, material, art, fullname, fullanswer;
    private int cost, basecost, rando, randometal, materialcost, randoart, randosubject, silver, gold, arttype;
    private double artcost;
    final int HARDAMNT = 40; 
    final int SOFTAMNT = 25;
    
    String[] mundyhard = new String[41];
    {
    mundyhard[0] = "fork001";
    mundyhard[1] = "spoon001";
    mundyhard[2] = "mug002";
    mundyhard[3] = "bowl003";
    mundyhard[4] = "plate002";
    mundyhard[5] = "teacup001";
    mundyhard[6] = "comb001";
    mundyhard[7] = "ring001";
    mundyhard[8] = "animal_cage010";
    mundyhard[9] = "cane050";
    mundyhard[10] = "bucket050";
    mundyhard[11] = "bottle015";
    mundyhard[12] = "hairbrush003";
    mundyhard[13] = "merchant_scale006";
    mundyhard[14] = "abacus075";
    mundyhard[15] = "pen002";
    mundyhard[16] = "smoking_pipe020";
    mundyhard[17] = "clock100";
    mundyhard[18] = "signal_horn004";
    mundyhard[19] = "lockbox070";
    mundyhard[20] = "hairpin001";
    mundyhard[21] = "awl001";
    mundyhard[22] = "ball003";
    mundyhard[23] = "hammer040";
    mundyhard[24] = "pestle_and_mortar005";
    mundyhard[25] = "drum050";
    mundyhard[26] = "flute075";
    mundyhard[27] = "harp075";
    mundyhard[28] = "lute075";
    mundyhard[29] = "hook020";
    mundyhard[30] = "lyre075";
    mundyhard[31] = "rod020";
    mundyhard[32] = "chess_set080";
    
    mundyhard[33] = "chain020";
    mundyhard[34] = "scissors010";
    mundyhard[35] = "pot035";
    mundyhard[36] = "bell030";
    mundyhard[37] = "chisel003";
    mundyhard[38] = "crowbar50";
    mundyhard[39] = "spade050";
    mundyhard[40] = "teapot060";

    
    
    }
    //Contains 40 items made of hard material
    
    
    String[] mundysoft = new String[26];
    {
    mundysoft[0] = "shirt003";
    mundysoft[1] = "trousers004";
    mundysoft[2] = "overcoat020";
    mundysoft[3] = "dress030";
    mundysoft[4] = "noble_clothes075";
    mundysoft[5] = "skirt007";
    mundysoft[6] = "petticoat003";
    mundysoft[7] = "vest015";
    mundysoft[8] = "cloak007";
    mundysoft[9] = "tunic023";
    mundysoft[10] = "light_blanket002";
    mundysoft[11] = "heavy_blanket008";
    mundysoft[12] = "winter_blanket050";
    mundysoft[13] = "bedroll010";
    mundysoft[14] = "curtains007";
    mundysoft[15] = "tablecloth002";
    mundysoft[16] = "cape006";
    mundysoft[17] = "veil001";
    mundysoft[18] = "bonnet002";
    mundysoft[19] = "ribbon001";
    mundysoft[20] = "bag001";
    mundysoft[21] = "hat004";
    mundysoft[22] = "apron002";
    mundysoft[23] = "robe004";
    mundysoft[24] = "winter_coat080";
    mundysoft[25] = "cloth_dregs002";
    }
//Contains 20 items made of soft material
    
    String[] animal = new String [100];
    {
        animal[0] = "dog";
        animal[1] = "cat";
        animal[2] = "lion";
        animal[3] = "tiger";
        animal[4] = "rabbit";
        animal[5] = "goat";
        animal[6] = "sheep";
        animal[7] = "cow";
        animal[8] = "pig";
        animal[9] = "parrot";
        animal[10] = "bear";
        animal[11] = "bull";
        animal[12] = "rooster";
        animal[13] = "chicken";
        animal[14] = "fish";
        animal[15] = "turkey";
        animal[16] = "crow";
        animal[17] = "ape";
        animal[18] = "monkey";
        animal[19] = "pidgeon";
        animal[20] = "kobold";
        animal[21] = "cockatrice";
        animal[22] = "gecko";
        animal[23] = "spider";
        animal[24] = "constrictor snake";
        animal[25] = "field mouse";
        animal[26] = "seal";
        animal[27] = "leapard";
        animal[28] = "cheetah";
        animal[29] = "crab";
        animal[30] = "mouse";
        animal[31] = "rat";
        animal[32] = "squirrel";
        animal[33] = "alligator";
        animal[34] = "crocodile";
        animal[35] = "chipmunk";
        animal[36] = "whale";
        animal[37] = "duck";
        animal[38] = "zebra";
        animal[39] = "goose";
        animal[40] = "donkey";
        animal[41] = "griffon";
        animal[42] = "elephant";
        animal[43] = "dolphin";
        animal[44] = "salamander";
        animal[45] = "raccoon";
        animal[46] = "penguin";
        animal[47] = "bat";
        animal[48] = "walrus";
        animal[49] = "jellyfish";
        animal[50] = "giraffe";
        animal[51] = "ostrich";
        animal[52] = "wolf";
        animal[53] = "deer";
        animal[54] = "antelope";
        animal[55] = "catfish";
        animal[56] = "chameleon";
        animal[57] = "fox";
        animal[58] = "llama";
        animal[59] = "camel";
        animal[60] = "gorilla";
        animal[61] = "frog";
        animal[62] = "quail";
        animal[63] = "moose";
        animal[64] = "cougar";
        animal[65] = "treant";
        animal[66] = "pixie";
        animal[67] = "unicorn";
        animal[68] = "platypus";
        animal[69] = "octopus";
        animal[70] = "viper";
        animal[71] = "bald eagle";
        animal[72] = "osprey";
        animal[73] = "badger";
        animal[74] = "skunk";
        animal[75] = "jaguar";
        animal[76] = "turtle";
        animal[77] = "hedgehog";
        animal[78] = "iguana";
        animal[79] = "flamingo";
        animal[80] = "bee";
        animal[81] = "toad";
        animal[82] = "dragon";
        animal[83] = "sloth";
        animal[84] = "lobster";
        animal[85] = "swordfish";
        animal[86] = "peregrine falcon";
        animal[87] = "chimp";
        animal[88] = "porcupine";
        animal[89] = "hyena";
        animal[90] = "hippo";
        animal[91] = "rhino";
        animal[92] = "crab";
        animal[93] = "raven";
        animal[94] = "possum";
        animal[95] = "koala";
        animal[96] = "swan";
        animal[97] = "chimera";
        animal[98] = "manticore";
        animal[99] = "echidna";

    }
    
    String[] majgod = new String [19];
    {
        majgod[0] = "symbol of Boccob";
        majgod[1] = "symbol of Crellon Larethian";
        majgod[2] = "symbol of Garl Glittergold";
        majgod[3] = "symbol of Gruumsh";
        majgod[4] = "symbol of Moradin";
        majgod[5] = "symbol of Nerull";
        majgod[6] = "symbol of Pelor";
        majgod[7] = "symbol of Yondalla";
        majgod[8] = "symbol of Ehlonna";
        majgod[9] = "symbol of Enythnul";
        majgod[10] = "symbol of Fharlanghn";
        majgod[11] = "symbol of Heironeous";
        majgod[12] = "symbol of Hextor";
        majgod[13] = "symbol of Kord";
        majgod[14] = "symbol of Obad-Hai";
        majgod[15] = "symbol of Olidammara";
        majgod[16] = "symbol of Saint Cuthbert";
        majgod[17] = "symbol of Wee Jas";
        majgod[18] = "symbol of Vecna";
        
        
    }
    
    String[] subject = new String [80];
    {
        subject[0] = "heart";
        subject[1] = "king";
        subject[2] = "queen";
        subject[3] = "battle_depiction";
        subject[4] = "wizard";
        subject[5] = "soldier";
        subject[6] = "warlock";
        subject[7] = "archer";
        subject[8] = "druid";
        subject[9] = "barbarian";
        subject[10] = "cleric";
        subject[11] = "paladin";
        subject[12] = "bard";
        subject[13] = "monk";
        subject[14] = "goblin";
        subject[15] = "orc";
        subject[16] = "elf";
        subject[17] = "troll";
        subject[18] = "beholder";
        subject[19] = "illithid";
        subject[20] = "angel";
        subject[21] = "demon";
        subject[22] = "archon";
        subject[23] = "devil";
        subject[24] = "man";
        subject[25] = "woman";
        subject[26] = "child";
        subject[27] = "minotaur";
        subject[28] = "noble";
        subject[29] = "centaur";
        subject[30] = "tree";
        subject[31] = "potato";
        subject[32] = "flower";
        subject[33] = "sun";
        subject[34] = "zombie";
        subject[35] = "moon";
        subject[36] = "star";
        subject[37] = "ship";
        subject[38] = "pirate";
        subject[39] = "gnome";
        subject[40] = "couple";
        subject[41] = "halfling";
        subject[42] = "fireball";
        subject[43] = "lightning_bolt";
        subject[44] = "hand";
        subject[45] = "foot";
        subject[46] = "farmer";
        subject[47] = "blacksmith";
        subject[48] = "skull";
        subject[49] = "brain";
        subject[50] = "tower";
        subject[51] = "key";
        subject[52] = "prince";
        subject[53] = "princess";
        subject[54] = "vampire";
        subject[55] = "warewolf";
        subject[56] = "fisherman";
        subject[57] = "priest";
        subject[58] = "artisan";
        subject[59] = "carriage";
        subject[60] = "boquette";
        subject[61] = "island";
        subject[62] = "house";
        subject[63] = "castle";
        subject[64] = "dwarf";
        subject[65] = "jester";
        subject[66] = "mountain";
        subject[67] = "totem";
        subject[68] = "sweetroll";
        subject[69] = "lumberjack";
        subject[70] = "miner";
        subject[71] = "bartender";
        subject[72] = "barmaid";
        subject[73] = "volcano";
        subject[74] = "leaf";
        subject[75] = "theater_mask";
        subject[76] = "pyramid";
        subject[77] = "golem";
        subject[78] = "mermaid";
        subject[79] = "abstract_shape";
    }
    
    
    

    

    
    public Item()
        {
             cost = 0;   
        }
    
        public String createartwork()
    {
        arttype = (int) (Math.random() * (2) + 1);
        if (arttype == 1)
            {
            fullname = "painting";
            basecost = (int) (Math.random() * (10000) + 100);
            }
        else if (arttype == 2)
            {
            fullname = "statuette";
            basecost = (int) (Math.random() * (1000) + 100);
            }
        
        type = fullname.replaceAll("[^A-Za-z_]","");
        //Removes the numerical value from problem, preserving the chars in parenthasis
        type = type.replace('_', ' ');
        //replaces underscores with blank space
        
        if (arttype == 1)
        {
            generatetrueartdesign();  
            cost = (int)(basecost * artcost);
        }
        else if (arttype == 2)
        {
            generatemetal();
            generatetrueartdesign();
            cost = (int)((basecost * materialcost) * artcost);
        }
                

        gold = cost / 100;
        cost -= (gold * 100);
        silver = cost / 10;
        cost -= (silver * 10);
        
        if (arttype == 1)
    {
        if (gold >= 1)
        {
        fullanswer = ( "A painting of a " + art + "\n " + gold + "gp " + silver + "sp " + cost + "cp");
        }
        else if (silver >= 1)
        {          
        fullanswer = ("A painting of a " + art + "\n " + silver + "sp " + cost + "cp");
        }
        else if (cost >= 1)
        {
        fullanswer = ("A painting of a " + art + "\n " + cost + "cp");
        }
    }
        else if (arttype == 2)
    {
        if (gold >= 1)
        {      
        fullanswer = (material + " " + type + " of a " + art + "\n" + gold + "gp " + silver + "sp " + cost + "cp");
        }
        else if (silver >= 1)
        {       
        fullanswer = (material + " " + type + " of a " + art + "\n " + silver + "sp " + cost + "cp");
        }
        else if (cost >= 1)
        {        
        fullanswer = (material + " " + type + " of a " + art + "\n " + cost + "cp");
        }
            
    }
        
        return fullanswer;
        
    
    }
    public String createmundanehard()
    {
        rando = (int) (Math.random() * (HARDAMNT) + 0);
        
        fullname = mundyhard[rando];
        
        basecost = Integer.parseInt(fullname.replaceAll("[^0-9]", ""));
        //Converts the numerical values in problem to an int
        type = fullname.replaceAll("[^A-Za-z_]","");
        //Removes the numerical value from problem, preserving the chars in parenthasis
        type = type.replace('_', ' ');
        //replaces underscores with blank space
        
        generatemetal();
        generateartdesign();
        cost = (int)((basecost * materialcost) * artcost);
        gold = cost / 100;
        cost -= (gold * 100);
        silver = cost / 10;
        cost -= (silver * 10);
        
        if (gold >= 1)
        {
        if (artcost != 1)           
        fullanswer = (material + " " + type + " with a " + art + " design\n " + gold + "gp " + silver + "sp " + cost + "cp");
        else
        fullanswer = (material + " " + type + "\n " + gold + "gp " + silver + "sp " + cost + "cp");
        }
        else if (silver >= 1)
        {
        if (artcost != 1)           
        fullanswer = (material + " " + type + " with a " + art + " design\n " + silver + "sp " + cost + "cp");
        else
        fullanswer = (material + " " + type + "\n " + silver + "sp " + cost + "cp");
        }
        else if (cost >= 1)
        {
        if (artcost != 1)           
        fullanswer = (material + " " + type + " with a " + art + " design\n " + cost + "cp");
        else
        fullanswer = (material + " " + type + "\n " + cost + "cp");
        }
        
        return fullanswer;
        
    }
    
        public String createmundanesoft()
    {
        rando = (int) (Math.random() * (SOFTAMNT) + 0);
        
        fullname = mundysoft[rando];
        
        basecost = Integer.parseInt(fullname.replaceAll("[^0-9]", ""));
        //Converts the numerical values in problem to an int
        type = fullname.replaceAll("[^A-Za-z_]","");
        //Removes the numerical value from problem, preserving the chars in parenthasis
        type = type.replace('_', ' ');
        //replaces underscores with blank space
        
        generatecloth();
        generateartdesign();
        cost = (int)((basecost * materialcost) * artcost);
        gold = cost / 100;
        cost -= (gold * 100);
        silver = cost / 10;
        cost -= (silver * 10);
        
        if (gold >= 1)
        {
        if (artcost != 1)           
        fullanswer = (material + " " + type + " with a " + art + " emroidering\n " + gold + "gp " + silver + "sp " + cost + "cp");
        else
        fullanswer = (material + " " + type + "\n " + gold + "gp " + silver + "sp " + cost + "cp");
        }
        else if (silver >= 1)
        {
        if (artcost != 1)           
        fullanswer = (material + " " + type + " with a " + art + " emroidering\n " + silver + "sp " + cost + "cp");
        else
        fullanswer = (material + " " + type + "\n " + silver + "sp " + cost + "cp");
        }
        else if (cost >= 1)
        {
        if (artcost != 1)           
        fullanswer = (material + " " + type + " with a " + art + " emroidering\n " + cost + "cp");
        else
        fullanswer = (material + " " + type + "\n " + cost + "cp");
        }
        
        return fullanswer;
        
    }
    
    public void generatemetal()
    {
    
        randometal = (int) (Math.random() * (100) + 1);
        if (randometal <= 60 && rando <= 32 )
        {
            material = "wooden";
            materialcost = 1;
        }
        else if (randometal <= 80)
        {
            material = "iron";
            materialcost = 6;
        }
        else if (randometal <= 85)
        {
            material = "steel";
            materialcost = 10;
        }
        else if (randometal <= 90)
        {
            material = "silver";
            materialcost = 40;
        }
        else if (randometal <= 94)
        {
            material = "gold";
            materialcost = 60;           
        }
        else if (randometal <= 97)
        {
            material = "mithral";
            materialcost = 100;
        }
        else if (randometal <= 99)
        {
            material = "adamantine";
            materialcost = 250;
        }
        else if (randometal == 100)
        {
            material = "star_metal";
            materialcost = 450;
        }

    }
    
        public void generatecloth()
    {
    
        randometal = (int) (Math.random() * (100) + 1);
        if (randometal <= 45 )
        {
            material = "wool_cloth";
            materialcost = 1;
        }
        else if (randometal <= 70)
        {
            material = "cotton";
            materialcost = 3;
        }
        else if (randometal <= 85)
        {
            material = "fir";
            materialcost = 7;
        }
        else if (randometal <= 90)
        {
            material = "silk";
            materialcost = 15;
        }
        else if (randometal <= 94)
        {
            material = "satin";
            materialcost = 40;           
        }
        else if (randometal <= 97)
        {
            material = "linen";
            materialcost = 75;
        }
        else if (randometal <= 99)
        {
            material = "spider_silk";
            materialcost = 115;
        }
        else if (randometal == 100)
        {
            material = "aether_silk";
            materialcost = 225;
        }

    }
    
    public void generateartdesign()
    {
        randoart = (int) (Math.random() * (100) + 1);
        if (randoart <= 85)
        {
            artcost = 1;
            art = "";
        }
        else if (randoart <= 90)
        {
            artcost = 1.2;
            randosubject = (int) (Math.random() * (80));
            art = subject[randosubject];
        }
        else if (randoart <= 95)
        {
            artcost = 1.2;
            randosubject = (int) (Math.random() * (100));
            art = animal[randosubject];
        }
        else if (randoart <= 100)
        {
            artcost = 1.4;
            randosubject = (int) (Math.random() * (19));
            art = majgod[randosubject];
        }
        

    }
    
    public void generatetrueartdesign()
    {
        randoart = (int) (Math.random() * (100) + 1);
        if (randoart <= 33)
        {
            artcost = 1.2;
            randosubject = (int) (Math.random() * (80));
            art = subject[randosubject];
        }
        else if (randoart <= 66)
        {
            artcost = 1.2;
            randosubject = (int) (Math.random() * (100));
            art = animal[randosubject];
        }
        else if (randoart <= 100)
        {
            artcost = 1.4;
            randosubject = (int) (Math.random() * (19));
            art = majgod[randosubject];
        }
    
    }
}

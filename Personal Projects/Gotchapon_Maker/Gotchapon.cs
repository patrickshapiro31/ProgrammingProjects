using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Gotchapon_Maker
{
    public class Gotchapon
    {


        Random rand = new Random();

        //Number of items for arrays
        const int NUMOFANIMALS = 44;
        const int NUMOFMUTATORS = 20;
        const int NUMOFCANTRIPS = 41;

        //What the Gotcha displayed stats will be
        String prefixes = "";
        String name = "Gotcha";
        String Wingtype = "";
        String Horntype = "";
        String MutatorList = "";
        String SkillList = "";
        String Attack = "";
        //Stats
        int animaltype = 0;
        int rarity = 1;
        int str = 0;
        int atksides = 4;
        int atknums = 1;
        int def = 0;
        int hdnum = 3;
        int hdsides = 6;
        int landspeed = 10;
        int flyspeed = 0;
        int swimspeed = 0;

        //Mutators
        
        int[] mutationIndex = new int[4] { NUMOFMUTATORS, NUMOFMUTATORS, NUMOFMUTATORS, NUMOFMUTATORS };

        int horns = 0;
        int wings = 0;
        int gloweyes = 0;
        int speech = 0;
        int tails = 0;
        int weapon = 0;
        int spiderclimb = 0;
        int antennai = 0;
        int fins = 0;
        int floofy = 0;
        int metal = 0;
        int sleek = 0;
        int grapple = 0;
        int crystal = 0;
        int modded = 0;
        int chameleon = 0;
        int dire = 0;
        int glowbod = 0;
        int flamegift = 0;
        int springload = 0;

        bool aquatic = false;
        bool multiattack = false;
        bool rollhorns = true;
        bool rollwings = true;


        //skills
        int ath = 0;
        int acro = 0;
        int soh = 0;
        int ste = 0;
        int arc = 0;
        int his = 0;
        int nat = 0;
        int rel = 0;
        int inv = 0;
        int ins = 0;
        int med = 0;
        int per = 0;
        int sur = 0;
        int perf = 0;

        
        //Array for the animals
        String[] baseAnimal = new string[NUMOFANIMALS]
            {
                "Humanoid",
                "Unicorn",
                "Mimic",
                "Hydra",
                "Treant",
                "Spider",
                "Minotaur",
                "Dragon",
                "Skeleton",
                "Owlbear",
                "Owl",
                "Horse",
                "Dog",
                "Cat",
                "Rabbit",
                "Sheep",
                "Bird",
                "Monkey",
                "Lizard",
                "Mouse",
                "Squirrel",
                "Raccoon",
                "Fox",
                "Panda",
                "Wolf",
                "Frog",
                "Hedgehog",
                "Octopus",
                "Seal",
                "Chicken",
                "Red Panda",
                "Ferret",
                "Beetle",
                "Scorpion",
                "Capybara",
                "Otter",
                "Penguin",
                "Chameleon",
                "Chipmunk",
                "Hairball",
                "Snake",
                "Shark",
                "Dolphin",
                "Grasshopper"
            };

        String[] Mutators = new string[NUMOFMUTATORS]
        {
            "Horned",
            "Winged",
            "Sightgifted",
            "Enlightened",
            "Polytailed",
            "Armed",
            "Skittering",
            "Aware",
            "Finned",
            "Fluffy",
            "Metallic",
            "Sleek",
            "Snaring",
            "Gifted",
            "Modded",
            "Vanishing",
            "Dire",
            "Bioluminescant",
            "Flamegifted",
            "Spring-Loaded"
        };

        String[] Cantrips = new string[NUMOFCANTRIPS]
        {
            "Acid Splash",
            "Blade Ward",
            "Booming Blade",
            "Control Flames",
            "Create Bonfire",
            "Dancing Lights",
            "Eldrich Blast",
            "Fire Bolt",
            "Friends",
            "Frostbite",
            "Green-Flame Blade",
            "Guidence",
            "Gust",
            "Infestation",
            "Light",
            "Lightning Lure",
            "Mage Hand",
            "Magic Stone",
            "Mending",
            "Message",
            "Minor Illusion",
            "Mold Earth",
            "Poison Spray",
            "Prestidigitation",
            "Primal Savagery",
            "Produce Flame",
            "Ray of Frost",
            "Resistance",
            "Sacred Flame",
            "Shape Water",
            "Shillelagh",
            "Shocking Grasp",
            "Spare the Dying",
            "Sword Burst",
            "Thaumaturgy",
            "Thorn Whip",
            "Thunderclap",
            "Toll the Dead",
            "Truestrike",
            "Vicious Mockery",
            "Word of Radiance"
        };


        //Used to create a Gotcha with chosen rarity
        public void createGotcha(int givenRarity)
        {
            rarity = givenRarity;
            RollAnimal();
            RollMutators();

            int raritydice = 4;
            if (rarity == 3)
                raritydice = 6;
            if (rarity == 4)
                raritydice = 6;

            if (rarity >= 3)
                hdnum++;

            str = rand.Next(1, (raritydice + 1));
            def = rand.Next(1, (raritydice));
            if (def < 0)
                def = 0;

            RollSkills();


        }

        //Creates a Gotcha with random rarity
        public void createGotcha()
        {
            int diceroll = rand.Next(1, 101);

            if (diceroll <= 50) rarity = 1;
            else if (diceroll <= 79) rarity = 2;
            else if (diceroll <= 95) rarity = 3;
            else if (diceroll > 95) rarity = 4;
            else rarity = 1;

            createGotcha(rarity);
        }

        //Strings for the UI
        public String getname()
        {
            String rarityname = "Common";

            if (rarity == 1)
                rarityname = "Common";
            if (rarity == 2)
                rarityname = "Rare";
            if (rarity == 3)
                rarityname = "Epic";
            if (rarity == 4)
                rarityname = "Legendary";
            name = rarityname + " " + prefixes + baseAnimal[animaltype] + " ";

            return name;
        }
        public String getatt()
        {
            return MutatorList;
        }
        public String getatk()
        {

            Attack = "1D" + (atksides) + " + " + str;

            if (horns > 0)
            {
                Attack += ", 1D" + (8 + (horns * 2)) + " Charge";
            }

            if (flamegift > 0)
            {
                Attack += ", Flamegift";
            }

            if (grapple > 0)
            {
                Attack += ", Grapple +" + (grapple * 2);
            }

            return Attack;
        }
        public String gethd()
        {
            String hitdice = "";
            hitdice = hdnum + "D" + hdsides;

            return hitdice;
        }
        public String getspeed()
        {
            String speedstring = "";

            if (landspeed > 0)
                speedstring += "Land(" + landspeed + "ft.) ";
            if (swimspeed > 0)
                speedstring += "Swim(" + swimspeed + "ft.) ";
            if (flyspeed > 0)
                speedstring += "Fly(" + flyspeed + "ft.) ";

            return speedstring;
        }
        public String getdef()
        {
            return "" + def;
        }
        public String getskill()
        {
            return SkillList;
        }




        //Roll Mutators based on rarity.
        void RollMutators()
        {
            
            int mutatorroll = 0;

            for (int i = 0; i < rarity; i++)
            {
                mutatorroll = rand.Next(NUMOFMUTATORS);
                switch (mutatorroll)
                {
                    case 0: horns++; break;
                    case 1: wings++; break;
                    case 2: gloweyes++; break;
                    case 3: speech++; break;
                    case 4: tails++; break;
                    case 5: weapon++; break;
                    case 6: spiderclimb++; break;
                    case 7: antennai++; break;
                    case 8: fins++; break;
                    case 9: floofy++; break;
                    case 10: metal++; break;
                    case 11: sleek++; break;
                    case 12: grapple++; break;
                    case 13: crystal++; break;
                    case 14: modded++; break;
                    case 15: chameleon++; break;
                    case 16: dire++; break;
                    case 17: glowbod++; break;
                    case 18: flamegift++; break;
                    case 19: springload++; break;
                    
                }
                if (mutatorroll != mutationIndex[0] && mutatorroll != mutationIndex[1] && mutatorroll != mutationIndex[2])
                    prefixes += Mutators[mutatorroll] + " ";

                mutationIndex[i] = mutatorroll;
            }

            CheckMutators();
        }

        //Randomly selects the animal of the Gotcha
        void RollAnimal()
        {
            animaltype = rand.Next(NUMOFANIMALS);
            
            switch(animaltype)
            {
                case 0: weapon++; break;
                case 1: horns++; rollhorns = false; break;
                case 2: ste++;  break;
                case 3: multiattack = true;  break;
                case 4: speech++; nat++; break;
                case 5: spiderclimb++; break;
                case 6: horns++; rollhorns = false; break;
                case 7: flamegift++;  break;
                case 8: gloweyes++; break;
                case 9: dire++; break;
                case 10: wings++; rollwings = false;  per++; break;
                case 11: landspeed += 5; break;
                case 12: sur++;  break;
                case 13: acro++;  break;
                case 14: landspeed += 5; break;
                case 15: floofy++; break;
                case 16: speech++; wings++; rollwings = false;  break;
                case 17: perf++; break;
                case 18: ste++; break;
                case 19: inv++; break;
                case 20: acro++; break;
                case 21: soh++; break;
                case 22: ins++; break;
                case 23: ath++; break;
                case 24: sur++; break;
                case 25: swimspeed = 10; break;
                case 26: landspeed += 5; break;
                case 27: grapple++; break;
                case 28: swimspeed = 10; break;
                case 29: med++; break;
                case 30: inv++; break;
                case 31: ste++; break;
                case 32: metal++; break;
                case 33: weapon++; break;
                case 34: med++; break;
                case 35: swimspeed = 10; break;
                case 36: swimspeed = 10; break;
                case 37: chameleon++; break;
                case 38: sur++; break;
                case 39: floofy++; break;
                case 40: grapple++; break;
                case 41: aquatic = true; weapon++; break;
                case 42: aquatic = true; med++; break;
                case 43: springload++; break;

            }


        }

        //Adds stats for the Gotcha's mutators
        void CheckMutators()
        {

            if (wings > 0)
            {
                //First set of flyspeed grants 10 instead of 5
                if (flyspeed == 0)
                    flyspeed = 5;
                flyspeed += wings * 5;

                if (rollwings)
                {
                    switch (rand.Next(10))
                    {
                        case 0: Wingtype = "Angelic"; break;
                        case 1: Wingtype = "Demonic"; break;
                        case 2: Wingtype = "Draconic"; break;
                        case 3: Wingtype = "Boney"; break;
                        case 4: Wingtype = "Raven"; break;
                        case 5: Wingtype = "Butterfly"; break;
                        case 6: Wingtype = "Dragonfly"; break;
                        case 7: Wingtype = "Robotic"; break;
                        case 8: Wingtype = "Etherial"; break;
                        case 9: Wingtype = "Bird-Like"; break;
                    };
                    MutatorList += (wings * 2) + " " + Wingtype + "Wings(" + (flyspeed) + "ft.), ";
                }
                else
                {
                    MutatorList += (wings * 2) + " " + "Wings(" + (flyspeed) + "ft.), ";
                }
            }

            if (speech > 0)
                MutatorList += "Speech(" + speech + "), ";

            if (gloweyes == 1)
                MutatorList += "Darkvision, ";
            else if (gloweyes == 2)
                MutatorList += "See Invisible, ";
            else if (gloweyes > 2)
                MutatorList += "Truesight, ";

            if (tails > 0)
            {
                int numoftails = 0;
                for(int i = 0; i < tails; i++)
                {
                    numoftails += rand.Next(1, 5);

                    switch (rand.Next(5))
                    {
                        case 0: arc += rarity; break;
                        case 1: his += rarity; break;
                        case 2: nat += rarity; break;
                        case 3: rel += rarity; break;
                    }
                }
                MutatorList += numoftails + " Tails, ";
            }

            if (weapon > 0)
            {
                atksides += (weapon * 2);

                if (atksides > 12)
                    atksides = 12;

                MutatorList += "Weapon(1d" + atksides + "), ";
            }

            if (spiderclimb > 0)
                MutatorList += "Spiderclimb, ";

            if (antennai > 0)
                MutatorList += "Blindsense, ";

            if (floofy > 0)
            {
                MutatorList += "Regenerator(" + floofy + "), ";
            }
            
            if (metal > 0)
            {
                hdsides += (metal * 2);
                MutatorList += "Metalic(D" + hdsides + " Hit Dice), ";
            }

            if (sleek > 0)
            {
                landspeed += (sleek * 5);
                MutatorList += "Sleek(+" + (sleek * 5) + "ft. Movespeed), ";
            }

            if (grapple > 0)
            {
                MutatorList += "Tail Grapple +" + (grapple * 2) + ", ";
            }

            if (crystal > 0)
            {
                int cantrippicker;
                MutatorList += "Head crystal: ";

                for (int i = 0; i < crystal; i++)
                {
                    cantrippicker = rand.Next(NUMOFCANTRIPS);
                    MutatorList += Cantrips[cantrippicker] + " at will, ";
                }
                int charisma = RollStat();
                int chamod = ((charisma - 10) / 2);
                MutatorList += "DC(" + (8 + rarity + chamod) + ") Cha " + charisma + ", ";
            }

            if (modded > 0)
            {

                for (int i = 0; i < modded; i++)
                {
                    int toolmod = rand.Next(17);
                    switch (toolmod)
                    {
                        case 0: MutatorList += "Built in Alchemist's Tools "; break;
                        case 1: MutatorList += "Built in Brewers's Tools "; break;
                        case 2: MutatorList += "Built in Calligrapher's Tools "; break;
                        case 3: MutatorList += "Built in Carpenter's Tools "; break;
                        case 4: MutatorList += "Built in Cartographer's Tools "; break;
                        case 5: MutatorList += "Built in Cobbler's Tools "; break;
                        case 6: MutatorList += "Built in Cook's Utensils "; break;
                        case 7: MutatorList += "Built in Glassblower's Tools "; break;
                        case 8: MutatorList += "Built in Jeweler's Tools "; break;
                        case 9: MutatorList += "Built in Leatherworker's Tools "; break;
                        case 10: MutatorList += "Built in Mason's Tools "; break;
                        case 11: MutatorList += "Built in Painter's Tools "; break;
                        case 12: MutatorList += "Built in Potter's Tools "; break;
                        case 13: MutatorList += "Built in Smith's Tools "; break;
                        case 14: MutatorList += "Built in Tinker's Tools "; break;
                        case 15: MutatorList += "Built in Weaver's Tools "; break;
                        case 16: MutatorList += "Built in Woodcarver's Tools "; break;
                    }
                    MutatorList += "+" + rarity + ", ";
                }

            }

            if (chameleon == 1)
                MutatorList += "Camouflage: +10 slealth when still, ";
            else if (chameleon >= 2)
                MutatorList += "Camouflage: Invisible while still, ";

            if (dire > 0)
            {
                hdnum += dire;
                MutatorList += "Extra " + dire + " HitDice, ";
            }

            if (glowbod > 0)
            {
                MutatorList += "Gives off light, ";
            }

            if (springload > 0)
            {
                MutatorList += "Can jump up to " + ((landspeed * 5) * springload) + "ft, ";
            }

            if (aquatic)
                MakeAquatic();


            if (horns > 0)
            {
                if (horns > 2)
                    horns = 2;

                if (rollhorns)
                {
                    switch (rand.Next(7))
                    {
                        case 0: Horntype = "Unicorn"; break;
                        case 1: Horntype = "Bull"; break;
                        case 2: Horntype = "Ram"; break;
                        case 3: Horntype = "Boney"; break;
                        case 4: Horntype = "Deer"; break;
                        case 5: Horntype = "Curled"; break;
                        case 6: Horntype = "Straight"; break;
                    };
                    MutatorList += Horntype + "Horns(1d" + (8 + (horns * 2)) + "), ";
                }
                else
                {
                    MutatorList += "Horns(1d" + (8 + (horns * 2)) + "), ";
                }
            }

            if (fins > 0)
            {
                if (swimspeed == 0)
                    swimspeed = 5;

                swimspeed += (fins * 5);
                MutatorList += "Fins(+" + swimspeed + "ft. Swimspeed), ";
            }

            if (multiattack)
            {
                MutatorList += "2 attacks per round, ";
            }



        }

        //Used for Gotchas with the 'Aquatic' mutator
        void MakeAquatic()
        {
            swimspeed = landspeed;
            landspeed = 0;
        }

        //roll 3d6, gain an extra dice and drop lowest per crystal on the Gotcha
        public int RollStat()
        {
            int cha = 0;
            int lowroll = 0;
            int newdice = 0;
            int[] dice = new int[3] { 0, 0, 0 };
            dice[0] = rand.Next(1, 7);
            dice[1] = rand.Next(1, 7);
            dice[2] = rand.Next(1, 7);

            for (int i = 0; i < crystal; i++)
            {
                if (dice[0] <= dice[1] && dice[0] <= dice[2])
                    lowroll = dice[0];
                if (dice[1] <= dice[0] && dice[1] <= dice[2])
                    lowroll = dice[1];
                if (dice[2] <= dice[0] && dice[2] <= dice[1])
                    lowroll = dice[2];

                newdice = rand.Next(1, 7);
                if (newdice > lowroll)
                {
                    if (dice[0] == lowroll)
                        dice[0] = newdice;
                    else if (dice[1] == lowroll)
                        dice[1] = newdice;
                    else if (dice[2] == lowroll)
                        dice[2] = newdice;
                }
            }

            cha = dice[0] + dice[1] + dice[2];
            return cha;
        }

        void RollSkills()
        {
            int skillselect;

            for (int i = 0; i < rarity; i++)
            {
                skillselect = rand.Next(14);

                switch(skillselect)
                {
                    case 0: ath++; break;
                    case 1: acro++; break;
                    case 2: soh++; break;
                    case 3: ste++; break;
                    case 4: arc++; break;
                    case 5: his++; break;
                    case 6: inv++; break;
                    case 7: nat++; break;
                    case 8: ins++; break;
                    case 9: med++; break;
                    case 10: per++; break;
                    case 11: sur++; break;
                    case 12: perf++; break;
                    case 13: rel++; break;
                }


            }

            if (ath > 2) ath = 2;
            if (acro > 2) acro = 2;
            if (soh > 2) soh = 2;
            if (ste > 2) ste = 2;
            if (arc > 2) arc = 2;
            if (his > 2) his = 2;
            if (inv > 2) inv = 2;
            if (nat > 2) nat = 2;
            if (ins > 2) ins = 2;
            if (med > 2) med = 2;
            if (per > 2) per = 2;
            if (sur > 2) sur = 2;
            if (perf > 2) perf = 2;
            if (rel > 2) rel = 2;

            if (ath != 0) SkillList += "Athletics +" + (ath * rarity) + ", ";
            if (acro != 0) SkillList += "Acrobatics +" + (acro * rarity) + ", ";
            if (arc != 0) SkillList += "Arcana +" + (arc * rarity) + ", ";
            if (his != 0) SkillList += "History +" + (his * rarity) + ", ";
            if (ins != 0) SkillList += "Insight +" + (ins * rarity) + ", ";
            if (inv != 0) SkillList += "Investigation +" + (inv * rarity) + ", ";
            if (med != 0) SkillList += "Medicine +" + (med * rarity) + ", ";
            if (nat != 0) SkillList += "Nature +" + (nat * rarity) + ", ";
            if (per != 0) SkillList += "Perception +" + (per * rarity) + ", ";
            if (perf != 0) SkillList += "Performance +" + (perf * rarity) + ", ";
            if (rel != 0) SkillList += "Religeon +" + (rel * rarity) + ", ";
            if (soh != 0) SkillList += "Sleight of Hand +" + (soh * rarity) + ", ";
            if (ste != 0) SkillList += "Stealth +" + (ste * rarity) + ", ";
            if (sur != 0) SkillList += "Survival +" + (sur * rarity) + ", ";


        }




        //Getters for the required stats (Gotchapon Battler)
        public int getAtkMod() //Flat Attack Modifier
        {
            return str;
        }

        public int getAtkSides() //Size of Attack dice
        {
            return atksides;
        }

        public int getAtkNum() //Number of Attack dice
        {
            return atknums;
        }

        public int getHDNum() //Number of Hit dice
        {
            return hdnum;
        }

        public int getHDSize() //Hit dice size
        {
            return hdsides;
        }

        public int getDefMod() //Defence
        {
            return def;
        }

        //Get Speeds
        public int getLandSpeed()
        {
            return landspeed;
        }
        public int getSwimSpeed()
        {
            return swimspeed;
        }
        public int getFlySpeed()
        {
            return flyspeed;
        }

        public bool getFlamegift()
        {
            if (flamegift >= 1)
                return true;
            else
                return false;
        }

        public int getGrapple()
        {
            return (grapple * 2);
        }

        //Charge modifiers
        public int getChargeDiceNum()
        {
            return 1;
        }
        public int getChargeDiceSize()
        {
            if (horns > 0)
                return (8 + (horns * 2));
            else
                return 0;
        }

        public int getRegen()
        {
            return floofy;
        }

    }
}

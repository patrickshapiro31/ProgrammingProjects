using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LootGenerator
{
    
    public class Loot
    {
        private Random rand = new Random();
        public bool rubycheq, sapphirecheq, emeraldcheq, amethystcheq, citrinecheq, jaspercheq, 
            onyxcheq, diamondcheq, shardcheq, wandcheq, consumecheq, ringcheq, junkcheq;
        public int budget = 0;
        public int junk = 0;
        public int shards = 0;
        public int[] smallgem = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, };
        public int[] medgem = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, };
        public int[] largegem = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, };
        public int[] wands = new int[] { 0, 0, 0, 0};
        public int[] potions = { 0, 0, 0 };
        public int[] curepots = new int[] { 0, 0, 0 };
        public int[] scrolls = new int[] { 0, 0, 0, 0 };
        public int[] rings = new int[] {0, 0, 0 };




        public void Generate(int importedBudget)
        {
            budget = importedBudget;

            while (budget > 0 && ValidateSelection())
            {
                if (budget < 50)
                {
                    if (junkcheq)
                        AddJunk();
                    else
                        budget -= 50;
                }
                else if (budget <= 500)
                {
                    if (AnyGemCheq() || junkcheq || consumecheq || diamondcheq)
                    {
                        LootT1();
                    } else
                        budget -= 200;
                }
                else if (budget <= 5000)
                {
                    LootT2();
                }
                else if (budget <= 20000)
                {
                    if (AnyGemCheq() || diamondcheq || wandcheq || consumecheq || ringcheq)
                    {
                        LootT3();
                    }
                    else
                        budget -= 1000;
                }
                else if (budget > 20000)
                {
                    if (AnyGemCheq() || diamondcheq || wandcheq || ringcheq)
                    {
                        LootT4();
                    } else
                        budget -= 1000;

                }

            }


        }

        public void AddJunk()
        {
            junk++;
            budget -= 50;
        }

        public void AddShard()
        {
            shards++;
            budget -= 500;
        }

        public bool AnyGemCheq()
        {
            if (rubycheq || sapphirecheq || emeraldcheq || amethystcheq || citrinecheq ||
                jaspercheq || onyxcheq)
                return true;
            else
                return false;
        }

        public bool ValidateSelection()
        {
            if (AnyGemCheq() || diamondcheq || shardcheq || wandcheq || consumecheq || ringcheq ||
                junkcheq)
                return true;
            else
                return false;
        }



        public void AddMinorGem()
        {

            int maxitems = 0;
            int yourprize = 0;
            int prizepicker = 0;
            if (rubycheq) maxitems++;
            if (sapphirecheq) maxitems++;
            if (emeraldcheq) maxitems++;
            if (amethystcheq) maxitems++;
            if (citrinecheq) maxitems++;
            if (jaspercheq) maxitems++;
            if (onyxcheq) maxitems++;

            yourprize = rand.Next(maxitems);

            if (prizepicker == yourprize && rubycheq)
            { smallgem[0]++; } if (rubycheq)
            { prizepicker++; }
            if (prizepicker == yourprize && sapphirecheq)
            { smallgem[1] += rand.Next(1, 4); } if (sapphirecheq)
            { prizepicker++; }
            if (prizepicker == yourprize && emeraldcheq)
            { smallgem[2]++; } if (emeraldcheq)
            { prizepicker++; }
            if (prizepicker == yourprize && amethystcheq)
            { smallgem[3]++; } if (amethystcheq)
            { prizepicker++; }
            if (prizepicker == yourprize && citrinecheq)
            { smallgem[4]++; } if (citrinecheq)
            { prizepicker++; }
            if (prizepicker == yourprize && jaspercheq)
            { smallgem[5] += rand.Next(1, 6); } if (jaspercheq)
            { prizepicker++; }
            if (prizepicker == yourprize && onyxcheq)
            { smallgem[6] += rand.Next(1, 8); } if (onyxcheq)
            { prizepicker++; }

            budget -= 200;

        }

        public void AddMedGem()
        {

            int maxitems = 0;
            int yourprize = 0;
            int prizepicker = 0;
            if (rubycheq) maxitems++;
            if (sapphirecheq) maxitems++;
            if (emeraldcheq) maxitems++;
            if (amethystcheq) maxitems++;
            if (citrinecheq) maxitems++;
            if (jaspercheq) maxitems++;
            if (onyxcheq) maxitems++;

            yourprize = rand.Next(maxitems);

            if (prizepicker == yourprize && rubycheq)
            { medgem[0]++; }
            if (rubycheq)
            { prizepicker++; }
            if (prizepicker == yourprize && sapphirecheq)
            { medgem[1] += rand.Next(1, 4); }
            if (sapphirecheq)
            { prizepicker++; }
            if (prizepicker == yourprize && emeraldcheq)
            { medgem[2]++; }
            if (emeraldcheq)
            { prizepicker++; }
            if (prizepicker == yourprize && amethystcheq)
            { medgem[3]++; }
            if (amethystcheq)
            { prizepicker++; }
            if (prizepicker == yourprize && citrinecheq)
            { medgem[4]++; }
            if (citrinecheq)
            { prizepicker++; }
            if (prizepicker == yourprize && jaspercheq)
            { medgem[5] += rand.Next(1, 6); }
            if (jaspercheq)
            { prizepicker++; }
            if (prizepicker == yourprize && onyxcheq)
            { medgem[6] += rand.Next(1, 8); }
            if (onyxcheq)
            { prizepicker++; }

            budget -= 750;

        }

        public void AddLargeGem()
        {

            int maxitems = 0;
            int yourprize = 0;
            int prizepicker = 0;
            if (rubycheq) maxitems++;
            if (sapphirecheq) maxitems++;
            if (emeraldcheq) maxitems++;
            if (amethystcheq) maxitems++;
            if (citrinecheq) maxitems++;
            if (jaspercheq) maxitems++;
            if (onyxcheq) maxitems++;

            yourprize = rand.Next(maxitems);

            if (prizepicker == yourprize && rubycheq)
            { largegem[0]++; }
            if (rubycheq)
            { prizepicker++; }
            if (prizepicker == yourprize && sapphirecheq)
            { largegem[1] += rand.Next(1, 4); }
            if (sapphirecheq)
            { prizepicker++; }
            if (prizepicker == yourprize && emeraldcheq)
            { largegem[2]++; }
            if (emeraldcheq)
            { prizepicker++; }
            if (prizepicker == yourprize && amethystcheq)
            { largegem[3]++; }
            if (amethystcheq)
            { prizepicker++; }
            if (prizepicker == yourprize && citrinecheq)
            { largegem[4]++; }
            if (citrinecheq)
            { prizepicker++; }
            if (prizepicker == yourprize && jaspercheq)
            { largegem[5] += rand.Next(1, 6); }
            if (jaspercheq)
            { prizepicker++; }
            if (prizepicker == yourprize && onyxcheq)
            { largegem[6] += rand.Next(1, 8); }
            if (onyxcheq)
            { prizepicker++; }

            budget -= 3000;

        }

        public void AddMinorDiamond()
        {
            smallgem[7]++;
            budget -= 750;
        }

        public void AddMedDiamond()
        {
            medgem[7]++;
            budget -= 4000;
        }

        public void AddLargeDiamond()
        {
            largegem[7]++;
            budget -= 8000;
        }

        public void AddMinorRing()
        {
            rings[0]++;
            budget -= 3000;
        }

        public void AddMedRing()
        {
            rings[1]++;
            budget -= 7500;
        }

        public void AddMajRing()
        {
            rings[2]++;
            budget -= 18000;
        }

        public void AddMinorPotion()
        {
            int yourprize = rand.Next(100);

            if (yourprize > 65)
            { potions[0]++; }
            else
            { curepots[0]++; }

            budget -= 100;
        }

        public void AddMedPotion()
        {
            int yourprize = rand.Next(100);

            if (yourprize > 65)
            { potions[1]++; }
            else
            { curepots[1]++; }

            budget -= 600;
        }

        public void AddMajPotion()
        {
            int yourprize = rand.Next(100);

            if (yourprize > 65)
            { potions[2]++; }
            else
            { curepots[2]++; }

            budget -= 1000;
        }

        public void AddMediumPotion()
        {
            int yourprize = rand.Next(100);

            if (yourprize > 65)
            { potions[1]++; }
            else
            { curepots[1]++; }

            budget -= 400;
        }

        public void AddMinorWand()
        {
            wands[0]++;
            budget -= 1000;
        }

        public void AddMedWand()
        {
            wands[1]++;
            budget -= 2000;
        }

        public void AddMajWand()
        {
            wands[2]++;
            budget -= 5000;
        }

        public void LootT1()
        {
            int maxitems = 0;
            int yourprize = 0;
            int junkroll = 0;
            int gemroll = 0;
            int consumroll = 0;
            int diamondroll = 0;

            if (junkcheq)
            {
                maxitems += 20;
                junkroll = maxitems;
            }
            if (AnyGemCheq())
            {
                maxitems += 30;
                gemroll = maxitems;
            }
            if (consumecheq)
            {
                maxitems += 30;
                consumroll = maxitems;
            }
            if (diamondcheq)
            {
                maxitems++;
                diamondroll = maxitems;
            }


            yourprize = rand.Next(1, maxitems);

            if (yourprize <= junkroll)
            { AddJunk(); }
            else if (yourprize <= gemroll)
            { AddMinorGem(); }
            else if (yourprize <= consumroll)
            { AddMinorPotion(); }
            else
            { AddMinorDiamond(); }

        }

        public void LootT2()
        {

            int maxitems = 0;
            int yourprize = 0;
            int junkroll = 0;
            int gemroll = 0;
            int gemrollm = 0;
            int consumroll = 0;
            int consumroll2 = 0;
            int consumroll3 = 0;
            int wandroll = 0;
            int wandroll2 = 0;
            int diamondroll = 0;
            int diamondrollm = 0;
            int ringroll = 0;
            int shardroll = 0;
            

            if (junkcheq)
            {
                maxitems += 10;
                junkroll = maxitems;
            }
            if (AnyGemCheq())
            {
                maxitems += 30;
                gemroll = maxitems;
                maxitems += 20;
                gemrollm = maxitems;
            }
            if (consumecheq)
            {
                maxitems += 30;
                consumroll = maxitems;
                maxitems += 20;
                consumroll2 = maxitems;
                maxitems += 10;
                consumroll3 = maxitems;
            }
            if (wandcheq)
            {
                maxitems += 20;
                wandroll = maxitems;
                maxitems += 10;
                wandroll2 = maxitems;
            }
            if (diamondcheq)
            {
                maxitems += 7;
                diamondroll = maxitems;
                maxitems++;
                diamondrollm = maxitems;
            }
            if (ringcheq)
            {
                maxitems++;
                ringroll = maxitems;
            }
            if (shardcheq)
            {
                maxitems += 5;
                shardroll = maxitems;
            }


            yourprize = rand.Next(1, maxitems);

            if (yourprize <= junkroll)
            { AddJunk(); }
            else if (yourprize <= gemroll)
            { AddMinorGem(); }
            else if (yourprize <= gemrollm)
            { AddMedGem(); }
            else if (yourprize <= consumroll)
            { AddMinorPotion(); }
            else if (yourprize <= consumroll2)
            { AddMediumPotion(); }
            else if (yourprize <= consumroll3)
            { AddMajPotion(); }
            else if (yourprize <= wandroll)
            { AddMinorWand(); }
            else if (yourprize <= wandroll2)
            { AddMedWand(); }
            else if (yourprize <= diamondroll)
            { AddMinorDiamond(); }
            else if (yourprize <= diamondrollm)
            { AddMedDiamond(); }
            else if (yourprize <= ringroll)
            { AddMinorRing(); }
            else if (yourprize <= shardroll)
            { AddShard(); }

            
        }

        public void LootT3()
        {

            int maxitems = 0;
            int yourprize = 0;
            int gemroll = 0;
            int gemrollm = 0;
            int gemrolll = 0;
            int consumroll = 0;
            int consumroll2 = 0;
            int consumroll3 = 0;
            int wandroll = 0;
            int wandroll2 = 0;
            int wandroll3 = 0;
            int diamondroll = 0;
            int diamondrollm = 0;
            int diamondrolll = 0;
            int ringroll = 0;
            int ringrollmed = 0;
            int shardroll = 0;



            if (AnyGemCheq())
            {
                maxitems += 30;
                gemroll = maxitems;
                maxitems += 20;
                gemrollm = maxitems;
                maxitems += 10;
                gemrolll = maxitems;
            }
            if (consumecheq)
            {
                maxitems += 30;
                consumroll = maxitems;
                maxitems += 20;
                consumroll2 = maxitems;
                maxitems += 10;
                consumroll3 = maxitems;
            }
            if (wandcheq)
            {
                maxitems += 20;
                wandroll = maxitems;
                maxitems += 10;
                wandroll2 = maxitems;
                maxitems += 5;
                wandroll3 = maxitems;
            }
            if (diamondcheq)
            {
                maxitems += 10;
                diamondroll = maxitems;
                maxitems += 3;
                diamondrollm = maxitems;
                maxitems++;
                diamondrolll = maxitems;
            }
            if (ringcheq)
            {
                maxitems += 3;
                ringroll = maxitems;
                maxitems++;
                ringrollmed = maxitems;
            }
            if (shardcheq)
            {
                maxitems += 10;
                shardroll = maxitems;
            }


            yourprize = rand.Next(1, maxitems);

            if (yourprize <= gemroll)
            { AddMinorGem(); }
            else if (yourprize <= gemrollm)
            { AddMedGem(); }
            else if (yourprize <= gemrolll)
            { AddLargeGem(); }
            else if (yourprize <= consumroll)
            { AddMinorPotion(); }
            else if (yourprize <= consumroll2)
            { AddMediumPotion(); }
            else if (yourprize <= consumroll3)
            { AddMajPotion(); }
            else if (yourprize <= wandroll)
            { AddMinorWand(); }
            else if (yourprize <= wandroll2)
            { AddMedWand(); }
            else if (yourprize <= wandroll3)
            { AddMajWand(); }
            else if (yourprize <= diamondroll)
            { AddMinorDiamond(); }
            else if (yourprize <= diamondrollm)
            { AddMedDiamond(); }
            else if (yourprize <= diamondrolll)
            { AddLargeDiamond(); }
            else if (yourprize <= ringroll)
            { AddMinorRing(); }
            else if (yourprize <= ringrollmed)
            { AddMedRing(); }
            else if (yourprize <= shardroll)
            { AddShard(); }

        }

        public void LootT4()
        {

            int maxitems = 0;
            int yourprize = 0;

            int gemrolll = 0;
            int wandroll3 = 0;
            int diamondrollm = 0;
            int diamondrolll = 0;
            int ringrollmed = 0;
            int ringrolll = 0;
            int shardroll = 0;



            if (AnyGemCheq())
            {
                maxitems += 10;
                gemrolll = maxitems;
            }
            if (wandcheq)
            {
                maxitems += 5;
                wandroll3 = maxitems;
            }
            if (diamondcheq)
            {
                maxitems += 5;
                diamondrollm = maxitems;
                maxitems++;
                diamondrolll = maxitems;
            }
            if (ringcheq)
            {
                maxitems += 3;
                ringrollmed = maxitems;
                maxitems++;
                ringrolll = maxitems;
            }
            if (shardcheq)
            {
                maxitems += 5;
                shardroll = maxitems;
            }


            yourprize = rand.Next(1, maxitems);


            if (yourprize <= gemrolll)
            { AddLargeGem(); }
            else if (yourprize <= wandroll3)
            { AddMajWand(); }
            else if (yourprize <= diamondrollm)
            { AddMedDiamond(); }
            else if (yourprize <= diamondrolll)
            { AddLargeDiamond(); }
            else if (yourprize <= ringrollmed)
            { AddMedRing(); }
            else if (yourprize <= ringrolll)
            { AddMajRing(); }
            else if (yourprize <= shardroll)
            { AddShard(); }

        }





    }
}

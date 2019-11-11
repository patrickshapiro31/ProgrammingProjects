using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LootGenerator
{
    public class LootDatabase
    {
        private int[] budget = new int[] { 30, 100, 200, 300, 400, 700, 900, 1200,
        1400, 1600, 2000, 2600, 3400,
        4000, 4500, 5800, 7500, 9800,
        11500, 13000, 17000, 22000, 28000, 36000, 47000, 61000};

        public int GetBudget(int level, int mod)
        {
            int i = level + mod;
            return budget[i];
        }



    }
}

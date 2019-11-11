using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LootGenerator
{
    public partial class ResultForm : Form
    {
        public ResultForm()
        {
            InitializeComponent();
            ResultBox.Text = "Loot from encounter!";
            ResultBox.Text += Environment.NewLine + "--------------------------------------------------------";
            if (MainForm.loot.junkcheq && MainForm.loot.junk > 0)
                ResultBox.Text += Environment.NewLine + $"Junk Items: {MainForm.loot.junk}";
            if (MainForm.loot.rubycheq && MainForm.loot.smallgem[0] > 0)
                ResultBox.Text += Environment.NewLine + $"Small Rubies: {MainForm.loot.smallgem[0]}";
            if (MainForm.loot.rubycheq && MainForm.loot.medgem[0] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Rubies: {MainForm.loot.medgem[0]}";
            if (MainForm.loot.rubycheq && MainForm.loot.largegem[0] > 0)
                ResultBox.Text += Environment.NewLine + $"Large Rubies: {MainForm.loot.largegem[0]}";
            if (MainForm.loot.sapphirecheq && MainForm.loot.smallgem[1] > 0)
                ResultBox.Text += Environment.NewLine + $"Small Sapphires: {MainForm.loot.smallgem[1]}";
            if (MainForm.loot.sapphirecheq && MainForm.loot.medgem[1] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Sapphires: {MainForm.loot.medgem[1]}";
            if (MainForm.loot.sapphirecheq && MainForm.loot.largegem[1] > 0)
                ResultBox.Text += Environment.NewLine + $"Large Sapphires: {MainForm.loot.largegem[1]}";
            if (MainForm.loot.emeraldcheq && MainForm.loot.smallgem[2] > 0)
                ResultBox.Text += Environment.NewLine + $"Small Emeralds: {MainForm.loot.smallgem[2]}";
            if (MainForm.loot.emeraldcheq && MainForm.loot.medgem[2] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Emeralds: {MainForm.loot.medgem[2]}";
            if (MainForm.loot.emeraldcheq && MainForm.loot.largegem[2] > 0)
                ResultBox.Text += Environment.NewLine + $"Large Emeralds: {MainForm.loot.largegem[2]}";
            if (MainForm.loot.amethystcheq && MainForm.loot.smallgem[3] > 0)
                ResultBox.Text += Environment.NewLine + $"Small Amethysts: {MainForm.loot.smallgem[3]}";
            if (MainForm.loot.amethystcheq && MainForm.loot.medgem[3] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Amethysts: {MainForm.loot.medgem[3]}";
            if (MainForm.loot.amethystcheq && MainForm.loot.largegem[3] > 0)
                ResultBox.Text += Environment.NewLine + $"Large Amethysts: {MainForm.loot.largegem[3]}";
            if (MainForm.loot.citrinecheq && MainForm.loot.smallgem[4] > 0)
                ResultBox.Text += Environment.NewLine + $"Small Citrines: {MainForm.loot.smallgem[4]}";
            if (MainForm.loot.citrinecheq && MainForm.loot.medgem[4] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Citrines: {MainForm.loot.medgem[4]}";
            if (MainForm.loot.citrinecheq && MainForm.loot.largegem[4] > 0)
                ResultBox.Text += Environment.NewLine + $"Large Citrines: {MainForm.loot.largegem[4]}";
            if (MainForm.loot.jaspercheq && MainForm.loot.smallgem[5] > 0)
                ResultBox.Text += Environment.NewLine + $"Small Jaspers: {MainForm.loot.smallgem[5]}";
            if (MainForm.loot.jaspercheq && MainForm.loot.medgem[5] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Jaspers: {MainForm.loot.medgem[5]}";
            if (MainForm.loot.jaspercheq && MainForm.loot.largegem[5] > 0)
                ResultBox.Text += Environment.NewLine + $"Large Jaspers: {MainForm.loot.largegem[5]}";
            if (MainForm.loot.onyxcheq && MainForm.loot.smallgem[6] > 0)
                ResultBox.Text += Environment.NewLine + $"Small Onyxes: {MainForm.loot.smallgem[6]}";
            if (MainForm.loot.onyxcheq && MainForm.loot.medgem[6] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Onyxes: {MainForm.loot.medgem[6]}";
            if (MainForm.loot.onyxcheq && MainForm.loot.largegem[6] > 0)
                ResultBox.Text += Environment.NewLine + $"Large Onyxes: {MainForm.loot.largegem[6]}";
            if (MainForm.loot.diamondcheq && MainForm.loot.smallgem[7] > 0)
                ResultBox.Text += Environment.NewLine + $"Small Diamonds: {MainForm.loot.smallgem[7]}";
            if (MainForm.loot.diamondcheq && MainForm.loot.medgem[7] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Diamonds: {MainForm.loot.medgem[7]}";
            if (MainForm.loot.diamondcheq && MainForm.loot.largegem[7] > 0)
                ResultBox.Text += Environment.NewLine + $"Large Diamonds: {MainForm.loot.largegem[7]}";
            if (MainForm.loot.consumecheq && MainForm.loot.potions[0] > 0)
                ResultBox.Text += Environment.NewLine + $"Minor Potions: {MainForm.loot.potions[0]}";
            if (MainForm.loot.consumecheq && MainForm.loot.potions[1] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Potions: {MainForm.loot.potions[1]}";
            if (MainForm.loot.consumecheq && MainForm.loot.potions[2] > 0)
                ResultBox.Text += Environment.NewLine + $"Major Potions: {MainForm.loot.potions[2]}";
            if (MainForm.loot.consumecheq && MainForm.loot.curepots[0] > 0)
                ResultBox.Text += Environment.NewLine + $"Cure Light Wounds Potions: {MainForm.loot.curepots[0]}";
            if (MainForm.loot.consumecheq && MainForm.loot.curepots[1] > 0)
                ResultBox.Text += Environment.NewLine + $"Cure Moderate Wounds Potions: {MainForm.loot.curepots[1]}";
            if (MainForm.loot.consumecheq && MainForm.loot.curepots[2] > 0)
                ResultBox.Text += Environment.NewLine + $"Cure Serious Wounds Potions: {MainForm.loot.curepots[2]}";
            if (MainForm.loot.wandcheq && MainForm.loot.wands[0] > 0)
                ResultBox.Text += Environment.NewLine + $"Minor Wands: {MainForm.loot.wands[0]}";
            if (MainForm.loot.wandcheq && MainForm.loot.wands[1] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Wands: {MainForm.loot.wands[1]}";
            if (MainForm.loot.wandcheq && MainForm.loot.wands[2] > 0)
                ResultBox.Text += Environment.NewLine + $"Major Wands: {MainForm.loot.wands[2]}";
            if (MainForm.loot.ringcheq && MainForm.loot.rings[0] > 0)
                ResultBox.Text += Environment.NewLine + $"Minor Rings: {MainForm.loot.rings[0]}";
            if (MainForm.loot.ringcheq && MainForm.loot.rings[1] > 0)
                ResultBox.Text += Environment.NewLine + $"Medium Rings: {MainForm.loot.rings[1]}";
            if (MainForm.loot.ringcheq && MainForm.loot.rings[2] > 0)
                ResultBox.Text += Environment.NewLine + $"Major Rings: {MainForm.loot.rings[2]}";
            if (MainForm.loot.shardcheq && MainForm.loot.shards > 0)
                ResultBox.Text += Environment.NewLine + $"Mortean Shards: {MainForm.loot.shards}";
        }

        private void CloseButt_Click( object sender, EventArgs e )
        {
            Close();
        }
    }
}

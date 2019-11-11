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
    public partial class MainForm : Form
    {
        public static LootDatabase looter = new LootDatabase();
        public static Loot loot;
        public MainForm()
        {
            InitializeComponent();
            DmCBox.SelectedIndex = 3;
            LevelCBox.SelectedIndex = 0;
            
        }

        private void LevelCBox_SelectedIndexChanged( object sender, EventArgs e )
        {
            ModsChanged();
        }

        private void DmCBox_SelectedIndexChanged( object sender, EventArgs e )
        {
            ModsChanged();
        }

        public void ModsChanged()
        {
            int level, mod;
            level = LevelCBox.SelectedIndex;
            mod = DmCBox.SelectedIndex;
            int displayedBudget = looter.GetBudget(level, mod);
            LootLabel.Text = $"Loot Budget: {displayedBudget}";
        }

        public int GetBudget()
        {
            int level, mod;
            level = LevelCBox.SelectedIndex;
            mod = DmCBox.SelectedIndex;
            int displayedBudget = looter.GetBudget(level, mod);
            return displayedBudget;
        }

        private void LootButton_Click( object sender, EventArgs e )
        {
            loot = new Loot();
            loot.rubycheq = Rubybox.Checked;
            loot.sapphirecheq = SapphireBox.Checked;
            loot.emeraldcheq = EmeraldBox.Checked;
            loot.amethystcheq = AmethystBox.Checked;
            loot.citrinecheq = CitrineBox.Checked;
            loot.jaspercheq = JasperBox.Checked;
            loot.onyxcheq = OnyxBox.Checked;
            loot.diamondcheq = DiamondBox.Checked;
            loot.shardcheq = ShardBox.Checked;
            loot.wandcheq = Wandbox.Checked;
            loot.consumecheq = Consumebox.Checked;
            loot.ringcheq = RingBox.Checked;
            loot.junkcheq = JunkBox.Checked;
            loot.Generate(GetBudget());
            ResultForm form = new ResultForm();
            form.StartPosition = FormStartPosition.CenterParent;
            if (form.ShowDialog() != DialogResult.OK)
            { return; }
        }

        private void ChecqAll_Click( object sender, EventArgs e )
        {
            Rubybox.Checked = true;
            SapphireBox.Checked = true;
            EmeraldBox.Checked = true;
            AmethystBox.Checked = true;
            CitrineBox.Checked = true;
            JasperBox.Checked = true;
            OnyxBox.Checked = true;
            DiamondBox.Checked = true;
            Wandbox.Checked = true;
            Consumebox.Checked = true;
            RingBox.Checked = true;
            JunkBox.Checked = true;
            ShardBox.Checked = true;
        }
    }
}

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Gotchapon_Maker
{
    public partial class form1 : Form
    {
        public Gotchapon Gotcha = new Gotchapon();

        public form1()
        {
            InitializeComponent();

        }

        private void GotchaButt_Click(object sender, EventArgs e)
        {
            Gotcha = new Gotchapon();
            Gotcha.createGotcha();
            MainLab.Text = $"{Gotcha.getname()}";
            AbilitiesLab1.Text = $"{Gotcha.getatt()}";
            AttackLab.Text = $"Attack: {Gotcha.getatk()}";
            DefenceLab.Text = $"Defence: {Gotcha.getdef()}";
            HitDiceLab.Text = $"Hit Dice: {Gotcha.gethd()}";
            SpeedLab.Text = $"Speed: {Gotcha.getspeed()}";
            SkillLab.Text = $"{Gotcha.getskill()}";
        }

        private void LegendaryButt_Click(object sender, EventArgs e)
        {
            Gotcha = new Gotchapon();
            Gotcha.createGotcha(4);
            MainLab.Text = $"{Gotcha.getname()}";
            AbilitiesLab1.Text = $"{Gotcha.getatt()}";
            AttackLab.Text = $"Attack: {Gotcha.getatk()}";
            DefenceLab.Text = $"Defence: {Gotcha.getdef()}";
            HitDiceLab.Text = $"Hit Dice: {Gotcha.gethd()}";
            SpeedLab.Text = $"Speed: {Gotcha.getspeed()}";
            SkillLab.Text = $"{Gotcha.getskill()}";
        }

        private void EpicButt_Click(object sender, EventArgs e)
        {
            Gotcha = new Gotchapon();
            Gotcha.createGotcha(3);
            MainLab.Text = $"{Gotcha.getname()}";
            AbilitiesLab1.Text = $"{Gotcha.getatt()}";
            AttackLab.Text = $"Attack: {Gotcha.getatk()}";
            DefenceLab.Text = $"Defence: {Gotcha.getdef()}";
            HitDiceLab.Text = $"Hit Dice: {Gotcha.gethd()}";
            SpeedLab.Text = $"Speed: {Gotcha.getspeed()}";
            SkillLab.Text = $"{Gotcha.getskill()}";
        }

        private void RareButt_Click(object sender, EventArgs e)
        {
            Gotcha = new Gotchapon();
            Gotcha.createGotcha(2);
            MainLab.Text = $"{Gotcha.getname()}";
            AbilitiesLab1.Text = $"{Gotcha.getatt()}";
            AttackLab.Text = $"Attack: {Gotcha.getatk()}";
            DefenceLab.Text = $"Defence: {Gotcha.getdef()}";
            HitDiceLab.Text = $"Hit Dice: {Gotcha.gethd()}";
            SpeedLab.Text = $"Speed: {Gotcha.getspeed()}";
            SkillLab.Text = $"{Gotcha.getskill()}";
        }

        private void CommonButt_Click(object sender, EventArgs e)
        {
            Gotcha = new Gotchapon();
            Gotcha.createGotcha(1);
            MainLab.Text = $"{Gotcha.getname()}";
            AbilitiesLab1.Text = $"{Gotcha.getatt()}";
            AttackLab.Text = $"Attack: {Gotcha.getatk()}";
            DefenceLab.Text = $"Defence: {Gotcha.getdef()}";
            HitDiceLab.Text = $"Hit Dice: {Gotcha.gethd()}";
            SpeedLab.Text = $"Speed: {Gotcha.getspeed()}";
            SkillLab.Text = $"{Gotcha.getskill()}";
        }
    }
}

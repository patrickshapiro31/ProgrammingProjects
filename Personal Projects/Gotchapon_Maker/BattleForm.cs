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
    public partial class BattleForm : Form
    {
        public Gotchapon Player1 = new Gotchapon();
        public Gotchapon Player2 = new Gotchapon();
        Random rand = new Random();
        int turncount1 = 0;
        int turncount2 = 0;

        public BattleForm()
        {
            InitializeComponent();
            
        }

        //Player 1 Buttons
        private void GotchaButt_Click(object sender, EventArgs e)
        {
            Player1 = new Gotchapon();
            Player1.createGotcha();
            FillPlayer1();
        }

        private void WindUpButt_Click(object sender, EventArgs e)
        {
            int dicerolls;
            int dicesize;
            int hp = 0;
            if (Int32.TryParse(HitDiceNumberBox.Text, out dicerolls) && Int32.TryParse(HitDiceSizeBox.Text, out dicesize))
            {
                for (int i = 0; i < dicerolls; i++)
                {
                    hp += rand.Next(1, (dicesize + 1));
                }
            }

            HitPointsBox.Text = $"{hp}";

        }

        private void CommButt_Click(object sender, EventArgs e)
        {
            Player1 = new Gotchapon();
            Player1.createGotcha(1);
            FillPlayer1();
        }

        private void RareButt_Click(object sender, EventArgs e)
        {
            Player1 = new Gotchapon();
            Player1.createGotcha(2);
            FillPlayer1();
        }

        private void EpicButt_Click(object sender, EventArgs e)
        {
            Player1 = new Gotchapon();
            Player1.createGotcha(3);
            FillPlayer1();
        }

        private void LegendButt_Click(object sender, EventArgs e)
        {
            Player1 = new Gotchapon();
            Player1.createGotcha(4);
            FillPlayer1();
        }

        public void FillPlayer1()
        {
            NameBox.Text = $"{Player1.getname()}";
            HitDiceNumberBox.Text = $"{Player1.getHDNum()}";
            HitDiceSizeBox.Text = $"{Player1.getHDSize()}";
            AttackDiceNumberBox.Text = $"{Player1.getAtkNum()}";
            AttackDiceSizeBox.Text = $"{Player1.getAtkSides()}";
            AttackModBox.Text = $"{Player1.getAtkMod()}";
            DefenceBox.Text = $"{Player1.getDefMod()}";

            if (Player1.getLandSpeed() <= 0)
                LandSpeedBox.Text = $"";
            else
                LandSpeedBox.Text = $"{Player1.getLandSpeed()}";

            if (Player1.getSwimSpeed() <= 0)
                SwimSpeedBox.Text = $"";
            else
                SwimSpeedBox.Text = $"{Player1.getSwimSpeed()}";

            if (Player1.getFlySpeed() <= 0)
                FlySpeedBox.Text = $"";
            else
                FlySpeedBox.Text = $"{Player1.getFlySpeed()}";

            FlameGiftCheq.Checked = Player1.getFlamegift();

            if (Player1.getGrapple() <= 0)
                GrappleBox.Text = $"";
            else
                GrappleBox.Text = $"{Player1.getGrapple()}";

            if (Player1.getChargeDiceSize() <= 0)
            {
                ChargeDiceNumberBox.Text = "";
                ChargeDiceSizeBox.Text = "";
                ChargeModBox.Text = "";
            }
            else
            {
                ChargeDiceNumberBox.Text = $"{Player1.getChargeDiceNum()}";
                ChargeDiceSizeBox.Text = $"{Player1.getChargeDiceSize()}";
                ChargeModBox.Text = $"{Player1.getAtkMod()}";
            }

            if (Player1.getRegen() <= 0)
                RegenBox.Text = $"";
            else
                RegenBox.Text = $"{Player1.getRegen()}";
        }

        private void P1atkButt_Click(object sender, EventArgs e)
        {
            int dicerolls;
            int dicesize;
            int mod;
            int damage = 0;
            int enemyhp = 0;
            int enemydef = 0;
            turncount1++;

            if (!FlameGiftCheq.Checked)
                turncount1 = 0;


            if (Int32.TryParse(AttackDiceNumberBox.Text, out dicerolls) && Int32.TryParse(AttackDiceSizeBox.Text, out dicesize))
            {
                for (int i = 0; i < dicerolls; i++)
                {
                    damage += rand.Next(1, (dicesize + 1));
                }
            }
            if (Int32.TryParse(AttackModBox.Text, out mod))
                damage += mod;


            if (FlameGiftCheq.Checked && turncount1 >= 3)
            {
                P1DamageLabel.Text = $"{damage}" + " Flamegift Damage!";
                P1DamageLabel.ForeColor = System.Drawing.Color.Red;
                turncount1 = 0;
                RegenBox2.Text = "";

                if (Int32.TryParse(HitPointsBox2.Text, out enemyhp))
                {
                    enemyhp -= damage;
                    if (enemyhp < 0)
                    {
                        enemyhp = 0;
                    }
                    HitPointsBox2.Text = $"{enemyhp}";
                }
            }
            else
            {
                P1DamageLabel.Text = $"{damage}" + " Damage!";
                P1DamageLabel.ForeColor = System.Drawing.Color.Black;

                if (Int32.TryParse(HitPointsBox2.Text, out enemyhp) && Int32.TryParse(DefenceBox2.Text, out enemydef))
                {
                    if (damage > enemydef)
                    {
                        enemyhp -= (damage - enemydef);
                    }

                    if (enemyhp < 0)
                    {
                        enemyhp = 0;
                    }
                    HitPointsBox2.Text = $"{enemyhp}";
                }
            }
        }

        private void GrappleButt_Click(object sender, EventArgs e)
        {
            int mod;

            if (Int32.TryParse(GrappleBox.Text, out mod)) { }
            else mod = 0;

            GrappleLabel.Text = $"Grapple: {rand.Next(1, 21) + mod}";


        }

        private void ChargeButt_Click(object sender, EventArgs e)
        {
            int dicerolls;
            int dicesize;
            int mod;
            int damage = 0;
            turncount1 = 1;
            int enemyhp = 0;
            int enemydef = 0;

            if (Int32.TryParse(ChargeDiceNumberBox.Text, out dicerolls) && Int32.TryParse(ChargeDiceSizeBox.Text, out dicesize))
            {
                for (int i = 0; i < dicerolls; i++)
                {
                    damage += rand.Next(1, (dicesize + 1));
                }
            }
            if (Int32.TryParse(ChargeModBox.Text, out mod))
                damage += mod;

            ChargeLabel.Text = $"{damage}" + " Charge!";

            if (Int32.TryParse(HitPointsBox2.Text, out enemyhp) && Int32.TryParse(DefenceBox2.Text, out enemydef))
            {
                if (damage > enemydef)
                {
                    enemyhp -= (damage - enemydef);
                }

                if (enemyhp < 0)
                {
                    enemyhp = 0;
                }
                HitPointsBox2.Text = $"{enemyhp}";
            }


        }

        private void RegenButton_Click(object sender, EventArgs e)
        {
            int dice1, dice2, regen, hp;
            if (Int32.TryParse(HitDiceNumberBox.Text, out dice1) && Int32.TryParse(HitDiceSizeBox.Text, out dice2)
                && Int32.TryParse(RegenBox.Text, out regen) && Int32.TryParse(HitPointsBox.Text, out hp))
            {
                if (dice1 * dice2 > hp)
                {
                    hp += regen;
                    if (dice1 * dice2 < hp)
                        hp = (dice1 * dice2);
                    HitPointsBox.Text = "" + hp;
                }
            }

        }

        //Player 2 Buttons------------------------------------------------------------------------------------------------
        private void GotchaButt2_Click(object sender, EventArgs e)
        {
            Player2 = new Gotchapon();
            Player2.createGotcha();
            FillPlayer2();
        }
        private void CommButt2_Click(object sender, EventArgs e)
        {
            Player2 = new Gotchapon();
            Player2.createGotcha(1);
            FillPlayer2();
        }

        private void RareButt2_Click(object sender, EventArgs e)
        {
            Player2 = new Gotchapon();
            Player2.createGotcha(2);
            FillPlayer2();
        }

        private void EpicButt2_Click(object sender, EventArgs e)
        {
            Player2 = new Gotchapon();
            Player2.createGotcha(3);
            FillPlayer2();
        }

        private void LegendButt2_Click(object sender, EventArgs e)
        {
            Player2 = new Gotchapon();
            Player2.createGotcha(4);
            FillPlayer2();
        }

        public void FillPlayer2()
        {
            NameBox2.Text = $"{Player2.getname()}";
            HitDiceNumberBox2.Text = $"{Player2.getHDNum()}";
            HitDiceSizeBox2.Text = $"{Player2.getHDSize()}";
            AttackDiceNumberBox2.Text = $"{Player2.getAtkNum()}";
            AttackDiceSizeBox2.Text = $"{Player2.getAtkSides()}";
            AttackModBox2.Text = $"{Player2.getAtkMod()}";
            DefenceBox2.Text = $"{Player2.getDefMod()}";

            if (Player2.getLandSpeed() <= 0)
                LandSpeedBox2.Text = $"";
            else
                LandSpeedBox2.Text = $"{Player2.getLandSpeed()}";

            if (Player2.getSwimSpeed() <= 0)
                SwimSpeedBox2.Text = $"";
            else
                SwimSpeedBox2.Text = $"{Player2.getSwimSpeed()}";

            if (Player2.getFlySpeed() <= 0)
                FlySpeedBox2.Text = $"";
            else
                FlySpeedBox2.Text = $"{Player2.getFlySpeed()}";

            FlameGiftCheq2.Checked = Player2.getFlamegift();

            if (Player2.getGrapple() <= 0)
                GrappleBox2.Text = $"";
            else
                GrappleBox2.Text = $"{Player2.getGrapple()}";

            if (Player2.getChargeDiceSize() <= 0)
            {
                ChargeDiceNumberBox2.Text = "";
                ChargeDiceSizeBox2.Text = "";
                ChargeModBox2.Text = "";
            }
            else
            {
                ChargeDiceNumberBox2.Text = $"{Player2.getChargeDiceNum()}";
                ChargeDiceSizeBox2.Text = $"{Player2.getChargeDiceSize()}";
                ChargeModBox2.Text = $"{Player2.getAtkMod()}";
            }

            if (Player2.getRegen() <= 0)
                RegenBox2.Text = $"";
            else
                RegenBox2.Text = $"{Player2.getRegen()}";
        }

        private void WindUpButt2_Click(object sender, EventArgs e)
        {
            int dicerolls;
            int dicesize;
            int hp = 0;
            if (Int32.TryParse(HitDiceNumberBox2.Text, out dicerolls) && Int32.TryParse(HitDiceSizeBox2.Text, out dicesize))
            {
                for (int i = 0; i < dicerolls; i++)
                {
                    hp += rand.Next(1, (dicesize + 1));
                }
            }

            HitPointsBox2.Text = $"{hp}";
        }

        private void P2atkButt_Click(object sender, EventArgs e)
        {
            int dicerolls;
            int dicesize;
            int mod;
            int damage = 0;
            int enemyhp = 0;
            int enemydef = 0;
            turncount2++;

            if (!FlameGiftCheq2.Checked)
                turncount2 = 0;


            if (Int32.TryParse(AttackDiceNumberBox2.Text, out dicerolls) && Int32.TryParse(AttackDiceSizeBox2.Text, out dicesize))
            {
                for (int i = 0; i < dicerolls; i++)
                {
                    damage += rand.Next(1, (dicesize + 1));
                }
            }
            if (Int32.TryParse(AttackModBox2.Text, out mod))
                damage += mod;


            if (FlameGiftCheq2.Checked && turncount2 >= 3)
            {
                P2DamageLabel.Text = $"{damage}" + " Flamegift Damage!";
                P2DamageLabel.ForeColor = System.Drawing.Color.Red;
                turncount2 = 0;
                RegenBox.Text = "";

                if (Int32.TryParse(HitPointsBox.Text, out enemyhp))
                {
                    enemyhp -= damage;
                    if (enemyhp < 0)
                    {
                        enemyhp = 0;
                    }
                    HitPointsBox.Text = $"{enemyhp}";
                }
            }
            else
            {
                P2DamageLabel.Text = $"{damage}" + " Damage!";
                P2DamageLabel.ForeColor = System.Drawing.Color.Black;

                if (Int32.TryParse(HitPointsBox.Text, out enemyhp) && Int32.TryParse(DefenceBox.Text, out enemydef))
                {
                    if (damage > enemydef)
                    {
                        enemyhp -= (damage - enemydef);
                    }

                    if (enemyhp < 0)
                    {
                        enemyhp = 0;
                    }
                    HitPointsBox.Text = $"{enemyhp}";
                }
            }
        }

        private void ChargeButt2_Click(object sender, EventArgs e)
        {
            int dicerolls;
            int dicesize;
            int mod;
            int damage = 0;
            turncount2 = 1;
            int enemyhp = 0;
            int enemydef = 0;

            if (Int32.TryParse(ChargeDiceNumberBox2.Text, out dicerolls) && Int32.TryParse(ChargeDiceSizeBox2.Text, out dicesize))
            {
                for (int i = 0; i < dicerolls; i++)
                {
                    damage += rand.Next(1, (dicesize + 1));
                }
            }
            if (Int32.TryParse(ChargeModBox2.Text, out mod))
                damage += mod;

            ChargeLabel2.Text = $"{damage}" + " Charge!";

            if (Int32.TryParse(HitPointsBox.Text, out enemyhp) && Int32.TryParse(DefenceBox.Text, out enemydef))
            {
                if (damage > enemydef)
                {
                    enemyhp -= (damage - enemydef);
                }

                if (enemyhp < 0)
                {
                    enemyhp = 0;
                }
                HitPointsBox.Text = $"{enemyhp}";
            }
        }

        private void GrappleButt2_Click(object sender, EventArgs e)
        {
            int mod;

            if (Int32.TryParse(GrappleBox2.Text, out mod)) { }
            else mod = 0;

            GrappleLabel2.Text = $"Grapple: {rand.Next(1, 21) + mod}";
        }
    }
}

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
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void GotchaMakerButtClick(object sender, EventArgs e)
        {
            form1 form = new form1();
            form.StartPosition = FormStartPosition.CenterParent;
            if (form.ShowDialog() != DialogResult.OK)
            { return; }
        }

        private void BattleButt_Click(object sender, EventArgs e)
        {
            BattleForm form = new BattleForm();
            form.StartPosition = FormStartPosition.CenterParent;
            if (form.ShowDialog() != DialogResult.OK)
            { return; }
        }
    }
}

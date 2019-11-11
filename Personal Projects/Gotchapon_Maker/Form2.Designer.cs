namespace Gotchapon_Maker
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.GotchaMakerButt = new System.Windows.Forms.Button();
            this.BattleButt = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // GotchaMakerButt
            // 
            this.GotchaMakerButt.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.GotchaMakerButt.Location = new System.Drawing.Point(12, 12);
            this.GotchaMakerButt.Name = "GotchaMakerButt";
            this.GotchaMakerButt.Size = new System.Drawing.Size(261, 43);
            this.GotchaMakerButt.TabIndex = 0;
            this.GotchaMakerButt.Text = "Make a Gotchapon";
            this.GotchaMakerButt.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.GotchaMakerButt.UseVisualStyleBackColor = true;
            this.GotchaMakerButt.Click += new System.EventHandler(this.GotchaMakerButtClick);
            // 
            // BattleButt
            // 
            this.BattleButt.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.BattleButt.Location = new System.Drawing.Point(12, 61);
            this.BattleButt.Name = "BattleButt";
            this.BattleButt.Size = new System.Drawing.Size(261, 43);
            this.BattleButt.TabIndex = 1;
            this.BattleButt.Text = "Battle Gotchapons";
            this.BattleButt.TextImageRelation = System.Windows.Forms.TextImageRelation.ImageBeforeText;
            this.BattleButt.UseVisualStyleBackColor = true;
            this.BattleButt.Click += new System.EventHandler(this.BattleButt_Click);
            // 
            // MainForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(285, 115);
            this.Controls.Add(this.BattleButt);
            this.Controls.Add(this.GotchaMakerButt);
            this.Name = "MainForm";
            this.Text = "Welcome to Gotchapon!";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button GotchaMakerButt;
        private System.Windows.Forms.Button BattleButt;
    }
}
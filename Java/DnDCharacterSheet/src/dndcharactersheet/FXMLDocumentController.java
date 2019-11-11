/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dndcharactersheet;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Patrick Shapiro
 */
public class FXMLDocumentController implements Initializable 
{
    private final int NUMOFATTRIBUTES = 6;
    private final int BLANKVALUE = 0;
    private final int NUMOFWEAPONS = 6;
    private final int NUMOFSKILLS = 46;
    private int bab = 0;
    
    
    
    
    //Creating the storage values
    Grapple grapple = new Grapple();
    Attribute[] bigStat = new Attribute[NUMOFATTRIBUTES + 1];
    Weapon[] weapon = new Weapon[NUMOFWEAPONS];
    ArmorClass ac = new ArmorClass();
    Initiative init = new Initiative();
    Save fort = new Save();
    Save ref = new Save();
    Save will = new Save();
    Skill[] skills = new Skill[NUMOFSKILLS];
    ComboBox[] skillboxes = new ComboBox[NUMOFSKILLS];
    NumberField[] skillRankFields = new NumberField[NUMOFSKILLS];
    NumberField[] skillMiscFields = new NumberField[NUMOFSKILLS];
    CheckBox[] classSkillBox = new CheckBox[NUMOFSKILLS];
    Button[] skillButton = new Button[NUMOFSKILLS];
    D20 dice = new D20();

    
    
    //BUTTONS__________________________________________________________
    
    //The Skills
    @FXML Button skillButt0;
    @FXML Button skillButt1;
    @FXML Button skillButt2;
    @FXML Button skillButt3;
    @FXML Button skillButt4;
    @FXML Button skillButt5;
    @FXML Button skillButt6;
    @FXML Button skillButt7;
    @FXML Button skillButt8;
    @FXML Button skillButt9;
    @FXML Button skillButt10;
    @FXML Button skillButt11;
    @FXML Button skillButt12;
    @FXML Button skillButt13;
    @FXML Button skillButt14;
    @FXML Button skillButt15;
    @FXML Button skillButt16;
    @FXML Button skillButt17;
    @FXML Button skillButt18;
    @FXML Button skillButt19;
    @FXML Button skillButt20;
    @FXML Button skillButt21;
    @FXML Button skillButt22;
    @FXML Button skillButt23;
    @FXML Button skillButt24;
    @FXML Button skillButt25;
    @FXML Button skillButt26;
    @FXML Button skillButt27;
    @FXML Button skillButt28;
    @FXML Button skillButt29;
    @FXML Button skillButt30;
    @FXML Button skillButt31;
    @FXML Button skillButt32;
    @FXML Button skillButt33;
    @FXML Button skillButt34;
    @FXML Button skillButt35;
    @FXML Button skillButt36;
    @FXML Button skillButt37;
    @FXML Button skillButt38;
    @FXML Button skillButt39;
    @FXML Button skillButt40;
    @FXML Button skillButt41;
    @FXML Button skillButt42;
    @FXML Button skillButt43;
    @FXML Button skillButt44;
    @FXML Button skillButt45;
    
    @FXML Button fortbutt;
    @FXML Button refbutt;
    @FXML Button willbutt;
    @FXML Button weaponbutt;
    @FXML Button initbutt;
    @FXML Button grapplebutt;
    
    
    

    
    
    //COMBOBOXES______________________________________________________
    
    //Combobox for Size Catagories
    @FXML 
    private ComboBox sizeMenu;
    private ObservableList<String> SizeCatagory = 
    FXCollections.observableArrayList(
        "Fine",
        "Diminuitive",
        "Tiny",
        "Small",
        "Medium",
        "Large",
        "Huge",
        "Gargantuan",
        "Colossal",
        "Colossal+");
    
        //Combobox for Save Attributes
    
    @FXML
    private ComboBox saveMenuFort;
    @FXML
    private ComboBox saveMenuRef;
    @FXML
    private ComboBox saveMenuWill;
    
    
        //Combobox for Weapon Selection
    @FXML
    private ComboBox weaponMenu;
    @FXML
    private ComboBox weaponAttribute;
    
    
    
        //Combobox for Skill Attributes
    @FXML 
    private ComboBox appraiseSkill;
    @FXML 
    private ComboBox balenceSkill;
    @FXML 
    private ComboBox bluffSkill;
    @FXML 
    private ComboBox climbSkill;
    @FXML 
    private ComboBox concentrationSkill;
    @FXML 
    private ComboBox craft1Skill;
    @FXML 
    private ComboBox craft2Skill;
    @FXML 
    private ComboBox craft3Skill;
    @FXML 
    private ComboBox decipherScriptSkill;
    @FXML 
    private ComboBox diplomacySkill;
    @FXML 
    private ComboBox disableDeviceSkill;
    @FXML 
    private ComboBox disguiseSkill;
    @FXML 
    private ComboBox escapeArtistSkill;
    @FXML 
    private ComboBox forgerySkill;
    @FXML 
    private ComboBox gatherInformationSkill;
    @FXML 
    private ComboBox handleAnimalSkill;
    @FXML 
    private ComboBox healSkill;
    @FXML 
    private ComboBox hideSkill;
    @FXML 
    private ComboBox intimidateSkill;
    @FXML 
    private ComboBox jumpSkill;
    @FXML 
    private ComboBox knowledge1Skill;
    @FXML 
    private ComboBox knowledge2Skill;
    @FXML 
    private ComboBox knowledge3Skill;
    @FXML 
    private ComboBox knowledge4Skill;
    @FXML 
    private ComboBox knowledge5Skill;
    @FXML 
    private ComboBox listenSkill;
    @FXML 
    private ComboBox moveSilentlySkill;
    @FXML 
    private ComboBox openLockSkill;
    @FXML 
    private ComboBox perform1Skill;
    @FXML 
    private ComboBox perform2Skill;
    @FXML 
    private ComboBox perform3Skill;
    @FXML 
    private ComboBox professionSkill;
    @FXML 
    private ComboBox rideSkill;
    @FXML 
    private ComboBox searchSkill;
    @FXML 
    private ComboBox senseMotiveSkill;
    @FXML 
    private ComboBox sleightOfHandSkill;
    @FXML 
    private ComboBox spellcraftSkill;
    @FXML 
    private ComboBox spotSkill;
    @FXML 
    private ComboBox survivalSkill;
    @FXML 
    private ComboBox swimSkill;
    @FXML 
    private ComboBox tumbleSkill;
    @FXML 
    private ComboBox useMagicDeviceSkill;
    @FXML 
    private ComboBox useRopeSkill;
    @FXML 
    private ComboBox ex1Skill;
    @FXML 
    private ComboBox ex2Skill;
    @FXML 
    private ComboBox ex3Skill;
    

    
    
    private ObservableList<String> attribute = 
    FXCollections.observableArrayList(
        "STR",
        "DEX",
        "CON",
        "INT",
        "WIS",
        "CHA",
        "n/a");
    
        private ObservableList<String> weapons = 
    FXCollections.observableArrayList(
        "Weapon1",
        "Weapon2",
        "Weapon3",
        "Weapon4",
        "Weapon5");
    
    
    //END OF COMBOBOXES________________________________________________
    
    
    //LABELS___________________________________________________________
    
    
    //ac
    @FXML
    private Label acsizelabel;
    @FXML
    private Label acstatlabel;
    @FXML
    private Label actotallabel;
    
    //grapple
    @FXML
    private Label grapplemodlabel;
    @FXML
    private Label sizelabelgrapple;
    @FXML
    private Label strlabelgrapple;
    @FXML
    private Label bablabelgrapple;
    
    //attributes
    @FXML
    private Label strTotalLabel;
    @FXML
    private Label dexTotalLabel;
    @FXML
    private Label conTotalLabel;
    @FXML
    private Label intTotalLabel;
    @FXML
    private Label wisTotalLabel;
    @FXML
    private Label chaTotalLabel;
    @FXML
    private Label strModLabel;
    @FXML
    private Label dexModLabel;
    @FXML
    private Label intModLabel;
    @FXML
    private Label conModLabel;
    @FXML
    private Label wisModLabel;
    @FXML
    private Label chaModLabel;
    
    //Initiative
    @FXML
    private Label initstatlabel;
    @FXML
    private Label inittotallabel;
    
    //saves
    @FXML
    private Label forttotallabel;
    @FXML
    private Label reftotallabel;
    @FXML
    private Label willtotallabel;
    @FXML
    private Label fortabilitylabel;
    @FXML
    private Label refabilitylabel;
    @FXML
    private Label willabilitylabel;
    
    //Weapons
    @FXML
    private Label weaponattributelabel;
    @FXML
    private Label weaponbablabel;
    @FXML
    private Label weapontotallabel;
    @FXML
    private Label weaponsizelabel;
    
    //Skills
    Label skilllabels[] = new Label[NUMOFSKILLS];
    @FXML Label skilllabel0;
    @FXML Label skilllabel1;
    @FXML Label skilllabel2;
    @FXML Label skilllabel3;
    @FXML Label skilllabel4;
    @FXML Label skilllabel5;
    @FXML Label skilllabel6;
    @FXML Label skilllabel7;
    @FXML Label skilllabel8;
    @FXML Label skilllabel9;
    @FXML Label skilllabel10;
    @FXML Label skilllabel11;
    @FXML Label skilllabel12;
    @FXML Label skilllabel13;
    @FXML Label skilllabel14;
    @FXML Label skilllabel15;
    @FXML Label skilllabel16;
    @FXML Label skilllabel17;
    @FXML Label skilllabel18;
    @FXML Label skilllabel19;
    @FXML Label skilllabel20;
    @FXML Label skilllabel21;
    @FXML Label skilllabel22;
    @FXML Label skilllabel23;
    @FXML Label skilllabel24;
    @FXML Label skilllabel25;
    @FXML Label skilllabel26;
    @FXML Label skilllabel27;
    @FXML Label skilllabel28;
    @FXML Label skilllabel29;
    @FXML Label skilllabel30;
    @FXML Label skilllabel31;
    @FXML Label skilllabel32;
    @FXML Label skilllabel33;
    @FXML Label skilllabel34;
    @FXML Label skilllabel35;
    @FXML Label skilllabel36;
    @FXML Label skilllabel37;
    @FXML Label skilllabel38;
    @FXML Label skilllabel39;
    @FXML Label skilllabel40;
    @FXML Label skilllabel41;
    @FXML Label skilllabel42;
    @FXML Label skilllabel43;
    @FXML Label skilllabel44;
    @FXML Label skilllabel45;
    
    Label skillranklabels[] = new Label[NUMOFSKILLS];
    @FXML Label skillranklabel0;
    @FXML Label skillranklabel1;
    @FXML Label skillranklabel2;
    @FXML Label skillranklabel3;
    @FXML Label skillranklabel4;
    @FXML Label skillranklabel5;
    @FXML Label skillranklabel6;
    @FXML Label skillranklabel7;
    @FXML Label skillranklabel8;
    @FXML Label skillranklabel9;
    @FXML Label skillranklabel10;
    @FXML Label skillranklabel11;
    @FXML Label skillranklabel12;
    @FXML Label skillranklabel13;
    @FXML Label skillranklabel14;
    @FXML Label skillranklabel15;
    @FXML Label skillranklabel16;
    @FXML Label skillranklabel17;
    @FXML Label skillranklabel18;
    @FXML Label skillranklabel19;
    @FXML Label skillranklabel20;
    @FXML Label skillranklabel21;
    @FXML Label skillranklabel22;
    @FXML Label skillranklabel23;
    @FXML Label skillranklabel24;
    @FXML Label skillranklabel25;
    @FXML Label skillranklabel26;
    @FXML Label skillranklabel27;
    @FXML Label skillranklabel28;
    @FXML Label skillranklabel29;
    @FXML Label skillranklabel30;
    @FXML Label skillranklabel31;
    @FXML Label skillranklabel32;
    @FXML Label skillranklabel33;
    @FXML Label skillranklabel34;
    @FXML Label skillranklabel35;
    @FXML Label skillranklabel36;
    @FXML Label skillranklabel37;
    @FXML Label skillranklabel38;
    @FXML Label skillranklabel39;
    @FXML Label skillranklabel40;
    @FXML Label skillranklabel41;
    @FXML Label skillranklabel42;
    @FXML Label skillranklabel43;
    @FXML Label skillranklabel44;
    @FXML Label skillranklabel45;
    
    @FXML Label totalskillrankslabel;
    
    //dice rolls
    Label dicerolls[] = new Label[10];
    @FXML Label diceroll0;
    @FXML Label diceroll1;
    @FXML Label diceroll2;
    @FXML Label diceroll3;
    @FXML Label diceroll4;
    @FXML Label diceroll5;
    @FXML Label diceroll6;
    @FXML Label diceroll7;
    @FXML Label diceroll8;
    @FXML Label diceroll9;
    
    //TEXTBOXES_______________________________________________________
    
    @FXML
    private NumberField strBaseField;
    @FXML
    private NumberField dexBaseField;
    @FXML
    private NumberField conBaseField;
    @FXML
    private NumberField intBaseField;
    @FXML
    private NumberField wisBaseField;
    @FXML
    private NumberField chaBaseField;
    @FXML
    private NumberField strTempField;
    @FXML
    private NumberField dexTempField;
    @FXML
    private NumberField conTempField;
    @FXML
    private NumberField intTempField;
    @FXML
    private NumberField wisTempField;
    @FXML
    private NumberField chaTempField;
    
    //bab
    @FXML
    private NumberField babField;
    
    //grapple
    @FXML
    private NumberField grappleMiscField;
    
    //ac
    @FXML
    private NumberField acArmorField;
    @FXML
    private NumberField acShieldField;
    @FXML
    private NumberField acNaturalField;
    @FXML
    private NumberField acDeflectField;
    @FXML
    private NumberField acMiscField;
    
    //initiative
    @FXML
    private NumberField initMiscField;
    
    //saves
    @FXML
    private NumberField fortBaseField;
    @FXML
    private NumberField fortMagicField;
    @FXML
    private NumberField fortMiscField;
    @FXML
    private NumberField refBaseField;
    @FXML
    private NumberField refMagicField;
    @FXML
    private NumberField refMiscField;
    @FXML
    private NumberField willBaseField;
    @FXML
    private NumberField willMagicField;
    @FXML
    private NumberField willMiscField;
    
    //weapons
    @FXML
    private NumberField weaponWeaponField;
    @FXML
    private NumberField weaponFeatField;
    @FXML
    private NumberField weaponOtherField;
    @FXML
    private NumberField weaponCritField;
    
    //Skills
    @FXML NumberField SkillRankField0;
    @FXML NumberField SkillRankField1;
    @FXML NumberField SkillRankField2;
    @FXML NumberField SkillRankField3;
    @FXML NumberField SkillRankField4;
    @FXML NumberField SkillRankField5;
    @FXML NumberField SkillRankField6;
    @FXML NumberField SkillRankField7;
    @FXML NumberField SkillRankField8;
    @FXML NumberField SkillRankField9;
    @FXML NumberField SkillRankField10;
    @FXML NumberField SkillRankField11;
    @FXML NumberField SkillRankField12;
    @FXML NumberField SkillRankField13;
    @FXML NumberField SkillRankField14;
    @FXML NumberField SkillRankField15;
    @FXML NumberField SkillRankField16;
    @FXML NumberField SkillRankField17;
    @FXML NumberField SkillRankField18;
    @FXML NumberField SkillRankField19;
    @FXML NumberField SkillRankField20;
    @FXML NumberField SkillRankField21;
    @FXML NumberField SkillRankField22;
    @FXML NumberField SkillRankField23;
    @FXML NumberField SkillRankField24;
    @FXML NumberField SkillRankField25;
    @FXML NumberField SkillRankField26;
    @FXML NumberField SkillRankField27;
    @FXML NumberField SkillRankField28;
    @FXML NumberField SkillRankField29;
    @FXML NumberField SkillRankField30;
    @FXML NumberField SkillRankField31;
    @FXML NumberField SkillRankField32;
    @FXML NumberField SkillRankField33;
    @FXML NumberField SkillRankField34;
    @FXML NumberField SkillRankField35;
    @FXML NumberField SkillRankField36;
    @FXML NumberField SkillRankField37;
    @FXML NumberField SkillRankField38;
    @FXML NumberField SkillRankField39;
    @FXML NumberField SkillRankField40;
    @FXML NumberField SkillRankField41;
    @FXML NumberField SkillRankField42;
    @FXML NumberField SkillRankField43;
    @FXML NumberField SkillRankField44;
    @FXML NumberField SkillRankField45;
    
    @FXML NumberField SkillMiscField0;
    @FXML NumberField SkillMiscField1;
    @FXML NumberField SkillMiscField2;
    @FXML NumberField SkillMiscField3;
    @FXML NumberField SkillMiscField4;
    @FXML NumberField SkillMiscField5;
    @FXML NumberField SkillMiscField6;
    @FXML NumberField SkillMiscField7;
    @FXML NumberField SkillMiscField8;
    @FXML NumberField SkillMiscField9;
    @FXML NumberField SkillMiscField10;
    @FXML NumberField SkillMiscField11;
    @FXML NumberField SkillMiscField12;
    @FXML NumberField SkillMiscField13;
    @FXML NumberField SkillMiscField14;
    @FXML NumberField SkillMiscField15;
    @FXML NumberField SkillMiscField16;
    @FXML NumberField SkillMiscField17;
    @FXML NumberField SkillMiscField18;
    @FXML NumberField SkillMiscField19;
    @FXML NumberField SkillMiscField20;
    @FXML NumberField SkillMiscField21;
    @FXML NumberField SkillMiscField22;
    @FXML NumberField SkillMiscField23;
    @FXML NumberField SkillMiscField24;
    @FXML NumberField SkillMiscField25;
    @FXML NumberField SkillMiscField26;
    @FXML NumberField SkillMiscField27;
    @FXML NumberField SkillMiscField28;
    @FXML NumberField SkillMiscField29;
    @FXML NumberField SkillMiscField30;
    @FXML NumberField SkillMiscField31;
    @FXML NumberField SkillMiscField32;
    @FXML NumberField SkillMiscField33;
    @FXML NumberField SkillMiscField34;
    @FXML NumberField SkillMiscField35;
    @FXML NumberField SkillMiscField36;
    @FXML NumberField SkillMiscField37;
    @FXML NumberField SkillMiscField38;
    @FXML NumberField SkillMiscField39;
    @FXML NumberField SkillMiscField40;
    @FXML NumberField SkillMiscField41;
    @FXML NumberField SkillMiscField42;
    @FXML NumberField SkillMiscField43;
    @FXML NumberField SkillMiscField44;
    @FXML NumberField SkillMiscField45;
    
    @FXML TextField KnowledgeField1;
    @FXML TextField KnowledgeField2;
    @FXML TextField KnowledgeField3;
    @FXML TextField KnowledgeField4;
    @FXML TextField KnowledgeField5;
    @FXML TextField PerformField1;
    @FXML TextField PerformField2;
    @FXML TextField PerformField3;
    @FXML TextField ProfessionField1;
    @FXML TextField exField1;
    @FXML TextField exField2;
    @FXML TextField exField3;
    @FXML TextField craftField1;
    @FXML TextField craftField2;
    @FXML TextField craftField3;    
    
    
    
    //Now the Checkbox Fields
    
    @FXML CheckBox skillBox0;
    @FXML CheckBox skillBox1;
    @FXML CheckBox skillBox2;
    @FXML CheckBox skillBox3;
    @FXML CheckBox skillBox4;
    @FXML CheckBox skillBox5;
    @FXML CheckBox skillBox6;
    @FXML CheckBox skillBox7;
    @FXML CheckBox skillBox8;
    @FXML CheckBox skillBox9;
    @FXML CheckBox skillBox10;
    @FXML CheckBox skillBox11;
    @FXML CheckBox skillBox12;
    @FXML CheckBox skillBox13;
    @FXML CheckBox skillBox14;
    @FXML CheckBox skillBox15;
    @FXML CheckBox skillBox16;
    @FXML CheckBox skillBox17;
    @FXML CheckBox skillBox18;
    @FXML CheckBox skillBox19;
    @FXML CheckBox skillBox20;
    @FXML CheckBox skillBox21;
    @FXML CheckBox skillBox22;
    @FXML CheckBox skillBox23;
    @FXML CheckBox skillBox24;
    @FXML CheckBox skillBox25;
    @FXML CheckBox skillBox26;
    @FXML CheckBox skillBox27;
    @FXML CheckBox skillBox28;
    @FXML CheckBox skillBox29;
    @FXML CheckBox skillBox30;
    @FXML CheckBox skillBox31;
    @FXML CheckBox skillBox32;
    @FXML CheckBox skillBox33;
    @FXML CheckBox skillBox34;
    @FXML CheckBox skillBox35;
    @FXML CheckBox skillBox36;
    @FXML CheckBox skillBox37;
    @FXML CheckBox skillBox38;
    @FXML CheckBox skillBox39;
    @FXML CheckBox skillBox40;
    @FXML CheckBox skillBox41;
    @FXML CheckBox skillBox42;
    @FXML CheckBox skillBox43;
    @FXML CheckBox skillBox44;
    @FXML CheckBox skillBox45;
    
    
    //TextAreas
    @FXML
    private TextField weaponDamageField;
    @FXML
    private TextField weaponRangeField;
    @FXML
    private TextField weaponTypeField;
    @FXML
    private TextField weaponNameField;
    @FXML
    private TextArea weaponOtherNotesField;


    

    
    
    
    
    //Actions
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
        
        
        //Setting the comboboxes
        sizeMenu.setItems(SizeCatagory);
        sizeMenu.getSelectionModel().select(4);
        saveMenuFort.setItems(attribute);
        saveMenuFort.getSelectionModel().select(2);
        saveMenuRef.setItems(attribute);
        saveMenuRef.getSelectionModel().select(1);
        saveMenuWill.setItems(attribute);
        saveMenuWill.getSelectionModel().select(4);
        
        //setting the skill comboboxes, and their starting attribute, then array
        appraiseSkill.setItems(attribute);
        appraiseSkill.getSelectionModel().select(3);
        balenceSkill.setItems(attribute);
        balenceSkill.getSelectionModel().select(1);
        bluffSkill.setItems(attribute);
        bluffSkill.getSelectionModel().select(5);
        climbSkill.setItems(attribute);
        climbSkill.getSelectionModel().select(0);
        concentrationSkill.setItems(attribute);
        concentrationSkill.getSelectionModel().select(2);
        craft1Skill.setItems(attribute);
        craft1Skill.getSelectionModel().select(3);
        craft2Skill.setItems(attribute);
        craft2Skill.getSelectionModel().select(3);
        craft3Skill.setItems(attribute);
        craft3Skill.getSelectionModel().select(3);
        decipherScriptSkill.setItems(attribute);
        decipherScriptSkill.getSelectionModel().select(3);
        diplomacySkill.setItems(attribute);
        diplomacySkill.getSelectionModel().select(5);
        disableDeviceSkill.setItems(attribute);
        disableDeviceSkill.getSelectionModel().select(3);
        disguiseSkill.setItems(attribute);
        disguiseSkill.getSelectionModel().select(5);
        escapeArtistSkill.setItems(attribute);
        escapeArtistSkill.getSelectionModel().select(1);
        forgerySkill.setItems(attribute);
        forgerySkill.getSelectionModel().select(3);
        gatherInformationSkill.setItems(attribute);
        gatherInformationSkill.getSelectionModel().select(5);
        handleAnimalSkill.setItems(attribute);
        handleAnimalSkill.getSelectionModel().select(5);
        healSkill.setItems(attribute);
        healSkill.getSelectionModel().select(4);
        hideSkill.setItems(attribute);
        hideSkill.getSelectionModel().select(1);
        intimidateSkill.setItems(attribute);
        intimidateSkill.getSelectionModel().select(5);
        jumpSkill.setItems(attribute);
        jumpSkill.getSelectionModel().select(0);
        knowledge1Skill.setItems(attribute);
        knowledge1Skill.getSelectionModel().select(3);
        knowledge2Skill.setItems(attribute);
        knowledge2Skill.getSelectionModel().select(3);
        knowledge3Skill.setItems(attribute);
        knowledge3Skill.getSelectionModel().select(3);
        knowledge4Skill.setItems(attribute);
        knowledge4Skill.getSelectionModel().select(3);
        knowledge5Skill.setItems(attribute);
        knowledge5Skill.getSelectionModel().select(3);
        listenSkill.setItems(attribute);
        listenSkill.getSelectionModel().select(4);
        moveSilentlySkill.setItems(attribute);
        moveSilentlySkill.getSelectionModel().select(1);
        openLockSkill.setItems(attribute);
        openLockSkill.getSelectionModel().select(1);
        perform1Skill.setItems(attribute);
        perform1Skill.getSelectionModel().select(5);
        perform2Skill.setItems(attribute);
        perform2Skill.getSelectionModel().select(5);
        perform3Skill.setItems(attribute);
        perform3Skill.getSelectionModel().select(5);
        professionSkill.setItems(attribute);
        professionSkill.getSelectionModel().select(4);
        rideSkill.setItems(attribute);
        rideSkill.getSelectionModel().select(1);
        searchSkill.setItems(attribute);
        searchSkill.getSelectionModel().select(3);
        senseMotiveSkill.setItems(attribute);
        senseMotiveSkill.getSelectionModel().select(4);
        sleightOfHandSkill.setItems(attribute);
        sleightOfHandSkill.getSelectionModel().select(1);
        spellcraftSkill.setItems(attribute);
        spellcraftSkill.getSelectionModel().select(3);
        spotSkill.setItems(attribute);
        spotSkill.getSelectionModel().select(4);
        survivalSkill.setItems(attribute);
        survivalSkill.getSelectionModel().select(4);
        swimSkill.setItems(attribute);
        swimSkill.getSelectionModel().select(0);
        tumbleSkill.setItems(attribute);
        tumbleSkill.getSelectionModel().select(1);
        useMagicDeviceSkill.setItems(attribute);
        useMagicDeviceSkill.getSelectionModel().select(5);
        useRopeSkill.setItems(attribute);
        useRopeSkill.getSelectionModel().select(1);
        ex1Skill.setItems(attribute);
        ex1Skill.getSelectionModel().select(6);
        ex2Skill.setItems(attribute);
        ex2Skill.getSelectionModel().select(6);
        ex3Skill.setItems(attribute);
        ex3Skill.getSelectionModel().select(6);
        
        
        
        //weapon comboboxes
        weaponMenu.setItems(weapons);
        weaponMenu.getSelectionModel().select(0);
        weaponAttribute.setItems(attribute);
        weaponAttribute.getSelectionModel().select(0);
        
        //initialise the storage values
        grapple.initialise();
        
        for (int i = 0; i <= NUMOFATTRIBUTES; i++)
        {
            bigStat[i] = new Attribute();
            bigStat[i].initialise();
        }
            //initialise the n/a attribute
            bigStat[NUMOFATTRIBUTES].setModifier(0);
        
        for (int i = 0; i < NUMOFWEAPONS; i++)
        {
            weapon[i] = new Weapon(i);
            weapon[i].Initialise();
        }
        
        for (int i = 0; i < NUMOFSKILLS; i++)
        {
            skills[i] = new Skill();
            skills[i].Initialise();
        }
        
        //setting up the weapon index
        weapon[0].setIndex(1);
        
        //skills
        //Putting things in an array
    skilllabels[0] = skilllabel0;
    skilllabels[1] = skilllabel1;
    skilllabels[2] = skilllabel2;
    skilllabels[3] = skilllabel3;
    skilllabels[4] = skilllabel4;
    skilllabels[5] = skilllabel5;
    skilllabels[6] = skilllabel6;
    skilllabels[7] = skilllabel7;
    skilllabels[8] = skilllabel8;
    skilllabels[9] = skilllabel9;
    skilllabels[10] = skilllabel10;
    skilllabels[11] = skilllabel11;
    skilllabels[12] = skilllabel12;
    skilllabels[13] = skilllabel13;
    skilllabels[14] = skilllabel14;
    skilllabels[15] = skilllabel15;
    skilllabels[16] = skilllabel16;
    skilllabels[17] = skilllabel17;
    skilllabels[18] = skilllabel18;
    skilllabels[19] = skilllabel19;
    skilllabels[20] = skilllabel20;
    skilllabels[21] = skilllabel21;
    skilllabels[22] = skilllabel22;
    skilllabels[23] = skilllabel23;
    skilllabels[24] = skilllabel24;
    skilllabels[25] = skilllabel25;
    skilllabels[26] = skilllabel26;
    skilllabels[27] = skilllabel27;
    skilllabels[28] = skilllabel28;
    skilllabels[29] = skilllabel29;
    skilllabels[30] = skilllabel30;
    skilllabels[31] = skilllabel31;
    skilllabels[32] = skilllabel32;
    skilllabels[33] = skilllabel33;
    skilllabels[34] = skilllabel34;
    skilllabels[35] = skilllabel35;
    skilllabels[36] = skilllabel36;
    skilllabels[37] = skilllabel37;
    skilllabels[38] = skilllabel38;
    skilllabels[39] = skilllabel39;
    skilllabels[40] = skilllabel40;
    skilllabels[41] = skilllabel41;
    skilllabels[42] = skilllabel42;
    skilllabels[43] = skilllabel43;
    skilllabels[44] = skilllabel44;
    skilllabels[45] = skilllabel45;
    
    skillranklabels[0] = skillranklabel0;
    skillranklabels[1] = skillranklabel1;
    skillranklabels[2] = skillranklabel2;
    skillranklabels[3] = skillranklabel3;
    skillranklabels[4] = skillranklabel4;
    skillranklabels[5] = skillranklabel5;
    skillranklabels[6] = skillranklabel6;
    skillranklabels[7] = skillranklabel7;
    skillranklabels[8] = skillranklabel8;
    skillranklabels[9] = skillranklabel9;
    skillranklabels[10] = skillranklabel10;
    skillranklabels[11] = skillranklabel11;
    skillranklabels[12] = skillranklabel12;
    skillranklabels[13] = skillranklabel13;
    skillranklabels[14] = skillranklabel14;
    skillranklabels[15] = skillranklabel15;
    skillranklabels[16] = skillranklabel16;
    skillranklabels[17] = skillranklabel17;
    skillranklabels[18] = skillranklabel18;
    skillranklabels[19] = skillranklabel19;
    skillranklabels[20] = skillranklabel20;
    skillranklabels[21] = skillranklabel21;
    skillranklabels[22] = skillranklabel22;
    skillranklabels[23] = skillranklabel23;
    skillranklabels[24] = skillranklabel24;
    skillranklabels[25] = skillranklabel25;
    skillranklabels[26] = skillranklabel26;
    skillranklabels[27] = skillranklabel27;
    skillranklabels[28] = skillranklabel28;
    skillranklabels[29] = skillranklabel29;
    skillranklabels[30] = skillranklabel30;
    skillranklabels[31] = skillranklabel31;
    skillranklabels[32] = skillranklabel32;
    skillranklabels[33] = skillranklabel33;
    skillranklabels[34] = skillranklabel34;
    skillranklabels[35] = skillranklabel35;
    skillranklabels[36] = skillranklabel36;
    skillranklabels[37] = skillranklabel37;
    skillranklabels[38] = skillranklabel38;
    skillranklabels[39] = skillranklabel39;
    skillranklabels[40] = skillranklabel40;
    skillranklabels[41] = skillranklabel41;
    skillranklabels[42] = skillranklabel42;
    skillranklabels[43] = skillranklabel43;
    skillranklabels[44] = skillranklabel44;
    skillranklabels[45] = skillranklabel45;    
        
    skillboxes[0] = appraiseSkill;
    skillboxes[1] = balenceSkill;
    skillboxes[2] = bluffSkill;
    skillboxes[3] = climbSkill;
    skillboxes[4] = concentrationSkill;
    skillboxes[5] = craft1Skill;
    skillboxes[6] = craft2Skill;
    skillboxes[7] = craft3Skill;
    skillboxes[8] = decipherScriptSkill;
    skillboxes[9] = diplomacySkill;
    skillboxes[10] = disableDeviceSkill;
    skillboxes[11] = disguiseSkill;
    skillboxes[12] = escapeArtistSkill;
    skillboxes[13] = forgerySkill;
    skillboxes[14] = gatherInformationSkill;
    skillboxes[15] = handleAnimalSkill;
    skillboxes[16] = healSkill;
    skillboxes[17] = hideSkill;
    skillboxes[18] = intimidateSkill;
    skillboxes[19] = jumpSkill;
    skillboxes[20] = knowledge1Skill;
    skillboxes[21] = knowledge2Skill;
    skillboxes[22] = knowledge3Skill;
    skillboxes[23] = knowledge4Skill;
    skillboxes[24] = knowledge5Skill;
    skillboxes[25] = listenSkill;
    skillboxes[26] = moveSilentlySkill;
    skillboxes[27] = openLockSkill;
    skillboxes[28] = perform1Skill;
    skillboxes[29] = perform2Skill;
    skillboxes[30] = perform3Skill;
    skillboxes[31] = professionSkill;
    skillboxes[32] = rideSkill;
    skillboxes[33] = searchSkill;
    skillboxes[34] = senseMotiveSkill;
    skillboxes[35] = sleightOfHandSkill;
    skillboxes[36] = spellcraftSkill;
    skillboxes[37] = spotSkill;
    skillboxes[38] = survivalSkill;
    skillboxes[39] = swimSkill;
    skillboxes[40] = tumbleSkill;
    skillboxes[41] = useMagicDeviceSkill;
    skillboxes[42] = useRopeSkill;
    skillboxes[43] = ex1Skill;
    skillboxes[44] = ex2Skill;
    skillboxes[45] = ex3Skill;
    
    skillRankFields[0] = SkillRankField0;
    skillRankFields[1] = SkillRankField1;
    skillRankFields[2] = SkillRankField2;
    skillRankFields[3] = SkillRankField3;
    skillRankFields[4] = SkillRankField4;
    skillRankFields[5] = SkillRankField5;
    skillRankFields[6] = SkillRankField6;
    skillRankFields[7] = SkillRankField7;
    skillRankFields[8] = SkillRankField8;
    skillRankFields[9] = SkillRankField9;
    skillRankFields[10] = SkillRankField10;
    skillRankFields[11] = SkillRankField11;
    skillRankFields[12] = SkillRankField12;
    skillRankFields[13] = SkillRankField13;
    skillRankFields[14] = SkillRankField14;
    skillRankFields[15] = SkillRankField15;
    skillRankFields[16] = SkillRankField16;
    skillRankFields[17] = SkillRankField17;
    skillRankFields[18] = SkillRankField18;
    skillRankFields[19] = SkillRankField19;
    skillRankFields[20] = SkillRankField20;
    skillRankFields[21] = SkillRankField21;
    skillRankFields[22] = SkillRankField22;
    skillRankFields[23] = SkillRankField23;
    skillRankFields[24] = SkillRankField24;
    skillRankFields[25] = SkillRankField25;
    skillRankFields[26] = SkillRankField26;
    skillRankFields[27] = SkillRankField27;
    skillRankFields[28] = SkillRankField28;
    skillRankFields[29] = SkillRankField29;
    skillRankFields[30] = SkillRankField30;
    skillRankFields[31] = SkillRankField31;
    skillRankFields[32] = SkillRankField32;
    skillRankFields[33] = SkillRankField33;
    skillRankFields[34] = SkillRankField34;
    skillRankFields[35] = SkillRankField35;
    skillRankFields[36] = SkillRankField36;
    skillRankFields[37] = SkillRankField37;
    skillRankFields[38] = SkillRankField38;
    skillRankFields[39] = SkillRankField39;
    skillRankFields[40] = SkillRankField40;
    skillRankFields[41] = SkillRankField41;
    skillRankFields[42] = SkillRankField42;
    skillRankFields[43] = SkillRankField43;
    skillRankFields[44] = SkillRankField44;
    skillRankFields[45] = SkillRankField45;
    
    skillMiscFields[0] = SkillMiscField0;
    skillMiscFields[1] = SkillMiscField1;
    skillMiscFields[2] = SkillMiscField2;
    skillMiscFields[3] = SkillMiscField3;
    skillMiscFields[4] = SkillMiscField4;
    skillMiscFields[5] = SkillMiscField5;
    skillMiscFields[6] = SkillMiscField6;
    skillMiscFields[7] = SkillMiscField7;
    skillMiscFields[8] = SkillMiscField8;
    skillMiscFields[9] = SkillMiscField9;
    skillMiscFields[10] = SkillMiscField10;
    skillMiscFields[11] = SkillMiscField11;
    skillMiscFields[12] = SkillMiscField12;
    skillMiscFields[13] = SkillMiscField13;
    skillMiscFields[14] = SkillMiscField14;
    skillMiscFields[15] = SkillMiscField15;
    skillMiscFields[16] = SkillMiscField16;
    skillMiscFields[17] = SkillMiscField17;
    skillMiscFields[18] = SkillMiscField18;
    skillMiscFields[19] = SkillMiscField19;
    skillMiscFields[20] = SkillMiscField20;
    skillMiscFields[21] = SkillMiscField21;
    skillMiscFields[22] = SkillMiscField22;
    skillMiscFields[23] = SkillMiscField23;
    skillMiscFields[24] = SkillMiscField24;
    skillMiscFields[25] = SkillMiscField25;
    skillMiscFields[26] = SkillMiscField26;
    skillMiscFields[27] = SkillMiscField27;
    skillMiscFields[28] = SkillMiscField28;
    skillMiscFields[29] = SkillMiscField29;
    skillMiscFields[30] = SkillMiscField30;
    skillMiscFields[31] = SkillMiscField31;
    skillMiscFields[32] = SkillMiscField32;
    skillMiscFields[33] = SkillMiscField33;
    skillMiscFields[34] = SkillMiscField34;
    skillMiscFields[35] = SkillMiscField35;
    skillMiscFields[36] = SkillMiscField36;
    skillMiscFields[37] = SkillMiscField37;
    skillMiscFields[38] = SkillMiscField38;
    skillMiscFields[39] = SkillMiscField39;
    skillMiscFields[40] = SkillMiscField40;
    skillMiscFields[41] = SkillMiscField41;
    skillMiscFields[42] = SkillMiscField42;
    skillMiscFields[43] = SkillMiscField43;
    skillMiscFields[44] = SkillMiscField44;
    skillMiscFields[45] = SkillMiscField45;
    
    classSkillBox[0] = skillBox0;
    classSkillBox[1] = skillBox1;
    classSkillBox[2] = skillBox2;
    classSkillBox[3] = skillBox3;
    classSkillBox[4] = skillBox4;
    classSkillBox[5] = skillBox5;
    classSkillBox[6] = skillBox6;
    classSkillBox[7] = skillBox7;
    classSkillBox[8] = skillBox8;
    classSkillBox[9] = skillBox9;
    classSkillBox[10] = skillBox10;
    classSkillBox[11] = skillBox11;
    classSkillBox[12] = skillBox12;
    classSkillBox[13] = skillBox13;
    classSkillBox[14] = skillBox14;
    classSkillBox[15] = skillBox15;
    classSkillBox[16] = skillBox16;
    classSkillBox[17] = skillBox17;
    classSkillBox[18] = skillBox18;
    classSkillBox[19] = skillBox19;
    classSkillBox[20] = skillBox20;
    classSkillBox[21] = skillBox21;
    classSkillBox[22] = skillBox22;
    classSkillBox[23] = skillBox23;
    classSkillBox[24] = skillBox24;
    classSkillBox[25] = skillBox25;
    classSkillBox[26] = skillBox26;
    classSkillBox[27] = skillBox27;
    classSkillBox[28] = skillBox28;
    classSkillBox[29] = skillBox29;
    classSkillBox[30] = skillBox30;
    classSkillBox[31] = skillBox31;
    classSkillBox[32] = skillBox32;
    classSkillBox[33] = skillBox33;
    classSkillBox[34] = skillBox34;
    classSkillBox[35] = skillBox35;
    classSkillBox[36] = skillBox36;
    classSkillBox[37] = skillBox37;
    classSkillBox[38] = skillBox38;
    classSkillBox[39] = skillBox39;
    classSkillBox[40] = skillBox40;
    classSkillBox[41] = skillBox41;
    classSkillBox[42] = skillBox42;
    classSkillBox[43] = skillBox43;
    classSkillBox[44] = skillBox44;
    classSkillBox[45] = skillBox45;
    
        for (int i = 0; i < NUMOFSKILLS; i++)
        {
            classSkillBox[i].setSelected(false);
        }
        
    skillButton[0] = skillButt0;
    skillButton[1] = skillButt1;
    skillButton[2] = skillButt2;
    skillButton[3] = skillButt3;
    skillButton[4] = skillButt4;
    skillButton[5] = skillButt5;
    skillButton[6] = skillButt6;
    skillButton[7] = skillButt7;
    skillButton[8] = skillButt8;
    skillButton[9] = skillButt9;
    skillButton[10] = skillButt10;
    skillButton[11] = skillButt11;
    skillButton[12] = skillButt12;
    skillButton[13] = skillButt13;
    skillButton[14] = skillButt14;
    skillButton[15] = skillButt15;
    skillButton[16] = skillButt16;
    skillButton[17] = skillButt17;
    skillButton[18] = skillButt18;
    skillButton[19] = skillButt19;
    skillButton[20] = skillButt20;
    skillButton[21] = skillButt21;
    skillButton[22] = skillButt22;
    skillButton[23] = skillButt23;
    skillButton[24] = skillButt24;
    skillButton[25] = skillButt25;
    skillButton[26] = skillButt26;
    skillButton[27] = skillButt27;
    skillButton[28] = skillButt28;
    skillButton[29] = skillButt29;
    skillButton[30] = skillButt30;
    skillButton[31] = skillButt31;
    skillButton[32] = skillButt32;
    skillButton[33] = skillButt33;
    skillButton[34] = skillButt34;
    skillButton[35] = skillButt35;
    skillButton[36] = skillButt36;
    skillButton[37] = skillButt37;
    skillButton[38] = skillButt38;
    skillButton[39] = skillButt39;
    skillButton[40] = skillButt40;
    skillButton[41] = skillButt41;
    skillButton[42] = skillButt42;
    skillButton[43] = skillButt43;
    skillButton[44] = skillButt44;
    skillButton[45] = skillButt45;
    
    for (int i = 0; i < NUMOFSKILLS; i++)
    {skillButton[i].setOnAction(this::diceRoll);}   
        
    
    dicerolls[0] = diceroll0;
    dicerolls[1] = diceroll1;
    dicerolls[2] = diceroll2;
    dicerolls[3] = diceroll3;
    dicerolls[4] = diceroll4;
    dicerolls[5] = diceroll5;
    dicerolls[6] = diceroll6;
    dicerolls[7] = diceroll7;
    dicerolls[8] = diceroll8;
    dicerolls[9] = diceroll9;
    
    
    }    
    
    //Listeners
    @FXML
    public void SizePicked()
    {
        String selection = sizeMenu.getValue().toString();
        
        if (selection.compareTo("Fine") == 0)
        {
            grapple.setSize(-16);
            ac.setSize(8);
            weapon[0].setSize(8);
        }
        else if (selection.compareTo("Diminuitive") == 0)
        {
            grapple.setSize(-12);
            ac.setSize(4);
            weapon[0].setSize(4);
        }
        else if (selection.compareTo("Tiny") == 0)
        {
            grapple.setSize(-8);
            ac.setSize(2);
            weapon[0].setSize(2);
        }
        else if (selection.compareTo("Small") == 0)
        {
            grapple.setSize(-4);
            ac.setSize(1);
            weapon[0].setSize(1);
        }
        else if (selection.compareTo("Medium") == 0)
        {
            grapple.setSize(0);
            ac.setSize(0);
            weapon[0].setSize(0);
        }
        else if (selection.compareTo("Large") == 0)
        {
            grapple.setSize(4);
            ac.setSize(-1);
            weapon[0].setSize(-1);
        }
        else if (selection.compareTo("Huge") == 0)
        {
            grapple.setSize(8);
            ac.setSize(-2);
            weapon[0].setSize(-2);
        }
        else if (selection.compareTo("Gargantuan") == 0)
        {
            grapple.setSize(12);
            ac.setSize(-4);
            weapon[0].setSize(-4);
        }
        else if (selection.compareTo("Colossal") == 0)
        {
            grapple.setSize(16);
            ac.setSize(-8);
            weapon[0].setSize(-8);
        }
        else if (selection.compareTo("Colossal+") == 0)
        {
            grapple.setSize(20);
            ac.setSize(-8);
            weapon[0].setSize(-8);
        }
        
        updateGrapple();
        updateAC();
        updateWeapon();
    }
    

    
    
    
    //Events used when key information is entered_____________________________
    
    public void updateGrapple()
    {
        
        
        if (grappleMiscField.getText().length() < 1)
            grapple.setMisc(0);
        else
            grapple.setMisc(Integer.parseInt(grappleMiscField.getText()));
        grapple.setBab(bab);
        grapple.calculate();
        
        sizelabelgrapple.setText("" + grapple.getSize());
        grapplemodlabel.setText("" + grapple.getTotalMod());
        strlabelgrapple.setText("" + bigStat[0].getModifier());
        bablabelgrapple.setText("" + bab);
        
    }
    
    public void updateStrength()
    {
        //Update the strength fields
        if (strBaseField.getText().length() < 1)
            bigStat[0].setBase(BLANKVALUE);
        else
            bigStat[0].setBase(Integer.parseInt(strBaseField.getText()));
        
        if (strTempField.getText().length() < 1)
            bigStat[0].setTemporary(BLANKVALUE);
        else
            bigStat[0].setTemporary(Integer.parseInt(strTempField.getText()));
        
        bigStat[0].calculate();
        
        strTotalLabel.setText("" + bigStat[0].getValue());
        
        if (bigStat[0].getModifier() > 0)
        strModLabel.setText("+" + bigStat[0].getModifier());
        else if (bigStat[0].getModifier() <= 0)
        strModLabel.setText("" + bigStat[0].getModifier());
        
        //Check for all comboboxes set to STR
        UpdateComboBoxes(0,"STR");
        
        //Update Grapple
        grapple.setStat(bigStat[0].getModifier());
        updateGrapple();
        
    }
    
        public void updateDexterity()
    {
        //Update the dexterity fields
        if (dexBaseField.getText().length() < 1)
            bigStat[1].setBase(BLANKVALUE);
        else
            bigStat[1].setBase(Integer.parseInt(dexBaseField.getText()));
        
        if (dexTempField.getText().length() < 1)
            bigStat[1].setTemporary(BLANKVALUE);
        else
            bigStat[1].setTemporary(Integer.parseInt(dexTempField.getText()));
        
        bigStat[1].calculate();
        
        dexTotalLabel.setText("" + bigStat[1].getValue());
        
        if (bigStat[1].getModifier() > 0)
        dexModLabel.setText("+" + bigStat[1].getModifier());
        else if (bigStat[1].getModifier() <= 0)
        dexModLabel.setText("" + bigStat[1].getModifier());
        
        //Check for all comboboxes set to DEX
        UpdateComboBoxes(1,"DEX");
        
        //update Armor Class
        updateAC();
        updateInitiative();
        
    }
        
    public void updateConstitution()
    {
        //Update the Constitution fields
        if (conBaseField.getText().length() < 1)
            bigStat[2].setBase(BLANKVALUE);
        else
            bigStat[2].setBase(Integer.parseInt(conBaseField.getText()));
        
        if (conTempField.getText().length() < 1)
            bigStat[2].setTemporary(BLANKVALUE);
        else
            bigStat[2].setTemporary(Integer.parseInt(conTempField.getText()));
        
        bigStat[2].calculate();
        
        conTotalLabel.setText("" + bigStat[2].getValue());
        
        if (bigStat[2].getModifier() > 0)
        conModLabel.setText("+" + bigStat[2].getModifier());
        else if (bigStat[2].getModifier() <= 0)
        conModLabel.setText("" + bigStat[2].getModifier());
        
        //Check for all comboboxes set to CON
        UpdateComboBoxes(2,"CON");
        
    }
    
        public void updateIntelligence()
    {
        //Update the intelligence fields
        if (intBaseField.getText().length() < 1)
            bigStat[3].setBase(BLANKVALUE);
        else
            bigStat[3].setBase(Integer.parseInt(intBaseField.getText()));
        
        if (intTempField.getText().length() < 1)
            bigStat[3].setTemporary(BLANKVALUE);
        else
            bigStat[3].setTemporary(Integer.parseInt(intTempField.getText()));
        
        bigStat[3].calculate();
        
        intTotalLabel.setText("" + bigStat[3].getValue());
        
        if (bigStat[3].getModifier() > 0)
        intModLabel.setText("+" + bigStat[3].getModifier());
        else if (bigStat[3].getModifier() <= 0)
        intModLabel.setText("" + bigStat[3].getModifier());
        
        //Check for all comboboxes set to INT
        UpdateComboBoxes(3,"INT");
        
        
    }
        
        public void updateWisdom()
    {
        //Update the wisdom fields
        if (wisBaseField.getText().length() < 1)
            bigStat[4].setBase(BLANKVALUE);
        else
            bigStat[4].setBase(Integer.parseInt(wisBaseField.getText()));
        
        if (wisTempField.getText().length() < 1)
            bigStat[4].setTemporary(BLANKVALUE);
        else
            bigStat[4].setTemporary(Integer.parseInt(wisTempField.getText()));
        
        bigStat[4].calculate();
        
        wisTotalLabel.setText("" + bigStat[4].getValue());
        
        if (bigStat[4].getModifier() > 0)
        wisModLabel.setText("+" + bigStat[4].getModifier());
        else if (bigStat[4].getModifier() <= 0)
        wisModLabel.setText("" + bigStat[4].getModifier());
        
        //Check for all comboboxes set to WIS
        UpdateComboBoxes(4,"WIS");

        
    }
        
        public void updateCharisma()
    {
        //Update the charisma fields
        if (chaBaseField.getText().length() < 1)
            bigStat[5].setBase(BLANKVALUE);
        else
            bigStat[5].setBase(Integer.parseInt(chaBaseField.getText()));
        
        if (chaTempField.getText().length() < 1)
            bigStat[5].setTemporary(BLANKVALUE);
        else
            bigStat[5].setTemporary(Integer.parseInt(chaTempField.getText()));
        
        bigStat[5].calculate();
        
        chaTotalLabel.setText("" + bigStat[5].getValue());
        
        if (bigStat[5].getModifier() > 0)
        chaModLabel.setText("+" + bigStat[5].getModifier());
        else if (bigStat[5].getModifier() <= 0)
        chaModLabel.setText("" + bigStat[5].getModifier());
        
        //Check for all comboboxes set to CHA
        UpdateComboBoxes(5,"CHA");

        
    }
        
    public void updateWeapon()
    {
        String currentAtt = weaponAttribute.getValue().toString();
        
        weapon[0].setBab(bab);
        
        if (weaponNameField.getText().length() < 1)
            weapon[0].setName("");
        else
            weapon[0].setName(weaponNameField.getText());
        
        if (weaponCritField.getText().length() < 1)
            weapon[0].setCritical(20);
        else
            weapon[0].setCritical(Integer.parseInt(weaponCritField.getText()));
        
        if (weaponWeaponField.getText().length() < 1)
            weapon[0].setWeaponBonus(BLANKVALUE);
        else
            weapon[0].setWeaponBonus(Integer.parseInt(weaponWeaponField.getText()));
        
        if (weaponFeatField.getText().length() < 1)
            weapon[0].setFeats(BLANKVALUE);
        else
            weapon[0].setFeats(Integer.parseInt(weaponFeatField.getText()));
        
        if (weaponOtherField.getText().length() < 1)
            weapon[0].setOther(BLANKVALUE);
        else
            weapon[0].setOther(Integer.parseInt(weaponOtherField.getText()));
        
        if (currentAtt.compareTo("STR") == 0)
        {
            weapon[0].setAttribute(bigStat[0].getModifier());
            weapon[0].setComboboxIndex(0);
        }
        if (currentAtt.compareTo("DEX") == 0)
        {
            weapon[0].setAttribute(bigStat[1].getModifier());
            weapon[0].setComboboxIndex(1);
        }
        if (currentAtt.compareTo("CON") == 0)
        {
            weapon[0].setAttribute(bigStat[2].getModifier());
            weapon[0].setComboboxIndex(2);
        }
        if (currentAtt.compareTo("INT") == 0)
        {
            weapon[0].setAttribute(bigStat[3].getModifier());
            weapon[0].setComboboxIndex(3);
        }
        if (currentAtt.compareTo("WIS") == 0)
        {
            weapon[0].setAttribute(bigStat[4].getModifier());
            weapon[0].setComboboxIndex(4);
        }
        if (currentAtt.compareTo("CHA") == 0)
        {
            weapon[0].setAttribute(bigStat[5].getModifier());
            weapon[0].setComboboxIndex(5);
        }
        if (currentAtt.compareTo("n/a") == 0)
        {
            weapon[0].setAttribute(BLANKVALUE);
            weapon[0].setComboboxIndex(6);
        }
        
        
        weapon[0].calculate();
        weaponsizelabel.setText("" + weapon[0].getSize());
        weaponattributelabel.setText("" + weapon[0].getAttribute());
        weaponbablabel.setText("" + weapon[0].getBab());
        weapontotallabel.setText("" + weapon[0].getTotalBonus());
     
    }
    
    public void weaponswitch()
    {
        //Save weapon 0 to the current weapon, and load from the new weapon
        int saveto = weapon[0].getIndex();
        
        String loadstring = weaponMenu.getValue().toString();
        int loadfrom = Integer.parseInt(loadstring.replaceAll("[^0-9]", ""));
        
        
        
        if (weaponNameField.getText().length() < 1)
            weapon[0].setName("");
        else
            weapon[0].setName(weaponNameField.getText());
        
        if (weaponRangeField.getText().length() < 1)
            weapon[0].setRange("");
        else
            weapon[0].setRange(weaponRangeField.getText());
        
        if (weaponDamageField.getText().length() < 1)
            weapon[0].setDamage("");
        else
            weapon[0].setDamage(weaponDamageField.getText());
        
        if (weaponOtherNotesField.getText().length() < 1)
            weapon[0].setOtherNotes("");
        else
            weapon[0].setOtherNotes(weaponOtherNotesField.getText());
        
        
        

        
        weapon[saveto] = weapon[0];
        weapon[0] = weapon[loadfrom];
        
        
        
        weaponDamageField.setText(weapon[0].getDamage());
        weaponRangeField.setText(weapon[0].getRange());
        weaponTypeField.setText(weapon[0].getType());
        weaponOtherNotesField.setText(weapon[0].getOtherNotes());
        weaponNameField.setText(weapon[0].getName());
        weaponCritField.setText("" + weapon[0].getCritical());
        weaponFeatField.setText("" + weapon[0].getFeats());
        weaponWeaponField.setText("" + weapon[0].getWeaponBonus());
        weaponOtherField.setText("" + weapon[0].getOther());
        weaponAttribute.getSelectionModel().select(weapon[0].getComboboxIndex());
        
        SizePicked();
        
        
        
        
    }
    
    public void updateBab()
    {
        if (babField.getText().length() < 1)
            bab = 0;
        else
            bab =  Integer.parseInt(babField.getText());
        
        updateGrapple();
        updateWeapon();
        
    }
    
    public void updateAC()
    {
        if (acArmorField.getText().length() < 1)
            ac.setArmor(0);
        else
            ac.setArmor(Integer.parseInt(acArmorField.getText()));
        
        if (acShieldField.getText().length() < 1)
            ac.setShield(0);
        else
            ac.setShield(Integer.parseInt(acShieldField.getText()));
        
        if (acNaturalField.getText().length() < 1)
            ac.setNatural(0);
        else
            ac.setNatural(Integer.parseInt(acNaturalField.getText()));
        
        if (acDeflectField.getText().length() < 1)
            ac.setDeflect(0);
        else
            ac.setDeflect(Integer.parseInt(acDeflectField.getText()));
        
        if (acMiscField.getText().length() < 1)
            ac.setMisc(0);
        else
            ac.setMisc(Integer.parseInt(acMiscField.getText()));
        
        ac.setStat(bigStat[1].getModifier());
        acstatlabel.setText("" + bigStat[1].getModifier());
        acsizelabel.setText("" + ac.getSize());
        ac.calculate();
        
        actotallabel.setText("" + ac.getTotalMod());
        
    }
    
    public void updateInitiative()
    {
        if (initMiscField.getText().length() < 1)
            init.setMisc(BLANKVALUE);
        else
            init.setMisc(Integer.parseInt(initMiscField.getText()));
        
        init.setStat(bigStat[1].getModifier());
        initstatlabel.setText("" + bigStat[1].getModifier());
        
        init.calculate();
        inittotallabel.setText("" + init.getTotal());

        
    }
    
    public void updateFort()
    {
        String currentAtt = saveMenuFort.getValue().toString();
        
        if (fortBaseField.getText().length() < 1)
            fort.setBase(BLANKVALUE);
        else
            fort.setBase(Integer.parseInt(fortBaseField.getText()));
        
        if (fortMagicField.getText().length() < 1)
            fort.setMagic(BLANKVALUE);
        else
            fort.setMagic(Integer.parseInt(fortMagicField.getText()));
        
        if (fortMiscField.getText().length() < 1)
            fort.setMisc(BLANKVALUE);
        else
            fort.setMisc(Integer.parseInt(fortMiscField.getText()));
        
        if (currentAtt.compareTo("STR") == 0)fort.setStat(bigStat[0].getModifier());
        if (currentAtt.compareTo("DEX") == 0)fort.setStat(bigStat[1].getModifier());
        if (currentAtt.compareTo("CON") == 0)fort.setStat(bigStat[2].getModifier());
        if (currentAtt.compareTo("INT") == 0)fort.setStat(bigStat[3].getModifier());
        if (currentAtt.compareTo("WIS") == 0)fort.setStat(bigStat[4].getModifier());
        if (currentAtt.compareTo("CHA") == 0)fort.setStat(bigStat[5].getModifier());
        if (currentAtt.compareTo("n/a") == 0)fort.setStat(BLANKVALUE);
        
        fort.calculate();

        fortabilitylabel.setText("" + fort.getStat());
        forttotallabel.setText("" + fort.getTotal());

    }
    
        public void updateRef()
    {
        String currentAtt = saveMenuRef.getValue().toString();
        
        if (refBaseField.getText().length() < 1)
            ref.setBase(BLANKVALUE);
        else
            ref.setBase(Integer.parseInt(refBaseField.getText()));
        
        if (refMagicField.getText().length() < 1)
            ref.setMagic(BLANKVALUE);
        else
            ref.setMagic(Integer.parseInt(refMagicField.getText()));
        
        if (refMiscField.getText().length() < 1)
            ref.setMisc(BLANKVALUE);
        else
            ref.setMisc(Integer.parseInt(refMiscField.getText()));
        
        if (currentAtt.compareTo("STR") == 0)ref.setStat(bigStat[0].getModifier());
        if (currentAtt.compareTo("DEX") == 0)ref.setStat(bigStat[1].getModifier());
        if (currentAtt.compareTo("CON") == 0)ref.setStat(bigStat[2].getModifier());
        if (currentAtt.compareTo("INT") == 0)ref.setStat(bigStat[3].getModifier());
        if (currentAtt.compareTo("WIS") == 0)ref.setStat(bigStat[4].getModifier());
        if (currentAtt.compareTo("CHA") == 0)ref.setStat(bigStat[5].getModifier());
        if (currentAtt.compareTo("n/a") == 0)ref.setStat(BLANKVALUE);
        
        ref.calculate();

        refabilitylabel.setText("" + ref.getStat());
        reftotallabel.setText("" + ref.getTotal());

    }
        
        public void updateWill()
    {
        String currentAtt = saveMenuWill.getValue().toString();
        
        if (willBaseField.getText().length() < 1)
            will.setBase(BLANKVALUE);
        else
            will.setBase(Integer.parseInt(willBaseField.getText()));
        
        if (willMagicField.getText().length() < 1)
            will.setMagic(BLANKVALUE);
        else
            will.setMagic(Integer.parseInt(willMagicField.getText()));
        
        if (willMiscField.getText().length() < 1)
            will.setMisc(BLANKVALUE);
        else
            will.setMisc(Integer.parseInt(willMiscField.getText()));
        
        if (currentAtt.compareTo("STR") == 0)will.setStat(bigStat[0].getModifier());
        if (currentAtt.compareTo("DEX") == 0)will.setStat(bigStat[1].getModifier());
        if (currentAtt.compareTo("CON") == 0)will.setStat(bigStat[2].getModifier());
        if (currentAtt.compareTo("INT") == 0)will.setStat(bigStat[3].getModifier());
        if (currentAtt.compareTo("WIS") == 0)will.setStat(bigStat[4].getModifier());
        if (currentAtt.compareTo("CHA") == 0)will.setStat(bigStat[5].getModifier());
        if (currentAtt.compareTo("n/a") == 0)will.setStat(BLANKVALUE);
        
        will.calculate();

        willabilitylabel.setText("" + will.getStat());
        willtotallabel.setText("" + will.getTotal());

    }
    
    
    
       public void UpdateComboBoxes(int option, String search)
    {
        

        if (search.compareTo(saveMenuFort.getValue().toString()) == 0)
            updateFort();
        if (search.compareTo(saveMenuRef.getValue().toString()) == 0)
            updateRef();
        if (search.compareTo(saveMenuWill.getValue().toString()) == 0)
            updateWill();
        if (search.compareTo(weaponAttribute.getValue().toString()) == 0)
            updateWeapon();

            updateSkills();
        
    }

       
       
       public void updateSkills()
       {
        String currentAtt;
        int totalskillpointsspent = 0;
        
        for(int i = 0; i < NUMOFSKILLS; i++)
        {
        int skillpointsspent = 0;
        
        currentAtt = skillboxes[i].getValue().toString();
           
        if (currentAtt.compareTo("STR") == 0)skills[i].setAttribute(bigStat[0].getModifier());
        if (currentAtt.compareTo("DEX") == 0)skills[i].setAttribute(bigStat[1].getModifier());
        if (currentAtt.compareTo("CON") == 0)skills[i].setAttribute(bigStat[2].getModifier());
        if (currentAtt.compareTo("INT") == 0)skills[i].setAttribute(bigStat[3].getModifier());
        if (currentAtt.compareTo("WIS") == 0)skills[i].setAttribute(bigStat[4].getModifier());
        if (currentAtt.compareTo("CHA") == 0)skills[i].setAttribute(bigStat[5].getModifier());
        if (currentAtt.compareTo("n/a") == 0)skills[i].setAttribute(BLANKVALUE);
        
        if (skillRankFields[i].getText().length() < 1)
            skills[i].setRanks(0);
        else
        {
            skills[i].setRanks(Integer.parseInt(skillRankFields[i].getText()));
            skillpointsspent = Integer.parseInt(skillRankFields[i].getText());
            
            if (!classSkillBox[i].isSelected())
            {skillpointsspent *= 2;}
            
            totalskillpointsspent += skillpointsspent;
        }
        
        totalskillrankslabel.setText("" + totalskillpointsspent);
        
        if (skillMiscFields[i].getText().length() < 1)
           skills[i].setMisc(0);
        else
           skills[i].setMisc(Integer.parseInt(skillMiscFields[i].getText()));
           
           skills[i].Calculate();
           skilllabels[i].setText("" + skills[i].getTotal());
           skillranklabels[i].setText("" + skills[i].getAttribute());  
        }  
        
       }
       
              
       public void diceRoll(javafx.event.ActionEvent event)
       {
           int total, index;
           String output = "";
           
           //Skill rolls
           for(int i = 0; i < NUMOFSKILLS; i++)
           {
                if (skillButton[i].equals(event.getSource()))
                {
                    index = i;
                    dice.roll();
                    
                    total = dice.getFaceValue() + skills[i].getTotal();
                    output = ("Rolled: " + dice.getFaceValue() + " + " +
                            skills[i].getTotal()) + " = " + total;
                
                    if (dice.getFaceValue() == 20)
                        output += " (NAT 20!)";
                    if (dice.getFaceValue() == 1)
                        output += " (FUMBLE!)";
                    updateSkillLabel(output, index);
                }
           }
                
                //Weaponroll
                if (weaponbutt.equals(event.getSource()))
                {
                    updateWeapon();
                    dice.roll();
                    
                    total = dice.getFaceValue() + weapon[0].getTotalBonus();
                    output = (weapon[0].getName() + " Rolled: " + dice.getFaceValue() + " + " +
                            weapon[0].getTotalBonus()) + " = " + total;
                
                    if (dice.getFaceValue() >= weapon[0].getCritical())
                        output += " (CRITICAL!)";
                    if (dice.getFaceValue() == 1)
                        output += " (FUMBLE!)";
                    updateLabel(output);
                }
                
                //Grappleroll
                if (grapplebutt.equals(event.getSource()))
                {
                    dice.roll();
                    
                    total = dice.getFaceValue() + grapple.getTotalMod();
                    output = "Grapple Rolled: " + dice.getFaceValue() + " + " +
                            grapple.getTotalMod() + " = " + total;
                
                    if (dice.getFaceValue() == 20)
                        output += " (NAT 20!)";
                    if (dice.getFaceValue() == 1)
                        output += " (FUMBLE!)";
                    updateLabel(output);
                }
                
                //Initroll
                if (initbutt.equals(event.getSource()))
                {
                    dice.roll();
                    
                    total = dice.getFaceValue() + init.getTotal();
                    output = "Initiative Rolled: " + dice.getFaceValue() + " + " +
                            init.getTotal() + " = " + total;
                
                    if (dice.getFaceValue() == 20)
                        output += " (NAT 20!)";
                    if (dice.getFaceValue() == 1)
                        output += " (FUMBLE!)";
                    updateLabel(output);
                }
                
                //Fortroll
                if (fortbutt.equals(event.getSource()))
                {
                    dice.roll();
                    
                    total = dice.getFaceValue() + fort.getTotal();
                    output = "Fortitude Rolled: " + dice.getFaceValue() + " + " +
                            fort.getTotal() + " = " + total;
                
                    if (dice.getFaceValue() == 20)
                        output += " (NAT 20!)";
                    if (dice.getFaceValue() == 1)
                        output += " (FUMBLE!)";
                    updateLabel(output);
                }
                
                //Initroll
                if (refbutt.equals(event.getSource()))
                {
                    dice.roll();
                    
                    total = dice.getFaceValue() + ref.getTotal();
                    output = "Reflex Rolled: " + dice.getFaceValue() + " + " +
                            ref.getTotal() + " = " + total;
                
                    if (dice.getFaceValue() == 20)
                        output += " (NAT 20!)";
                    if (dice.getFaceValue() == 1)
                        output += " (FUMBLE!)";
                    updateLabel(output);
                }
                
                //Willroll
                if (willbutt.equals(event.getSource()))
                {
                    dice.roll();
                    
                    total = dice.getFaceValue() + will.getTotal();
                    output = "Will Rolled: " + dice.getFaceValue() + " + " +
                            will.getTotal() + " = " + total;
                
                    if (dice.getFaceValue() == 20)
                        output += " (NAT 20!)";
                    if (dice.getFaceValue() == 1)
                        output += " (FUMBLE!)";
                    updateLabel(output);
                }
           
           
           
           
           
           
           
           
       }
       
       public void updateLabel(String s)
       {
           String output = "";
           
           for (int i = 9; i > 0; i--)
           {dicerolls[i].setText(dicerolls[i-1].getText());}

            output = s;
    
           
           dicerolls[0].setText(output);
       }
       
       
       
       public void updateSkillLabel(String s, int index)
       {
           String output = "";
           
           for (int i = 9; i > 0; i--)
           {dicerolls[i].setText(dicerolls[i-1].getText());}
           
           switch (index)
           {
           case 0: output = "Appraise " + s; break;
           case 1: output = "Balence " + s; break;
           case 2: output = "Bluff " + s; break;
           case 3: output = "Climb " + s; break;
           case 4: output = "Concentration " + s; break;
           case 5: output = "Craft(" + craftField1.getText() +") " + s; break;
           case 6: output = "Craft(" + craftField2.getText() +") " + s; break;
           case 7: output = "Craft(" + craftField3.getText() +") " + s; break;
           case 8: output = "Decipher Script " + s; break;
           case 9: output = "Diplomacy " + s; break;
           case 10: output = "Disable Device " + s; break;
           case 11: output = "Disguise " + s; break;
           case 12: output = "Escape Artist " + s; break;
           case 13: output = "Forgery " + s; break;
           case 14: output = "Gather Information " + s; break;
           case 15: output = "Handle Animal " + s; break;
           case 16: output = "Heal " + s; break;
           case 17: output = "Hide " + s; break;
           case 18: output = "Intimidate " + s; break;
           case 19: output = "Jump " + s; break;
           case 20: output = "Knowledge(" + KnowledgeField1.getText() +") " + s; break;
           case 21: output = "Knowledge(" + KnowledgeField2.getText() +") " + s; break;
           case 22: output = "Knowledge(" + KnowledgeField3.getText() +") " + s; break;
           case 23: output = "Knowledge(" + KnowledgeField4.getText() +") " + s; break;
           case 24: output = "Knowledge(" + KnowledgeField5.getText() +") " + s; break;
           case 25: output = "Listen " + s; break;
           case 26: output = "Move Silent " + s; break;
           case 27: output = "Open Lock " + s; break;
           case 28: output = "Perform(" + PerformField1.getText() +") " + s; break;
           case 29: output = "Perform(" + PerformField2.getText() +") " + s; break;
           case 30: output = "Perform(" + PerformField3.getText() +") " + s; break;
           case 31: output = "Profession(" + ProfessionField1.getText() +") " + s; break;
           case 32: output = "Ride " + s; break;
           case 33: output = "Search " + s; break;
           case 34: output = "Sense Motive " + s; break;
           case 35: output = "Sleight of Hand " + s; break;
           case 36: output = "Spellcraft " + s; break;
           case 37: output = "Spot " + s; break;
           case 38: output = "Survival " + s; break;
           case 39: output = "Swim " + s; break;
           case 40: output = "Tumble " + s; break;
           case 41: output = "Use Magic Device " + s; break;
           case 42: output = "Use Rope " + s; break;
           case 43: output = exField1.getText() +" " + s; break;
           case 44: output = exField2.getText() +" " + s; break;
           case 45: output = exField3.getText() +" " + s; break;
           }
           
           dicerolls[0].setText(output);
       }
    
    

    
    
}

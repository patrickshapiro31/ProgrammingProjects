
#include <string>
#include <cstdlib>

class Enemy
{
protected: 
	std::string message = ""; //output message to the console
	std::string name = "";
	int damage = 0; //The damage the enemy deals this turn
	int maxHP = 0;
	int currentHP = 0;
	int damageReduction = 0;
	int randomNum = 0; //The number used for random decisions
	bool isbig; //Sophie uses this to determine if it is a big enemy or a trash mob
	bool ishealing; //If the enemy uses a healing or buffing ability, this will be set to true


	//The virtual methods must be overwritten in the child class.
public:
	virtual void generateIdleMessage() {} //An idle message, unique to the creature is loaded into message
	virtual void attack() {} //Sets the damage and message variables, indicating an attack.

	std::string getMessage() { return message; } //Prints the message
	int getDamage() { return damage; }//Gets the damage dealt by the enemy
	int getHP() { return currentHP; } //Current HP, when it reaches 0, the monster dies
	int getMaxHP() { return maxHP; } // Starting HP.
	void takeDamage(int damage) {} //The damage Sophie deals
	void numeriseName(int n) { name += n + ""; } //Adds numbers to the name

	//These are booleans the game will check to determine if the monster is using special actions. Override to true if needed
	bool checkIfHealing() { return false; }
	bool checkIfBuffing() { return false; }
	bool checkIfDebuffing() { return false; }

	bool checkIfBig() { return false; } //Used to determine how Sophie's AI behaves towards this monster.
};

class Kobold:Enemy
{
	Kobold()
	{
		maxHP = 3;
		currentHP = maxHP;
		name = "Kobold";
	}

	void generateIdleMessage() override
	{
		randomNum = rand() % 10 + 1;

		switch (randomNum)
		{
		case 1: {message = name + " lets out a big yawn."; }
		case 2: {message = name + " is picking its nose."; }
		case 3: {message = name + " stares off into the sky."; }
		case 4: {message = name + " is chewing on something"; }
		case 5: {message = name + " stares at you."; }
		case 6: {message = name + " seems unsure of itself."; }
		case 7: {message = name + " is itching to fight."; }
		case 8: {message = name + " is destracted by a bird."; }
		case 9: {message = name + " is grooming itself."; }
		case 10: {message = name + " rolls around in the grass."; }
		}

	}

};
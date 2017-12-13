/*
Character.cpp
Purpose: To create a program that outputs the attacks and plays between the hero and the monster, and ultimately decides the winner based on health left.

*/


#include "Character.h"

Character::Character(string newName)
{
	name = newName;
	health = 20;
	damage = 2;
	arrows = 2;
}

Character::Character(string newName, int newHealth, int newDamage, int newArrows) {
	name = newName;
	health = newHealth;
	damage = newDamage;
	arrows = newArrows;
}

void Character::attack(Character& target) {
	target.health -= damage;
	cout << name << " attacks " << target.get_name() << " doing " << damage << " damage!" << endl;
	cout << target.get_name() << "  health: " << target.get_health() << endl;



}
void Character::rangedAttack(Character& target) {
	//generate 1-5

	if (arrows > 0)
	{
		int hit = 1 + rand() % (5);
		arrows--;
		target.health -= hit;
		cout << name << " shoots " << target.get_name() << " doing " << hit << " damage!" << endl;
		cout << target.get_name() << " health: " << target.get_health() << endl;


	}
	else {
		cout << name << " is out of arrows!" << endl;
	}



}
void Character::set_health(int newHealth) {
	health = newHealth;
}

int Character::get_health() const {
	return health;

}

string Character::get_name() const {
	return name;

}

void Character::display() const {
	cout << name << "  health: " << health << " arrows:" << arrows << endl;

}

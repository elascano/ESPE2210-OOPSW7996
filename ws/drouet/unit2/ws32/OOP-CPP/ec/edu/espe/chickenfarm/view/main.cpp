#include <iostream>
#include "../model/Chicken.h"

using namespace std;

// author: Stephen Drouet

void printChicken(Chicken chicken) {
    cout << "-----------------------------------------" << endl;
    cout << "Chicken id: " << chicken.getId() << endl;
    cout << "Chicken name: " << chicken.getName() << endl;
    cout << "Chicken color: " << chicken.getColor() << endl;
    cout << "Chicken age: " << chicken.getAge() << endl;
    cout << "Chicken isMoloting: " << chicken.getIsMolting() << endl;
}

int main() {
    Chicken chickens[3];
    chickens[0] = Chicken(1, "Blacky", "Black", 7, false);
    chickens[1] = Chicken(2, "Chickenator", "Gray", 4, true);
    chickens[2] = Chicken(3, "Moon", "Brown", 3, true);

    cout << "Stephen Drouet - OOP in C++" << endl;

    for (int i = 0; i < 3; i++) {
        printChicken(chickens[i]);
    }
    
    return 0;
}


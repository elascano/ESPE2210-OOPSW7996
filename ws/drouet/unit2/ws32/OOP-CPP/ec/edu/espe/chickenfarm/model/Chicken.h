#pragma once
#include <iostream>
#include <string>
#include "Egg.h"

using namespace std;
class Chicken {
    public:
        Chicken(int id, string name, string color, int age, bool isMolting) {
            this->setName(name);
            this->setId(id);
            this->setColor(color);
            this->setAge(age);
            this->setIsMolting(isMolting);
        }
        Chicken() { } // default constructor

        int getId() {
            return this->id;
        }

        void setId(int id) {
            this->id = id;  
        }
        
        string getName(){
            return this->name;
        }
 
        void setName(string name) {
            this->name = name;  
        }

        string getColor(){
            return this->color;
        }
 
        void setColor(string color) {
            this->color = color;  
        }

        int getAge() {
            return this->age;
        }

        void setAge(int age) {
            this->age = age;  
        }

        int getIsMolting() {
            return this->isMolting;
        }

        void setIsMolting(int isMolting) {
            this->isMolting = isMolting;  
        }
        
        void DoStuff(int forTime) {
            cout << "Doing Stuff for " << forTime << endl;
        }

        void cluck() {
            cout << "the clucking" << endl;
        }

        void wander () {
            cout << "The chicken " << this->name << "is wandering" << endl; 
        }
        
    private:
        int id = 0;
        string name = "";
        string color = "";
        int age = 0;
        bool isMolting = false;
};
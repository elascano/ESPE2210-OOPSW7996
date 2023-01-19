#pragma once
#include <string>
#include "Coop.h"

using namespace std;

class ChickenFarmer {
    public:
        ChickenFarmer(string name, Coop coops[]) {
            this->setName(name);
            this->setCoops(coops);
        }
        ChickenFarmer() { } // default constructor

        string getName(){
            return this->name;
        }
 
        void setName(string name) {
            this->name = name; 
        }

        Coop *getCoops(){
            return this->coops;
        }
 
        void setCoops(Coop coops[]) {
            for (int i = 0; i < 10; i++)
            {
                this->coops[i] = coops[i];
            }   
        }
        
    private:
        string name = "";
        Coop coops[10];
        
};
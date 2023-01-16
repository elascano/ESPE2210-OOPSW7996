#pragma once
#include <string>
#include "Chicken.h"

using namespace std;
class Coop {
    public:
        Coop(string id, Chicken  chickens[]) {
            this->setId(id);
            this->setChickens(chickens);
        }
        Coop() { } // default constructor

        string getId(){
            return this->id;
        }
 
        void setId(string id) {
            this->id = id;   
        }

        Chicken *getChicken(){
            return this->chickens;
        }
 
        void setChickens(Chicken chickens[]) {
            for (int i = 0; i < 100; i++)
            {
                this->chickens[i] = chickens[i];
            }   
        }
        
    private:
        string id = "";
        Chicken chickens[100];
        
};
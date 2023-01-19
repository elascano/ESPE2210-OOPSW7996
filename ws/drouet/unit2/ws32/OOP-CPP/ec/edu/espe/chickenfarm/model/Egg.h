#pragma once

using namespace std;

class Egg {
    public:
        Egg(const int id) {
            this->setid(id);
        }
        Egg() { } // default constructor

        int getid(){
            return this->id;
        }
 
        void setid(int id) {
            this->id = id;    
        }
        
    private:
        int id = 0;  
};
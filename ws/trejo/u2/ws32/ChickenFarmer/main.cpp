#include <iostream>
#include <stdlib.h>

using namespace std;

class Chicken{
    private:
        int id;
        string nameCh;
        string color;
        int age;
        bool isMolting;
    public:
        Chicken(int, string, string, int, bool);
        void getChicken(int id, string nameCh, string color, int age, bool isMolting){
            this->id = id;
            this->nameCh = nameCh;
            this->color = color;
            this->age = age;
            this->isMolting= isMolting;
        }
        string setChciken(){
            return "Name: " + this->nameCh + "\n" + "Color: " + this->color;
        }

        string printChicken(){
            return "Id: " + to_string(this->id) + "\tName: " + this->nameCh + "\tColor: " + this->color + "\tAge: " + to_string(this->age) + "\tIs Molting: " + to_string(this->isMolting);
        };
        void doStuff(int forTime);
        void cluck();
        void wander();
        void eat();
        void drink();
        void poop();
        void setChicken();
};

    Chicken::Chicken(int id,string name, string color, int age, bool isMoolting){
    id = id;
    nameCh = name;
    color = color;
    age = age;
    isMolting = isMoolting;
    };

    class Coop{
    private:
        int id;
        Chicken chickens[];
    public:
        Coop(int, Chicken);
        void add (Chicken chicken);
        void removeChicken(int ChickenId);
        void resetIteration();
        Chicken next();

    };



    class ChickenFarmer{
    private:
        string nameCf;
        Coop coops[];
    public:
        ChickenFarmer(string, Coop);
        void add(Coop coop);
        void removeCoop(int coopId);
        void resetIteration();
        Coop next();
    };






class Egg{
    private:
        int id;
};



int main(){

    int id;
    string name;
    string color;
    int age;
    bool isMolting;

    Chicken chickenOne = Chicken(1, "Maria", "Black", 2, false);
    Chicken chickenTwo = Chicken(1, "Daniel", "white", 3, true);
    Chicken chickenThree = Chicken(1, "Pluto", "Brown", 8, false);

    Chicken chickens[3] = {chickenOne, chickenTwo, chickenThree};
    int cursor = 0;

    do{
        cout << "\n";
        cout << chickens[cursor].printChicken() <<endl;
        cursor++;

    }while(cursor < 3);

    return 0;


}

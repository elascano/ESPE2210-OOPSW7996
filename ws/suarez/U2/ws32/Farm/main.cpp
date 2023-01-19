#include <iostream>
#include <cstdlib>
using namespace std;
class Chicken{

private:
   int id;
   string name;
   string color;
   int age;
bool isMolting;

private:
    Chicken(int,string,string,int,bool);
    void getChicken(int id,string name,string color,int age, bool isMolting){
    this->id =id;
    this->name = name;
    this->color = color;
    this->age = age;
    this->isMolting = isMolting;
    }
    string setChicken(){
        return"Name: "+this->name +"\n"+"Color: "+this->color;
    }
    void cluck();
    void wander();
    void eat();
    void drink();
    void poop();

};

Chicken::Chicken(int id,string name,string color,int age,bool isMolting){

}

class Egg{
private:
   int id;

};

class Coop{

private:
   int id;
   Chicken chickens[];

private:
void add(Chicken chickens);
  void remove(int ChickenId);
  void resetiteration();
  Chicken next();

};

class ChickenFarmer{

private:
   string name;
   Coop coops[];

private:
   void add(Coop coops);
   void remove (int coopId);
   void resetiteration();
   Coop next();

};



int main()
{


printf("id :1, name: Lola ,color: Black,age: 6, isMolting: true\n");
printf("id :2, name: Marta ,color: Red,age: 9, isMolting: false");
printf("id :3, name: Juan ,color: white,age: 12, isMolting: true");
string Chicken1[0]={"id :1", "name: Lola" ,"color: Black,age: 6", "isMolting: true"};
    return 0;
}

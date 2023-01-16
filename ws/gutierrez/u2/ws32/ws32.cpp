#include <iostream>
#include <conio.h>
#include <string.h>

using namespace std;
class Chicken {
  public:
    int myNum;
    string myString;
 Chicken() {     // Constructor
      cout << "";
    }
    void myMethod() {

    }

};

class Coop {
  public:
    int myNum;
    string myString;
    Coop() {     // Constructor
      cout << "";
}
    void myMethod() {

    }
};


class ChickenFarmer {
  public:
    int myNum;
    string myString;
    ChickenFarmer() {     // Constructor
      cout << "";
}
    void myMethod() {


    }
};

class Egg {
  public:
    int myNum;
    string myString;
    Egg() {     // Constructor
      cout << "";
}
    void myMethod() {


    }
};

int main(){
  Chicken myObj;  // Create an object of MyClass

  // Access attributes and set values
  myObj.myNum = 15;
  myObj.myString = "**Chickens**\n";

  // Print attribute values
  cout << myObj.myNum << "\n";
  cout << myObj.myString;
  cout << " Chicken 1" << endl;
  cout << "id : 69" << endl;
  cout << "name: Yorman" << endl;
  cout << "color: white" <<endl;
  cout << "age: 2" <<endl;
  cout << "isMolting: true" <<endl;
   cout << "----------------" <<endl;
     cout << " Chicken 2" << endl;
  cout << "id : 7" << endl;
  cout << "name: Tilin" << endl;
  cout << "color: gray" <<endl;
  cout << "age: 9" <<endl;
  cout << "isMolting: false" <<endl;
  cout << "----------------" <<endl;
  cout << " Chicken 3" << endl;
  cout << "id : 3 " << endl;
  cout << "name: Ariel" << endl;
  cout << "color: black" <<endl;
  cout << "age: 5 " <<endl;
  cout << "isMolting: true" <<endl;


 return 0;
}



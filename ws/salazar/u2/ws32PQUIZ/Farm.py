from Chicken import Chicken
import os

chickens=[]
while True:
    os.system("cls")
    option =""
    try:
        id = int(input('Chicken ID: '))
    except ValueError:
        exit('Please enter a number')
    name=input("Chicken name: ")
    color=input("Chicken color: ")
    try:
        age = int(input('Chicken age: '))
    except ValueError:
        exit('Please enter a number')
        
    try:
        isMolting = bool(input('Chicken molting: '))
    except ValueError:
        exit('Please enter a boolean')
    chicken = Chicken(id,name,color,age,isMolting)
    chickens.append(chicken)
        
    option = input("Do you want to continue: ")
    if (option=="no"):
        break
    os.system("pause")
    os.system("cls")

for chicken in chickens:
    print(chicken.toString())

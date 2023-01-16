from Chicken import *

def addChickens():

    extension = 3
    chickens = []

    for i in range(0,extension):
        print("")
        print("CHICKEN N°"+str(i+1))
        chicken_id=input("Insert the id of the Chicken: ")
        chicken_name=input("Insert the name of the Chicken: ")
        chicken_color=input("Insert the color of the Chicken: ")
        chicken_age=input("Insert the age of the Chicken: ")
        chicken_molting=input("Chicken is Molting? (yes/no): ")
        print("")
        if chicken_molting == "yes":
            Molting = True
        else:
            Molting = False

        chicken = Chicken(chicken_id,chicken_name,chicken_color,chicken_age,Molting)
        chickens.append(chicken)

    for i in range (0,extension):
        print(f"""
            CHICKEN N°{i+1}
            ID: {chickens[i].id}
            Name: {chickens[i].name}
            Color: {chickens[i].color}
            Age: {chickens[i].age}
            Molting: {chickens[i].isMolting}
        
        """
        )


if __name__ == '__main__':

    addChickens()
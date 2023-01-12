import Egg
class Chicken:
    def __init__(self,id,name,color,age,isMolting):
        self.id = int(id)
        self.name = name
        self.color = color
        self.age = int(age)
        self.isMolting = bool(isMolting)
        
    def toString(self):
        id = str(self.id)
        age = str(self.age)
        molting = str(self.isMolting)
        return(id+"|"+self.name+"|"+self.color+"|"+age+"|"+molting)
        
    def DoStuff(forTime):
        forTime = int(forTime)
        print("The chicken do stuff for "+forTime+" hours")
        
    def cluck(self):
        print("The chicken "+self.name+" is clucking")
        
    def wander(self):
        print("The chicken "+self.name+" is wandering")
        
    def eat(self):
        print("The chicken "+self.name+" is eating")
    
    def drink(self):
        print("The chicken "+self.name+" is drinking")
        
    def poop(self):
        print("The chicken "+self.name+" is pooping")
        
    def layAnEgg(self):
        print("The chicken "+self.name+" is laying an egg")
        return Egg
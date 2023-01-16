import Chicken
class Coop:
    def __init__(self,id,chickens):
        self.id = int(id)
        self.chickens = Chicken(chickens)
        
    def get_id(self):
        return self.id
        
    def set_id(self, id):
        self.id = id
        
    def add(self,chicken):
        self.chickens.append(chicken)
        
    def remove(self,chickenId):
        for chicken in self.chickens:
            if(chicken.id==chickenId):
                self.chickens.pop(chicken)
                
    def resetIteration(self):
        self.chickens.clear()
                
    def next():
        return Chicken
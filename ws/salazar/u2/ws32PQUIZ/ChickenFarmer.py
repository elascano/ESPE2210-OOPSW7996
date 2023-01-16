import Coop
class ChickenFarmer:
    def __init__(self,id,coops):
        self.id = int(id)
        self.coops = Coop(coops)
        
    def add(self,coop):
        self.coops.append(coop)
        
    def remove(self,coopId):
        for coop in self.coops:
            if(coop.id==coopId):
                self.coops.pop(coop)
                
    def resetIteration(self):
        self.coops.clear()
        
    def next():
        return Coop
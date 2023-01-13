

from xml.etree.ElementTree import tostring
from model.Chicken import Chicken

chickens = []

chickens[0] =Chicken("1","Vilma","blue","3","true")
chickens[1] =Chicken("2","Bulma","skyblue","5","true")
chickens[2]= Chicken("3","Berry","red","5","true")

print(tostring(chickens[0]))


   


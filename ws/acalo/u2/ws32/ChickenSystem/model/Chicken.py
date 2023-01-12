from Egg import *

class Chicken():
  def __init__(self, id, name,color,age,isMolting):
    self.id = id
    self.name = name
    self.color = color
    self.age = age
    self.isMolting = isMolting

  def DoStuff(forTime):
    print("Is Stuff")

  def cluck():
    print("Is Cluck")
  
  def wander():
    print("Is wander")

  def eat():
    print("Is Eating")
  
  def drink():
    print("Is drinking")

  def poop():
    print("Is pooping")

  def layAnEgg():
    return Egg
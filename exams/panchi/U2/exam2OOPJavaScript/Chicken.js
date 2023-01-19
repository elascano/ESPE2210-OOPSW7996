class Chicken{
    constructor(id, name, color, age, isMolting){
        this._id = id
        this._name = name
        this._color = color
        this._age = age
        this._isMolting = isMolting
    }
    doStuff(){

    }
    cluck(){

    }
    wander(){

    }
    eat(){

    }
    drink(){

    }
    poop(){

    }
    layAnEgg(){
        return Egg
    }
}

const chicken1 = new Chicken(1, "lola", "black", 4, "true")
const chicken2 = new Chicken(2, "pichion", "white and brown", 3, "false")
const chicken3 = new Chicken(3, "pidgeon", "red and blue", 2, "true")

const arr = [chicken1, chicken2, chicken3]
console.log(arr)
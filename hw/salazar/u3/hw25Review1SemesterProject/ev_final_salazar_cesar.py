import os

def obtener_sueldo(frase,lista):
    sueldo=[]
    for letra in frase:
        if ord(letra)>=48 and ord(letra)<=57:
            valor=ord(letra)-48
            sueldo.append(valor)
    if len(sueldo)==4:
        num=sueldo[0]*1000+sueldo[1]*100+sueldo[2]*10+sueldo[3]
    if len(sueldo)==3:
        num=sueldo[0]*100+sueldo[1]*10+sueldo[2]
    lista.append(num)

def aumentos(lista1,lista2,lista3):
    for num in lista1:
        if num<=1000:
            incremento=round(num*0.15,2)
        elif num<=1500:
            incremento=round(num*0.1,2)
        else:
            incremento=round(num*0.05,2)
        total=num+incremento
    lista2.append(incremento)
    lista3.append(total)

def totales(lista):
    cont=0
    for num in lista:
        cont=cont+num
    return cont

def separar(frase,financiero,logistica,produccion,sistemas,ventas):
    sueldo=[]
    for letra in frase:
        if ord(letra)>=48 and ord(letra)<=57:
            valor=ord(letra)-48
            sueldo.append(valor)
    if len(sueldo)==4:
        num=sueldo[0]*1000+sueldo[1]*100+sueldo[2]*10+sueldo[3]
    if len(sueldo)==3:
        num=sueldo[0]*100+sueldo[1]*10+sueldo[2]
    if frase.find("Financiero")!=-1:
        financiero.append(num)
    if frase.find("Logística")!=-1:
        logistica.append(num)
    if frase.find("Producción")!=-1:
        produccion.append(num)
    if frase.find("Sistemas")!=-1:
        sistemas.append(num)
    if frase.find("Ventas")!=-1:
        ventas.append(num)

#principal

#operaciones con archivos
entrada=open("Sueldos.txt","r",encoding="utf-8")
salida=open("Sueldos final.txt","w",encoding="utf-8")
#literal 1
financiero=[]
logistica=[]
produccion=[]
sistemas=[]
ventas=[]
#tomar cada linea
linea=entrada.readline()
linea=linea.rstrip("\n")
#almacenar cada linea en una lista
contenido=[]
contenido.append(linea)

sueldos=[]
aumento=[]
sueldo_f=[]
obtener_sueldo(linea,sueldos)
aumentos(sueldos,aumento,sueldo_f)
separar(linea,financiero,logistica,produccion,sistemas,ventas)
while linea !="":
    linea=entrada.readline()
    linea=linea.rstrip("\n")
    contenido.append(linea)
    if linea:
        obtener_sueldo(linea,sueldos)
        aumentos(sueldos,aumento,sueldo_f)
        separar(linea,financiero,logistica,produccion,sistemas,ventas)

#literal 2
for i in range(len(sueldos)):
    linea_f=(contenido[i],",",str(aumento[i]),",",str(sueldo_f[i]),"\n")
    salida.writelines(linea_f)

while True:
    os.system("cls")
    print("||MENU||")
    print("1. Ver totales")
    print("2. Ver sectores")
    print("3. Salir")
    x=int(input("Seleccione una opcion: "))
    match x:
        case 1:
            os.system("cls")
            #literal 1
            print("||TOTALES AREAS||")
            print("Financiero: ",totales(financiero))
            print("Logística: ",totales(logistica))
            print("Producción: ",totales(produccion))
            print("Sistemas: ",totales(sistemas))
            print("Ventas: ",totales(ventas))
            print("Total: ",totales(sueldos))
            os.system("pause")
        case 2:
            os.system("cls")
            #literal 3
            print("||SECTOR FINANCIERO||")
            for i in range(len(sueldos)):
                if contenido[i].find("Financiero")!=-1:
                    print(contenido[i],",",str(aumento[i]),",",str(sueldo_f[i]))
            print("||SECTOR LOGISTICO||")
            for i in range(len(sueldos)):
                if contenido[i].find("Logística")!=-1:
                    print(contenido[i],",",str(aumento[i]),",",str(sueldo_f[i]))
            print("||SECTOR DE PRODUCCION||")
            for i in range(len(sueldos)):
                if contenido[i].find("Producción")!=-1:
                    print(contenido[i],",",str(aumento[i]),",",str(sueldo_f[i]))
            print("||SECTOR DE SISTEMAS||")
            for i in range(len(sueldos)):
                if contenido[i].find("Sistemas")!=-1:
                    print(contenido[i],",",str(aumento[i]),",",str(sueldo_f[i]))
            print("||SECTOR DE VENTAS||")
            for i in range(len(sueldos)):
                if contenido[i].find("Ventas")!=-1:
                    print(contenido[i],",",str(aumento[i]),",",str(sueldo_f[i]))
            os.system("pause")
        case 3:
            break
        case _:
            print("Ingrese un numero del 1 al 3")

entrada.close()
salida.close()
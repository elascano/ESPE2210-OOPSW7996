Imports System

Module ChickenFarmSimulator
    Sub Main(args As String())
        Dim chickens(3) As Chicken
        Dim id As Integer
        Dim name As String
        Dim color As String
        Dim age As Integer
        Dim isMolting As Boolean
        chickens(0) = New Chicken(111, "Juanito", "Brown", 4, False)
        chickens(1) = New Chicken(222, "Ramiro", "White", 2, True)
        chickens(2) = New Chicken(333, "Lucia", "Yellow", 5, False)

        For i = 0 To 3
            id = chickens(i).Id1
            name = chickens(i).Name1
            color = chickens(i).Color1
            age = chickens(i).Age1
            isMolting = chickens(i).IsMolting1

            Console.WriteLine("===========================")
            Console.WriteLine("Id: " & id)
            Console.WriteLine("name: " & name)
            Console.WriteLine("color: " & color)
            Console.WriteLine("age: " & age)
            Console.WriteLine("Is Molting: " & isMolting)
            Console.WriteLine("===========================")

        Next

    End Sub
End Module

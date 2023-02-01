Imports System



Module Program
    Sub Main(args As String())
        Console.WriteLine("=================")
        Console.WriteLine("Ariel Rivadeneira")
        Console.WriteLine("=================")
        Dim chickens(3) As Chicken
        Dim id As Integer
        Dim name As String
        Dim color As String
        Dim age As Integer
        Dim isMolting As Boolean

        chickens(0) = New Chicken(99, "Luz", "black", 9, True)
        chickens(1) = New Chicken(34, "Pepe", "brown", 4, False)
        chickens(2) = New Chicken(9, "Ana", "white", 1, True)

        For i = 0 To 3
            id = chickens(i).Id1
            name = chickens(i).Name1
            color = chickens(i).Color1
            age = chickens(i).Age1
            isMolting = chickens(i).IsMolting1

            Console.WriteLine("=================")
            Console.WriteLine("id:" & id)
            Console.WriteLine("Name:" & name)
            Console.WriteLine("color:" & color)
            Console.WriteLine("age:" & age)
            Console.WriteLine("Is molting" & isMolting)
            Console.WriteLine("=================")



        Next








    End Sub
End Module

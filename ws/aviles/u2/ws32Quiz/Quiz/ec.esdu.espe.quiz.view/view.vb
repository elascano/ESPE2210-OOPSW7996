Module view

    Sub Main()

        Dim chicken = New Chicken(1, "Paola", "black", 10, True)

        Dim chicken2 = New Chicken(2, "Juana", "brown", 3, False)

        Dim chicken3 = New Chicken(3, "Pancha", "white", 5, True)

        Dim chickens(3) As Chicken

        chickens(0) = chicken
        chickens(1) = chicken
        chickens(2) = chicken


        Dim Coop = New Coop(1, chickens)


        For i = 0 To 2
            Console.WriteLine("Chicken N " & i + 1)
            chickens(i).show()
            Console.WriteLine()
        Next


    End Sub

End Module

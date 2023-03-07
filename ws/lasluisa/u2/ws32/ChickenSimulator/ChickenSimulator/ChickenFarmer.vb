Public Class ChickenFarmer
    Private name As String
    Private coops() As Coop

    Public Sub add(coop As Coop)
        Console.WriteLine("Coop added")
    End Sub
    Public Sub remove(coopId As Integer)
        Console.WriteLine("Coop removed")
    End Sub

    Public Sub resetIteration()

    End Sub

    Public Function nextCoop() As Coop
        Dim coop As New Coop()
        Return coop
    End Function

End Class

Public Class ChickenFarmer
    Private name As String
    Private coops() As Coop

    Public Sub New(name As String, coops() As Coop)
        Me.Name1 = name
        Me.Coops1 = coops
    End Sub

    Public Property Name1 As String
        Get
            Return name
        End Get
        Set(value As String)
            name = value
        End Set
    End Property

    Public Property Coops1 As Coop()
        Get
            Return coops
        End Get
        Set(value As Coop())
            coops = value
        End Set
    End Property


    Public Sub add(coop As Coop)

        Console.Write("Coop added")


    End Sub


    Public Sub remove(coop As Coop)
        Console.Write("Coop removed")

    End Sub

    Public Sub resetIteration()

    End Sub

    Public Sub nextCoop()

    End Sub

End Class

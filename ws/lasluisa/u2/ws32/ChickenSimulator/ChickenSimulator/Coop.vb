Public Class Coop
    Private id As Integer
    Private chickens(3) As Chicken

    Public Sub New()

    End Sub

    Public Sub New(id As Integer, chickens() As Chicken)
        Me.Id1 = id
        Me.Chickens1 = chickens
    End Sub

    Public Property Id1 As Integer
        Get
            Return id
        End Get
        Set(value As Integer)
            id = value
        End Set
    End Property

    Public Property Chickens1 As Chicken()
        Get
            Return chickens
        End Get
        Set(value As Chicken())
            chickens = value
        End Set
    End Property

    Public Sub add(chicken As Chicken)

        Console.WriteLine("Chicken added")
    End Sub
    Public Sub remove(chicken As Chicken)
        Console.WriteLine("Chicken removed")
    End Sub
    Public Sub resetiteration()

    End Sub

    Public Function nextChicken() As Chicken
        Dim chicken As New Chicken

        Return chicken

    End Function

End Class

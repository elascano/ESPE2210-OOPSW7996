Public Class Chicken_Farmer
    Private name As String
    Private coops() As Coop

    Public Sub New(name As String, coops() As Coop)
        Me.name = name
        Me.coops = coops
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
End Class

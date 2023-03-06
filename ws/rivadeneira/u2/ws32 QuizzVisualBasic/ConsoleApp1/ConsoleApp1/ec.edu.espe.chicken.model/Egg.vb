Public Class Egg

    Private id As Integer

    Public Sub New(id As Integer)
        Me.id = id
    End Sub

    Public Property Id1 As Integer
        Get
            Return id
        End Get
        Set(value As Integer)
            id = value
        End Set
    End Property

    Public Overrides Function Equals(obj As Object) As Boolean
        Dim egg = TryCast(obj, Egg)
        Return egg IsNot Nothing AndAlso
               id = egg.id
    End Function
End Class

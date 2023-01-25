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



End Class

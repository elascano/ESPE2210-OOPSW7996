Public Class Chicken
    Public id As Integer
    Public Name As String
    Public Color As String
    Public age As Integer
    Public isMolting As Boolean

    Public Sub New()
    End Sub

    Public Sub New(id As Integer, name As String, color As String, age As Integer, isMolting As Boolean)
        Me.Id1 = id
        Me.Name1 = name
        Me.Color1 = color
        Me.Age1 = age
        Me.IsMolting1 = isMolting


    End Sub

    Public Property Id1 As Integer
        Get
            Return id
        End Get
        Set(value As Integer)
            id = value
        End Set
    End Property

    Public Property Name1 As String
        Get
            Return Name
        End Get
        Set(value As String)
            Name = value
        End Set
    End Property

    Public Property Color1 As String
        Get
            Return Color
        End Get
        Set(value As String)
            Color = value
        End Set
    End Property

    Public Property Age1 As Integer
        Get
            Return age
        End Get
        Set(value As Integer)
            age = value
        End Set
    End Property

    Public Property IsMolting1 As Boolean
        Get
            Return isMolting
        End Get
        Set(value As Boolean)
            isMolting = value
        End Set
    End Property

End Class



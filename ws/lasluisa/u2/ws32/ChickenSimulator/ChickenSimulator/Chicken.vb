Public Class Chicken
    Private id As Integer
    Private name As String
    Private color As String
    Private age As Integer
    Private isMolting As Boolean

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
            Return name
        End Get
        Set(value As String)
            name = value
        End Set
    End Property

    Public Property Color1 As String
        Get
            Return color
        End Get
        Set(value As String)
            color = value
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

    Public Sub doStuff(forTime As Integer)
        Console.WriteLine("The chicken is doing Stuff for" + forTime)
    End Sub

    Private Sub cluck()
        Console.WriteLine("The chicken is clucking")
    End Sub

    Private Sub wander()
        Console.WriteLine("The chicken is wandering")
    End Sub

    Private Sub eat()
        Console.WriteLine("The chicken is eating")
    End Sub

    Private Sub drink()
        Console.WriteLine("The chicken is drinking")
    End Sub

    Private Sub poop()
        Console.WriteLine("The chicken is pooping")
    End Sub

    Private Function layAnEgg() As Egg
        Dim egg As New Egg()
        Return egg
    End Function

End Class

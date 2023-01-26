Public Class Chicken
    Private id As Integer
    Private name As String
    Private color As String
    Private age As Integer
    Private isMolting As Boolean

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


    Public Sub DoStuff(forTime As Integer)

    End Sub

    Public Sub cluck()

    End Sub
    Public Sub wander()

    End Sub

    Public Sub eat()

    End Sub

    Public Sub drink()

    End Sub


    Public Sub poop()

    End Sub

    Public Sub layAnEgg()
        Console.Write("Egg layed")

    End Sub

    Sub show()
        Console.WriteLine("id=" & id)
        Console.WriteLine("Name=" & name)
        Console.WriteLine("Color=" & color)
        Console.WriteLine("Age=" & age)
        Console.WriteLine("Is Molting= " & isMolting)
    End Sub

End Class

﻿Public Class Coop
    Private id As Integer
    Private chickens() As Chicken

    Public Sub New(id As Integer, chickens() As Chicken)
        Me.id = id
        Me.chickens = chickens
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
End Class

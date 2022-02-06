package vsvdev.ua.starter;object LogicOperators extends App {
        var ticket = true
        var hands = true
        var feet = true
        var nightTime = true
        var closedBlinds = true
        var activeUse = true

        var enter = ticket && hands && feet
        println(enter)
        var enterWithFalse = ticket && !hands && feet
        println(enterWithFalse)

        if (enter) println("Come in") else println("go away")
        if (enterWithFalse) println("Come in") else println("go away")

        var turnOnlight =nightTime || closedBlinds
        if (turnOnlight) println("turning on the light ") else println("turn off")

        var turnOffScreen = !activeUse || nightTime

        if (turnOffScreen) println("turn off monitor") else println("keep working")

        }

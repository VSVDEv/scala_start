package vsvdev.ua.starter;object IFclass extends App {
        var lightOn = true
        val turnOnLight = "Turn on the light"
        val takeFeed = "Take feed"
        val feelThough = "Feel through"

        if (lightOn == true) {
                println(takeFeed)
                println(feelThough)
                }
        println("***********************")
        if (lightOn) {
                println(s"$takeFeed, $feelThough ")
                }
        println("************************")

        val ifInstructioin: Unit = if (lightOn) {
                println(s"$takeFeed, $feelThough ")
                }

        println("*******************")
        println("*******************")

        if (lightOn) println(s"$takeFeed, $feelThough ")


        println("*******************")

        /*
        IF ELSE
           */
        //return string
        if (lightOn) s"$takeFeed, $feelThough " else s"$turnOnLight, $takeFeed, $feelThough "

        //return any
        if (lightOn) s"$takeFeed, $feelThough " else 1
        }

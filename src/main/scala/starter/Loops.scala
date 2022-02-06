package vsvdev.ua.starter;object Loops extends App {

        /*
        while return Unit(no results)
         */


        var i = 0
        while (i < 3) {
                println(i)
                i += 1
                }
        println("*******************")
        /*
        do while   Unit(no results)
         */
                var j = 0
        do {
                println(j)
                j += 1
                }
                while (j < 2)

        println("*******************")
        /*

        for  Unit(no results)
         */

        for (i<-0 to 2) println(i)//0,1,2

        println("*******************")
        for (i<-0 until 2) println(i)//0,1

        println("*******************")
        for (i<-"Hello") println(i)

        println("*******************")

        for (i<-1 to 3; j<-1 to 5) println(s"$i, $j")

        println("*******************")

        for (i<-1 to 3; j<-1 to 5 if i !=j) println(s"$i, $j")

        println("*******************")

        val d = for (i<-1 to 3) yield i*10
        val c: Seq[Int] = for (i<-1 to 3) yield i*10
        println(d)


        println("*******************")

        }

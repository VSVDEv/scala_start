package vsvdev.ua.starter

import scala.io.StdIn;object Hello extends App {
        var name = "Joe" //can be modified
        name = StdIn.readLine("Your name: ")
        val seqname = "Doe" //const
        println(s"Hello,  $name $seqname")
        println(s"Hello,  $name $seqname")

        val nname, nname2 = StdIn.readLine("Enter name:  ")
        println(s"Hello,  $nname $seqname") //what enter first
        println(s"Hello,  $nname2") //what enter second

        val nname1, nname3 = "Tom"
        println(s"Hello,  $nname1 $seqname") //tom
        println(s"Hello,  $nname3") //tom

        //write to one string
                val a: Int = 154; val b = 2.0; println( a, b)
        }

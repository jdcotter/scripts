#!/usr/bin/env groovy
import groovy.time.TimeCategory

def acceptedFormat = "yyyy/MM/dd"
def today = new Date() + 1
def currentdate = today.format(acceptedFormat)
println("Today is $currentdate")

(1..15).each { year ->
    println " Processing $year ago..." 
    use(TimeCategory) {
        def lastyear = today - year.year
        def yesteryear = lastyear + 1.day
        def afteryear = lastyear.format(acceptedFormat)
        def beforeyear = yesteryear.format(acceptedFormat)
        println "after:$afteryear before:$beforeyear"
    }


}

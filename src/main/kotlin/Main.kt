fun main() {
    for (likes in 0..112) {
        var peoplessEnd : String = "";
        if (likes % 100 == 11) {
            peoplessEnd = "людям"
        }
        else {
            if (likes % 10 == 1) {
                peoplessEnd = "человеку"
            }
            else {
                peoplessEnd = "людям"
            }
        }
        println("Понравилось $likes $peoplessEnd")
    } // for likes in 0..1000
}
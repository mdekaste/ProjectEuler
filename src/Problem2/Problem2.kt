package Problem2

fun main(){
    generateSequence(0 to 1){(prev1, prev2) -> prev2 to prev1 + prev2}
        .map { (_,it) -> it }
        .takeWhile { it <= 4000000 }
        .filter { it % 2 == 0 }
        .sum()
        .let(::println)
}
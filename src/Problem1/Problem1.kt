package Problem1

fun main() {
    List(1000) { it }.filter { it % 3 == 0 || it % 5 == 0 }.sum().let(::println)
}

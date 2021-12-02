package problem9

fun main() {
    generateSequence(0 to 1) { (n, m) ->
        when (m - n) {
            1 -> 1 to m + 1
            else -> n + 1 to m
        }
    }.map { (n, m) -> listOf(m * m - n * n, 2 * n * m, n * n + m * m) }
        .first { (a, b, c) -> a + b + c == 1000 }
        .let { (a, b, c) -> a * b * c }
        .let(::println)
}

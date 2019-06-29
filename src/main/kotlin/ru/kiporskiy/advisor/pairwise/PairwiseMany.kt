package ru.kiporskiy.advisor.pairwise

import ru.kiporskiy.advisor.Many

/**
 * Множество альтернатив для попарного сравнения.
 */
data class PairwiseMany(

    /**
     * Список всех доступных вариантов.
     */
    val alternatives: List<PairwiseAlternative>,

    /**
     * Попарное сравнение вариантов.
     */
    val comparison: Map<Pair<PairwiseAlternative, PairwiseAlternative>, Boolean>,

    /**
     * Режим, применяемый для сравнения вариантов.
     */
    val mode: Mode
) : Many<PairwiseAlternative>


/**
 * Режим попарного сравнения
 */
enum class Mode {
    STRICT,     //строгий режим включает одностороннее предпочтение (альтернатива А ХУЖЕ/ЛУЧШЕ, чем Б)
    NO_STRICT   //режим допускает присутствие равнозначности между парой (альтернатива А НЕ ХУЖЕ/ЛУЧШЕ, чем Б)
}

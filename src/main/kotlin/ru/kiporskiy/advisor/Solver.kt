package ru.kiporskiy.advisor

/**
 * Объект, принимающее решение среди множества альтернатив.
 */
interface Solver<T : Alternative> {

    /**
     * Из всех вариантов выбрать наилучший.
     */
    fun getBestsAlternatives(allAlternatives: Collection<T>): List<T>

}

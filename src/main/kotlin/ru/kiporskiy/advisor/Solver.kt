package ru.kiporskiy.advisor

/**
 * Объект, принимающее решение среди множества альтернатив.
 */
interface Solver<T : Alternative> {

    /**
     * Из множества вариантов выбрать наилучшие.
     */
    fun getBestsAlternatives(manyAlternatives: Many<T>): List<T>

}

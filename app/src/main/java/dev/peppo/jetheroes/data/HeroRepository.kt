package dev.peppo.jetheroes.data

import dev.peppo.jetheroes.model.Hero
import dev.peppo.jetheroes.model.HeroesData

class HeroRepository {

    fun getHeroes():List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}
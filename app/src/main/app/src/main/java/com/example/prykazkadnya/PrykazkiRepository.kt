package com.example.prykazkadnya

import java.util.Calendar

object PrykazkiRepository {

    val list = listOf(
        "Не той багаты, што мае, а той, каму хапае.",
        "Як дбаеш, так і маеш.",
        "Без працы не будзе і смацы.",
        "Хто рана ўстае, таму Бог падае.",
        "Добрае слова і кошке прыемна.",
        "Слова — не верабей, вылеціць — не словіш.",
        "Чужая праца не корміць.",
        "Родная зямля мёдам пахне.",
        "За працу плацяць, а за ляноту свараць.",
        "Ласкавае слова што веснавы дзень.",
        "Дзе згода, там і перамога.",
        "Што пасееш, тое і пажнеш.",
        "Чалавек без сяброў — што дрэва без каранёў.",
        "Свая хатка — родная матка.",
        "Багатаму і чорт дзяцей калыша."
    )

    fun getProverbOfDay(): String {
        val calendar = Calendar.getInstance()
        val dayOfYear = calendar.get(Calendar.DAY_OF_YEAR)
        val year = calendar.get(Calendar.YEAR)
        val index = (dayOfYear + year) % list.size
        return list[index]
    }
}

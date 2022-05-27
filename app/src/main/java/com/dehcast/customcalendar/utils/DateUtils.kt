package com.dehcast.customcalendar.utils

import com.kizitonwose.calendarview.model.CalendarMonth
import java.time.LocalDate
import java.time.temporal.WeekFields
import java.util.*

fun CalendarMonth.getNextMonthAsDate(): LocalDate { //TODO is this one necessary?
    val newDate = this.plusMonths(1)
    return LocalDate.of(newDate.year, newDate.month, 1)
}

fun CalendarMonth.getPreviousMonthAsDate(): LocalDate {
    val newDate = this.plusMonths(-1)
    return LocalDate.of(newDate.year, newDate.month, 1)
}

fun CalendarMonth.plusMonths(extraMonths: Long): CalendarMonth {
    return this.copy(yearMonth = yearMonth.plusMonths(extraMonths))
}

fun getFirstDayOfWeek() = WeekFields.of(Locale.getDefault()).firstDayOfWeek //TODO is this one necessary?
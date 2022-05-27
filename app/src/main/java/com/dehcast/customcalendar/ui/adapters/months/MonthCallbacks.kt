package com.dehcast.customcalendar.ui.adapters.months

import com.kizitonwose.calendarview.model.CalendarMonth

interface MonthCallbacks {

    //TODO maybe have only one
    fun onPreviousMonthClicked(currentMonth: CalendarMonth)
    fun onNextMonthClicked(currentMonth: CalendarMonth)
}
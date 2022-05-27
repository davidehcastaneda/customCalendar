package com.dehcast.customcalendar.ui.adapters.days

import com.kizitonwose.calendarview.model.CalendarDay

interface DayCallbacks {

    fun onDayClicked(day: CalendarDay)
}
package com.dehcast.customcalendar.ui.adapters.days

import android.view.View
import com.kizitonwose.calendarview.model.CalendarDay
import com.kizitonwose.calendarview.ui.DayBinder

class CalendarDayBinder(
    private val callbacks: DayCallbacks,
) : DayBinder<CalendarDayViewContainer> {
    override fun create(view: View): CalendarDayViewContainer =
        CalendarDayViewContainer(view, callbacks)

    override fun bind(container: CalendarDayViewContainer, day: CalendarDay) {
        container.bindDate(day) //wrap and clean?
    }
}
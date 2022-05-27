package com.dehcast.customcalendar.ui.adapters.months

import android.view.View
import com.kizitonwose.calendarview.model.CalendarMonth
import com.kizitonwose.calendarview.ui.MonthHeaderFooterBinder

class CalendarMonthBinder(
    private val monthCallbacks: MonthCallbacks
) : MonthHeaderFooterBinder<CalendarMonthViewContainer> {
    override fun create(view: View) = CalendarMonthViewContainer(view, monthCallbacks)

    override fun bind(container: CalendarMonthViewContainer, month: CalendarMonth) {
        container.bindMonth(month = month)
    }
}
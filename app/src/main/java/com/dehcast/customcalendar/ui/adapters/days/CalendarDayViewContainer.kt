package com.dehcast.customcalendar.ui.adapters.days

import android.view.View
import com.dehcast.customcalendar.databinding.GridItemCalendarBinding
import com.kizitonwose.calendarview.model.CalendarDay
import com.kizitonwose.calendarview.ui.ViewContainer

class CalendarDayViewContainer(
    view: View,
    private val callbacks: DayCallbacks,
    private val binding: GridItemCalendarBinding = GridItemCalendarBinding.bind(view),
) : ViewContainer(binding.root) {

    fun bindDate(day: CalendarDay) { //enabled, number, separator? out of range?
        binding.date.text = day.date.dayOfMonth.toString()
        binding.root.setOnClickListener { callbacks.onDayClicked(day) }
    }

}
package com.dehcast.customcalendar.ui.adapters.months

import android.view.View
import com.dehcast.customcalendar.databinding.CalendarHeaderBinding
import com.kizitonwose.calendarview.model.CalendarMonth
import com.kizitonwose.calendarview.ui.ViewContainer

class CalendarMonthViewContainer(
    view: View,
    val callbacks: MonthCallbacks,
    private val binding: CalendarHeaderBinding = CalendarHeaderBinding.bind(view),
) : ViewContainer(binding.root) {

    fun bindMonth(month: CalendarMonth) { //pass name, previous enable, next enable, //yearMonth?
        binding.month.text = month.month.toString()
        binding.nextMonth.setOnClickListener { callbacks.onNextMonthClicked(month) }
        binding.previousMonth.setOnClickListener { callbacks.onPreviousMonthClicked(month) }
    }
}
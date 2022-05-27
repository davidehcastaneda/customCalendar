package com.dehcast.customcalendar.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dehcast.customcalendar.databinding.ActivityMainBinding
import com.dehcast.customcalendar.repositories.ScheduleAvailabilityRepository
import com.dehcast.customcalendar.repositories.ScheduleAvailabilityRepositoryContract
import com.dehcast.customcalendar.ui.adapters.days.CalendarDayBinder
import com.dehcast.customcalendar.ui.adapters.days.DayCallbacks
import com.dehcast.customcalendar.ui.adapters.months.CalendarMonthBinder
import com.dehcast.customcalendar.ui.adapters.months.MonthCallbacks
import com.dehcast.customcalendar.utils.getFirstDayOfWeek
import com.dehcast.customcalendar.utils.getNextMonthAsDate
import com.dehcast.customcalendar.utils.getPreviousMonthAsDate
import com.kizitonwose.calendarview.model.CalendarDay
import com.kizitonwose.calendarview.model.CalendarMonth
import java.time.YearMonth

class MainActivity : AppCompatActivity(), MonthCallbacks, DayCallbacks {

    private lateinit var binding: ActivityMainBinding
    private val dayBinder by lazy { CalendarDayBinder(this) }
    private val monthBinder by lazy { CalendarMonthBinder(this) }
    private val repository: ScheduleAvailabilityRepositoryContract by lazy { ScheduleAvailabilityRepository() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupCalendar()
        setAvailableDays()
    }

    private fun setupCalendar() {
        binding.calendar.dayBinder = dayBinder
        binding.calendar.monthHeaderBinder = monthBinder
        setAvailableDays()
    }

    private fun setAvailableDays() { //TODO fetch from repository
        val firstDayOfWeek = getFirstDayOfWeek()
        val firstMonth = YearMonth.now()
        val lastMonth = YearMonth.now().plusMonths(12) //TODO pass list to adapters, so wrapper is available
        binding.calendar.setup(firstMonth, lastMonth, firstDayOfWeek)
    }

    override fun onPreviousMonthClicked(currentMonth: CalendarMonth) {
        binding.calendar.scrollToDate(currentMonth.getPreviousMonthAsDate())
    }

    override fun onNextMonthClicked(currentMonth: CalendarMonth) {
        binding.calendar.scrollToDate(currentMonth.getNextMonthAsDate())
    }

    override fun onDayClicked(day: CalendarDay) {
        Toast.makeText(this, day.day.toString(), Toast.LENGTH_SHORT).show()
    }
}
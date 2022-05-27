package com.dehcast.customcalendar.repositories

import com.dehcast.customcalendar.model.ScheduleSlot

interface ScheduleAvailabilityRepositoryContract {

    fun fetchAvailableSlots(): List<ScheduleSlot>
}
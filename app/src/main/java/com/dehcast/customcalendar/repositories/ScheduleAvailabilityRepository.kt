package com.dehcast.customcalendar.repositories

import com.dehcast.customcalendar.model.ScheduleSlot

class ScheduleAvailabilityRepository: ScheduleAvailabilityRepositoryContract {

    override fun fetchAvailableSlots(): List<ScheduleSlot> = listOf(
        ScheduleSlot(
            startDate = "2022-07-10",
            id = 1
        ),
        ScheduleSlot(
            startDate = "2022-07-11",
            id = 2
        ),
        ScheduleSlot(
            startDate = "2022-07-12",
            id = 3
        ),
        ScheduleSlot(
            startDate = "2022-07-13",
            id = 4
        ),
        ScheduleSlot(
            startDate = "2022-07-14",
            id = 5
        )
    )
}
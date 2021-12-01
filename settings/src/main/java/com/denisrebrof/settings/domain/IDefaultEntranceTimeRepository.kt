package com.denisrebrof.settings.domain

import java.util.concurrent.TimeUnit
import kotlin.time.TimeMark

interface IDefaultEntranceTimeRepository {
    suspend fun getTime():
}
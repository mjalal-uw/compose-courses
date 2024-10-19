package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val topicNameStringResourceId: Int,
    val numberOfCoursesInTopic: Int,
    @DrawableRes val topicImageResourceId: Int
)

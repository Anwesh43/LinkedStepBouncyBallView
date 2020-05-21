package com.anwesh.uiprojects.stepbouncyballview

/**
 * Created by anweshmishra on 21/05/20.
 */

import android.view.View
import android.view.MotionEvent
import android.content.Context
import android.app.Activity
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color

val colors : Array<String> = arrayOf("#3F51B5", "#9C27B0", "#4CAF50", "#FF9800", "#F44336")
val balls : Int = 5
val scGap : Float = 0.02f / balls
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20

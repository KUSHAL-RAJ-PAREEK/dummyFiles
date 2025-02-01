package com.krp.dummyfiles.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.krp.dummyfiles.ui.theme.Purple40

/**
 * Created by KUSHAL RAJ PAREEK on 01,February,2025
 */
@Composable
fun cuttedCircle(modifier: Modifier = Modifier) {

    Canvas(modifier = Modifier.size(1400.dp), onDraw = {

        drawCircle(
            color = Purple40.copy(alpha = 0.4f),
            radius = 800f,
            center = Offset(0f, 0f)
        )

        drawCircle(color = Purple40.copy(alpha = 0.5f), radius = 800f,
            center = Offset(size.width, 0f)
        )


        val center = Offset(size.width / 2f, size.height / 2f - 300f)
        val radius = 470f

        drawCircle(
            color = Purple40.copy(alpha = 0.4f),
            radius = radius,
            center = center
        )
        val cutHeight = 100f
        drawRect(
            color = Color.White,
            topLeft = Offset(center.x - radius, center.y + radius - cutHeight),
            size = androidx.compose.ui.geometry.Size(2 * radius, cutHeight)
        )
    })
}
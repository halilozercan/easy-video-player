package com.example.composevideoplayer

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Icon
import androidx.ui.graphics.Color
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.Stack
import androidx.ui.layout.offset
import androidx.ui.layout.size
import androidx.ui.unit.Dp
import androidx.ui.unit.dp

@Composable
fun ShadowedIcon(
        icon: VectorAsset,
        iconSize: Dp = 48.dp,
        modifier: Modifier = Modifier
) {
    Stack(modifier = Modifier + modifier) {
        Icon(
                asset = icon.copy(defaultWidth = iconSize, defaultHeight = iconSize),
                tint = Color.Black.copy(alpha = 0.3f),
                modifier = Modifier.offset(2.dp, 2.dp) + modifier
        )
        Icon(
                asset = icon.copy(defaultWidth = iconSize, defaultHeight = iconSize),
                modifier = Modifier + modifier
        )
    }
}
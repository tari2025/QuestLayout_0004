package com.example.pampraktikum4

import androidx.compose.foundation.checkScrollableContainerConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column (
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAllignment = alignment.CenterHorizontally
    ) {
        Text(
            stringResource(R.string.prodi),
            fontSize =35.sp,
            fontWeight = FontWeight.Bold

        )
        Text(
            stringResource(R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                ContainerColor = colorResource(R.color.card_0_bg       )
            )
        )
    }

    Row() {
        val gambar = painterResource(R.drawable.kucinganime)
        immage(
            painter = gambar,
            contentDescription = null,
            modifier = Modifier.size(100).dp).padding(all=5.dp)

        )
        Spacer(modifier = Modifier.width(30.dp))
        Column() {
            Text(
                stringResource("Deni Lestari"),
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive,
            )
        }
    }

}

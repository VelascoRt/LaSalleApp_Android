package com.atervictor.lasalleapp512.ui.screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.atervictor.lasalleapp512.ui.theme.LaSalleApp512Theme
import com.atervictor.lasalleapp512.ui.utils.Logout

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Header
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(""),
                contentDescription = "Background Image",
                modifier = Modifier
                    .fillMaxSize()
                    .offset(y = 70.dp)
                )
            Image(painter = painterResource(id = com.atervictor.lasalleapp512.R.drawable.background),
                contentDescription = "Backgorund Image",
                modifier = Modifier.fillMaxSize().offset(y = 70.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(painter = painterResource(id = com.atervictor.lasalleapp512.R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(70.dp).clickable {
                        Log.i("HomeScreen","Cerrando sesión")
                    })
                Column (
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = "Hola",
                        color = MaterialTheme.colorScheme.background,
                        fontSize = 18.sp)
                    Text(text = "Usuario",
                        color = MaterialTheme.colorScheme.background,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 15.dp))
                }
                Icon(imageVector = Logout,
                    contentDescription = "Logout",
                    modifier = Modifier.size(45.dp),
                    tint = MaterialTheme.colorScheme.background)
            }
        }

        // Body
        Box (
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    LaSalleApp512Theme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}

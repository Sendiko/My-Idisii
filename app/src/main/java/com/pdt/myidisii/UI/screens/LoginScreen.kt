package com.pdt.myidisii.UI.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pdt.myidisii.UI.components.signButton
import com.pdt.myidisii.UI.components.signTextField

@Preview(showBackground = true)
@Composable
fun LoginScreen() {
    val username = remember { mutableStateOf(TextFieldValue("")) }
    val password = remember { mutableStateOf(TextFieldValue("")) }

    Box(
        modifier = Modifier
            .fillMaxHeight(0.7f)
            .fillMaxWidth()
            .background(Color( 0xFF063970)),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 100.dp)
        ) {
            Text(
                text = "My-Idisii",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFB2EBF2),
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Lorem ipsum dolor sit amet,  sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\nsed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                fontSize = 14.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 10.dp)
            )
        }
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 290.dp),
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxSize()
                .height(100.dp)
                .background(
                    Color(0xFFF5F5F5),
                    shape = RoundedCornerShape(topStart = 130.dp, topEnd = 130.dp, bottomEnd = 0.dp, bottomStart = 0.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp),
            ) {

                Text(
                    text = "Login",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                )

                Spacer(modifier = Modifier.height(16.dp))

                signTextField("Masukan Username", username)
                Spacer(modifier = Modifier.height(16.dp))

                signTextField("Masukan Password", password, isPassword = true)

                Spacer(modifier = Modifier.height(32.dp))

                signButton(
                    text = "Sign In",
                    onClick = { /*   */ }
                )
            }

        }
    }
}




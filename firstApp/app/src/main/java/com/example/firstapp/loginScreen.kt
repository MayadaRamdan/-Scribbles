package com.example.firstapp

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun login(){
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = "LogIn Screen") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = colorResource(id = R.color.topBarColor),
                    titleContentColor = colorResource(id = R.color.black)
                )
               )
        },
        content = { scafoldContent()}
    )

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scafoldContent(){

    var textField1 = remember { mutableStateOf("") }
    var textField2 = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        OutlinedTextField(value = textField1.value , onValueChange = {
            textField2.value = it
        })
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(value = textField2.value , onValueChange = {
            textField2.value = it
        })
        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.topBarColor),
                contentColor = colorResource(id = R.color.black)
            )
        ) {
            Text(text = "SUBMIT")
        }
    }
}

fun displayNotification(){

}
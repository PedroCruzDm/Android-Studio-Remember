package com.example.teste04

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
//import androidx.compose.material.MaterialTheme
//import androidx.compose.material.Surface
//mport androidx.compose.material.Text
//mport androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.teste04.ui.theme.Teste04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Teste04Theme {
                // A surface container using the 'background' color from the theme
                // //Surface(
                // modifier = Modifier.fillMaxSize(),
                //    color = MaterialTheme.colors.background
                // ) {
                //      Greeting("Android")
                //    }
                val CPTexto = rememberSaveable {
                    mutableStateOf("");
                }
                Log.i(TAG, "a, $CPTexto")

                TextField(
                    value = CPTexto.value,
                    onValueChange ={
                        Log.d(TAG, "o app, $it")
                        CPTexto.value = it
                    } )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Teste04Theme {
        Greeting("Android")
    }
}


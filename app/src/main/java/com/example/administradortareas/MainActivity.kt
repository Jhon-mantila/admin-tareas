package com.example.administradortareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administradortareas.ui.theme.AdministradorTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorTareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImageTask(
                        text = stringResource(R.string.text),
                        text2 = stringResource(R.string.text2),
                    )
                }
            }
        }
    }
}

@Composable
fun TaskText(text: String, text2: String,  modifier: Modifier = Modifier) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                )
        )
        Text(
            text = text2,
            fontSize = 16.sp,
            modifier = modifier
        )
    }

}
@Composable
fun ImageTask(text: String, text2: String, modifier: Modifier = Modifier) {

    val image = painterResource(id = R.drawable.ic_task_completed)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
        ) {
        Image(
            painter = image,
            contentDescription = null,
        )
        TaskText(
            text = text,
            text2 = text2
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdministradorTareasTheme {
        ImageTask(
            "All tasks completed",
            "Nice work!",
        )
    }
}
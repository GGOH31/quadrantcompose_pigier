package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    QuadrantCompose(
                        modifier = Modifier
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun QuadrantCompose(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ){
         Row(modifier = modifier.weight(1f)){
             Column(
                 verticalArrangement = Arrangement.Center,
                 horizontalAlignment = Alignment.CenterHorizontally,
                 modifier = modifier
                 .weight(1f)
                 .background(Color(0xFFEADDFF))
                 .fillMaxSize()) {
                 Text(
                     text = stringResource(R.string.texte_1),
                 )
                 Text(
                     text = stringResource(R.string.texte_2),
                 )
             }
             Column(
                 verticalArrangement = Arrangement.Center,
                 horizontalAlignment = Alignment.CenterHorizontally,
                 modifier = modifier
                     .weight(1f)
                     .background(Color(0xFFD0BCFF))
                     .fillMaxSize()
             ) {
                 Text(
                     text = stringResource(R.string.texte_1),
                 )
                 Text(
                     text = stringResource(R.string.texte_2),
                 )
             }
         }
        Row(modifier = modifier.weight(1f)){
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .weight(1f)
                    .background(Color(0xFFB69DF8))
                    .fillMaxSize()
            ) {
                Text(
                    text = stringResource(R.string.texte_1),
                )
                Text(
                    text = stringResource(R.string.texte_2),
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .weight(1f)
                    .background(Color(0xFFF6EDFF))
                    .fillMaxSize()
            ) {
                Text(
                    text = stringResource(R.string.texte_1),
                )
                Text(
                    text = stringResource(R.string.texte_2),
                )
            }
        }
    }
}




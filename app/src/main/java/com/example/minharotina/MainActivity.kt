package com.example.minharotina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.minharotina.ui.theme.MinhaRotinaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MinhaRotinaTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MinhaRotina()
                }
            }
        }
    }
}

@Composable
fun MinhaRotina() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Image(
            painter = painterResource(id = R.drawable.imagem),
            contentDescription = "Imagem da Rotina",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Minha Rotina Diária")

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "06:00 - Acordo e tomo café da manhã")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "07:00 - Vou para a faculdade")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "13:00 - Almoço")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "13:30 - Chego no trabalho")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "19:00 - Chego em casa e vou jantar")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "20:00 - Relaxo")
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "22:00 - Vou dormir")

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MinhaRotinaTheme {
        MinhaRotina()
    }
}
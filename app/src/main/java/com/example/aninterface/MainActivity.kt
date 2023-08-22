package com.example.aninterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aninterface.ui.theme.InterfaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
            SimpleForm()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleForm() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Adiciona um espaçamento externo
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Formulário simples
        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Nome") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Fone") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Endereço") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Bairro") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Cep") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        TextField(
            value = "",
            onValueChange = { /* Implemente a lógica de mudança de valor aqui */ },
            label = { Text("Estado") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

        Button(
            onClick = { /* Implemente a lógica do botão aqui */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text("Enviar")
        }
    }
}


@Composable
fun App() {
    InterfaceTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                // O SimpleBottomAppBar ficará na parte superior
                SimpleBottomAppBar()

                // Adiciona um espaço flexível para empurrar o BottomAppBarWithFAB para a parte inferior
                Spacer(modifier = Modifier.weight(1f))

                // O BottomAppBarWithFAB ficará na parte inferior
                BottomAppBarWithFAB()
            }
        }
    }
}



@Composable
fun SimpleBottomAppBar() {
    BottomAppBar {
        IconButton(onClick = { /* doSomething() */ }) {
            Icon(Icons.Filled.Menu, contentDescription = "Localized description")
        }
    }
}


@Composable
fun BottomAppBarWithFAB() {
    BottomAppBar(
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(Icons.Filled.Check, contentDescription = "Localized description")
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(
                    Icons.Filled.Edit,
                    contentDescription = "Localized description",
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* do something */ },
                containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
            ) {
                Icon(Icons.Filled.Add, "Localized description")
            }
        }
    )
}



@Preview(showBackground = true)
@Composable
fun BottomAppBarPreview() {
    InterfaceTheme {
        BottomAppBarWithFAB()
    }
}

@Preview(showBackground = true)
@Composable
fun SimpleBottomPreview() {
    InterfaceTheme {
        SimpleBottomAppBar()

    }
}

@Preview(showBackground = true)
@Composable
fun SimpleFormPreview() {
    InterfaceTheme {
        SimpleForm()
    }
}

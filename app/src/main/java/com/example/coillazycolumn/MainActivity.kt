package com.example.coillazycolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent
import com.example.coillazycolumn.DataSource.Companion.createDataSet
import com.example.coillazycolumn.ui.theme.CoilLazyColumnTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoilLazyColumnTheme {
                val data = createDataSet()
                Surface(color = MaterialTheme.colors.background) {
                    MyLazyColumn(data = data)
                }
            }
        }
    }
}

@Composable
fun MyLazyColumn(data: ArrayList<MyArrayItem>){
    LazyColumn{
        items(
            items = data,
            itemContent = {
                ListItem(character = it)
            }
        )
    }
}

@Composable
fun ListItem(character: MyArrayItem){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(100.dp),
        elevation = 8.dp,
    ) {
        Row(
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
        ){
            SubcomposeAsyncImage(
                model = character.image,
                contentDescription = character.title
            ) {
                when (painter.state) {
                    is AsyncImagePainter.State.Loading -> {
                        CircularProgressIndicator()
                    }
                    is AsyncImagePainter.State.Error -> {
                        AsyncImage(model = R.drawable.ic_launcher_background,
                            contentDescription = "Default")
                    }
                    else -> {
                        SubcomposeAsyncImageContent()
                    }
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                character.title,
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
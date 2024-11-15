package com.curiozing.dagger2_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.curiozing.dagger2_example.ui.theme.Dagger2ExampleTheme
import com.curiozing.dagger2_example.ui.theme.data.HomeRepository
import com.curiozing.dagger2_example.ui.theme.di.component.DaggerHomeComponent
import javax.inject.Inject

class MainActivity : ComponentActivity(){

    @Inject
    lateinit var homeRepository: HomeRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        val homeComponent = DaggerHomeComponent.create()
        homeComponent.inject(this)
        super.onCreate(savedInstanceState)
        homeRepository.apiCall()
        setContent {
            Dagger2ExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Dagger2ExampleTheme {
        Greeting("Android")
    }
}
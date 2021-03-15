package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            PreviewGreeting()
            DefaultPreview()
        }
    }
}


//@Composable
//fun Greeting(name: String){
//    Text(text = "Hello $name")
//}
//
//@Preview
//@Composable
//fun PreviewGreeting(){
//    Greeting("Android")
//}

@Composable
fun NewsStory() {
    Text("A day in Shark Fin Cove")
    Text("Davenport, California")
    Text("December 2018")
}

// version=1.0.0-beta02,use painterResource instead of imageResource which has been deleted.
//https://developer.android.com/reference/kotlin/androidx/compose/ui/res/package-summary#painterresource
@Composable
fun NewStory() {
    val img = painterResource(R.drawable.header)

    MaterialTheme() {
        val typography = MaterialTheme.typography

        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            val imageModifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(8.dp))

            Image(img, null, imageModifier,contentScale = ContentScale.Crop)

            Spacer(Modifier.height(16.dp))

            Text( "A day wandering through the sandhills " +
                    "in Shark Fin Cove, and a few of the " +
                    "sights I saw",
            style = typography.h6,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis)

            Text("This is second",
            style = typography.body2)
            Text("This is third",
            style = typography.body2)
        }
    }


}

@Preview
@Composable
fun DefaultPreview() {
    NewStory()
}
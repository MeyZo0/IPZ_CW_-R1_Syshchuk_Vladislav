package ua.edu.lntu.cw_CR1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_CR1.ui.theme.IPZ_CW_R1_Syshchuk_VladislavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_R1_Syshchuk_VladislavTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainWindow()
                }
            }
        }
    }
}

@Composable
fun MainWindow(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier

                .padding(bottom = 15.dp, top = 48.dp, end = 22.dp, start = 0.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.images),
                contentDescription = "Avtar",
                modifier = Modifier
                    .size(200.dp)
                    .clip(RoundedCornerShape(50.dp))


            )
        }
        Text(
            text = "Jennifer Doe",
            fontSize = 36.sp,
            modifier = Modifier.padding(start = 12.dp, bottom = 5.dp)
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 15.sp,
            modifier = Modifier.padding(start = 12.dp, bottom = 40.dp)
        )
        

    }
}

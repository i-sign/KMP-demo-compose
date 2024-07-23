import aisummary.composeapp.generated.resources.Res
import aisummary.composeapp.generated.resources.ai_loading
import aisummary.composeapp.generated.resources.ai_loading_svg
import aisummary.composeapp.generated.resources.text_generated
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.resources.vectorResource

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            mainContent()
        }
    }
}

@Composable
fun mainContent(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth().padding(16.dp)) {
        headerSection()
        titleContent()
    }
}

@Composable
fun headerSection(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(bottom = 16.dp)) {
        Text(text = "Finnomena AI Lab", fontSize = 17.sp, fontWeight = FontWeight.Bold)
        Text(
            text = "เนื้อหาต่อไปนี้สร้างโดย AI อาจมีข้อผิดพลาดได้",
            fontSize = 13.sp
        )
    }
}

@Composable
fun titleContent(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier.clip(RoundedCornerShape(percent = 5))
            .background(Color.Magenta)
    ) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier.padding(end = 16.dp).clip(CircleShape).border(
                        1.dp, Color.Red,
                        CircleShape
                    ).background(Color.Gray)
                ) {
                    Image(
                        painterResource(Res.drawable.ai_loading),
                        null, modifier = Modifier.padding(4.dp)
                    )
                }
                Column() {
                    Text(
                        text = "5 สิ่งที่ต้องรู้เกี่ยวกับตลาดวันนี้",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = "3 มิ.ย. 67", fontSize = 15.sp)
                }
            }

            Text(text = stringResource(Res.string.text_generated), modifier = Modifier.padding(16.dp))
        }

    }

}
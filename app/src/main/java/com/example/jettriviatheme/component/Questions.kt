package com.example.jettriviatheme.component

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jettriviatheme.screens.QuestionsViewModel
import com.example.jettriviatheme.util.AppColors

@Composable
fun Questions(viewModel: QuestionsViewModel) {
    val questions = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true){

        CircularProgressIndicator()


        Log.d("Loading", "Questions: ...Loading")
    }else{
        Log.d("Loading", "Questions: ...Loading Stopped")
        questions?.forEach{questionItem ->
            Log.d("Result", "Questions: ${questionItem.question}")

        }

    }

}
@Preview
@Composable
fun QuestionDisplay(){
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(4.dp),
          color = AppColors.mDarkPurple ) {
        Column(modifier = Modifier.padding(12.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start) {




        }

    }
}
@Preview
@Composable
fun QuestionTracker(
    counter: Int = 10,

    outOff : Int = 100
)
   {


  }

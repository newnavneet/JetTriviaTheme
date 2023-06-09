package com.example.jettriviatheme

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import com.example.jettriviatheme.model.Question
import com.example.jettriviatheme.screens.QuestionsViewModel
import com.example.jettriviatheme.screens.TriviaHome
import com.example.jettriviatheme.ui.theme.JetTriviaThemeTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetTriviaThemeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    TriviaHome()




                }
            }
        }
    }







    @Preview()
    @Composable
    fun DefaultPreview() {
        JetTriviaThemeTheme {


        }
    }

}
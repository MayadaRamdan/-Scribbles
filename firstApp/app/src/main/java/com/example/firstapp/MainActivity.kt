package com.example.firstapp

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
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
import androidx.core.app.NotificationCompat
import com.example.firstapp.ui.theme.FirstAppTheme

class MainActivity : ComponentActivity() {
    val CHANNEL_ID :String="X_Channel";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            login()
        }
    }

    fun displayNotification(){
        if (Build.VERSION.SDK_INT==Build.VERSION_CODES.O){
            var channel= NotificationChannel(CHANNEL_ID,"Chanel Name" , NotificationManager.IMPORTANCE_DEFAULT)
            var notificationManager =getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
        var builder= NotificationCompat.Builder(baseContext ,CHANNEL_ID)
        builder.setSmallIcon(R.drawable.notifications)
            .setContentTitle("Test")
            .setContentText(" I WILL BE HAPPY IF THIS DONE")

    }
}

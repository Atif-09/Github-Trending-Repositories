package com.example.githubtrendingrepositories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.githubtrendingrepositories.api.ApiInterface
import com.example.githubtrendingrepositories.api.ApiUtilities
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usersApi = ApiUtilities.getInstance().create(ApiInterface::class.java)

        GlobalScope.launch(Dispatchers.IO) {
            val result = usersApi.getUsers()

            if (result.body() != null){


                Log.d("Atif", "Oncreate ${result.body()}")
                }
        }


    }
}
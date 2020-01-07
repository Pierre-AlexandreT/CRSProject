package com.pat.crsproject

import android.os.Bundle
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.pat.crsproject.data.model.Photo
import com.pat.crsproject.data.model.Seance
import com.pat.crsproject.ui.viewmodel.PhotoViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var photoViewModel: PhotoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_seance_list_fragment, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        photoViewModel = ViewModelProvider(this, PhotoViewModel).get()

        btn_get.setOnClickListener(View.OnClickListener {
            var maList: List<Photo> = emptyList()
            photoViewModel.getPhotos {
                maList = it
            }
        })

        TestDatabase()
    }

    private fun TestDatabase() {
        val photo1 = Photo(1, 1, "Mode1", "focal_09", "1000ms", "Lat", "Long", 1, 2, 3, 4)

        photoViewModel.insertPhoto(photo1)

    }
}

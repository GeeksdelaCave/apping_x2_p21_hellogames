package fr.epita.android.hellogames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_game_details.*

class GameDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_details)

        Glide
            .with(this@GameDetails)
            .load("https://upload.wikimedia.org/wikipedia/commons/f/f6/Tic_Tac_Toe.png")
            .into(imageView5)
    }
}

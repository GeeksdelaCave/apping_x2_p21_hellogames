package fr.epita.android.hellogames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide
            .with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/4/48/15-Puzzle.jpg")
            .into(imageView)
        Glide
            .with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/f/f6/Tic_Tac_Toe.png")
            .into(imageView2)
        Glide
            .with(this)
            .load("https://cdn.education.com/worksheet-image/126064/printable-memory-game-printable-board.png")
            .into(imageView3)
        Glide
            .with(this)
            .load("https://datagenetics.com/blog/december32011/progress.png")
            .into(imageView4)
    }
}

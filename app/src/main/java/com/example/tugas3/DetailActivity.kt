package com.example.tugas3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.tugas3.R.layout.detail
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(detail)

        val temp = intent.getParcelableExtra<Detail>("detail")

        if(temp!= null){

            val nama: TextView = findViewById(R.id.tv_nama)
            val email: TextView = findViewById(R.id.tv_email)
            val jurusan: TextView = findViewById(R.id.tv_jurusan)
            val semester: TextView = findViewById(R.id.tv_semester)
            val image: ImageView = findViewById(R.id.imageDetail)

            nama.text = "Nama :  ${temp.nama}"
            email.text = "Email :  ${temp.email}"
            jurusan.text = "Jurusan :  ${temp.jurusan}"
            semester.text = "Semester : ${temp.semester}"

            Picasso.get().load(temp.url).into(image)
        }

    }
}
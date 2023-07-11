package com.example.tugas3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {

    private lateinit var  detailList: ArrayList<Detail>
    private lateinit var  detailadapter: RecyclerAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recyclerView = findViewById<RecyclerView>(R.id.rv_recyclerView)

        postToList()

        recyclerView .layoutManager =  LinearLayoutManager(this)
        detailadapter =  RecyclerAdapter(detailList)
        recyclerView.adapter =  detailadapter

        detailadapter.onItemClick = {

            val i = Intent(this, DetailActivity::class.java)
            i.putExtra("detail", it )

            startActivity(i)
        }


    }
    private fun postToList() {

        detailList = ArrayList()

        detailList.add(Detail("Klasik","fefesf","teknik informatika","4","https://media.licdn.com/dms/image/D5603AQH8T5ratqKmgg/profile-displayphoto-shrink_800_800/0/1680367893780?e=1694649600&v=beta&t=mUtVJLOMDcV0QDgXrZE96LmX7wneAYQs83ViW2F8_VE"))
        detailList.add(Detail("Pentaho","fefethfsf","teknik informatika","7","https://images.ctfassets.net/kkvmdunnrywi/2VrHtCTnpPXS1xByCl8Gme/ca3c0cd5bde9923a40714addfa76756f/pentaho.png?w=1280&h=853&q=50&fit=fill"))
        detailList.add(Detail("Tableu","fetfhfesf","teknik informatika","9","https://financeandbusiness.ucdavis.edu/sites/g/files/dgvnsk4871/files/styles/sf_landscape_16x9/public/images/article/tableau_logo.png?h=c673cd1c&itok=aomysVvE"))
        detailList.add(Detail("Phyton","fefesthff","teknik informatika","4","https://logos-download.com/wp-content/uploads/2016/10/Python_logo_icon-700x697.png"))
        detailList.add(Detail("Java","feww3twtfesf","teknik informatika","5","https://www.theindianwire.com/wp-content/uploads/2018/06/java-logo.png"))

    }

}
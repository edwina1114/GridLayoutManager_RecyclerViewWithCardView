package com.example.mygridlayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mygridlayoutapp.adapters.AlphaAdapters
import com.example.mygridlayoutapp.model.AlphaChar

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var arrayList:ArrayList<AlphaChar> ? = null
    private var alphaAdapters:AlphaAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler_view)
        // design the gridlayout count/row
        gridLayoutManager = GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters(applicationContext, arrayList!!)
        recyclerView?.adapter = alphaAdapters

    }

    private fun setDataInList() :ArrayList<AlphaChar> {

        var items:ArrayList<AlphaChar> = ArrayList()

        items.add(AlphaChar(R.drawable.letter_a , alphaChar = "Char A"))
        items.add(AlphaChar(R.drawable.letter_b , alphaChar = "Char B"))
        items.add(AlphaChar(R.drawable.letter_c , alphaChar = "Char C"))
        items.add(AlphaChar(R.drawable.letter_d , alphaChar = "Char D"))
        items.add(AlphaChar(R.drawable.letter_e , alphaChar = "Char E"))
        items.add(AlphaChar(R.drawable.letter_f , alphaChar = "Char F"))
        items.add(AlphaChar(R.drawable.letter_g , alphaChar = "Char G"))
        items.add(AlphaChar(R.drawable.letter_h , alphaChar = "Char H"))
        items.add(AlphaChar(R.drawable.letter_i , alphaChar = "Char I"))
        items.add(AlphaChar(R.drawable.letter_j , alphaChar = "Char J"))
        items.add(AlphaChar(R.drawable.letter_k , alphaChar = "Char K"))
        items.add(AlphaChar(R.drawable.letter_l , alphaChar = "Char L"))
        items.add(AlphaChar(R.drawable.letter_m , alphaChar = "Char M"))
        items.add(AlphaChar(R.drawable.letter_n , alphaChar = "Char N"))
        items.add(AlphaChar(R.drawable.letter_o , alphaChar = "Char O"))
        items.add(AlphaChar(R.drawable.letter_p , alphaChar = "Char P"))
        items.add(AlphaChar(R.drawable.letter_q , alphaChar = "Char Q"))
        items.add(AlphaChar(R.drawable.letter_r , alphaChar = "Char R"))
        items.add(AlphaChar(R.drawable.letter_s , alphaChar = "Char S"))
        items.add(AlphaChar(R.drawable.letter_t , alphaChar = "Char T"))
        items.add(AlphaChar(R.drawable.letter_u , alphaChar = "Char U"))
        items.add(AlphaChar(R.drawable.letter_v , alphaChar = "Char V"))
        items.add(AlphaChar(R.drawable.letter_w , alphaChar = "Char W"))
        items.add(AlphaChar(R.drawable.letter_x , alphaChar = "Char X"))
        items.add(AlphaChar(R.drawable.letter_y , alphaChar = "Char Y"))
        items.add(AlphaChar(R.drawable.letter_z , alphaChar = "Char Z"))




        return items
    }


}
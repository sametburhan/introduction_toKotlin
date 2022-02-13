package com.samet.classandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var abc = 1
        if (abc==0){
            ilkfonksiyon()
        }else{
            ikincifonksiyon()
        }
        ucuncufonksiyon(4532,32)
        println("selam: ${bolme(234,4)}")
        button2.setOnClickListener{
            val bolum = bolme(34,2)
            textView.text = "Sonuç: ${bolum}"
        }
        birfonksiyon()

    }
    fun ilkfonksiyon(){
       println("nabeer")
    }
    fun ikincifonksiyon(){
        println("heyooo")
    }
    fun ucuncufonksiyon(x:Int,y:Int){
        var a = x+y
        textView.text = "sonuç: ${a}"
    }
    //return
    fun bolme(t:Int,z:Int ): Int {
        return t/z
    }

    fun degistir(view : View){
        val bol = bolme(48,12)
        textView.text = "Sonuç: ${bol}"
    }
    fun birfonksiyon(){
        var superman = SuperKahraman()
        superman.isim = "samet"
        superman.yas = 21
        superman.meslek = "öğrenci"
        var sametman = SuperKahraman()
        sametman.isim = "batman"
        sametman.yas = 40
        sametman.meslek = "milyarder"
        textView.text = "batman meslek: ${sametman.meslek}"
    }


}
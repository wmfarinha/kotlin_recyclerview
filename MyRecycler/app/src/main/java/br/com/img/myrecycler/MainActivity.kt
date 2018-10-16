package br.com.img.myrecycler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this, OrientationHelper.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("William", "Av Sao Jorge"))
        users.add(User("Jaqueline", "Av Sao Jorge"))
        users.add(User("Daphne", "Av Sao Jorge"))
        users.add(User("Bruno", "Av Sao Jorge"))
        users.add(User("Jefferson", "Av Sao Jorge"))
        users.add(User("Rafael", "Av Sao Jorge"))
        users.add(User("Brodinho", "Av Sao Jorge"))
        users.add(User("Joao Bombinha", "Av Sao Jorge"))
        users.add(User("Laurindo", "Av Sao Jorge"))

        recyclerView.adapter = MyAdapter(users)
    }

}

package com.example.hache.masterdetaildefinitivo

import com.google.firebase.database.*

/**
 * Created by Hache on 11/12/2017.
 */
class AmplificadorContenido {


    private  val amplificadorList: MutableList<Amplificador> = ArrayList()
    lateinit var dataBaseRef: DatabaseReference

    public  fun getAmplificadorList(): MutableList<Amplificador> {
        return amplificadorList
    }
    public fun getIdAmplificador(id:String): Amplificador{
        for (obbj in amplificadorList) {
            if (obbj.id == id) {
                return obbj
            }
        }
        return amplificadorList.get(0)
    }

    public fun loadAmplificadorList() {
       dataBaseRef =  FirebaseDatabase.getInstance().getReference()
        
    }
}
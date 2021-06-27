package com.minhaempres.santanderdevweek.local

import com.minhaempres.santanderdevweek.data.Cartao
import com.minhaempres.santanderdevweek.data.Cliente
import com.minhaempres.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData() : Conta {
        val cliente = Cliente("Olá Malu")
        val cartao = Cartao("411111111")
        return Conta(
           "445655-4",
           "6552-4",
           "R$ 2.450,80",
           "R$ 4.120,00",
            cliente,
            cartao,
        );



    }
}
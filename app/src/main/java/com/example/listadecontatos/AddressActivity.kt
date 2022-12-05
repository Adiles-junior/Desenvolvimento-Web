package com.example.listadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.listadecontatos.databinding.ActivityAddressBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AddressActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddressBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddressBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCep.setOnClickListener {
            val call: Call<List<Address>>? = RetrofitClient.instance?.getApi()?.getAddress(
                binding.cep.toString())
            call?.enqueue(object : Callback<List<Address>> {

                override fun onResponse(call: Call<List<Address>>,
                                        response: Response<List<Address>>
                ) {
                    if (response.isSuccessful) {
                        response.body()?.let{
                            binding.logradouro.setText(Address().logradouro)
                            binding.bairro.setText(Address().bairro)
                            binding.localidade.setText(Address().localidade)
                            binding.uf.setText(Address().uf)
                        }
                    }
                }

                override fun onFailure(call: Call<List<Address>>, t: Throwable) {
                    binding.erro.text = "CEP não localizado!"
                    binding.erro.visibility = View.VISIBLE
                }

            })
        }
    }
}
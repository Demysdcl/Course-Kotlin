package com.kazale.pontointeligente.response

/**
 * Created by marciosouza on 10/14/17.
 */
data class Response<T> (
        val erros: ArrayList<String> = arrayListOf(),
        var data: T? = null
)

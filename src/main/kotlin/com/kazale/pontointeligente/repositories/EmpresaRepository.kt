package com.kazale.pontointeligente.repositories

import com.kazale.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by marciosouza on 10/14/17.
 */
interface EmpresaRepository : MongoRepository<Empresa, String> {

    fun findByCnpj(cnpj: String): Empresa

}

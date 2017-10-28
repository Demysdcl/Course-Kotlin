package com.kazale.pontointeligente.repositories

import com.kazale.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by marciosouza on 10/14/17.
 */
interface FuncionarioRepository : MongoRepository<Funcionario, String> {

    fun findByEmail(email: String): Funcionario

    fun findByCpf(cpf: String): Funcionario

}

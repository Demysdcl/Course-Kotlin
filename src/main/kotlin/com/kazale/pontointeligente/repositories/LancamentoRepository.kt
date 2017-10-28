package com.kazale.pontointeligente.repositories

import com.kazale.pontointeligente.documents.Funcionario
import com.kazale.pontointeligente.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by marciosouza on 10/14/17.
 */
interface LancamentoRepository : MongoRepository<Lancamento, String> {

    fun findByFuncionarioId(funcionarioId: String, pageable: Pageable): Page<Lancamento>

}

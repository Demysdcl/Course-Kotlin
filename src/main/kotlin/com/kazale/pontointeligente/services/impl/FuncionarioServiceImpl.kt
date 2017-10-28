package com.kazale.pontointeligente.services.impl

import com.kazale.pontointeligente.documents.Funcionario
import com.kazale.pontointeligente.repositories.FuncionarioRepository
import com.kazale.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

/**
 * Created by marciosouza on 10/14/17.
 */
@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository) : FuncionarioService {

    override fun persistir(funcionario: Funcionario): Funcionario =
            funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String): Funcionario? = funcionarioRepository.findOne(id)

}

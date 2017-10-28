package com.kazale.pontointeligente.services.impl

import com.kazale.pontointeligente.documents.Empresa
import com.kazale.pontointeligente.repositories.EmpresaRepository
import com.kazale.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

/**
 * Created by marciosouza on 10/14/17.
 */
@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}

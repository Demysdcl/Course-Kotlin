package com.kazale.pontointeligente

import com.kazale.pontointeligente.documents.Empresa
import com.kazale.pontointeligente.documents.Funcionario
import com.kazale.pontointeligente.enums.PerfilEnum
import com.kazale.pontointeligente.repositories.EmpresaRepository
import com.kazale.pontointeligente.repositories.FuncionarioRepository
import com.kazale.pontointeligente.repositories.LancamentoRepository
import com.kazale.pontointeligente.utils.SenhaUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @todo
 * O código abaixo serve somente para testes e deve ser removido ao término
 * do projeto, até porque ele faz alguns testes unitário falharem.
 *
 * Mantenha somente a declaração da classe e o método main, conforme criado no início do curso.
 */
@SpringBootApplication
class PontointeligenteApplication(val empresaRepository: EmpresaRepository,
                                  val funcionarioRepository: FuncionarioRepository,
                                  val lancamentoRepository: LancamentoRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        empresaRepository.deleteAll()
        funcionarioRepository.deleteAll()
        lancamentoRepository.deleteAll()

        val empresa: Empresa = Empresa("Empresa", "10443887000146")
        empresaRepository.save(empresa)

        val admin: Funcionario = Funcionario("Admin", "admin@empresa.com",
                SenhaUtils().gerarBcrypt("123456"), "25708317000",
                PerfilEnum.ROLE_ADMIN, empresa.id!!)
        funcionarioRepository.save(admin)

        val funcionario: Funcionario = Funcionario("Funcionario",
                "funcionario@empresa.com", SenhaUtils().gerarBcrypt("123456"),
                "44325441557", PerfilEnum.ROLE_USUARIO, empresa.id!!)
        funcionarioRepository.save(funcionario)

        System.out.println("Empresa ID: " + empresa.id)
        System.out.println("Admin ID: " + admin.id)
        System.out.println("Funcionario ID: " + funcionario.id)

    }

}

fun main(args: Array<String>) {
    SpringApplication.run(PontointeligenteApplication::class.java, *args)
}
package fabricio.jefferson.projectlogin.model

data class User(
    val id: Int,
    val name: String,
    val cpf: String,
    val email: String,
    val login: String,
    val password: String
)

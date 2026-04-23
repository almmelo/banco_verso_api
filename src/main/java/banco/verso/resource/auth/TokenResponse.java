package banco.verso.resource.auth;


public record TokenResponse(

        String token,
        String cpf,
        String nome,
        String email,
        String role

) {
}

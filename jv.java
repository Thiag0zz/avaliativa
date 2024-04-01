document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('cadastroForm');
    const mensagemDiv = document.getElementById('mensagem');

    form.addEventListener('submit', function (e) {
        e.preventDefault();

        const formData = new FormData(form);
        const nome = formData.get('nome');
        const email = formData.get('email');
        const senha = formData.get('senha');

        // Aqui você pode fazer qualquer ação com os dados do formulário
        // Neste exemplo, apenas exibimos uma mensagem
        mensagemDiv.textContent = `Usuário cadastrado:
        Nome: ${nome}
        Email: ${email}
        Senha: ${senha}`;
    });
});

form.addEventListener('submit', function (e) {
    e.preventDefault();

    const formData = new FormData(form);
    const nome = formData.get('nome');
    const email = formData.get('email');
    const senha = formData.get('senha');
    const senhaConfirmacao = formData.get('senha-confirmacao');

    if (nome.trim() === '' || !validateEmail(email) || senha.length < 6 || senha !== senhaConfirmacao) {
        mensagemDiv.textContent = 'Por favor, preencha o formulário corretamente.';
        return;
    }

    // Restante do código para cadastro...
});

function validateEmail(email) {
    const re = /\S+@\S+\.\S+/;
    return re.test(email);
}
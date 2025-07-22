document.getElementById("form-produto").addEventListener("submit", function(e) {
function mostrarCadastro() {
  document.getElementById("tela-cadastro").style.display = "block";
}

  e.preventDefault();
  const data = {
    nome: e.target.nome.value,
    preco: parseFloat(e.target.preco.value)
  };

  fetch("/api/produtos", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(data)
  })
  .then(res => res.text())
  .then(msg => alert(msg))
  .catch(() => alert("Erro ao salvar produto"));
});

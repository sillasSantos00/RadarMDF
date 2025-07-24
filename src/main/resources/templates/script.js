<script>
  // Preencher código automaticamente
  document.getElementById("nomeItem").addEventListener("change", function () {
    const codigos = {
      "CPU Dell i3": "45678",
      "CPU Dell i7": "12321",
      "CPU win 7": "78901"
    };
    document.getElementById("codigoItem").value = codigos[this.value] || "";
  });

  // Enviar dados
  document.getElementById("form-produto").addEventListener("submit", function(e) {
    e.preventDefault();
    const form = e.target;

    const data = {
      patrimonio: parseFloat(form.preco.value),
      nomeItem: form.nomeItem.value,
      codigoItem: form.codigoItem.value,
      tipo: form.tipo.value,
      // Adicione os outros campos como loja, setor, estadoConservacao, descricao...
      descricao: form.descricao.value
    };

    fetch("/api/produtos", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data)
    })
    .then(res => res.text())
    .then(msg => {
      form.reset();
      alert(msg);
    })
    .catch(() => alert("Erro ao cadastrar produto"));
  });
</script>
